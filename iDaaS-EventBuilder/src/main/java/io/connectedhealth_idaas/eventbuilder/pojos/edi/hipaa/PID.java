package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PID {
private String PID_01_ItemDescriptionType;
private String PID_02_ProductProcessCharacteristicCode;
private String PID_03_AgencyQualifierCode;
private String PID_04_ProductDescriptionCode;
private String PID_05_Description;
private String PID_06_SurfaceLayerPositionCode;
private String PID_07_SourceSubqualifier;
private String PID_08_YesNoConditionorResponseCode;
private String PID_09_LanguageCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

