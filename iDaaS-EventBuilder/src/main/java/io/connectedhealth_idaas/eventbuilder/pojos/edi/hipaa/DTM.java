package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DTM {
private String DTM_01_DateTimeQualifier;
private String DTM_02_Date;
private String DTM_03_Time;
private String DTM_04_TimeCode;
private String DTM_05_DateTimePeriodFormatQualifier;
private String DTM_06_DateTimePeriod;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

