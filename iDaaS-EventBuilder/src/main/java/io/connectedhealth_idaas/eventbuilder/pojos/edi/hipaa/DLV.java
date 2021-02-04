package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DLV {
private String DLV_01_Quantity;
private String DLV_02_ProductServiceIDQualifier;
private String DLV_03_ProductServiceID;
private String DLV_04_ProgramTypeCode;
private String DLV_05_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

