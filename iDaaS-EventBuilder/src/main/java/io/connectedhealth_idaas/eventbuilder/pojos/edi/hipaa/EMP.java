package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EMP {
private String EMP_01_Description;
private String EMP_02_ProductServiceIDQualifier;
private String EMP_03_ProductServiceID;
private String EMP_04_ReferenceIdentificationQualifier;
private String EMP_05_ReferenceIdentification;
private String EMP_06_YesNoConditionorResponseCode;
private String EMP_07_Description;
private String EMP_08_YesNoConditionorResponseCode;
private String EMP_09_YesNoConditionorResponseCode;
private String EMP_10_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

