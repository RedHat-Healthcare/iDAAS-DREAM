package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SFT {
    private String SFT_1_SoftwareVendorOrganization;
    private String SFT_2_SoftwareCertifiedVersionorReleaseNumber;
    private String SFT_3_SoftwareProductName;
    private String SFT_4_SoftwareBinaryID;
    private String SFT_5_SoftwareProductInformation;
    private String SFT_6_SoftwareInstallDate;

    public String getSFT_1_SoftwareVendorOrganization() {
        return this.SFT_1_SoftwareVendorOrganization;
    }

    public void setSFT_1_SoftwareVendorOrganization(final String SFT_1_SoftwareVendorOrganization) {
        this.SFT_1_SoftwareVendorOrganization = SFT_1_SoftwareVendorOrganization;
    }

    public String getSFT_2_SoftwareCertifiedVersionorReleaseNumber() {
        return this.SFT_2_SoftwareCertifiedVersionorReleaseNumber;
    }

    public void setSFT_2_SoftwareCertifiedVersionorReleaseNumber(final String SFT_2_SoftwareCertifiedVersionorReleaseNumber) {
        this.SFT_2_SoftwareCertifiedVersionorReleaseNumber = SFT_2_SoftwareCertifiedVersionorReleaseNumber;
    }

    public String getSFT_3_SoftwareProductName() {
        return this.SFT_3_SoftwareProductName;
    }

    public void setSFT_3_SoftwareProductName(final String SFT_3_SoftwareProductName) {
        this.SFT_3_SoftwareProductName = SFT_3_SoftwareProductName;
    }

    public String getSFT_4_SoftwareBinaryID() {
        return this.SFT_4_SoftwareBinaryID;
    }

    public void setSFT_4_SoftwareBinaryID(final String SFT_4_SoftwareBinaryID) {
        this.SFT_4_SoftwareBinaryID = SFT_4_SoftwareBinaryID;
    }

    public String getSFT_5_SoftwareProductInformation() {
        return this.SFT_5_SoftwareProductInformation;
    }

    public void setSFT_5_SoftwareProductInformation(final String SFT_5_SoftwareProductInformation) {
        this.SFT_5_SoftwareProductInformation = SFT_5_SoftwareProductInformation;
    }

    public String getSFT_6_SoftwareInstallDate() {
        return this.SFT_6_SoftwareInstallDate;
    }

    public void setSFT_6_SoftwareInstallDate(final String SFT_6_SoftwareInstallDate) {
        this.SFT_6_SoftwareInstallDate = SFT_6_SoftwareInstallDate;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

