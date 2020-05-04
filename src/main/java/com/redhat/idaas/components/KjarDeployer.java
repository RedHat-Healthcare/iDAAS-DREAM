package com.redhat.idaas.components;

import org.kie.api.KieServices;
import org.kie.api.builder.KieScanner;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class KjarDeployer {
    private static final Logger logger = LoggerFactory.getLogger(KjarDeployer.class);

    private static final KieServices KIE_SERVICES = KieServices.Factory.get();

    public static KieContainer kieContainer;

    public KjarDeployer() {
        ReleaseId releaseId = KIE_SERVICES.newReleaseId("com.redhat.idaas", "idaas-rules", "1.0.0-SNAPSHOT");
        //ReleaseId releaseId = kieServices.newReleaseId("com.redhat.idaas", "idaas-rules", "[1.0.0,)");
        kieContainer = KIE_SERVICES.newKieContainer(releaseId);

        // Start the KieScanner polling the Maven repository every 10 seconds
        KieScanner kieScanner = KIE_SERVICES.newKieScanner( kieContainer );
        kieScanner.start( 10000L );
        logger.info("KieContainer created! Started scanning for new kjars...");

        // Initialize to get rid of first delay
        KieSession kieSession = kieContainer.newKieSession("default-stateful-kie-session");
        kieSession.dispose();
        logger.info("Initial KieSession created and disposed of. Requests should be faster...");
    }

    public KieSession newKieSession() {
        return kieContainer.newKieSession("default-stateful-kie-session");
    }
}
