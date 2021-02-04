package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PI {
private String PI_01_ReferenceIdentificationQualifier;
private String PI_02_ReferenceIdentification;
private String PI_03_PrimaryPublicationAuthorityCode;
private String PI_04_RegulatoryAgencyCode;
private String PI_05_TariffAgencyCode;
private String PI_06_IssuingCarrierIdentifier;
private String PI_07_ContractSuffix;
private String PI_08_TariffItemNumber;
private String PI_09_TariffSupplementIdentifier;
private String PI_10_TariffSectionNumber;
private String PI_11_ContractSuffix;
private String PI_12_Date;
private String PI_13_Date;
private String PI_14_AlternationPrecedenceCode;
private String PI_15_AlternationPrecedenceCode;
private String PI_16_ServiceLevelCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

