package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SMR {
private String SMR_01_LocationQualifier;
private String SMR_02_StandardPointLocationCode;
private String SMR_03_CityName;
private String SMR_04_StateorProvinceCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

