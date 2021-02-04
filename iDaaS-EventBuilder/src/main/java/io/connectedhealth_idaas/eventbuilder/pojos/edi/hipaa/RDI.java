package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RDI {
private String RDI_01_EntityIdentifierCode;
private String RDI_02_CountryCode;
private String RDI_03_AmountQualifierCode;
private String RDI_04_Amount;
private String RDI_05_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

