package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CRD {
private String CRD_01_CountryCode;
private String CRD_02_AmountQualifierCode;
private String CRD_03_MonetaryAmount;
private String CRD_04_Percent,IntegerFormat;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

