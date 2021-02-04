package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class X01 {
private String X01_01_StandardCarrierAlphaCode;
private String X01_02_LocationQualifier;
private String X01_03_LocationIdentifier;
private String X01_04_VesselCodeQualifier;
private String X01_05_VesselCode;
private String X01_06_VesselName;
private String X01_07_FlightVoyageNumber;
private String X01_08_DateTimeQualifier;
private String X01_09_Date;
private String X01_10_Quantity;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

