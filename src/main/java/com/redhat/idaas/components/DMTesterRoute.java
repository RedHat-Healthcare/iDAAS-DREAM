package com.redhat.idaas.components;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DMTesterRoute  extends RouteBuilder {
    private static final Logger logger = LoggerFactory.getLogger(DMTesterRoute.class);

    @Override
    public void configure() throws Exception {
        from("direct:start")
                .to("log:com.redhat.idaas.idaasfusedmtester.components?showExchangePattern=false&showBodyType=true")
                .to("decisionManagerProcessor")
                .to("log:com.redhat.idaas.idaasfusedmtester.components?showExchangePattern=false&showBodyType=true&showHeaders=true");

    }
}
