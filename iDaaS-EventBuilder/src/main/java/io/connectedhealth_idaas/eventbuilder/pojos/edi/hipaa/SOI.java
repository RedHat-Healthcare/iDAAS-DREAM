package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SOI {
private String SOI_01_TypeofIncomeCode;
private String SOI_02_DateTimePeriodFormatQualifier;
private String SOI_03_DateTimePeriod;
private String SOI_04_Number;
private String SOI_05_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

