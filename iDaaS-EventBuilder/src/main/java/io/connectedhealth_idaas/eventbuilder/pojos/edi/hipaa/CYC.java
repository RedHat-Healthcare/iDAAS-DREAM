package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CYC {
private String CYC_01_Year;
private String CYC_02_MonthoftheYearCode;
private String CYC_03_CycleMonthHours;
private String CYC_04_StandardPointLocationCode;
private String CYC_05_StandardCarrierAlphaCode;
private String CYC_06_AssociationofAmericanRailroadsAARPoolCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

