package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OID {
private String OID_01_ReferenceIdentification;
private String OID_02_PurchaseOrderNumber;
private String OID_03_ReferenceIdentification;
private String OID_04_PackagingFormCode;
private String OID_05_Quantity;
private String OID_06_WeightUnitCode;
private String OID_07_Weight;
private String OID_08_VolumeUnitQualifier;
private String OID_09_Volume;
private String OID_10_ApplicationErrorConditionCode;
private String OID_11_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

