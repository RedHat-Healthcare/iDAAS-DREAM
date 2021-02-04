package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TRL {
private String TRL_01_EquipmentStatusCode;
private String TRL_02_Date;
private String TRL_03_Time;
private String TRL_04_ShipmentIdentificationNumber;
private String TRL_05_RejectReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

