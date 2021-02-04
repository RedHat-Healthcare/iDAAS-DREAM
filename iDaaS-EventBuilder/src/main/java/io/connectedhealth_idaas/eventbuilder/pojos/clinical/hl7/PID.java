package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import io.connectedhealth_idaas.eventbuilder.common.hl7.HL7Versions;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PID {
    private String PID_1_SetIDPID;
    private String PID_2_PatientID;
    private String PID_3_PatientIdentifierList;
    private String PID_4_AlternatePatientIDPID;
    private String PID_5_PatientName;
    private String PID_6_MothersMaidenName;
    private String PID_7_DateTimeofBirth;
    private String PID_8_AdministrativeSex;
    private String PID_9_PatientAlias;
    private String PID_10_Race;
    private String PID_11_PatientAddress;
    private String PID_12_CountyCode;
    private String PID_13_PhoneNumberHome;
    private String PID_14_PhoneNumberBusiness;
    private String PID_15_PrimaryLanguage;
    private String PID_16_MaritalStatus;
    private String PID_17_Religion;
    private String PID_18_PatientAccountNumber;
    private String PID_19_SSNNumberPatient;
    private String PID_20_DriversLicenseNumberPatient;
    private String PID_21_MothersIdentifier;
    private String PID_22_EthnicGroup;
    private String PID_23_BirthPlace;
    private String PID_24_MultipleBirthIndicator;
    private String PID_25_BirthOrder;
    private String PID_26_Citizenship;
    private String PID_27_VeteransMilitaryStatus;
    private String PID_28_Nationality;
    private String PID_29_PatientDeathDateandTime;
    private String PID_30_PatientDeathIndicator;
    private String PID_31_IdentityUnknownIndicator;
    private String PID_32_IdentityReliabilityCode;
    private String PID_33_LastUpdateDateTime;
    private String PID_34_LastUpdateFacility;
    private String PID_35_TaxonomicClassificationCode;
    private String PID_36_BreedCode;
    private String PID_37_Strain;
    private String PID_38_ProductionClassCode;
    private String PID_39_TribalCitizenship;
    private String PID_40_PatientTelecommunicationInformation;
    public String buildSegment(HL7Versions hl7Version, String fieldDelimiter) {
        StringBuilder builder = new StringBuilder();
        switch (hl7Version)
        {
            case VERSION_2_5_1: {
                builder.append("PID").append(fieldDelimiter);//.append(EVN_1_EventTypeCode).append(fieldDelimiter).append(EVN_2_RecordedDateTime).append(fieldDelimiter)
                         //.append(fieldDelimiter).append(EVN_6_EventOccurred).append(fieldDelimiter).append( EVN_7_EventFacility).append(fieldDelimiter);
            }
            break;
        }
        return builder.toString();
    }
    public String buildSegment(HL7Versions hl7Version) {
        return buildSegment(hl7Version,"|");
    }

    public String getPID_1_SetIDPID() {
        return this.PID_1_SetIDPID;
    }

    public void setPID_1_SetIDPID(final String PID_1_SetIDPID) {
        this.PID_1_SetIDPID = PID_1_SetIDPID;
    }

    public String getPID_2_PatientID() {
        return this.PID_2_PatientID;
    }

    public void setPID_2_PatientID(final String PID_2_PatientID) {
        this.PID_2_PatientID = PID_2_PatientID;
    }

    public String getPID_3_PatientIdentifierList() {
        return this.PID_3_PatientIdentifierList;
    }

    public void setPID_3_PatientIdentifierList(final String PID_3_PatientIdentifierList) {
        this.PID_3_PatientIdentifierList = PID_3_PatientIdentifierList;
    }

    public String getPID_4_AlternatePatientIDPID() {
        return this.PID_4_AlternatePatientIDPID;
    }

    public void setPID_4_AlternatePatientIDPID(final String PID_4_AlternatePatientIDPID) {
        this.PID_4_AlternatePatientIDPID = PID_4_AlternatePatientIDPID;
    }

    public String getPID_5_PatientName() {
        return this.PID_5_PatientName;
    }

    public void setPID_5_PatientName(final String PID_5_PatientName) {
        this.PID_5_PatientName = PID_5_PatientName;
    }

    public String getPID_6_MothersMaidenName() {
        return this.PID_6_MothersMaidenName;
    }

    public void setPID_6_MothersMaidenName(final String PID_6_MothersMaidenName) {
        this.PID_6_MothersMaidenName = PID_6_MothersMaidenName;
    }

    public String getPID_7_DateTimeofBirth() {
        return this.PID_7_DateTimeofBirth;
    }

    public void setPID_7_DateTimeofBirth(final String PID_7_DateTimeofBirth) {
        this.PID_7_DateTimeofBirth = PID_7_DateTimeofBirth;
    }

    public String getPID_8_AdministrativeSex() {
        return this.PID_8_AdministrativeSex;
    }

    public void setPID_8_AdministrativeSex(final String PID_8_AdministrativeSex) {
        this.PID_8_AdministrativeSex = PID_8_AdministrativeSex;
    }

    public String getPID_9_PatientAlias() {
        return this.PID_9_PatientAlias;
    }

    public void setPID_9_PatientAlias(final String PID_9_PatientAlias) {
        this.PID_9_PatientAlias = PID_9_PatientAlias;
    }

    public String getPID_10_Race() {
        return this.PID_10_Race;
    }

    public void setPID_10_Race(final String PID_10_Race) {
        this.PID_10_Race = PID_10_Race;
    }

    public String getPID_11_PatientAddress() {
        return this.PID_11_PatientAddress;
    }

    public void setPID_11_PatientAddress(final String PID_11_PatientAddress) {
        this.PID_11_PatientAddress = PID_11_PatientAddress;
    }

    public String getPID_12_CountyCode() {
        return this.PID_12_CountyCode;
    }

    public void setPID_12_CountyCode(final String PID_12_CountyCode) {
        this.PID_12_CountyCode = PID_12_CountyCode;
    }

    public String getPID_13_PhoneNumberHome() {
        return this.PID_13_PhoneNumberHome;
    }

    public void setPID_13_PhoneNumberHome(final String PID_13_PhoneNumberHome) {
        this.PID_13_PhoneNumberHome = PID_13_PhoneNumberHome;
    }

    public String getPID_14_PhoneNumberBusiness() {
        return this.PID_14_PhoneNumberBusiness;
    }

    public void setPID_14_PhoneNumberBusiness(final String PID_14_PhoneNumberBusiness) {
        this.PID_14_PhoneNumberBusiness = PID_14_PhoneNumberBusiness;
    }

    public String getPID_15_PrimaryLanguage() {
        return this.PID_15_PrimaryLanguage;
    }

    public void setPID_15_PrimaryLanguage(final String PID_15_PrimaryLanguage) {
        this.PID_15_PrimaryLanguage = PID_15_PrimaryLanguage;
    }

    public String getPID_16_MaritalStatus() {
        return this.PID_16_MaritalStatus;
    }

    public void setPID_16_MaritalStatus(final String PID_16_MaritalStatus) {
        this.PID_16_MaritalStatus = PID_16_MaritalStatus;
    }

    public String getPID_17_Religion() {
        return this.PID_17_Religion;
    }

    public void setPID_17_Religion(final String PID_17_Religion) {
        this.PID_17_Religion = PID_17_Religion;
    }

    public String getPID_18_PatientAccountNumber() {
        return this.PID_18_PatientAccountNumber;
    }

    public void setPID_18_PatientAccountNumber(final String PID_18_PatientAccountNumber) {
        this.PID_18_PatientAccountNumber = PID_18_PatientAccountNumber;
    }

    public String getPID_19_SSNNumberPatient() {
        return this.PID_19_SSNNumberPatient;
    }

    public void setPID_19_SSNNumberPatient(final String PID_19_SSNNumberPatient) {
        this.PID_19_SSNNumberPatient = PID_19_SSNNumberPatient;
    }

    public String getPID_20_DriversLicenseNumberPatient() {
        return this.PID_20_DriversLicenseNumberPatient;
    }

    public void setPID_20_DriversLicenseNumberPatient(final String PID_20_DriversLicenseNumberPatient) {
        this.PID_20_DriversLicenseNumberPatient = PID_20_DriversLicenseNumberPatient;
    }

    public String getPID_21_MothersIdentifier() {
        return this.PID_21_MothersIdentifier;
    }

    public void setPID_21_MothersIdentifier(final String PID_21_MothersIdentifier) {
        this.PID_21_MothersIdentifier = PID_21_MothersIdentifier;
    }

    public String getPID_22_EthnicGroup() {
        return this.PID_22_EthnicGroup;
    }

    public void setPID_22_EthnicGroup(final String PID_22_EthnicGroup) {
        this.PID_22_EthnicGroup = PID_22_EthnicGroup;
    }

    public String getPID_23_BirthPlace() {
        return this.PID_23_BirthPlace;
    }

    public void setPID_23_BirthPlace(final String PID_23_BirthPlace) {
        this.PID_23_BirthPlace = PID_23_BirthPlace;
    }

    public String getPID_24_MultipleBirthIndicator() {
        return this.PID_24_MultipleBirthIndicator;
    }

    public void setPID_24_MultipleBirthIndicator(final String PID_24_MultipleBirthIndicator) {
        this.PID_24_MultipleBirthIndicator = PID_24_MultipleBirthIndicator;
    }

    public String getPID_25_BirthOrder() {
        return this.PID_25_BirthOrder;
    }

    public void setPID_25_BirthOrder(final String PID_25_BirthOrder) {
        this.PID_25_BirthOrder = PID_25_BirthOrder;
    }

    public String getPID_26_Citizenship() {
        return this.PID_26_Citizenship;
    }

    public void setPID_26_Citizenship(final String PID_26_Citizenship) {
        this.PID_26_Citizenship = PID_26_Citizenship;
    }

    public String getPID_27_VeteransMilitaryStatus() {
        return this.PID_27_VeteransMilitaryStatus;
    }

    public void setPID_27_VeteransMilitaryStatus(final String PID_27_VeteransMilitaryStatus) {
        this.PID_27_VeteransMilitaryStatus = PID_27_VeteransMilitaryStatus;
    }

    public String getPID_28_Nationality() {
        return this.PID_28_Nationality;
    }

    public void setPID_28_Nationality(final String PID_28_Nationality) {
        this.PID_28_Nationality = PID_28_Nationality;
    }

    public String getPID_29_PatientDeathDateandTime() {
        return this.PID_29_PatientDeathDateandTime;
    }

    public void setPID_29_PatientDeathDateandTime(final String PID_29_PatientDeathDateandTime) {
        this.PID_29_PatientDeathDateandTime = PID_29_PatientDeathDateandTime;
    }

    public String getPID_30_PatientDeathIndicator() {
        return this.PID_30_PatientDeathIndicator;
    }

    public void setPID_30_PatientDeathIndicator(final String PID_30_PatientDeathIndicator) {
        this.PID_30_PatientDeathIndicator = PID_30_PatientDeathIndicator;
    }

    public String getPID_31_IdentityUnknownIndicator() {
        return this.PID_31_IdentityUnknownIndicator;
    }

    public void setPID_31_IdentityUnknownIndicator(final String PID_31_IdentityUnknownIndicator) {
        this.PID_31_IdentityUnknownIndicator = PID_31_IdentityUnknownIndicator;
    }

    public String getPID_32_IdentityReliabilityCode() {
        return this.PID_32_IdentityReliabilityCode;
    }

    public void setPID_32_IdentityReliabilityCode(final String PID_32_IdentityReliabilityCode) {
        this.PID_32_IdentityReliabilityCode = PID_32_IdentityReliabilityCode;
    }

    public String getPID_33_LastUpdateDateTime() {
        return this.PID_33_LastUpdateDateTime;
    }

    public void setPID_33_LastUpdateDateTime(final String PID_33_LastUpdateDateTime) {
        this.PID_33_LastUpdateDateTime = PID_33_LastUpdateDateTime;
    }

    public String getPID_34_LastUpdateFacility() {
        return this.PID_34_LastUpdateFacility;
    }

    public void setPID_34_LastUpdateFacility(final String PID_34_LastUpdateFacility) {
        this.PID_34_LastUpdateFacility = PID_34_LastUpdateFacility;
    }

    public String getPID_35_TaxonomicClassificationCode() {
        return this.PID_35_TaxonomicClassificationCode;
    }

    public void setPID_35_TaxonomicClassificationCode(final String PID_35_TaxonomicClassificationCode) {
        this.PID_35_TaxonomicClassificationCode = PID_35_TaxonomicClassificationCode;
    }

    public String getPID_36_BreedCode() {
        return this.PID_36_BreedCode;
    }

    public void setPID_36_BreedCode(final String PID_36_BreedCode) {
        this.PID_36_BreedCode = PID_36_BreedCode;
    }

    public String getPID_37_Strain() {
        return this.PID_37_Strain;
    }

    public void setPID_37_Strain(final String PID_37_Strain) {
        this.PID_37_Strain = PID_37_Strain;
    }

    public String getPID_38_ProductionClassCode() {
        return this.PID_38_ProductionClassCode;
    }

    public void setPID_38_ProductionClassCode(final String PID_38_ProductionClassCode) {
        this.PID_38_ProductionClassCode = PID_38_ProductionClassCode;
    }

    public String getPID_39_TribalCitizenship() {
        return this.PID_39_TribalCitizenship;
    }

    public void setPID_39_TribalCitizenship(final String PID_39_TribalCitizenship) {
        this.PID_39_TribalCitizenship = PID_39_TribalCitizenship;
    }

    public String getPID_40_PatientTelecommunicationInformation() {
        return this.PID_40_PatientTelecommunicationInformation;
    }

    public void setPID_40_PatientTelecommunicationInformation(final String PID_40_PatientTelecommunicationInformation) {
        this.PID_40_PatientTelecommunicationInformation = PID_40_PatientTelecommunicationInformation;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

