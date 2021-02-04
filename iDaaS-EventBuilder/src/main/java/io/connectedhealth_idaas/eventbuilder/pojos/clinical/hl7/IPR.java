package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IPR {
    private String IPR_1_IPRIdentifier;
    private String IPR_2_ProviderCrossReferenceIdentifier;
    private String IPR_3_PayerCrossReferenceIdentifier;
    private String IPR_4_IPRStatus;
    private String IPR_5_IPRDateTime;
    private String IPR_6_AdjudicatedPaidAmount;
    private String IPR_7_ExpectedPaymentDateTime;
    private String IPR_8_IPRChecksum;

    public String getIPR_1_IPRIdentifier() {
        return this.IPR_1_IPRIdentifier;
    }

    public void setIPR_1_IPRIdentifier(final String IPR_1_IPRIdentifier) {
        this.IPR_1_IPRIdentifier = IPR_1_IPRIdentifier;
    }

    public String getIPR_2_ProviderCrossReferenceIdentifier() {
        return this.IPR_2_ProviderCrossReferenceIdentifier;
    }

    public void setIPR_2_ProviderCrossReferenceIdentifier(final String IPR_2_ProviderCrossReferenceIdentifier) {
        this.IPR_2_ProviderCrossReferenceIdentifier = IPR_2_ProviderCrossReferenceIdentifier;
    }

    public String getIPR_3_PayerCrossReferenceIdentifier() {
        return this.IPR_3_PayerCrossReferenceIdentifier;
    }

    public void setIPR_3_PayerCrossReferenceIdentifier(final String IPR_3_PayerCrossReferenceIdentifier) {
        this.IPR_3_PayerCrossReferenceIdentifier = IPR_3_PayerCrossReferenceIdentifier;
    }

    public String getIPR_4_IPRStatus() {
        return this.IPR_4_IPRStatus;
    }

    public void setIPR_4_IPRStatus(final String IPR_4_IPRStatus) {
        this.IPR_4_IPRStatus = IPR_4_IPRStatus;
    }

    public String getIPR_5_IPRDateTime() {
        return this.IPR_5_IPRDateTime;
    }

    public void setIPR_5_IPRDateTime(final String IPR_5_IPRDateTime) {
        this.IPR_5_IPRDateTime = IPR_5_IPRDateTime;
    }

    public String getIPR_6_AdjudicatedPaidAmount() {
        return this.IPR_6_AdjudicatedPaidAmount;
    }

    public void setIPR_6_AdjudicatedPaidAmount(final String IPR_6_AdjudicatedPaidAmount) {
        this.IPR_6_AdjudicatedPaidAmount = IPR_6_AdjudicatedPaidAmount;
    }

    public String getIPR_7_ExpectedPaymentDateTime() {
        return this.IPR_7_ExpectedPaymentDateTime;
    }

    public void setIPR_7_ExpectedPaymentDateTime(final String IPR_7_ExpectedPaymentDateTime) {
        this.IPR_7_ExpectedPaymentDateTime = IPR_7_ExpectedPaymentDateTime;
    }

    public String getIPR_8_IPRChecksum() {
        return this.IPR_8_IPRChecksum;
    }

    public void setIPR_8_IPRChecksum(final String IPR_8_IPRChecksum) {
        this.IPR_8_IPRChecksum = IPR_8_IPRChecksum;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

