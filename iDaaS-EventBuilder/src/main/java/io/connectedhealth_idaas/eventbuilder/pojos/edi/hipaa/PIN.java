package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PIN {
private String PIN_01_AssignedNumber;
private String PIN_02_YesNoConditionorResponseCode;
private String PIN_03_ReferenceIdentification;
private String PIN_04_Name;
private String PIN_05_DateTimePeriodFormatQualifier;
private String PIN_06_DateTimePeriod;
private String PIN_07_IndustryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

