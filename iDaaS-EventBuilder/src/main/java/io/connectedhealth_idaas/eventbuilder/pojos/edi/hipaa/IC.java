package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IC {
private String IC_01_EquipmentInitial;
private String IC_02_EquipmentNumber;
private String IC_03_TareWeight;
private String IC_04_TareQualifierCode;
private String IC_05_StandardCarrierAlphaCode;
private String IC_06_EquipmentLength;
private String IC_07_StandardCarrierAlphaCode;
private String IC_08_ChassisType;
private String IC_09_EquipmentNumberCheckDigit;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

