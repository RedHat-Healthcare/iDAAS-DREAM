package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PRI {
private String PRI_01_PrimaryPublicationAuthorityCode;
private String PRI_02_TariffAgencyCode;
private String PRI_03_TariffNumber;
private String PRI_04_TariffNumberSuffix;
private String PRI_05_TariffSupplementIdentifier;
private String PRI_06_TariffSectionNumber;
private String PRI_07_TariffItemNumber;
private String PRI_08_ReferenceIdentificationQualifier;
private String PRI_09_ReferenceIdentification;
private String PRI_10_StandardCarrierAlphaCode;
private String PRI_11_DocketControlNumber;
private String PRI_12_DocketIdentification;
private String PRI_13_RevisionNumber;
private String PRI_14_GroupTitle;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

