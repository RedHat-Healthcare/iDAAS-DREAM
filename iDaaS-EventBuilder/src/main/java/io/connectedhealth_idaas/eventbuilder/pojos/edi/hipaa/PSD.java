package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PSD {
private String PSD_01_SampleProcessStatusCode;
private String PSD_02_SampleSelectionMethodCode;
private String PSD_03_SampleFrequencyValueperUnitofMeasurementCode;
private String PSD_05_SampleDescriptionCode;
private String PSD_06_SampleDirectionCode;
private String PSD_07_PositionCode;
private String PSD_08_Description;
private String PSD_09_SampleSelectionModulus;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

