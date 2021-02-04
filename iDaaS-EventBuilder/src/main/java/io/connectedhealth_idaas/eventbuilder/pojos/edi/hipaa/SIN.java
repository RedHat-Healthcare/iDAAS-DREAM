package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SIN {
private String SIN_01_InformationStatusCode;
private String SIN_02_ControlledSubstanceTypeCode;
private String SIN_03_FreeformMessageText;
private String SIN_04_FrequencyCode;
private String SIN_05_Quantity;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

