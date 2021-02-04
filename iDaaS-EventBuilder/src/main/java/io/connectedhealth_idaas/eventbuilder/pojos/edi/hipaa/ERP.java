package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ERP {
private String ERP_01_TransactionTypeCode;
private String ERP_02_StatusReasonCode;
private String ERP_03_ActionCode;
private String ERP_04_DateTimePeriodFormatQualifier;
private String ERP_05_DateTimePeriod;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

