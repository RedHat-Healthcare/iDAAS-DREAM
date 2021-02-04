package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DED {
private String DED_01_TypeofDeduction;
private String DED_02_ReferenceIdentification;
private String DED_03_Date;
private String DED_04_Amount;
private String DED_05_ReferenceIdentification;
private String DED_06_YesNoConditionorResponseCode;
private String DED_07_Name;
private String DED_08_ReferenceIdentification;
private String DED_09_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

