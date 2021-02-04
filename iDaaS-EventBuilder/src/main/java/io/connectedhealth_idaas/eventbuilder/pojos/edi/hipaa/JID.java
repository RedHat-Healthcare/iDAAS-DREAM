package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class JID {
private String JID_01_ProductServiceIDQualifier;
private String JID_02_ProductServiceID;
private String JID_03_Quantity;
private String JID_05_ProductServiceConditionCode;
private String JID_06_MonetaryAmount;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

