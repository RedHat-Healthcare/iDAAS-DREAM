package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BIA {
private String BIA_01_TransactionSetPurposeCode;
private String BIA_02_ReportTypeCode;
private String BIA_03_ReferenceIdentification;
private String BIA_04_Date;
private String BIA_05_Time;
private String BIA_06_ActionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

