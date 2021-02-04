package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BNR {
private String BNR_01_TransactionSetPurposeCode;
private String BNR_02_ReferenceIdentification;
private String BNR_03_Date;
private String BNR_04_Time;
private String BNR_05_NonconformanceReportStatusCode;
private String BNR_06_TransactionTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

