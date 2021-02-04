package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ISS {
private String ISS_01_NumberofUnitsShipped;
private String ISS_02_UnitorBasisforMeasurementCode;
private String ISS_03_Weight;
private String ISS_04_UnitorBasisforMeasurementCode;
private String ISS_05_Volume;
private String ISS_06_UnitorBasisforMeasurementCode;
private String ISS_07_Quantity;
private String ISS_08_Weight;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

