package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VND {
    private String VND_1_SetIdVND;
    private String VND_2_VendorIdentifier;
    private String VND_3_VendorName;
    private String VND_4_VendorCatalogNumber;
    private String VND_5_PrimaryVendorIndicator;

    public String getVND_1_SetIdVND() {
        return this.VND_1_SetIdVND;
    }

    public void setVND_1_SetIdVND(final String VND_1_SetIdVND) {
        this.VND_1_SetIdVND = VND_1_SetIdVND;
    }

    public String getVND_2_VendorIdentifier() {
        return this.VND_2_VendorIdentifier;
    }

    public void setVND_2_VendorIdentifier(final String VND_2_VendorIdentifier) {
        this.VND_2_VendorIdentifier = VND_2_VendorIdentifier;
    }

    public String getVND_3_VendorName() {
        return this.VND_3_VendorName;
    }

    public void setVND_3_VendorName(final String VND_3_VendorName) {
        this.VND_3_VendorName = VND_3_VendorName;
    }

    public String getVND_4_VendorCatalogNumber() {
        return this.VND_4_VendorCatalogNumber;
    }

    public void setVND_4_VendorCatalogNumber(final String VND_4_VendorCatalogNumber) {
        this.VND_4_VendorCatalogNumber = VND_4_VendorCatalogNumber;
    }

    public String getVND_5_PrimaryVendorIndicator() {
        return this.VND_5_PrimaryVendorIndicator;
    }

    public void setVND_5_PrimaryVendorIndicator(final String VND_5_PrimaryVendorIndicator) {
        this.VND_5_PrimaryVendorIndicator = VND_5_PrimaryVendorIndicator;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

