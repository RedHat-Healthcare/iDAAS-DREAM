package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PAD {
private String PAD_01_AssignedIdentification;
private String PAD_02_ProductTransferTypeCode;
private String PAD_03_ChangeorResponseTypeCode;
private String PAD_04_PriceMultiplierQualifier;
private String PAD_05_Multiplier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

