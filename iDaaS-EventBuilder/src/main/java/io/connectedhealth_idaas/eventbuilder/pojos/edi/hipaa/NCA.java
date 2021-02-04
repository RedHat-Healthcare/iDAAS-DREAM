package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class NCA {
private String NCA_01_AssignedIdentification;
private String NCA_02_NonconformanceResultantResponseCode;
private String NCA_03_Description;
private String NCA_04_Quantity;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

