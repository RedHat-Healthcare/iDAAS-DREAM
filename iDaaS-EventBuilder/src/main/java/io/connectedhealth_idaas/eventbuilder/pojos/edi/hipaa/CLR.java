package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CLR {
private String CLR_01_IdentificationCodeQualifier;
private String CLR_02_IdentificationCode;
private String CLR_03_IndustryCode;
private String CLR_04_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

