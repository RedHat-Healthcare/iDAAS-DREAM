package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PLI {
private String PLI_01_LoanTypeCode;
private String PLI_02_MonetaryAmount;
private String PLI_03_InterestRate;
private String PLI_04_LevelofIndividual,Test,orCourseCode;
private String PLI_05_DateTimePeriodFormatQualifier;
private String PLI_06_DateTimePeriod;
private String PLI_07_MonetaryAmount;
private String PLI_08_Quantity;
private String PLI_09_LoanRateTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

