package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ADV {
private String ADV_01_AgencyQualifierCode;
private String ADV_02_ServiceCharacteristicsQualifier;
private String ADV_03_RangeMinimum;
private String ADV_04_RangeMaximum;
private String ADV_05_Category;
private String ADV_06_ServiceCharacteristicsQualifier;
private String ADV_07_MeasurementValue;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

