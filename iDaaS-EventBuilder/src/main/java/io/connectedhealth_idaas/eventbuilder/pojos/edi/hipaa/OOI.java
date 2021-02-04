package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OOI {
private String OOI_01_ObjectIdentificationGroup;
private String OOI_02_ObjectTypeQualifier;
private String OOI_03_ObjectAttributeIdentification;
private String OOI_04_ControllingAgency;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

