package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VID {
private String VID_01_EquipmentDescriptionCode;
private String VID_02_EquipmentInitial;
private String VID_03_EquipmentNumber;
private String VID_04_SealNumber;
private String VID_05_SealNumber;
private String VID_06_EquipmentLength;
private String VID_07_Height;
private String VID_08_Width;
private String VID_09_EquipmentType;
private String VID_10_LoadEmptyStatusCode;
private String VID_11_TypeofServiceCode;
private String VID_12_LocationIdentifier;
private String VID_13_StandardCarrierAlphaCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

