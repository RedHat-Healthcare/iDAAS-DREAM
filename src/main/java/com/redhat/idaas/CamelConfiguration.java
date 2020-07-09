/**
 *
 */
package com.redhat.idaas;

import com.redhat.idaas.processors.DecisionManagerProcessor;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
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
    public RoutingEventParser2 routingEventParser() {
        return new com.redhat.idaas.parsers.platform.RoutingEventParser();
    }

    @Override
    public void configure() throws Exception {
        /* Routing from AMQ-Streams Topic through routing event

        from("amqp:topic:HL7_ADT?connectionFactory=#pooledJmsConnectionFactory&disableReplyTo=true&acknowledgementModeName=CLIENT_ACKNOWLEDGE")
                .routeId("MiddleTierRouteAdmissions")
                .log(LoggingLevel.INFO, log, "HL7 Body: ${body}")
                // Bean Invocation
                .bean(RoutingEventParser.class, "buildRoutingEvent(${body})")
                .log(LoggingLevel.INFO, log, "Routing Event: ${body}")
                //.process(decisionManagerProcessor)
                .log(LoggingLevel.INFO, log, "Topics to route to: ${header.routingTopics}")
                .recipientList(header("routingTopics"));
        }
        */

         /*
            Invoke RoutingeventParser2 needs to pass in body of message to get response object
         */
        from("netty4:tcp://0.0.0.0:10001?sync=true&decoder=#hl7Decoder&encoder=#hl7Encoder")
                .routeId("ProcessADTAgainstRules")
                .log(LoggingLevel.INFO, log, "HL7 Body: ${body}")
                // Bean Invocation
                .bean(RoutingEventParser2.class, "buildRoutingEvent(${body})")
                .log(LoggingLevel.INFO, log, "Routing Event: ${body}")
                //.convertBodyTo(String.class).to("kafka://localhost:9092?topic=MCTN_MMS_ADT&brokers=localhost:9092")
        ;
    }
}

