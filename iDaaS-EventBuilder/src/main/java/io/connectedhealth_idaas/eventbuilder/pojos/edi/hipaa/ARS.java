package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ARS {
private String ARS_01_TypeofResidenceCode;
private String ARS_02_PropertyOwnershipRightsCode;
private String ARS_03_RateValueQualifier;
private String ARS_04_MonetaryAmount;
private String ARS_05_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

