package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ISA {
private String ISA_01_AuthorizationInformationQualifier;
private String ISA_02_AuthorizationInformation;
private String ISA_03_SecurityInformationQualifier;
private String ISA_04_SecurityInformation;
private String ISA_05_InterchangeIDQualifier;
private String ISA_06_InterchangeSenderID;
private String ISA_07_InterchangeIDQualifier;
private String ISA_08_InterchangeReceiverID;
private String ISA_09_InterchangeDate;
private String ISA_10_InterchangeTime;
private String ISA_11_RepetitionSeparator;
private String ISA_12_InterchangeControlVersionNumber;
private String ISA_13_InterchangeControlNumber;
private String ISA_14_AcknowledgmentRequested;
private String ISA_15_InterchangeUsageIndicator;
private String ISA_16_ComponentElementSeparator;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

