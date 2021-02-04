package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CIC {
private String CIC_01_EquipmentInitial;
private String CIC_02_EquipmentNumber;
private String CIC_03_CarTypeCode;
private String CIC_04_EquipmentNumber;
private String CIC_05_MechanicalCarCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

