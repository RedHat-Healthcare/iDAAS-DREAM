package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PTS {
private String PTS_01_StatusCode;
private String PTS_02_ReferenceIdentification;
private String PTS_03_TaxServicePaymentCode;
private String PTS_04_DateTimePeriodFormatQualifier;
private String PTS_05_DateTimePeriod;
private String PTS_06_StatusCode;
private String PTS_07_TaxJurisdictionCodeQualifier;
private String PTS_08_TaxJurisdictionCode;
private String PTS_09_Description;
private String PTS_10_TypeofTaxingAuthorityCode;
private String PTS_11_StatusCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

