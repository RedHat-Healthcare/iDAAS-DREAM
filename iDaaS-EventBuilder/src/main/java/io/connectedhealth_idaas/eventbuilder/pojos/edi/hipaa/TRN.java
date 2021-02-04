package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TRN {
private String TRN_01_TraceTypeCode;
private String TRN_02_ReferenceIdentification;
private String TRN_03_OriginatingCompanyIdentifier;
private String TRN_04_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

