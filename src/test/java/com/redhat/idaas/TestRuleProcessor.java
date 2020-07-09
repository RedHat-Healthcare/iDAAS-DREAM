package com.redhat.idaas;


import java.util.Arrays;

import com.redhat.idaas.pojos.platform.RoutingEvent;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import com.redhat.idaas.components.KjarDeployer;
//import com.redhat.idaas.idaas_rules.RoutingEvent;
//import com.redhat.idaas.idaas_rules.RoutingInfo;
import com.redhat.idaas.processors.DecisionManagerProcessor;
import org.apache.camel.test.junit4.CamelTestSupport;

public class TestRuleProcessor extends CamelTestSupport {

    private DecisionManagerProcessor decisionManagerProcessor;

    @Override
    protected void doPreSetup() throws Exception {
        super.doPreSetup();

        KjarDeployer kjarDeployer = new KjarDeployer();
        decisionManagerProcessor = new DecisionManagerProcessor(kjarDeployer);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("direct:decisionManagerProcessor")
                        .to("log:com.redhat.idaas?showExchangePattern=false&showBodyType=true")
                        .process(decisionManagerProcessor)
                        .to("log:com.redhat.idaas.idaasfusedmtester?showExchangePattern=false&showBodyType=false&showHeaders=true");

                from("direct:recipientList")
                        .to("log:com.redhat.idaas?showExchangePattern=false&showBodyType=false&showHeaders=true")
                        //.recipientList(header("routingTopics"));
                        .recipientList(simple("${body.getTopicNames}"));

                from("direct:testFullRoute")
                        .to("log:com.redhat.idaas?showExchangePattern=false&showBodyType=true")
                        .process(decisionManagerProcessor)
                        .to("log:com.redhat.idaas?showExchangePattern=false&showBodyType=false&showHeaders=true")
                        .recipientList(header("routingTopics"));

            }
        };
    }

    @Test
    public void testDecisionManagerProcessorRoute() throws Exception {
        RoutingEvent routingEvent = new RoutingEvent();
        routingEvent.setSendingApp("MMS");
        routingEvent.setMessageType("ADT");
        routingEvent.setMessageEvent("A03");

        template.sendBody("direct:decisionManagerProcessor", routingEvent);
    }

    @Test
    public void testRecipientListRoute() throws Exception {
        RoutingEvent routingEvent = new RoutingEvent();
        routingEvent.setSendingApp("MMS");
        routingEvent.setMessageType("ADT");
        routingEvent.setMessageEvent("A03");

        //RoutingInfo routingInfo = new RoutingInfo();
        //routingInfo.setTopicNames(Arrays.asList("log:testerA", "log:testerB", "log:testerC"));

        //template.sendBodyAndHeader("direct:recipientList", routingInfo,
        //        "routingTopics", Arrays.asList("log:tester1", "log:tester2", "log:tester3"));
    }

    @Test
    public void testFullRoute() throws Exception {
        RoutingEvent routingEvent = new RoutingEvent();
        routingEvent.setSendingApp("MMS");
        routingEvent.setMessageType("ADT");
        routingEvent.setMessageEvent("A03");

        template.sendBody("direct:testFullRoute", routingEvent);
    }

    //@Test
    public void testDecisionManagerProcessor() throws Exception {
        KjarDeployer kjarDeployer = new KjarDeployer();
        DecisionManagerProcessor decisionManagerProcessor = new DecisionManagerProcessor(kjarDeployer);

        RoutingEvent routingEvent = new RoutingEvent();
        routingEvent.setSendingApp("MMS");
        routingEvent.setMessageType("ADT");
        routingEvent.setMessageEvent("A03");

        Exchange exchange = createExchangeWithBody(routingEvent);

        decisionManagerProcessor.process(exchange);
    }

}
