package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TI {
private String TI_01_StandardCarrierAlphaCode;
private String TI_02_StandardCarrierAlphaCode;
private String TI_03_EquipmentInitial;
private String TI_04_EquipmentNumber;
private String TI_05_Date;
private String TI_06_SealStatusCode;
private String TI_07_CarTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

