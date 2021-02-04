package io.connectedhealth_idaas.eventbuilder.builders.hapifhir;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import org.hl7.fhir.r4.model.*;

public class HAPIFHIRObservation {

    public static void createObservationObject() {

        // Create a patient object
        org.hl7.fhir.r4.model.Observation observationData = new org.hl7.fhir.r4.model.Observation();

        observationData.addIdentifier()
            .setSystem("http://acme.org/mrns")
            .setValue("12345");

        observationData.setStatus(Observation.ObservationStatus.FINAL);
        observationData
                .getCode()
                .addCoding()
                .setSystem("http://loinc.org")
                .setCode("789-8")
                .setDisplay("Erythrocytes [#/volume] in Blood by Automated count");
        observationData.setValue(
                new Quantity()
                        .setValue(4.12)
                        .setUnit("10 trillion/L")
                        .setSystem("http://unitsofmeasure.org")
                        .setCode("10*12/L"));

        // The observation refers to the patient using the ID, which is already
        // set to a temporary UUID
        observationData.setSubject(new Reference("1234"));

    }


}
