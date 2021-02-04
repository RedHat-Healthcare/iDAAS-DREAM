package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PRJ {
private String PRJ_01_Name;
private String PRJ_02_ReferenceIdentificationQualifier;
private String PRJ_03_ReferenceIdentification;
private String PRJ_04_Date;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

