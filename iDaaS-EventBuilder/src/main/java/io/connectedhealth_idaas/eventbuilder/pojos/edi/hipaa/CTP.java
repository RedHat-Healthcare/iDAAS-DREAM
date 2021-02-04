package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CTP {
private String CTP_01_ClassofTradeCode;
private String CTP_02_PriceIdentifierCode;
private String CTP_03_UnitPrice;
private String CTP_04_Quantity;
private String CTP_06_PriceMultiplierQualifier;
private String CTP_07_Multiplier;
private String CTP_08_MonetaryAmount;
private String CTP_09_BasisofUnitPriceCode;
private String CTP_10_ConditionValue;
private String CTP_11_MultiplePriceQuantity;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

