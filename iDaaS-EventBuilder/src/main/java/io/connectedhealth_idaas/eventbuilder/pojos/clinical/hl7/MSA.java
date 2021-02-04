package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MSA {
    private String MSA_1_AcknowledgmentCode;
    private String MSA_2_MessageControlID;
    private String MSA_3_TextMessage;
    private String MSA_4_ExpectedSequenceNumber;
    private String MSA_6_ErrorCondition;
    private String MSA_7_MessageWaitingNumber;
    private String MSA_8_MessageWaitingPriority;

    public String getMSA_1_AcknowledgmentCode() {
        return this.MSA_1_AcknowledgmentCode;
    }

    public void setMSA_1_AcknowledgmentCode(final String MSA_1_AcknowledgmentCode) {
        this.MSA_1_AcknowledgmentCode = MSA_1_AcknowledgmentCode;
    }

    public String getMSA_2_MessageControlID() {
        return this.MSA_2_MessageControlID;
    }

    public void setMSA_2_MessageControlID(final String MSA_2_MessageControlID) {
        this.MSA_2_MessageControlID = MSA_2_MessageControlID;
    }

    public String getMSA_3_TextMessage() {
        return this.MSA_3_TextMessage;
    }

    public void setMSA_3_TextMessage(final String MSA_3_TextMessage) {
        this.MSA_3_TextMessage = MSA_3_TextMessage;
    }

    public String getMSA_4_ExpectedSequenceNumber() {
        return this.MSA_4_ExpectedSequenceNumber;
    }

    public void setMSA_4_ExpectedSequenceNumber(final String MSA_4_ExpectedSequenceNumber) {
        this.MSA_4_ExpectedSequenceNumber = MSA_4_ExpectedSequenceNumber;
    }

    public String getMSA_6_ErrorCondition() {
        return this.MSA_6_ErrorCondition;
    }

    public void setMSA_6_ErrorCondition(final String MSA_6_ErrorCondition) {
        this.MSA_6_ErrorCondition = MSA_6_ErrorCondition;
    }

    public String getMSA_7_MessageWaitingNumber() {
        return this.MSA_7_MessageWaitingNumber;
    }

    public void setMSA_7_MessageWaitingNumber(final String MSA_7_MessageWaitingNumber) {
        this.MSA_7_MessageWaitingNumber = MSA_7_MessageWaitingNumber;
    }

    public String getMSA_8_MessageWaitingPriority() {
        return this.MSA_8_MessageWaitingPriority;
    }

    public void setMSA_8_MessageWaitingPriority(final String MSA_8_MessageWaitingPriority) {
        this.MSA_8_MessageWaitingPriority = MSA_8_MessageWaitingPriority;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

