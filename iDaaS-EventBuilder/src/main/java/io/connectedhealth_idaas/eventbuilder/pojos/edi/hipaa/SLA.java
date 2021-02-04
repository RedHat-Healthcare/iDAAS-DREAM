package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SLA {
private String SLA_01_CodeListQualifierCode;
private String SLA_02_IndustryCode;
private String SLA_03_CodeForLicensing,Certification,Registration,orAccreditationAgency;
private String SLA_04_DateTimePeriodFormatQualifier;
private String SLA_05_DateTimePeriod;
private String SLA_06_CodeListQualifierCode;
private String SLA_07_IndustryCode;
private String SLA_08_StateorProvinceCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

