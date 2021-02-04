package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SPS {
private String SPS_01_Count;
private String SPS_02_Count;
private String SPS_03_Count;
private String SPS_04_ConfidenceLimit;
private String SPS_06_SampleFrequencyValueperUnitofMeasurementCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

