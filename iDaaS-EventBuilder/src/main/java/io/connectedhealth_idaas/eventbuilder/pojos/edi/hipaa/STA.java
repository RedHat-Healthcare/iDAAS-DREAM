package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class STA {
private String STA_01_StatisticCode;
private String STA_02_MeasurementValue;
private String STA_04_MeasurementQualifier;
private String STA_05_MeasurementReferenceIDCode;
private String STA_06_RangeMinimum;
private String STA_07_RangeMaximum;
private String STA_08_MeasurementSignificanceCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

