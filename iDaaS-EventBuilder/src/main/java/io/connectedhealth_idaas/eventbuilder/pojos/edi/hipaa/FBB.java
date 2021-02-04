package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FBB {
private String FBB_01_CountryCode;
private String FBB_02_MonetaryAmount;
private String FBB_03_PercentageasDecimal;
private String FBB_04_IdentificationCodeQualifier;
private String FBB_05_IdentificationCode;
private String FBB_06_MonetaryAmount;
private String FBB_07_PercentageasDecimal;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

