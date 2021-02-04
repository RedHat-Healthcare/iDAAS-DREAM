package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SG {
private String SG_01_ShipmentStatusCode;
private String SG_02_StatusReasonCode;
private String SG_03_BillofLadingDispositionCode;
private String SG_04_Date;
private String SG_05_Time;
private String SG_06_TimeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

