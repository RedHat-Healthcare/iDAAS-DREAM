package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import io.connectedhealth_idaas.eventbuilder.common.hl7.HL7Versions;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MSH {
    private String MSH_1_FieldSeparator;
    private String MSH_2_EncodingCharacters;
    private String MSH_3_SendingApplication;
    private String MSH_4_SendingFacility;
    private String MSH_5_ReceivingApplication;
    private String MSH_6_ReceivingFacility;
    private String MSH_7_DateTimeofMessage;
    private String MSH_8_Security;
    private String MSH_9_MessageType;
    private String MSH_10_MessageControlID;
    private String MSH_11_ProcessingID;
    private String MSH_12_VersionID;
    private String MSH_13_SequenceNumber;
    private String MSH_14_ContinuationPointer;
    private String MSH_15_AcceptAcknowledgmentType;
    private String MSH_16_ApplicationAcknowledgmentType;
    private String MSH_17_CountryCode;
    private String MSH_18_CharacterSet;
    private String MSH_19_PrincipalLanguageOfMessage;
    private String MSH_20_AlternateCharacterSetHandlingScheme;
    private String MSH_21_MessageProfileIdentifier;
    private String MSH_22_SendingResponsibleOrganization;
    private String MSH_23_ReceivingResponsibleOrganization;
    private String MSH_24_SendingNetworkAddress;
    private String MSH_25_ReceivingNetworkAddress;

    public String buildSegment(HL7Versions hl7Version) {
        StringBuilder builder = new StringBuilder();

        switch (hl7Version)
        {
            case VERSION_2_5_1: {
                builder.append("MSH").append(MSH_1_FieldSeparator).append(MSH_2_EncodingCharacters).append(MSH_1_FieldSeparator)
                            .append(MSH_3_SendingApplication).append(MSH_1_FieldSeparator).append(MSH_4_SendingFacility).append(MSH_1_FieldSeparator).append(MSH_5_ReceivingApplication)
                            .append(MSH_1_FieldSeparator).append(MSH_6_ReceivingFacility).append(MSH_1_FieldSeparator).append(MSH_7_DateTimeofMessage).append(MSH_1_FieldSeparator)
                            .append(MSH_8_Security).append(MSH_1_FieldSeparator).append(MSH_9_MessageType).append(MSH_1_FieldSeparator).append(MSH_10_MessageControlID).append(MSH_1_FieldSeparator)
                            .append(MSH_11_ProcessingID).append(MSH_1_FieldSeparator);
            }
            break;
        }
        return builder.toString();
    }

    public String getMSH_1_FieldSeparator() {
        return this.MSH_1_FieldSeparator;
    }

    public void setMSH_1_FieldSeparator(final String MSH_1_FieldSeparator) {
        this.MSH_1_FieldSeparator = MSH_1_FieldSeparator;
    }

    public String getMSH_2_EncodingCharacters() {
        return this.MSH_2_EncodingCharacters;
    }

    public void setMSH_2_EncodingCharacters(final String MSH_2_EncodingCharacters) {
        this.MSH_2_EncodingCharacters = MSH_2_EncodingCharacters;
    }

    public String getMSH_3_SendingApplication() {
        return this.MSH_3_SendingApplication;
    }

    public void setMSH_3_SendingApplication(final String MSH_3_SendingApplication) {
        this.MSH_3_SendingApplication = MSH_3_SendingApplication;
    }

    public String getMSH_4_SendingFacility() {
        return this.MSH_4_SendingFacility;
    }

    public void setMSH_4_SendingFacility(final String MSH_4_SendingFacility) {
        this.MSH_4_SendingFacility = MSH_4_SendingFacility;
    }

    public String getMSH_5_ReceivingApplication() {
        return this.MSH_5_ReceivingApplication;
    }

    public void setMSH_5_ReceivingApplication(final String MSH_5_ReceivingApplication) {
        this.MSH_5_ReceivingApplication = MSH_5_ReceivingApplication;
    }

    public String getMSH_6_ReceivingFacility() {
        return this.MSH_6_ReceivingFacility;
    }

    public void setMSH_6_ReceivingFacility(final String MSH_6_ReceivingFacility) {
        this.MSH_6_ReceivingFacility = MSH_6_ReceivingFacility;
    }

    public String getMSH_7_DateTimeofMessage() {
        return this.MSH_7_DateTimeofMessage;
    }

    public void setMSH_7_DateTimeofMessage(final String MSH_7_DateTimeofMessage) {
        this.MSH_7_DateTimeofMessage = MSH_7_DateTimeofMessage;
    }

    public String getMSH_8_Security() {
        return this.MSH_8_Security;
    }

    public void setMSH_8_Security(final String MSH_8_Security) {
        this.MSH_8_Security = MSH_8_Security;
    }

    public String getMSH_9_MessageType() {
        return this.MSH_9_MessageType;
    }

    public void setMSH_9_MessageType(final String MSH_9_MessageType) {
        this.MSH_9_MessageType = MSH_9_MessageType;
    }

    public String getMSH_10_MessageControlID() {
        return this.MSH_10_MessageControlID;
    }

    public void setMSH_10_MessageControlID(final String MSH_10_MessageControlID) {
        this.MSH_10_MessageControlID = MSH_10_MessageControlID;
    }

    public String getMSH_11_ProcessingID() {
        return this.MSH_11_ProcessingID;
    }

    public void setMSH_11_ProcessingID(final String MSH_11_ProcessingID) {
        this.MSH_11_ProcessingID = MSH_11_ProcessingID;
    }

    public String getMSH_12_VersionID() {
        return this.MSH_12_VersionID;
    }

    public void setMSH_12_VersionID(final String MSH_12_VersionID) {
        this.MSH_12_VersionID = MSH_12_VersionID;
    }

    public String getMSH_13_SequenceNumber() {
        return this.MSH_13_SequenceNumber;
    }

    public void setMSH_13_SequenceNumber(final String MSH_13_SequenceNumber) {
        this.MSH_13_SequenceNumber = MSH_13_SequenceNumber;
    }

    public String getMSH_14_ContinuationPointer() {
        return this.MSH_14_ContinuationPointer;
    }

    public void setMSH_14_ContinuationPointer(final String MSH_14_ContinuationPointer) {
        this.MSH_14_ContinuationPointer = MSH_14_ContinuationPointer;
    }

    public String getMSH_15_AcceptAcknowledgmentType() {
        return this.MSH_15_AcceptAcknowledgmentType;
    }

    public void setMSH_15_AcceptAcknowledgmentType(final String MSH_15_AcceptAcknowledgmentType) {
        this.MSH_15_AcceptAcknowledgmentType = MSH_15_AcceptAcknowledgmentType;
    }

    public String getMSH_16_ApplicationAcknowledgmentType() {
        return this.MSH_16_ApplicationAcknowledgmentType;
    }

    public void setMSH_16_ApplicationAcknowledgmentType(final String MSH_16_ApplicationAcknowledgmentType) {
        this.MSH_16_ApplicationAcknowledgmentType = MSH_16_ApplicationAcknowledgmentType;
    }

    public String getMSH_17_CountryCode() {
        return this.MSH_17_CountryCode;
    }

    public void setMSH_17_CountryCode(final String MSH_17_CountryCode) {
        this.MSH_17_CountryCode = MSH_17_CountryCode;
    }

    public String getMSH_18_CharacterSet() {
        return this.MSH_18_CharacterSet;
    }

    public void setMSH_18_CharacterSet(final String MSH_18_CharacterSet) {
        this.MSH_18_CharacterSet = MSH_18_CharacterSet;
    }

    public String getMSH_19_PrincipalLanguageOfMessage() {
        return this.MSH_19_PrincipalLanguageOfMessage;
    }

    public void setMSH_19_PrincipalLanguageOfMessage(final String MSH_19_PrincipalLanguageOfMessage) {
        this.MSH_19_PrincipalLanguageOfMessage = MSH_19_PrincipalLanguageOfMessage;
    }

    public String getMSH_20_AlternateCharacterSetHandlingScheme() {
        return this.MSH_20_AlternateCharacterSetHandlingScheme;
    }

    public void setMSH_20_AlternateCharacterSetHandlingScheme(final String MSH_20_AlternateCharacterSetHandlingScheme) {
        this.MSH_20_AlternateCharacterSetHandlingScheme = MSH_20_AlternateCharacterSetHandlingScheme;
    }

    public String getMSH_21_MessageProfileIdentifier() {
        return this.MSH_21_MessageProfileIdentifier;
    }

    public void setMSH_21_MessageProfileIdentifier(final String MSH_21_MessageProfileIdentifier) {
        this.MSH_21_MessageProfileIdentifier = MSH_21_MessageProfileIdentifier;
    }

    public String getMSH_22_SendingResponsibleOrganization() {
        return this.MSH_22_SendingResponsibleOrganization;
    }

    public void setMSH_22_SendingResponsibleOrganization(final String MSH_22_SendingResponsibleOrganization) {
        this.MSH_22_SendingResponsibleOrganization = MSH_22_SendingResponsibleOrganization;
    }

    public String getMSH_23_ReceivingResponsibleOrganization() {
        return this.MSH_23_ReceivingResponsibleOrganization;
    }

    public void setMSH_23_ReceivingResponsibleOrganization(final String MSH_23_ReceivingResponsibleOrganization) {
        this.MSH_23_ReceivingResponsibleOrganization = MSH_23_ReceivingResponsibleOrganization;
    }

    public String getMSH_24_SendingNetworkAddress() {
        return this.MSH_24_SendingNetworkAddress;
    }

    public void setMSH_24_SendingNetworkAddress(final String MSH_24_SendingNetworkAddress) {
        this.MSH_24_SendingNetworkAddress = MSH_24_SendingNetworkAddress;
    }

    public String getMSH_25_ReceivingNetworkAddress() {
        return this.MSH_25_ReceivingNetworkAddress;
    }

    public void setMSH_25_ReceivingNetworkAddress(final String MSH_25_ReceivingNetworkAddress) {
        this.MSH_25_ReceivingNetworkAddress = MSH_25_ReceivingNetworkAddress;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

