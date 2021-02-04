package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RSC {
private String RSC_01_ResourceCodeIdentifier;
private String RSC_02_Description;
private String RSC_03_ResourceType;
private String RSC_04_ActionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

