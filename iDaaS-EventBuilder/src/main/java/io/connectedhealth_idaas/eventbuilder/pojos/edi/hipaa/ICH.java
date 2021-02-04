package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ICH {
private String ICH_01_Count;
private String ICH_02_DateTimePeriodFormatQualifier;
private String ICH_03_DateTimePeriod;
private String ICH_04_GenderCode;
private String ICH_05_ReferenceIdentification;
private String ICH_06_ReferenceIdentification;
private String ICH_07_StateorProvinceCode;
private String ICH_08_OccupationCode;
private String ICH_09_IndividualRelationshipCode;
private String ICH_10_Description;
private String ICH_11_Description;
private String ICH_12_PoliticalPartyAffiliationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

