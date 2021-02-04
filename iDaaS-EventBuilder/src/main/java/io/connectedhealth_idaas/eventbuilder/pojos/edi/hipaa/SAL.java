package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SAL {
private String SAL_01_YesNoConditionorResponseCode;
private String SAL_02_Amount;
private String SAL_03_LaborRate;
private String SAL_04_NumberofPeriods;
private String SAL_05_UnitofTimePeriodorInterval;
private String SAL_06_Date;
private String SAL_07_Date;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

