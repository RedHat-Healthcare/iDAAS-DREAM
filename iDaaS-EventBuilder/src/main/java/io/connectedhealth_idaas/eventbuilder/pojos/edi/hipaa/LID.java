package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LID {
private String LID_01_DateTimePeriodFormatQualifier;
private String LID_02_DateTimePeriod;
private String LID_03_IndustryCode;
private String LID_04_IndustryCode;
private String LID_05_Description;
private String LID_06_YesNoConditionorResponseCode;
private String LID_07_YesNoConditionorResponseCode;
private String LID_08_Description;
private String LID_09_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

