package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SID {
private String SID_01_CommodityCodeQualifier;
private String SID_02_CommodityCode;
private String SID_03_YesNoConditionorResponseCode;
private String SID_04_Date;
private String SID_05_RatingSummaryValueCode;
private String SID_06_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

