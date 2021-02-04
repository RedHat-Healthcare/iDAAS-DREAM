package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CCI {
private String CCI_01_IdentificationCode;
private String CCI_02_ReferenceIdentification;
private String CCI_03_ReferenceIdentificationQualifier;
private String CCI_04_ReferenceIdentification;
private String CCI_05_DateTimePeriodFormatQualifier;
private String CCI_06_DateTimePeriod;
private String CCI_07_DateTimePeriod;
private String CCI_08_DateTimePeriod;
private String CCI_09_MonetaryAmount;
private String CCI_10_CounselingStatusCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

