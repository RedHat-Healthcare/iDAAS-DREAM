package com.redhat.idaas.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.redhat.idaas.processors.DecisionManagerProcessor;

@Component
public class DecisionManagerClient {

    @Bean
    @Autowired
    public DecisionManagerProcessor decisionManagerProcessor(KjarDeployer kjarDeployer) {
        return new DecisionManagerProcessor(kjarDeployer);
    }
}
