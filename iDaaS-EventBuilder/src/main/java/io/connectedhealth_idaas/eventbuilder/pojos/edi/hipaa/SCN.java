package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SCN {
private String SCN_01_StandardCarrierAlphaCode;
private String SCN_02_ReferenceIdentification;
private String SCN_03_TransactionSetPurposeCode;
private String SCN_04_ShipmentMethodofPayment;
private String SCN_05_Amount;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

