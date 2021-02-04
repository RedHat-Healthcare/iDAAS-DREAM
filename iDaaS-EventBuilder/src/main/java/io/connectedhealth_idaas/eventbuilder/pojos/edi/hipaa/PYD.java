package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PYD {
private String PYD_01_MonetaryAmount;
private String PYD_02_FrequencyCode;
private String PYD_03_TaxTreatmentCode;
private String PYD_04_DeductionTypeCode;
private String PYD_05_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

