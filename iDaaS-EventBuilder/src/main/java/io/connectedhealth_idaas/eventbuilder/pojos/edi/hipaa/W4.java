package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class W4 {
private String W4_01_AbbreviatedCustomerName;
private String W4_02_StandardCarrierAlphaCode;
private String W4_03_FreightStationAccountingCode;
private String W4_04_CityName;
private String W4_05_StateorProvinceCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

