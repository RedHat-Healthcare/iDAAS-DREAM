package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class USD {
private String USD_01_RelationshipCode;
private String USD_02_AssignedIdentification;
private String USD_03_Rate;
private String USD_04_PercentageasDecimal;
private String USD_06_Quantity;
private String USD_07_Quantity;
private String USD_08_MonetaryAmount;
private String USD_09_Amount;
private String USD_11_RangeMinimum;
private String USD_12_RangeMaximum;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

