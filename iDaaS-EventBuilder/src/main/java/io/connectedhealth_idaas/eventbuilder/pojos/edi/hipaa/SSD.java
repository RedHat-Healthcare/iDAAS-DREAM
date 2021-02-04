package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SSD {
private String SSD_01_ReferenceIdentification;
private String SSD_02_ReferenceIdentification;
private String SSD_03_PurchaseOrderNumber;
private String SSD_04_ApplicationErrorConditionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

