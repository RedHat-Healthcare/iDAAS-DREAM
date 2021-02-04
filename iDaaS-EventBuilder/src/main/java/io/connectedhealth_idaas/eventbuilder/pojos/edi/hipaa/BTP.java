package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BTP {
private String BTP_01_TransactionSetPurposeCode;
private String BTP_02_ReferenceIdentification;
private String BTP_03_Date;
private String BTP_04_Time;
private String BTP_05_TransactionTypeCode;
private String BTP_06_TransactionSetPurposeCode;
private String BTP_07_ReferenceIdentification;
private String BTP_08_Date;
private String BTP_09_Time;
private String BTP_10_PaymentMethodCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

