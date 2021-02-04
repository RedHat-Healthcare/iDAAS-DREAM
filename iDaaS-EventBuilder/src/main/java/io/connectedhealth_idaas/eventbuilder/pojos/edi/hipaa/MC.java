package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MC {
private String MC_01_SpecialChargeorAllowanceCode;
private String MC_02_RateValueQualifier;
private String MC_03_Rate;
private String MC_04_SpecialChargeDescription;
private String MC_05_AssignedNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

