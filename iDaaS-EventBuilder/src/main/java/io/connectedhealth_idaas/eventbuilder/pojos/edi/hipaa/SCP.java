package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SCP {
private String SCP_01_StandardCarrierAlphaCode;
private String SCP_02_ReferenceIdentification;
private String SCP_03_ReservationActionCode;
private String SCP_04_ShipmentorWorkAssignmentDeclineReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

