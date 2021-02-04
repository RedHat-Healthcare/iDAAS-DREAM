package io.connectedhealth_idaas.eventbuilder.pojos.edi.fhir;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
/*
 * https://www.hl7.org/fhir/chargeitem.html
 * Represents a FHIR ChargeItem Resource
 * This will only contain fields
 * If other structures are referenced are used they can be populated directly
 * The intent is to use these libraries as DTO objects to populate and pass into building methods for simplicity
 *
 */
public class ChargeItem {

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
