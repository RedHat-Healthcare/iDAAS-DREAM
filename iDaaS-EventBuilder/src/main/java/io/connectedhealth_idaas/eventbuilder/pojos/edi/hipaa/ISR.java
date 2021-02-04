package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ISR {
private String ISR_01_ShipmentOrderStatusCode;
private String ISR_02_Date;
private String ISR_03_StatusReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

