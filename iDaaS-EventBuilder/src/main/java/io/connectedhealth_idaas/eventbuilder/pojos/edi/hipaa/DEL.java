package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DEL {
private String DEL_01_Quantity;
private String DEL_02_IdentificationCodeQualifier;
private String DEL_03_IdentificationCode;
private String DEL_04_InvoiceNumber;
private String DEL_05_MoveTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

