package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ETD {
private String ETD_01_ExcessTransportationReasonCode;
private String ETD_02_ExcessTransportationResponsibilityCode;
private String ETD_03_ReferenceIdentificationQualifier;
private String ETD_04_ReferenceIdentification;
private String ETD_05_ReturnableContainerFreightPaymentResponsibilityCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

