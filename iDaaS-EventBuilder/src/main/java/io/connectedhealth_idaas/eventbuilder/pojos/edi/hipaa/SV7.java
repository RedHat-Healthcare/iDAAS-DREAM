package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SV7 {
private String SV7_01_ReferenceIdentification;
private String SV7_02_ReferenceIdentification;
private String SV7_03_PrescriptionDenialOverrideCode;
private String SV7_04_CoverageLevelCode;
private String SV7_05_ProductProcessCharacteristicCode;
private String SV7_06_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

