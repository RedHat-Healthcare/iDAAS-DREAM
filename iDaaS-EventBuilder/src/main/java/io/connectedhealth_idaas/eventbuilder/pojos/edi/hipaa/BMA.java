package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BMA {
private String BMA_01_TransactionSetPurposeCode;
private String BMA_02_ReferenceIdentification;
private String BMA_03_AllowanceorChargeMethodofHandlingCode;
private String BMA_04_Date;
private String BMA_05_Date;
private String BMA_06_TransactionTypeCode;
private String BMA_07_MonetaryAmount;
private String BMA_08_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

