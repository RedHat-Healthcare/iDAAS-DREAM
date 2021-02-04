package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class INV {
private String INV_01_Description;
private String INV_02_PercentageasDecimal;
private String INV_03_MonetaryAmount;
private String INV_04_Quantity;
private String INV_05_StateorProvinceCode;
private String INV_06_Description;
private String INV_07_MonetaryAmount;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

