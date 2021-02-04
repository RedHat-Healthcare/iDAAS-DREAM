package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IDB {
private String IDB_01_LoanTypeCode;
private String IDB_02_AmountQualifierCode;
private String IDB_03_MonetaryAmount;
private String IDB_04_InterestRate;
private String IDB_05_LoanRateTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

