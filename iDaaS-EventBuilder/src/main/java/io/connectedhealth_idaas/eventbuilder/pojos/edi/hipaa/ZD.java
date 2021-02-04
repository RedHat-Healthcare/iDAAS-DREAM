package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ZD {
private String ZD_01_TransactionSetIdentifierCode;
private String ZD_02_ShipmentIdentificationNumber;
private String ZD_03_EquipmentInitial;
private String ZD_04_EquipmentNumber;
private String ZD_05_TransactionReferenceNumber;
private String ZD_06_TransactionReferenceDate;
private String ZD_07_CorrectionIndicator;
private String ZD_08_StandardCarrierAlphaCode;
private String ZD_09_EquipmentNumberCheckDigit;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

