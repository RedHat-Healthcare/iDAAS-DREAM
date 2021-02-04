package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BOR {
private String BOR_01_ReportTypeCode;
private String BOR_02_ReferenceIdentification;
private String BOR_03_ReferenceIdentification;
private String BOR_04_ReferenceIdentification;
private String BOR_05_DateTimePeriodFormatQualifier;
private String BOR_06_DateTimePeriod;
private String BOR_07_TransportationMethodTypeCode;
private String BOR_08_ActionCode;
private String BOR_09_StatusReasonCode;
private String BOR_10_LanguageCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

