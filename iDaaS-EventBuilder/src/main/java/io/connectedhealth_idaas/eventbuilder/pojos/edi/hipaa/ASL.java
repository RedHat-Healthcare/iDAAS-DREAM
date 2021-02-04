package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ASL {
private String ASL_01_AmountQualifierCode;
private String ASL_02_MonetaryAmount;
private String ASL_03_AssetLiabilityTypeCode;
private String ASL_04_FrequencyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

