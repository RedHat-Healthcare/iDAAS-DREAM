package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PAI {
private String PAI_01_Date;
private String PAI_02_MeasurementValue;
private String PAI_03_UnitorBasisforMeasurementCode;
private String PAI_04_Amount;
private String PAI_05_Amount;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

