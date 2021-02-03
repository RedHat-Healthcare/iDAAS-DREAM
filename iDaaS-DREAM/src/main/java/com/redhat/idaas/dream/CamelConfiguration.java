/**
 *
 */
package com.redhat.idaas.dream;

// import com.redhat.idaas.processors.DecisionManagerProcessor;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.kafka.KafkaComponent;
import org.apache.camel.component.kafka.KafkaConstants;
import org.apache.camel.component.kafka.KafkaEndpoint;
import org.apache.camel.component.hl7.HL7;
import org.apache.camel.component.hl7.HL7MLLPNettyDecoderFactory;
import org.apache.camel.component.hl7.HL7MLLPNettyEncoderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

// iDAAS Event Builder imports
import com.redhat.idaas.parsers.platform.RoutingEventParser;

@Component
public class CamelConfiguration extends RouteBuilder {

    private static final Logger log = LoggerFactory.getLogger(CamelConfiguration.class);

    //@Autowired
    //DecisionManagerProcessor decisionManagerProcessor;

    @Bean
    private HL7MLLPNettyEncoderFactory hl7Encoder() {
        HL7MLLPNettyEncoderFactory encoder = new HL7MLLPNettyEncoderFactory();
        encoder.setCharset("iso-8859-1");
        //encoder.setConvertLFtoCR(true);
        return encoder;
    }
    @Bean
    private HL7MLLPNettyDecoderFactory hl7Decoder() {
        HL7MLLPNettyDecoderFactory decoder = new HL7MLLPNettyDecoderFactory();
        decoder.setCharset("iso-8859-1");
        return decoder;
    }

    @Bean
    private KafkaEndpoint kafkaEndpoint(){
        KafkaEndpoint kafkaEndpoint = new KafkaEndpoint();
        return kafkaEndpoint;
    }
    @Bean
    private KafkaComponent kafkaComponent(KafkaEndpoint kafkaEndpoint){
        KafkaComponent kafka = new KafkaComponent();
        return kafka;
    }

    //@Bean
    //public RoutingEventParser routingEventParser() {
    //    return new RoutingEventParser();
    //}

    @Bean
    public RoutingEventParser routingEventParser() {
        return new RoutingEventParser();
    }

    @Override
    public void configure() throws Exception {

        from("direct:auditing")
                .setHeader("messageprocesseddate").simple("${date:now:yyyy-MM-dd}")
                .setHeader("messageprocessedtime").simple("${date:now:HH:mm:ss:SSS}")
                .setHeader("processingtype").exchangeProperty("processingtype")
                .setHeader("industrystd").exchangeProperty("industrystd")
                .setHeader("component").exchangeProperty("componentname")
                .setHeader("messagetrigger").exchangeProperty("messagetrigger")
                .setHeader("processname").exchangeProperty("processname")
                .setHeader("auditdetails").exchangeProperty("auditdetails")
                .setHeader("camelID").exchangeProperty("camelID")
                .setHeader("exchangeID").exchangeProperty("exchangeID")
                .setHeader("internalMsgID").exchangeProperty("internalMsgID")
                .setHeader("bodyData").exchangeProperty("bodyData")
                .convertBodyTo(String.class).to("kafka://localhost:9092?topic=opsMgmt_PlatformTransactions&brokers=localhost:9092")
        ;
        /*
         *  Logging
         */
        from("direct:logging")
                .log(LoggingLevel.INFO, log, "Transaction: [${body}]")
        ;

        // MLLP Test Receiver
        from("netty4:tcp://0.0.0.0:10001?sync=true&decoder=#hl7Decoder&encoder=#hl7Encoder")
                //from("file:src/data-in?delete=true?noop=true")
                .routeId("hl7Admissions")
                // Added
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-DREAM")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ADT")
                .setProperty("componentname").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("processname").constant("Input")
                .setProperty("auditdetails").constant("ADT Transaction received")
                // iDAAS DataHub Processing
                .wireTap("direct:auditing")
                // Send to Topic
                .convertBodyTo(String.class).to("kafka://localhost:9092?topic=MCTN_MMS_ADT&brokers=localhost:9092")
                //Response to HL7 Message Sent Built by platform
                .transform(HL7.ack())
                // This would enable persistence of the ACK
                .convertBodyTo(String.class)
                .setProperty("bodyData").simple("${body}")
                .setProperty("processingtype").constant("data")
                .setProperty("appname").constant("iDAAS-DREAM")
                .setProperty("industrystd").constant("HL7")
                .setProperty("messagetrigger").constant("ADT")
                .setProperty("componentname").simple("${routeId}")
                .setProperty("camelID").simple("${camelId}")
                .setProperty("exchangeID").simple("${exchangeId}")
                .setProperty("internalMsgID").simple("${id}")
                .setProperty("processname").constant("Input")
                .setProperty("auditdetails").constant("ACK Processed")
                // iDAAS DataHub Processing
                .wireTap("direct:auditing")
        ;
         /*
            Invoke RoutingeventParser needs to pass in body of message to get response object
         */
        from("kafka://localhost:9092?topic=MCTN_MMS_ADT&brokers=localhost:9092")
            .routeId("ProcessADTAgainstRules")
            //.log(LoggingLevel.INFO, log, "HL7 Body: ${body}")
            // Process Message Routing
            .bean(RoutingEventParser.class, "buildRoutingEvent(${body})")
            .log(LoggingLevel.INFO, log, "Routing Event: ${body}")
            .convertBodyTo(String.class).to("kafka://localhost:9092?topic=MCTN_MMS_ADT_Routing&brokers=localhost:9092")
            // Auditing
            .convertBodyTo(String.class)
            .setProperty("bodyData").simple("${body}")
            .setProperty("processingtype").constant("data")
            .setProperty("appname").constant("iDAAS-DREAM")
            .setProperty("industrystd").constant("HL7")
            .setProperty("messagetrigger").constant("ADT")
            .setProperty("componentname").simple("${routeId}")
            .setProperty("camelID").simple("${camelId}")
            .setProperty("exchangeID").simple("${exchangeId}")
            .setProperty("internalMsgID").simple("${id}")
            .setProperty("processname").constant("Input")
            .setProperty("auditdetails").constant("Routing Bean Invoked")
            // iDAAS DataHub Processing
            .wireTap("direct:auditing")
        ;
    }
}

