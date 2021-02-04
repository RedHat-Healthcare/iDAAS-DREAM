package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PTD {
private String PTD_01_ProductTransferTypeCode;
private String PTD_02_PriceMultiplierQualifier;
private String PTD_03_Multiplier;
private String PTD_04_ReferenceIdentificationQualifier;
private String PTD_05_ReferenceIdentification;
private String PTD_06_ProductTransferMovementTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

