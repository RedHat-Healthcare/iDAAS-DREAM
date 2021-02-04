package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HCR {
private String HCR_01_ActionCode;
private String HCR_02_ReferenceIdentification;
private String HCR_03_IndustryCode;
private String HCR_04_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

