package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PES {
    private String PES_1_SenderOrganizationName;
    private String PES_2_SenderIndividualName;
    private String PES_3_SenderAddress;
    private String PES_4_SenderTelephone;
    private String PES_5_SenderEventIdentifier;
    private String PES_6_SenderSequenceNumber;
    private String PES_7_SenderEventDescription;
    private String PES_8_SenderComment;
    private String PES_9_SenderAwareDateTime;
    private String PES_10_EventReportDate;
    private String PES_11_EventReportTimingType;
    private String PES_12_EventReportSource;
    private String PES_13_EventReportedTo;

    public String getPES_1_SenderOrganizationName() {
        return this.PES_1_SenderOrganizationName;
    }

    public void setPES_1_SenderOrganizationName(final String PES_1_SenderOrganizationName) {
        this.PES_1_SenderOrganizationName = PES_1_SenderOrganizationName;
    }

    public String getPES_2_SenderIndividualName() {
        return this.PES_2_SenderIndividualName;
    }

    public void setPES_2_SenderIndividualName(final String PES_2_SenderIndividualName) {
        this.PES_2_SenderIndividualName = PES_2_SenderIndividualName;
    }

    public String getPES_3_SenderAddress() {
        return this.PES_3_SenderAddress;
    }

    public void setPES_3_SenderAddress(final String PES_3_SenderAddress) {
        this.PES_3_SenderAddress = PES_3_SenderAddress;
    }

    public String getPES_4_SenderTelephone() {
        return this.PES_4_SenderTelephone;
    }

    public void setPES_4_SenderTelephone(final String PES_4_SenderTelephone) {
        this.PES_4_SenderTelephone = PES_4_SenderTelephone;
    }

    public String getPES_5_SenderEventIdentifier() {
        return this.PES_5_SenderEventIdentifier;
    }

    public void setPES_5_SenderEventIdentifier(final String PES_5_SenderEventIdentifier) {
        this.PES_5_SenderEventIdentifier = PES_5_SenderEventIdentifier;
    }

    public String getPES_6_SenderSequenceNumber() {
        return this.PES_6_SenderSequenceNumber;
    }

    public void setPES_6_SenderSequenceNumber(final String PES_6_SenderSequenceNumber) {
        this.PES_6_SenderSequenceNumber = PES_6_SenderSequenceNumber;
    }

    public String getPES_7_SenderEventDescription() {
        return this.PES_7_SenderEventDescription;
    }

    public void setPES_7_SenderEventDescription(final String PES_7_SenderEventDescription) {
        this.PES_7_SenderEventDescription = PES_7_SenderEventDescription;
    }

    public String getPES_8_SenderComment() {
        return this.PES_8_SenderComment;
    }

    public void setPES_8_SenderComment(final String PES_8_SenderComment) {
        this.PES_8_SenderComment = PES_8_SenderComment;
    }

    public String getPES_9_SenderAwareDateTime() {
        return this.PES_9_SenderAwareDateTime;
    }

    public void setPES_9_SenderAwareDateTime(final String PES_9_SenderAwareDateTime) {
        this.PES_9_SenderAwareDateTime = PES_9_SenderAwareDateTime;
    }

    public String getPES_10_EventReportDate() {
        return this.PES_10_EventReportDate;
    }

    public void setPES_10_EventReportDate(final String PES_10_EventReportDate) {
        this.PES_10_EventReportDate = PES_10_EventReportDate;
    }

    public String getPES_11_EventReportTimingType() {
        return this.PES_11_EventReportTimingType;
    }

    public void setPES_11_EventReportTimingType(final String PES_11_EventReportTimingType) {
        this.PES_11_EventReportTimingType = PES_11_EventReportTimingType;
    }

    public String getPES_12_EventReportSource() {
        return this.PES_12_EventReportSource;
    }

    public void setPES_12_EventReportSource(final String PES_12_EventReportSource) {
        this.PES_12_EventReportSource = PES_12_EventReportSource;
    }

    public String getPES_13_EventReportedTo() {
        return this.PES_13_EventReportedTo;
    }

    public void setPES_13_EventReportedTo(final String PES_13_EventReportedTo) {
        this.PES_13_EventReportedTo = PES_13_EventReportedTo;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

