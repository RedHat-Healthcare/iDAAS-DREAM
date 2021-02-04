package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ICM {
private String ICM_01_FrequencyCode;
private String ICM_02_MonetaryAmount;
private String ICM_03_Quantity;
private String ICM_04_LocationIdentifier;
private String ICM_05_SalaryGrade;
private String ICM_06_CurrencyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

