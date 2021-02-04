package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PSG {
    private String PSG_1_ProviderProductServiceGroupNumber;
    private String PSG_2_PayerProductServiceGroupNumber;
    private String PSG_3_ProductServiceGroupSequenceNumber;
    private String PSG_4_AdjudicateasGroup;
    private String PSG_5_ProductServiceGroupBilledAmount;
    private String PSG_6_ProductServiceGroupDescription;

    public String getPSG_1_ProviderProductServiceGroupNumber() {
        return this.PSG_1_ProviderProductServiceGroupNumber;
    }

    public void setPSG_1_ProviderProductServiceGroupNumber(final String PSG_1_ProviderProductServiceGroupNumber) {
        this.PSG_1_ProviderProductServiceGroupNumber = PSG_1_ProviderProductServiceGroupNumber;
    }

    public String getPSG_2_PayerProductServiceGroupNumber() {
        return this.PSG_2_PayerProductServiceGroupNumber;
    }

    public void setPSG_2_PayerProductServiceGroupNumber(final String PSG_2_PayerProductServiceGroupNumber) {
        this.PSG_2_PayerProductServiceGroupNumber = PSG_2_PayerProductServiceGroupNumber;
    }

    public String getPSG_3_ProductServiceGroupSequenceNumber() {
        return this.PSG_3_ProductServiceGroupSequenceNumber;
    }

    public void setPSG_3_ProductServiceGroupSequenceNumber(final String PSG_3_ProductServiceGroupSequenceNumber) {
        this.PSG_3_ProductServiceGroupSequenceNumber = PSG_3_ProductServiceGroupSequenceNumber;
    }

    public String getPSG_4_AdjudicateasGroup() {
        return this.PSG_4_AdjudicateasGroup;
    }

    public void setPSG_4_AdjudicateasGroup(final String PSG_4_AdjudicateasGroup) {
        this.PSG_4_AdjudicateasGroup = PSG_4_AdjudicateasGroup;
    }

    public String getPSG_5_ProductServiceGroupBilledAmount() {
        return this.PSG_5_ProductServiceGroupBilledAmount;
    }

    public void setPSG_5_ProductServiceGroupBilledAmount(final String PSG_5_ProductServiceGroupBilledAmount) {
        this.PSG_5_ProductServiceGroupBilledAmount = PSG_5_ProductServiceGroupBilledAmount;
    }

    public String getPSG_6_ProductServiceGroupDescription() {
        return this.PSG_6_ProductServiceGroupDescription;
    }

    public void setPSG_6_ProductServiceGroupDescription(final String PSG_6_ProductServiceGroupDescription) {
        this.PSG_6_ProductServiceGroupDescription = PSG_6_ProductServiceGroupDescription;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

