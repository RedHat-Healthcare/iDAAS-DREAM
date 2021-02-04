package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RQ1 {
    private String RQ1_1_AnticipatedPrice;
    private String RQ1_2_ManufacturerIdentifier;
    private String RQ1_3_ManufacturersCatalog;
    private String RQ1_4_VendorID;
    private String RQ1_5_VendorCatalog;
    private String RQ1_6_Taxable;
    private String RQ1_7_SubstituteAllowed;

    public String getRQ1_1_AnticipatedPrice() {
        return this.RQ1_1_AnticipatedPrice;
    }

    public void setRQ1_1_AnticipatedPrice(final String RQ1_1_AnticipatedPrice) {
        this.RQ1_1_AnticipatedPrice = RQ1_1_AnticipatedPrice;
    }

    public String getRQ1_2_ManufacturerIdentifier() {
        return this.RQ1_2_ManufacturerIdentifier;
    }

    public void setRQ1_2_ManufacturerIdentifier(final String RQ1_2_ManufacturerIdentifier) {
        this.RQ1_2_ManufacturerIdentifier = RQ1_2_ManufacturerIdentifier;
    }

    public String getRQ1_3_ManufacturersCatalog() {
        return this.RQ1_3_ManufacturersCatalog;
    }

    public void setRQ1_3_ManufacturersCatalog(final String RQ1_3_ManufacturersCatalog) {
        this.RQ1_3_ManufacturersCatalog = RQ1_3_ManufacturersCatalog;
    }

    public String getRQ1_4_VendorID() {
        return this.RQ1_4_VendorID;
    }

    public void setRQ1_4_VendorID(final String RQ1_4_VendorID) {
        this.RQ1_4_VendorID = RQ1_4_VendorID;
    }

    public String getRQ1_5_VendorCatalog() {
        return this.RQ1_5_VendorCatalog;
    }

    public void setRQ1_5_VendorCatalog(final String RQ1_5_VendorCatalog) {
        this.RQ1_5_VendorCatalog = RQ1_5_VendorCatalog;
    }

    public String getRQ1_6_Taxable() {
        return this.RQ1_6_Taxable;
    }

    public void setRQ1_6_Taxable(final String RQ1_6_Taxable) {
        this.RQ1_6_Taxable = RQ1_6_Taxable;
    }

    public String getRQ1_7_SubstituteAllowed() {
        return this.RQ1_7_SubstituteAllowed;
    }

    public void setRQ1_7_SubstituteAllowed(final String RQ1_7_SubstituteAllowed) {
        this.RQ1_7_SubstituteAllowed = RQ1_7_SubstituteAllowed;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

