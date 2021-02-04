package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class UCS {
private String UCS_01_CodeCategory;
private String UCS_02_Description;
private String UCS_03_ItemDescriptionType;
private String UCS_04_Description;
private String UCS_05_ProductServiceIDQualifier;
private String UCS_06_ProductServiceID;
private String UCS_07_Number;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

