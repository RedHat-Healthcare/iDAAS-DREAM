package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VAD {
private String VAD_01_VehicleIdentificationNumber;
private String VAD_02_InvoiceNumber;
private String VAD_03_MonetaryAmount;
private String VAD_04_Rate;
private String VAD_05_DealerCode;
private String VAD_06_ReferenceIdentification;
private String VAD_07_ApplicationErrorConditionCode;
private String VAD_08_ApplicationErrorConditionCode;
private String VAD_09_ApplicationErrorConditionCode;
private String VAD_10_DateTimeQualifier;
private String VAD_11_Date;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

