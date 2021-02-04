package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EMT {
private String EMT_01_CodeListQualifierCode;
private String EMT_02_IndustryCode;
private String EMT_03_StateorProvinceCode;
private String EMT_04_IdentificationCode;
private String EMT_05_Description;
private String EMT_06_YesNoConditionorResponseCode;
private String EMT_07_YesNoConditionorResponseCode;
private String EMT_08_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

