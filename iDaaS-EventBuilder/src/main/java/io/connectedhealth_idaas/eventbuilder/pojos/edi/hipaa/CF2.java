package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CF2 {
private String CF2_01_InvoiceNumber;
private String CF2_02_NetAmountDue;
private String CF2_03_ShipmentIdentificationNumber;
private String CF2_04_ShipmentMethodofPayment;
private String CF2_05_Date;
private String CF2_06_Date;
private String CF2_07_WeightQualifier;
private String CF2_08_WeightUnitCode;
private String CF2_09_Weight;
private String CF2_10_TransactionTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

