package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BMM {
private String BMM_01_StandardCarrierAlphaCode;
private String BMM_02_StandardPointLocationCode;
private String BMM_03_Quantity;
private String BMM_04_WaybillNumber;
private String BMM_05_StandardPointLocationCode;
private String BMM_06_ShipmentIdentificationNumber;
private String BMM_07_VehicleStatus;
private String BMM_08_AccountNumber;
private String BMM_09_ReferenceIdentification;
private String BMM_10_TransactionSetPurposeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

