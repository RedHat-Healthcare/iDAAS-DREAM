package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BPT {
private String BPT_01_TransactionSetPurposeCode;
private String BPT_02_ReferenceIdentification;
private String BPT_03_Date;
private String BPT_04_ReportTypeCode;
private String BPT_05_PriceMultiplierQualifier;
private String BPT_06_Multiplier;
private String BPT_07_ActionCode;
private String BPT_08_Time;
private String BPT_09_ReferenceIdentification;
private String BPT_10_SecurityLevelCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

