package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OTI {
private String OTI_01_ApplicationAcknowledgmentCode;
private String OTI_02_ReferenceIdentificationQualifier;
private String OTI_03_ReferenceIdentification;
private String OTI_04_ApplicationSendersCode;
private String OTI_05_ApplicationReceiversCode;
private String OTI_06_Date;
private String OTI_07_Time;
private String OTI_08_GroupControlNumber;
private String OTI_09_TransactionSetControlNumber;
private String OTI_10_TransactionSetIdentifierCode;
private String OTI_11_VersionReleaseIndustryIdentifierCode;
private String OTI_12_TransactionSetPurposeCode;
private String OTI_13_TransactionTypeCode;
private String OTI_14_ApplicationType;
private String OTI_15_ActionCode;
private String OTI_16_TransactionHandlingCode;
private String OTI_17_StatusReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

