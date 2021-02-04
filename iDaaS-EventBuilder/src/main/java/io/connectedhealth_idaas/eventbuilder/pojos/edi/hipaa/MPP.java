package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MPP {
private String MPP_01_CodeCategory;
private String MPP_02_ProgramTypeCode;
private String MPP_03_DateTimeQualifier;
private String MPP_04_DateTimePeriodFormatQualifier;
private String MPP_05_DateTimePeriod;
private String MPP_06_MonetaryAmount;
private String MPP_07_AccrualRateMethodCode;
private String MPP_08_CertificationTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

