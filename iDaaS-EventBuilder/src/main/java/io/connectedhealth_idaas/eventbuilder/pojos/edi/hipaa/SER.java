package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SER {
private String SER_01_ProductServiceIDQualifier;
private String SER_02_ProductServiceID;
private String SER_03_MonetaryAmount;
private String SER_04_MonetaryAmount;
private String SER_05_UnitPrice;
private String SER_06_Quantity;
private String SER_07_Description;
private String SER_08_PriceIdentifierCode;
private String SER_09_PaymentMethodTypeCode;
private String SER_10_ReferenceIdentificationQualifier;
private String SER_11_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

