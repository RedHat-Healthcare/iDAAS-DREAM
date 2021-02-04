package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SHD {
private String SHD_01_NumberofUnitsShipped;
private String SHD_02_QuantityReceived;
private String SHD_03_UnitorBasisforMeasurementCode;
private String SHD_04_Weight;
private String SHD_05_UnitorBasisforMeasurementCode;
private String SHD_06_Volume;
private String SHD_07_UnitorBasisforMeasurementCode;
private String SHD_08_OrderSizingFactor;
private String SHD_09_PriceBracketIdentifier;
private String SHD_10_TransportationMethodTypeCode;
private String SHD_11_StandardCarrierAlphaCode;
private String SHD_12_ShipmentOrderStatusCode;
private String SHD_13_ReferenceIdentificationQualifier;
private String SHD_14_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

