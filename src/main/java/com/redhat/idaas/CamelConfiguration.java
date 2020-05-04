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

import com.redhat.idaas.parsers.platform.RoutingEventParser;

@Component
public class CamelConfiguration extends RouteBuilder {

    private static final Logger log = LoggerFactory.getLogger(CamelConfiguration.class);

    @Autowired
    DecisionManagerProcessor decisionManagerProcessor;

    @Bean
    private HL7MLLPNettyEncoderFactory hl7Encoder() {
        HL7MLLPNettyEncoderFactory encoder = new HL7MLLPNettyEncoderFactory();
        encoder.setCharset("iso-8859-1");
        //encoder.setConvertLFtoCR(true);
        return encoder;
    }

    @Bean
    public RoutingEventParser routingEventParser() {
        return new RoutingEventParser();
    }

    @Override
    public void configure() throws Exception {
        // Routing from Topic through routing event
        from("amqp:topic:HL7_ADT?connectionFactory=#pooledJmsConnectionFactory&disableReplyTo=true&acknowledgementModeName=CLIENT_ACKNOWLEDGE")
                .routeId("MiddleTierRouteAdmissions")
                .log(LoggingLevel.INFO, log, "HL7 Body: ${body}")
                // Bean Invocation
                .bean(RoutingEventParser.class, "buildRoutingEvent(${body})")
                .log(LoggingLevel.INFO, log, "Routing Event: ${body}")
                .process(decisionManagerProcessor)
                .log(LoggingLevel.INFO, log, "Topics to route to: ${header.routingTopics}")
                .recipientList(header("routingTopics"));
    }
}

