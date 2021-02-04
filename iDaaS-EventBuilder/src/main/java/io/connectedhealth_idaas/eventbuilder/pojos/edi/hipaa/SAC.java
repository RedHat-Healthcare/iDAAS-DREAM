package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SAC {
private String SAC_01_AllowanceorChargeIndicator;
private String SAC_02_Service,Promotion,Allowance,orChargeCode;
private String SAC_03_AgencyQualifierCode;
private String SAC_04_AgencyServicePromotionAllowanceorChargeCode;
private String SAC_05_Amount;
private String SAC_06_AllowanceChargePercentQualifier;
private String SAC_07_Percent,DecimalFormat;
private String SAC_08_Rate;
private String SAC_09_UnitorBasisforMeasurementCode;
private String SAC_10_Quantity;
private String SAC_11_Quantity;
private String SAC_12_AllowanceorChargeMethodofHandlingCode;
private String SAC_13_ReferenceIdentification;
private String SAC_14_OptionNumber;
private String SAC_15_Description;
private String SAC_16_LanguageCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

