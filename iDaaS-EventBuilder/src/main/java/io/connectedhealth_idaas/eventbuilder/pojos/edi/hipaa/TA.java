package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TA {
private String TA_01_TaxJurisdictionCodeQualifier;
private String TA_02_TaxJurisdictionCode;
private String TA_03_Description;
private String TA_04_TypeofTaxingAuthorityCode;
private String TA_05_Description;
private String TA_06_TaxServicePaymentCode;
private String TA_07_StatusCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

