package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PSS {
    private String PSS_1_ProviderProductServiceSectionNumber;
    private String PSS_2_PayerProductServiceSectionNumber;
    private String PSS_3_ProductServiceSectionSequenceNumber;
    private String PSS_4_BilledAmount;
    private String PSS_5_SectionDescriptionorHeading;

    public String getPSS_1_ProviderProductServiceSectionNumber() {
        return this.PSS_1_ProviderProductServiceSectionNumber;
    }

    public void setPSS_1_ProviderProductServiceSectionNumber(final String PSS_1_ProviderProductServiceSectionNumber) {
        this.PSS_1_ProviderProductServiceSectionNumber = PSS_1_ProviderProductServiceSectionNumber;
    }

    public String getPSS_2_PayerProductServiceSectionNumber() {
        return this.PSS_2_PayerProductServiceSectionNumber;
    }

    public void setPSS_2_PayerProductServiceSectionNumber(final String PSS_2_PayerProductServiceSectionNumber) {
        this.PSS_2_PayerProductServiceSectionNumber = PSS_2_PayerProductServiceSectionNumber;
    }

    public String getPSS_3_ProductServiceSectionSequenceNumber() {
        return this.PSS_3_ProductServiceSectionSequenceNumber;
    }

    public void setPSS_3_ProductServiceSectionSequenceNumber(final String PSS_3_ProductServiceSectionSequenceNumber) {
        this.PSS_3_ProductServiceSectionSequenceNumber = PSS_3_ProductServiceSectionSequenceNumber;
    }

    public String getPSS_4_BilledAmount() {
        return this.PSS_4_BilledAmount;
    }

    public void setPSS_4_BilledAmount(final String PSS_4_BilledAmount) {
        this.PSS_4_BilledAmount = PSS_4_BilledAmount;
    }

    public String getPSS_5_SectionDescriptionorHeading() {
        return this.PSS_5_SectionDescriptionorHeading;
    }

    public void setPSS_5_SectionDescriptionorHeading(final String PSS_5_SectionDescriptionorHeading) {
        this.PSS_5_SectionDescriptionorHeading = PSS_5_SectionDescriptionorHeading;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

