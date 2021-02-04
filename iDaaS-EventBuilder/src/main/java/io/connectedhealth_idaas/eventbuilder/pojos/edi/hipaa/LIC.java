package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LIC {
private String LIC_01_StateorProvinceCode;
private String LIC_02_ProductServiceIDQualifier;
private String LIC_03_ProductServiceID;
private String LIC_04_YesNoConditionorResponseCode;
private String LIC_05_StatusCode;
private String LIC_06_ReferenceIdentification;
private String LIC_07_StateorProvinceCode;
private String LIC_08_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

