package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DAD {
private String DAD_01_ActionCode;
private String DAD_02_TransactionHandlingCode;
private String DAD_03_Date;
private String DAD_04_Date;
private String DAD_05_OriginatingCompanyIdentifier;
private String DAD_06_OriginatingCompanySupplementalCode;
private String DAD_07_AmountQualifierCode;
private String DAD_08_MonetaryAmount;
private String DAD_09_ReferenceIdentification;
private String DAD_10_ReferenceIdentification;
private String DAD_11_DFIIDNumberQualifier;
private String DAD_12_DFIIdentificationNumber;
private String DAD_13_AccountNumber;
private String DAD_14_Number;
private String DAD_15_FrequencyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

