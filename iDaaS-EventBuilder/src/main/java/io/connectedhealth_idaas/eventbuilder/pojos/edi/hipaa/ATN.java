package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ATN {
private String ATN_01_Quantity;
private String ATN_02_UnitorBasisforMeasurementCode;
private String ATN_03_QuantityQualifier;
private String ATN_04_FrequencyCode;
private String ATN_05_AttendanceTypeCode;
private String ATN_06_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

