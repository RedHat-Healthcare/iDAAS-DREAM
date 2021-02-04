package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LHT {
private String LHT_01_HazardousClassification;
private String LHT_02_HazardousPlacardNotation;
private String LHT_03_HazardousEndorsement;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

