package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SHI {
private String SHI_01_SecurityHoldingTypeCode;
private String SHI_02_Name;
private String SHI_03_ReferenceIdentification;
private String SHI_04_ProductTransferTypeCode;
private String SHI_05_StatusCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

