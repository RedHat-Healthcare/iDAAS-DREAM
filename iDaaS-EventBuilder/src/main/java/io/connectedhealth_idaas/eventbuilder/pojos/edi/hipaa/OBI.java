package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OBI {
private String OBI_01_ObligationTypeCode;
private String OBI_02_Name;
private String OBI_03_MonetaryAmount;
private String OBI_04_MonetaryAmount;
private String OBI_05_FrequencyCode;
private String OBI_06_Quantity;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

