package io.connectedhealth_idaas.eventbuilder.builders.hapifhir;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import org.hl7.fhir.r4.model.*;

import java.util.Arrays;
import java.util.Date;

// https://hapifhir.io/hapi-fhir/docs/model/working_with_resources.html
//https://hapifhir.io/hapi-fhir/apidocs/hapi-fhir-structures-r4/org/hl7/fhir/r4/model/package-summary.html
public class HAPIFHIRPhysician {
    public static org.hl7.fhir.r4.model.Practitioner createPatient(io.connectedhealth_idaas.eventbuilder.builders.fhir.Practitioner providerData)
    {
        // Create a practitioner object
        org.hl7.fhir.r4.model.Practitioner physician = new org.hl7.fhir.r4.model.Practitioner();
        /*
         *
         * Identifer and Value for the identifier - this is the core system the data is coming from
         *
         */
        physician.addIdentifier()
                .setSystem(providerData.getSystemURL())
                .setValue(providerData.getSystemID());
        // Practitioner Name
        physician.addName()
                .setFamily(providerData.getProvider_Name_Last())
                .addGiven(providerData.getProvider_Name_Middle())
                .addGiven(providerData.getProvider_Name_First());
        // Gender is textual Value so we pass it over from object in manner expected
        // Some form of a condition to determine enumeration
        if (providerData.getProvider_Gender().equals("M")) {
            physician.setGender(Enumerations.AdministrativeGender.MALE);
        }
        else if(providerData.getProvider_Gender().equals("F"))
        {
            physician.setGender(Enumerations.AdministrativeGender.FEMALE);
        }
        else
        {
            physician.setGender(Enumerations.AdministrativeGender.NULL);
        }
        physician.addAddress()
                // Might need to pass multiple to array oif multiple lines
                .setLine(Arrays.asList(new StringType(providerData.getProvider_Address_Line())))
                .setCity(providerData.getProvider_Address_City())
                .setState(providerData.getProvider_Address_State())
                .setPostalCode(providerData.getProvider_Address_Zip())
                .setCountry(providerData.getProvider_Address_Country());
        physician.setBirthDate(new Date());
        physician.addTelecom()
                .setValue(providerData.getProvider_Number_Business());
        Period p = new Period();
        CodeableConcept codeconcept = new CodeableConcept();
        codeconcept.addCoding();
        physician.addQualification()
                .setPeriod(new Period())
                .setCode(codeconcept);
        // return object
        return physician;
    }
        public static void createPhysicianObjectGeneric()
        {
            // Create a patient object
            org.hl7.fhir.r4.model.Practitioner physician = new org.hl7.fhir.r4.model.Practitioner();
            /*
             *
             * Identifer and Value for the identifier - this is the core system the data is coming from
             *
             */
            physician.addIdentifier()
                    .setSystem("http://acme.org/mrns")
                    .setValue("12345");
            // Practitioner Name
            physician.addName()
                    .setFamily("Jameson")
                    .addGiven("J")
                    .addGiven("Jonah");
            physician.setGender(Enumerations.AdministrativeGender.MALE);
            physician.addAddress()
                    .setCity("")
                    .setLine(Arrays.asList(new StringType("")))
                    .setPostalCode("");
            physician.setBirthDate(new Date());
            physician.addTelecom()
                .setValue("");
            Period p = new Period();
            physician.addQualification()
                    .setPeriod(new Period());

            // Give the patient a temporary UUID so that other resources in
            // the transaction can refer to it
            physician.setId(IdType.newRandomUuid());
        }

    }
