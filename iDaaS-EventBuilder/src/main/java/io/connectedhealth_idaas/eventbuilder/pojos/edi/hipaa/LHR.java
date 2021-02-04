package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LHR {
private String LHR_01_ReferenceIdentificationQualifier;
private String LHR_02_ReferenceIdentification;
private String LHR_03_Date;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

