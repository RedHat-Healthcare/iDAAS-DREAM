package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CGS {
private String CGS_01_AmountCharged;
private String CGS_02_CurrencyCode;
private String CGS_03_DateTimeQualifier;
private String CGS_04_Date;
private String CGS_05_SpecialChargeorAllowanceCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

