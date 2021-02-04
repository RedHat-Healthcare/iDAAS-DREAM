package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LCT {
private String LCT_01_ReferenceIdentification;
private String LCT_02_PackagingFormCode;
private String LCT_03_Description;
private String LCT_04_WeightUnitCode;
private String LCT_05_UnitWeight;
private String LCT_06_MeasurementUnitQualifier;
private String LCT_07_Length;
private String LCT_08_Width;
private String LCT_09_Height;
private String LCT_10_VolumeUnitQualifier;
private String LCT_11_Volume;
private String LCT_12_PalletExchangeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

