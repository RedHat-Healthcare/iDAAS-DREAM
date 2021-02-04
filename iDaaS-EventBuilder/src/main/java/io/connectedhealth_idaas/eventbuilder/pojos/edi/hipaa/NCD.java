package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class NCD {
private String NCD_01_MeasurementAttributeCode;
private String NCD_02_NonconformanceDeterminationCode;
private String NCD_03_AssignedIdentification;
private String NCD_04_ProductProcessCharacteristicCode;
private String NCD_05_AgencyQualifierCode;
private String NCD_06_ProductDescriptionCode;
private String NCD_07_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

