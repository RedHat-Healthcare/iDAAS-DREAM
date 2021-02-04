package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VC {
private String VC_01_VehicleIdentificationNumber;
private String VC_02_VehicleDeckPositionCode;
private String VC_03_VehicleTypeCode;
private String VC_04_DealerCode;
private String VC_05_RouteCode;
private String VC_06_BayLocation;
private String VC_07_AutomotiveManufacturersCode;
private String VC_08_DamageExceptionIndicator;
private String VC_09_SupplementalInspectionCode;
private String VC_10_FactoryCarOrderNumber;
private String VC_11_VesselStowageLocation;
private String VC_12_EquipmentOrientationCode;
private String VC_13_LocationIdentifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

