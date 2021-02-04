package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FAA {
private String FAA_01_AccountNumberQualifier;
private String FAA_02_AccountNumber;
private String FAA_03_Date;
private String FAA_04_MonetaryAmount;
private String FAA_05_TypeofAccountCode;
private String FAA_06_MonetaryAmount;
private String FAA_08_Quantity;
private String FAA_09_DateTimeQualifier;
private String FAA_10_DateTimePeriodFormatQualifier;
private String FAA_11_DateTimePeriod;
private String FAA_12_ReferenceIdentificationQualifier;
private String FAA_13_ReferenceIdentification;
private String FAA_14_ReferenceIdentification;
private String FAA_15_MaintenanceTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

