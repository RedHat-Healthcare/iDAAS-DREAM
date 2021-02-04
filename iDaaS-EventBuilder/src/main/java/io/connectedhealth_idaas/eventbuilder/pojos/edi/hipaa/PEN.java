package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PEN {
private String PEN_01_TransactionTypeCode;
private String PEN_02_MonetaryAmount;
private String PEN_03_ContributionCode;
private String PEN_04_PercentageasDecimal;
private String PEN_05_SpecialProcessingType;
private String PEN_06_ReferenceIdentification;
private String PEN_07_Number;
private String PEN_08_LoanTypeCode;
private String PEN_09_MaintenanceTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

