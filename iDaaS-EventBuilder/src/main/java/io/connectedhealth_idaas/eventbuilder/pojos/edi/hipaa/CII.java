package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CII {
private String CII_01_Name;
private String CII_02_ReferenceIdentification;
private String CII_03_Year;
private String CII_04_CurrencyCode;
private String CII_05_Amount;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

