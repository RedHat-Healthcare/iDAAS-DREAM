package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AT7 {
private String AT7_01_ShipmentStatusIndicator;
private String AT7_02_ShipmentStatusorAppointmentReasonCode;
private String AT7_03_ShipmentAppointmentStatusCode;
private String AT7_04_ShipmentStatusorAppointmentReasonCode;
private String AT7_05_Date;
private String AT7_06_Time;
private String AT7_07_TimeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

