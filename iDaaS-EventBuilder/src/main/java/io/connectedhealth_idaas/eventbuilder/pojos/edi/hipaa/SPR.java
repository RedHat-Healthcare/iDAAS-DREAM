package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SPR {
private String SPR_01_RatingCategoryCode;
private String SPR_02_MeasurementValue;
private String SPR_03_RangeMinimum;
private String SPR_04_RangeMaximum;
private String SPR_05_RatingSummaryValueCode;
private String SPR_06_Description;
private String SPR_07_MeasurementValue;
private String SPR_08_InformationStatusCode;
private String SPR_09_UnitofTimePeriodorInterval;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

