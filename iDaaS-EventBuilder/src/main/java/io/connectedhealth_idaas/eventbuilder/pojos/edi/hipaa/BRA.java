package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BRA {
private String BRA_01_ReferenceIdentification;
private String BRA_02_Date;
private String BRA_03_TransactionSetPurposeCode;
private String BRA_04_ReceivingAdviceorAcceptanceCertificateTypeCode;
private String BRA_05_Time;
private String BRA_06_ReceivingConditionCode;
private String BRA_07_ActionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

