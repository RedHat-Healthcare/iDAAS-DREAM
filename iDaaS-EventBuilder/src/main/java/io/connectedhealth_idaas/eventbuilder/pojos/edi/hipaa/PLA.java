package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PLA {
private String PLA_01_ActionCode;
private String PLA_02_EntityIdentifierCode;
private String PLA_03_Date;
private String PLA_04_Time;
private String PLA_05_MaintenanceReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

