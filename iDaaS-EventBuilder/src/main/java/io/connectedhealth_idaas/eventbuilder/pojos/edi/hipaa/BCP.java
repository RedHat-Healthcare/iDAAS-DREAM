package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BCP {
private String BCP_01_TransactionSetPurposeCode;
private String BCP_02_ReferenceIdentificationQualifier;
private String BCP_03_ReferenceIdentification;
private String BCP_04_Date;
private String BCP_05_ContractActionCode;
private String BCP_06_ContractTypeCode;
private String BCP_07_Date;
private String BCP_08_Time;
private String BCP_09_ChangeOrderSequenceNumber;
private String BCP_10_ReferenceIdentification;
private String BCP_11_ReferenceIdentification;
private String BCP_12_Description;
private String BCP_13_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

