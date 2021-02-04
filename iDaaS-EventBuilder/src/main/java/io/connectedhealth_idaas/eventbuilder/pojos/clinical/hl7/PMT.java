package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PMT {
    private String PMT_1_PaymentRemittanceAdviceNumber;
    private String PMT_2_PaymentRemittanceEffectiveDateTime;
    private String PMT_3_PaymentRemittanceExpirationDateTime;
    private String PMT_4_PaymentMethod;
    private String PMT_5_PaymentRemittanceDateTime;
    private String PMT_6_PaymentRemittanceAmount;
    private String PMT_7_CheckNumber;
    private String PMT_8_PayeeBankIdentification;
    private String PMT_9_PayeeTransitNumber;
    private String PMT_10_PayeeBankAccountID;
    private String PMT_11_PaymentOrganization;
    private String PMT_12_ESRCodeLine;

    public String getPMT_1_PaymentRemittanceAdviceNumber() {
        return this.PMT_1_PaymentRemittanceAdviceNumber;
    }

    public void setPMT_1_PaymentRemittanceAdviceNumber(final String PMT_1_PaymentRemittanceAdviceNumber) {
        this.PMT_1_PaymentRemittanceAdviceNumber = PMT_1_PaymentRemittanceAdviceNumber;
    }

    public String getPMT_2_PaymentRemittanceEffectiveDateTime() {
        return this.PMT_2_PaymentRemittanceEffectiveDateTime;
    }

    public void setPMT_2_PaymentRemittanceEffectiveDateTime(final String PMT_2_PaymentRemittanceEffectiveDateTime) {
        this.PMT_2_PaymentRemittanceEffectiveDateTime = PMT_2_PaymentRemittanceEffectiveDateTime;
    }

    public String getPMT_3_PaymentRemittanceExpirationDateTime() {
        return this.PMT_3_PaymentRemittanceExpirationDateTime;
    }

    public void setPMT_3_PaymentRemittanceExpirationDateTime(final String PMT_3_PaymentRemittanceExpirationDateTime) {
        this.PMT_3_PaymentRemittanceExpirationDateTime = PMT_3_PaymentRemittanceExpirationDateTime;
    }

    public String getPMT_4_PaymentMethod() {
        return this.PMT_4_PaymentMethod;
    }

    public void setPMT_4_PaymentMethod(final String PMT_4_PaymentMethod) {
        this.PMT_4_PaymentMethod = PMT_4_PaymentMethod;
    }

    public String getPMT_5_PaymentRemittanceDateTime() {
        return this.PMT_5_PaymentRemittanceDateTime;
    }

    public void setPMT_5_PaymentRemittanceDateTime(final String PMT_5_PaymentRemittanceDateTime) {
        this.PMT_5_PaymentRemittanceDateTime = PMT_5_PaymentRemittanceDateTime;
    }

    public String getPMT_6_PaymentRemittanceAmount() {
        return this.PMT_6_PaymentRemittanceAmount;
    }

    public void setPMT_6_PaymentRemittanceAmount(final String PMT_6_PaymentRemittanceAmount) {
        this.PMT_6_PaymentRemittanceAmount = PMT_6_PaymentRemittanceAmount;
    }

    public String getPMT_7_CheckNumber() {
        return this.PMT_7_CheckNumber;
    }

    public void setPMT_7_CheckNumber(final String PMT_7_CheckNumber) {
        this.PMT_7_CheckNumber = PMT_7_CheckNumber;
    }

    public String getPMT_8_PayeeBankIdentification() {
        return this.PMT_8_PayeeBankIdentification;
    }

    public void setPMT_8_PayeeBankIdentification(final String PMT_8_PayeeBankIdentification) {
        this.PMT_8_PayeeBankIdentification = PMT_8_PayeeBankIdentification;
    }

    public String getPMT_9_PayeeTransitNumber() {
        return this.PMT_9_PayeeTransitNumber;
    }

    public void setPMT_9_PayeeTransitNumber(final String PMT_9_PayeeTransitNumber) {
        this.PMT_9_PayeeTransitNumber = PMT_9_PayeeTransitNumber;
    }

    public String getPMT_10_PayeeBankAccountID() {
        return this.PMT_10_PayeeBankAccountID;
    }

    public void setPMT_10_PayeeBankAccountID(final String PMT_10_PayeeBankAccountID) {
        this.PMT_10_PayeeBankAccountID = PMT_10_PayeeBankAccountID;
    }

    public String getPMT_11_PaymentOrganization() {
        return this.PMT_11_PaymentOrganization;
    }

    public void setPMT_11_PaymentOrganization(final String PMT_11_PaymentOrganization) {
        this.PMT_11_PaymentOrganization = PMT_11_PaymentOrganization;
    }

    public String getPMT_12_ESRCodeLine() {
        return this.PMT_12_ESRCodeLine;
    }

    public void setPMT_12_ESRCodeLine(final String PMT_12_ESRCodeLine) {
        this.PMT_12_ESRCodeLine = PMT_12_ESRCodeLine;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

