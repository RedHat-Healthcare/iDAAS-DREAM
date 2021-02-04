package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FAC {
private String FAC_01_EquipmentInitial;
private String FAC_02_EquipmentNumber;
private String FAC_03_EquipmentDescriptionCode;
private String FAC_04_DirectionFacing;
private String FAC_05_EquipmentStatusCode;
private String FAC_06_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

