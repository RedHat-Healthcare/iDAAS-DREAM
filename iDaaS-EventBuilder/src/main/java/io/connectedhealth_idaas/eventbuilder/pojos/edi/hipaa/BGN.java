package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BGN {
private String BGN_01_TransactionSetPurposeCode;
private String BGN_02_ReferenceIdentification;
private String BGN_03_Date;
private String BGN_04_Time;
private String BGN_05_TimeCode;
private String BGN_06_ReferenceIdentification;
private String BGN_07_TransactionTypeCode;
private String BGN_08_ActionCode;
private String BGN_09_SecurityLevelCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

