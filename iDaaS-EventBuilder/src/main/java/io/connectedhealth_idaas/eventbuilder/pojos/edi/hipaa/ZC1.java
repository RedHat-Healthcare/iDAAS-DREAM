package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ZC1 {
private String ZC1_01_ShipmentIdentificationNumber;
private String ZC1_02_EquipmentInitial;
private String ZC1_03_EquipmentNumber;
private String ZC1_04_TransactionReferenceNumber;
private String ZC1_05_TransactionReferenceDate;
private String ZC1_06_CorrectionIndicator;
private String ZC1_07_StandardCarrierAlphaCode;
private String ZC1_08_TransportationMethodTypeCode;
private String ZC1_09_EquipmentNumberCheckDigit;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

