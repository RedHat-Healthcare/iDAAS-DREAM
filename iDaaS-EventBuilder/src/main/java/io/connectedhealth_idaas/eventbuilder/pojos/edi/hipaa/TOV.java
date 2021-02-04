package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TOV {
private String TOV_01_HazardousVehicleTypeCode;
private String TOV_02_DateTimeQualifier;
private String TOV_03_DateTimePeriodFormatQualifier;
private String TOV_04_DateTimePeriod;
private String TOV_05_QuantityQualifier;
private String TOV_06_Quantity;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

