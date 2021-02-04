package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BSW {
private String BSW_01_Date;
private String BSW_02_StandardCarrierAlphaCode;
private String BSW_03_StandardCarrierAlphaCode;
private String BSW_04_NetAmountDue;
private String BSW_05_BillingCode;
private String BSW_06_CorrectionIndicator;
private String BSW_07_StatementNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

