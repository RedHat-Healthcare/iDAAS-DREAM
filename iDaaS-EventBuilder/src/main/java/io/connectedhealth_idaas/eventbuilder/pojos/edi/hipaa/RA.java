package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RA {
private String RA_01_RouteCode;
private String RA_02_RateValueQualifier;
private String RA_03_RateValueQualifier;
private String RA_04_AlternationPrecedenceCode;
private String RA_05_NumberofRates;
private String RA_06_UnitConversionFactor;
private String RA_07_RateLevelQualifierCode;
private String RA_08_RateLevel;
private String RA_09_Date;
private String RA_10_Date;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

