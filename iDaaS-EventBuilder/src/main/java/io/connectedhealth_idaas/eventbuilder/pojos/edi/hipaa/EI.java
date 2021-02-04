package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EI {
private String EI_01_Count;
private String EI_02_EquipmentInitial;
private String EI_03_EquipmentNumber;
private String EI_04_EquipmentOrientationCode;
private String EI_05_Position;
private String EI_06_TagStatusCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

