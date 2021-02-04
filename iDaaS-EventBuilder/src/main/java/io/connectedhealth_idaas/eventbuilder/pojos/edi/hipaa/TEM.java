package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TEM {
private String TEM_01_Quantity;
private String TEM_02_Quantity;
private String TEM_03_WeightUnitCode;
private String TEM_04_Weight;
private String TEM_05_CommodityCharacteristicCodes;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

