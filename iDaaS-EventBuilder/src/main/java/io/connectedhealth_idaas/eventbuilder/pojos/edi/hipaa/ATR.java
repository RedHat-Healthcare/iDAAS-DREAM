package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ATR {
private String ATR_01_TestTypeCode;
private String ATR_02_TestPeriodorIntervalValue;
private String ATR_03_UnitofTimePeriodorInterval;
private String ATR_04_MeasurementValue;
private String ATR_06_NonNumericTestValue;
private String ATR_07_Description;
private String ATR_08_YesNoConditionorResponseCode;
private String ATR_09_SurfaceLayerPositionCode;
private String ATR_10_Time;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

