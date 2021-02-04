package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PDR {
private String PDR_01_TypeofRealEstateAssetCode;
private String PDR_02_CodeListQualifierCode;
private String PDR_03_IndustryCode;
private String PDR_04_OccupancyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

