package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SVD {
private String SVD_01_IdentificationCode;
private String SVD_02_MonetaryAmount;
private String SVD_04_ProductServiceID;
private String SVD_05_Quantity;
private String SVD_06_AssignedNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

