package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SWR {
private String SWR_01_RateValueQualifier;
private String SWR_02_Rate;
private String SWR_03_Rate;
private String SWR_04_AmountCharged;
private String SWR_05_AmountQualifierCode;
private String SWR_06_SpecialChargeorAllowanceCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

