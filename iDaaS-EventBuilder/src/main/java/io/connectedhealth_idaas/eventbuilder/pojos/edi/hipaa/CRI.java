package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CRI {
private String CRI_01_MaintenanceTypeCode;
private String CRI_02_ClaimStatusCode;
private String CRI_03_MaintenanceReasonCode;
private String CRI_04_YesNoConditionorResponseCode;
private String CRI_05_FrequencyCode;
private String CRI_06_ClaimFilingIndicatorCode;
private String CRI_07_DateTimePeriodFormatQualifier;
private String CRI_08_DateTimePeriod;
private String CRI_09_AdjustmentReasonCodeCharacteristic;
private String CRI_10_LateReasonCode;
private String CRI_11_ConditionIndicator;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

