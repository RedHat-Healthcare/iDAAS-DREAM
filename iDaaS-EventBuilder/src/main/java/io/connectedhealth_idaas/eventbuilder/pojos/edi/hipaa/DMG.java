package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DMG {
private String DMG_01_DateTimePeriodFormatQualifier;
private String DMG_02_DateTimePeriod;
private String DMG_03_GenderCode;
private String DMG_04_MaritalStatusCode;
private String DMG_06_CitizenshipStatusCode;
private String DMG_07_CountryCode;
private String DMG_08_BasisofVerificationCode;
private String DMG_09_Quantity;
private String DMG_10_CodeListQualifierCode;
private String DMG_11_IndustryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

