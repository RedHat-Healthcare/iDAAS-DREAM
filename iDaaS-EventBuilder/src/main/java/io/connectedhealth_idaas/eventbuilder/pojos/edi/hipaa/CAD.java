package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CAD {
private String CAD_01_TransportationMethodTypeCode;
private String CAD_02_EquipmentInitial;
private String CAD_03_EquipmentNumber;
private String CAD_04_StandardCarrierAlphaCode;
private String CAD_05_Routing;
private String CAD_06_ShipmentOrderStatusCode;
private String CAD_07_ReferenceIdentificationQualifier;
private String CAD_08_ReferenceIdentification;
private String CAD_09_ServiceLevelCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

