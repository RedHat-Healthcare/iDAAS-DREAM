package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BAU {
private String BAU_01_ReferenceIdentification;
private String BAU_02_PaymentMethodCode;
private String BAU_03_IDNumberQualifier;
private String BAU_04_IdentificationNumber;
private String BAU_05_AccountNumber;
private String BAU_06_Name;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

