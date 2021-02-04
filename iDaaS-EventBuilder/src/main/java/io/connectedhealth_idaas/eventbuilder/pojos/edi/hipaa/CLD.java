package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CLD {
private String CLD_01_NumberofLoads;
private String CLD_02_NumberofUnitsShipped;
private String CLD_03_PackagingCode;
private String CLD_04_Size;
private String CLD_05_UnitorBasisforMeasurementCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

