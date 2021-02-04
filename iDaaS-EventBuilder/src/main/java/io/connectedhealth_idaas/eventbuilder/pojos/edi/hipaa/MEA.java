package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MEA {
private String MEA_01_MeasurementReferenceIDCode;
private String MEA_02_MeasurementQualifier;
private String MEA_03_MeasurementValue;
private String MEA_05_RangeMinimum;
private String MEA_06_RangeMaximum;
private String MEA_07_MeasurementSignificanceCode;
private String MEA_08_MeasurementAttributeCode;
private String MEA_09_SurfaceLayerPositionCode;
private String MEA_10_MeasurementMethodorDevice;
private String MEA_11_CodeListQualifierCode;
private String MEA_12_IndustryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

