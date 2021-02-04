package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SSC {
private String SSC_01_TransactionSetPurposeCode;
private String SSC_02_ReferenceIdentification;
private String SSC_03_DateTimePeriodFormatQualifier;
private String SSC_04_DateTimePeriod;
private String SSC_05_IdentificationCode;
private String SSC_06_ServiceCommitmentTypeCode;
private String SSC_07_LoadEmptyStatusCode;
private String SSC_08_Percent,IntegerFormat;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

