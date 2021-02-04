package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IMC {
private String IMC_01_ExchangeBlockSequence;
private String IMC_02_ExchangeBlockTypeIdentifier;
private String IMC_03_InterchangeIDQualifier;
private String IMC_04_InterchangeSenderID;
private String IMC_05_InterchangeIDQualifier;
private String IMC_06_InterchangeReceiverID;
private String IMC_07_InterchangeDate;
private String IMC_08_InterchangeTime;
private String IMC_09_InterchangeControlNumber;
private String IMC_10_ExchangeBlockLength;
private String IMC_11_FilterIDCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

