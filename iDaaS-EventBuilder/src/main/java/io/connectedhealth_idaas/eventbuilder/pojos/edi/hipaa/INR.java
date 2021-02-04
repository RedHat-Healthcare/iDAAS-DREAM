package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class INR {
private String INR_01_CodeCategory;
private String INR_02_InformationType;
private String INR_03_InformationStatusCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

