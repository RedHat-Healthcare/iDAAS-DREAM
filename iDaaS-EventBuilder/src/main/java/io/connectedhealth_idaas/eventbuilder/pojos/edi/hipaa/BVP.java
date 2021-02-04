package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BVP {
private String BVP_01_VehicleProductionStatus;
private String BVP_02_IdentificationCodeQualifier;
private String BVP_03_IdentificationCode;
private String BVP_04_IdentificationCodeQualifier;
private String BVP_05_IdentificationCode;
private String BVP_06_VehicleServiceCode;
private String BVP_07_StandardCarrierAlphaCode;
private String BVP_08_VehicleStatus;
private String BVP_09_ReferenceIdentification;
private String BVP_10_Date;
private String BVP_11_TransactionSetPurposeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

