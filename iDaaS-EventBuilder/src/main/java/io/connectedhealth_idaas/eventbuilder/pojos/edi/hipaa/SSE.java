package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SSE {
private String SSE_01_Date;
private String SSE_02_Date;
private String SSE_03_StatusReasonCode;
private String SSE_04_Number;
private String SSE_05_StatusReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

