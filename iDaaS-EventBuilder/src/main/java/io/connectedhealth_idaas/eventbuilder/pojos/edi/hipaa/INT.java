package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class INT {
private String INT_01_InterestTypeCode;
private String INT_02_InterestRate;
private String INT_03_DateTimePeriodFormatQualifier;
private String INT_04_DateTimePeriod;
private String INT_05_Quantity;
private String INT_06_QuantityQualifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

