package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RO {
private String RO_01_PublicRecordorObligationCode;
private String RO_02_DispositionStatusCode;
private String RO_03_ReferenceIdentification;
private String RO_04_AmountQualifierCode;
private String RO_05_MonetaryAmount;
private String RO_06_RateValueQualifier;
private String RO_07_ReferenceIdentificationQualifier;
private String RO_08_ReferenceIdentification;
private String RO_09_TypeofAccountCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

