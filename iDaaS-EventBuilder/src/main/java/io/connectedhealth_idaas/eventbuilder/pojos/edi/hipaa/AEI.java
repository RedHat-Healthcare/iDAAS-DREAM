package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AEI {
private String AEI_01_EquipmentDescriptionCode;
private String AEI_02_Quantity;
private String AEI_03_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

