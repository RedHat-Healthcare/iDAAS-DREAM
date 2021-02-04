package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class B3B {
private String B3B_01_InvoiceNumber;
private String B3B_02_ShipmentMethodofPayment;
private String B3B_03_Date;
private String B3B_04_NetAmountDue;
private String B3B_05_Date;
private String B3B_06_StandardCarrierAlphaCode;
private String B3B_07_TransportationMethodTypeCode;
private String B3B_08_ShipmentIdentificationNumber;
private String B3B_09_WeightUnitCode;
private String B3B_10_CorrectionIndicator;
private String B3B_11_CurrencyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

