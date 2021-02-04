package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PTF {
private String PTF_01_AmountQualifierCode;
private String PTF_02_MonetaryAmount;
private String PTF_03_FrequencyCode;
private String PTF_05_EntityIdentifierCode;
private String PTF_06_TaxTypeCode;
private String PTF_07_TaxExemptCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

