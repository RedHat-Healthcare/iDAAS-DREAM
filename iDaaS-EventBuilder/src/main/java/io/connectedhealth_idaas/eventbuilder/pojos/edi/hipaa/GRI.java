package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class GRI {
private String GRI_01_ReportedDataIDCode;
private String GRI_02_ReportedDataResponse;
private String GRI_03_QuantityQualifier;
private String GRI_04_Quantity;
private String GRI_05_AmountQualifierCode;
private String GRI_06_MonetaryAmount;
private String GRI_07_PercentQualifier;
private String GRI_08_Percent,IntegerFormat;
private String GRI_09_DateTimeQualifier;
private String GRI_10_Date;
private String GRI_11_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

