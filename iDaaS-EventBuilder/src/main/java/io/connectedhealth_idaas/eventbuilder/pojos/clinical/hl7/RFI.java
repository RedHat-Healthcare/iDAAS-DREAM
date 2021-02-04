package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RFI {
    private String RFI_1_RequestDate;
    private String RFI_2_ResponseDueDate;
    private String RFI_3_PatientConsent;
    private String RFI_4_DateAdditionalInformationWasSubmitted;

    public String getRFI_1_RequestDate() {
        return this.RFI_1_RequestDate;
    }

    public void setRFI_1_RequestDate(final String RFI_1_RequestDate) {
        this.RFI_1_RequestDate = RFI_1_RequestDate;
    }

    public String getRFI_2_ResponseDueDate() {
        return this.RFI_2_ResponseDueDate;
    }

    public void setRFI_2_ResponseDueDate(final String RFI_2_ResponseDueDate) {
        this.RFI_2_ResponseDueDate = RFI_2_ResponseDueDate;
    }

    public String getRFI_3_PatientConsent() {
        return this.RFI_3_PatientConsent;
    }

    public void setRFI_3_PatientConsent(final String RFI_3_PatientConsent) {
        this.RFI_3_PatientConsent = RFI_3_PatientConsent;
    }

    public String getRFI_4_DateAdditionalInformationWasSubmitted() {
        return this.RFI_4_DateAdditionalInformationWasSubmitted;
    }

    public void setRFI_4_DateAdditionalInformationWasSubmitted(final String RFI_4_DateAdditionalInformationWasSubmitted) {
        this.RFI_4_DateAdditionalInformationWasSubmitted = RFI_4_DateAdditionalInformationWasSubmitted;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

