package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IMM {
private String IMM_01_IndustryCode;
private String IMM_02_DateTimePeriodFormatQualifier;
private String IMM_03_DateTimePeriod;
private String IMM_04_ImmunizationStatusCode;
private String IMM_05_ReportTypeCode;
private String IMM_06_CodeListQualifierCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

