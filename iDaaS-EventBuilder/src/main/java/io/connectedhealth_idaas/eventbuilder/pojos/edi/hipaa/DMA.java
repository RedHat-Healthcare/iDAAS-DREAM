package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DMA {
private String DMA_01_ReferenceIdentification;
private String DMA_02_StateorProvinceCode;
private String DMA_03_ReferenceIdentification;
private String DMA_04_StateorProvinceCode;
private String DMA_05_ApplicantTypeCode;
private String DMA_06_CodeForLicensing,Certification,Registration,orAccreditationAgency;
private String DMA_07_CountryCode;
private String DMA_08_LanguageCode;
private String DMA_09_StatusCode;
private String DMA_10_CityName;
private String DMA_11_Color;
private String DMA_12_Color;
private String DMA_13_MeasurementUnitQualifier;
private String DMA_14_Height;
private String DMA_15_WeightUnitCode;
private String DMA_16_Weight;
private String DMA_17_Description;
private String DMA_18_CountryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

