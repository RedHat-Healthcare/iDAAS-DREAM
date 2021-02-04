package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BIX {
private String BIX_01_TransactionSetPurposeCode;
private String BIX_02_StandardCarrierAlphaCode;
private String BIX_03_Date;
private String BIX_04_InspectionLocationTypeCode;
private String BIX_05_RampIdentification;
private String BIX_06_CityName;
private String BIX_07_StateorProvinceCode;
private String BIX_08_InspectorIdentityCode;
private String BIX_09_DamageCodeQualifier;
private String BIX_10_IdentificationCodeQualifier;
private String BIX_11_IdentificationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

