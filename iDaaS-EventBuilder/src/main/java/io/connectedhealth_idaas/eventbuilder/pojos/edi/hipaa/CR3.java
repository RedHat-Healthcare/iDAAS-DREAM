package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CR3 {
private String CR3_01_CertificationTypeCode;
private String CR3_02_UnitorBasisforMeasurementCode;
private String CR3_03_Quantity;
private String CR3_04_InsulinDependentCode;
private String CR3_05_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

