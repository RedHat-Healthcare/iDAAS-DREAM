package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ADX {
private String ADX_01_MonetaryAmount;
private String ADX_02_AdjustmentReasonCode;
private String ADX_03_ReferenceIdentificationQualifier;
private String ADX_04_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

