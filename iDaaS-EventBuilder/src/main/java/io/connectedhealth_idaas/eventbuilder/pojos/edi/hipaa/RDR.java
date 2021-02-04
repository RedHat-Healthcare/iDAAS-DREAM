package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RDR {
private String RDR_01_ReturnsDispositionCode;
private String RDR_02_ReturnRequestReasonCode;
private String RDR_03_ReturnResponseReasonCode;
private String RDR_04_Description;
private String RDR_05_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

