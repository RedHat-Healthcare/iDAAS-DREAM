package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LEQ {
private String LEQ_01_ReferenceIdentificationQualifier;
private String LEQ_02_ReferenceIdentification;
private String LEQ_03_Year;
private String LEQ_04_MonthoftheYearCode;
private String LEQ_05_StandardCarrierAlphaCode;
private String LEQ_06_ReferenceIdentification;
private String LEQ_07_MonetaryAmount;
private String LEQ_08_Date;
private String LEQ_09_ExchangeRate;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

