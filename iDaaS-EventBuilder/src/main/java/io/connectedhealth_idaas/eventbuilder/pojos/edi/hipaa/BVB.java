package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BVB {
private String BVB_01_StandardCarrierAlphaCode;
private String BVB_02_IdentificationCodeQualifier;
private String BVB_03_IdentificationCode;
private String BVB_04_BayTypeCode;
private String BVB_05_CapacityQualifier;
private String BVB_06_Quantity;
private String BVB_07_TransactionSetPurposeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

