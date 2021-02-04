package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MS2 {
private String MS2_01_StandardCarrierAlphaCode;
private String MS2_02_EquipmentNumber;
private String MS2_03_EquipmentDescriptionCode;
private String MS2_04_EquipmentNumberCheckDigit;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

