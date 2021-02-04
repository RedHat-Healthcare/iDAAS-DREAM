package io.connectedhealth_idaas.eventbuilder.builders.hapifhir;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import org.hl7.fhir.r4.model.*;

public class HAPIFHIRAllergyIntolerance {
    public static void createAllergyIntoleranceObject()
    {
        // Create a patient object
        org.hl7.fhir.r4.model.AllergyIntolerance allergyIntolerance = new org.hl7.fhir.r4.model.AllergyIntolerance();
        allergyIntolerance.addIdentifier()
                .setSystem("http://acme.org/mrns")
                .setValue("12345");
    }
}
