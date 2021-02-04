package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HS {
private String HS_01_IndustryCode;
private String HS_02_DateTimePeriodFormatQualifier;
private String HS_03_DateTimePeriod;
private String HS_04_StatusReasonCode;
private String HS_05_CodeListQualifierCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

