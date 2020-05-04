package com.redhat.idaas.processors;

import java.util.Collection;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.kie.api.runtime.ClassObjectFilter;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.idaas.components.KjarDeployer;
import com.redhat.idaas.idaas_rules.RoutingEvent;
import com.redhat.idaas.idaas_rules.RoutingInfo;

public class DecisionManagerProcessor implements Processor {
    private static final Logger logger = LoggerFactory.getLogger(DecisionManagerProcessor.class);

    protected KjarDeployer kjarDeployer;

    public DecisionManagerProcessor(KjarDeployer kjarDeployer) {
        this.kjarDeployer = kjarDeployer;
    }

    /***
     * This processor reads in the exchange and expects a {@link RoutingEvent} object to be there.
     * This object is then sent to Decision Manager where rules are run to determine the Camel/Kafka topics
     * that the message will needs to be sent to. The list of topics is stored in the exchange header.
     * @param exchange
     * @throws Exception
     */
    public void process(Exchange exchange) throws Exception {
        Message in = exchange.getIn();

        // Acquire a new KieSession
        KieSession kieSession = kjarDeployer.newKieSession();

        RoutingEvent routingEvent = in.getBody(RoutingEvent.class);
        logger.info(routingEvent.toString());

        // Convert the message over to the RoutingEvent expected by the rules engine
        com.redhat.idaas.idaas_rules.RoutingEvent re = new com.redhat.idaas.idaas_rules.RoutingEvent();
        re.setMessageEvent(routingEvent.getMessageEvent());
        re.setMessageType(routingEvent.getMessageType());
        re.setSendingApplication(routingEvent.getSendingApplication());

        // insert the fact into the engine, start the process and extract the routing info from the rules
        kieSession.insert(re);
        kieSession.startProcess("idaas-rules.DetermineTopics");
        ClassObjectFilter filter = new ClassObjectFilter(RoutingInfo.class);
        Collection<?> objects = kieSession.getObjects(filter);

        // Cast the RoutingInfo object out of the returned collection
        RoutingInfo routingInfo = (RoutingInfo) objects.iterator().next();
        logger.info("RoutingInfo returned from the rules: " + routingInfo);

        // Modify the list of topic names to have the correct Camel connector in front of it
        for (int i = 0; i < routingInfo.getTopicNames().size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("log:");
            sb.append(routingInfo.getTopicNames().get(i));

            routingInfo.getTopicNames().set(i, sb.toString());
        }
        logger.info("Setting the routingTopics header to: " + routingInfo.getTopicNames());
        in.setHeader("routingTopics", routingInfo.getTopicNames());

        // Dispose of the current session
        kieSession.dispose();
    }

    public KjarDeployer getKjarDeployer() {
        return kjarDeployer;
    }

    public void setKjarDeployer(KjarDeployer kjarDeployer) {
        this.kjarDeployer = kjarDeployer;
    }
}
