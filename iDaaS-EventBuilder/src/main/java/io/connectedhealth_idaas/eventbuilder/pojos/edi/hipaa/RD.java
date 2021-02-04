package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RD {
private String RD_01_AssignedNumber;
private String RD_02_RateApplicationTypeCode;
private String RD_03_FreightRate;
private String RD_04_ChangeTypeCode;
private String RD_05_CurrencyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

