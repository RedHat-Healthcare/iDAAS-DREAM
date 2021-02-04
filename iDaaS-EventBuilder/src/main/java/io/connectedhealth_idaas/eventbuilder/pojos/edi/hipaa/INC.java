package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class INC {
private String INC_01_TermsTypeCode;
private String INC_03_Quantity;
private String INC_04_Quantity;
private String INC_05_MonetaryAmount;
private String INC_06_AmountQualifierCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

