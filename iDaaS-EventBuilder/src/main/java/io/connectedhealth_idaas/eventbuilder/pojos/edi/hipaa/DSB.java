package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DSB {
private String DSB_01_DisabilityTypeCode;
private String DSB_02_Quantity;
private String DSB_03_OccupationCode;
private String DSB_04_WorkIntensityCode;
private String DSB_05_ProductOptionCode;
private String DSB_06_MonetaryAmount;
private String DSB_07_ProductServiceIDQualifier;
private String DSB_08_MedicalCodeValue;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

