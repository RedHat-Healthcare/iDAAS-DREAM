package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BJF {
private String BJF_01_TransactionSetPurposeCode;
private String BJF_02_TransactionTypeCode;
private String BJF_03_Rule260JunctionCode;
private String BJF_04_StandardPointLocationCode;
private String BJF_05_CityName;
private String BJF_06_StateorProvinceCode;
private String BJF_07_CountryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

