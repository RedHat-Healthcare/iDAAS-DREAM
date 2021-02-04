package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CID {
private String CID_01_MeasurementQualifier;
private String CID_02_ProductProcessCharacteristicCode;
private String CID_03_AgencyQualifierCode;
private String CID_04_ProductDescriptionCode;
private String CID_05_Description;
private String CID_06_SourceSubqualifier;
private String CID_07_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

