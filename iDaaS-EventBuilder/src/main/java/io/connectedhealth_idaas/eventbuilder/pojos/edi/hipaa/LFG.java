package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LFG {
private String LFG_01_Description;
private String LFG_02_HazardousClassification;
private String LFG_03_UNNAIdentificationCode;
private String LFG_04_HazardousPlacardNotation;
private String LFG_05_PackingGroupCode;
private String LFG_06_HazardousMaterialRegulationsExceptionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

