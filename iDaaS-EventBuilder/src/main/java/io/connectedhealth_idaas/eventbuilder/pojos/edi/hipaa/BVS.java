package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BVS {
private String BVS_01_StandardCarrierAlphaCode;
private String BVS_02_IdentificationCodeQualifier;
private String BVS_03_IdentificationCode;
private String BVS_04_Quantity;
private String BVS_05_VehicleServiceCode;
private String BVS_06_VehicleStatus;
private String BVS_07_InvoiceNumber;
private String BVS_08_IdentificationCodeQualifier;
private String BVS_09_IdentificationCode;
private String BVS_10_BillofLadingWaybillNumber;
private String BVS_11_AccountNumber;
private String BVS_12_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

