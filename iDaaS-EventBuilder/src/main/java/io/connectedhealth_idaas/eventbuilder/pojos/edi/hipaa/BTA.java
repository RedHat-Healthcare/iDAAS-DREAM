package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BTA {
private String BTA_01_AcknowledgmentType;
private String BTA_02_Date;
private String BTA_03_AmountQualifierCode;
private String BTA_04_MonetaryAmount;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

