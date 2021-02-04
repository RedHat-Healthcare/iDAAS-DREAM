package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FAC {
    private String FAC_1_FacilityIDFAC;
    private String FAC_2_FacilityType;
    private String FAC_3_FacilityAddress;
    private String FAC_4_FacilityTelecommunication;
    private String FAC_5_ContactPerson;
    private String FAC_6_ContactTitle;
    private String FAC_7_ContactAddress;
    private String FAC_8_ContactTelecommunication;
    private String FAC_9_SignatureAuthority;
    private String FAC_10_SignatureAuthorityTitle;
    private String FAC_11_SignatureAuthorityAddress;
    private String FAC_12_SignatureAuthorityTelecommunication;

    public String getFAC_1_FacilityIDFAC() {
        return this.FAC_1_FacilityIDFAC;
    }

    public void setFAC_1_FacilityIDFAC(final String FAC_1_FacilityIDFAC) {
        this.FAC_1_FacilityIDFAC = FAC_1_FacilityIDFAC;
    }

    public String getFAC_2_FacilityType() {
        return this.FAC_2_FacilityType;
    }

    public void setFAC_2_FacilityType(final String FAC_2_FacilityType) {
        this.FAC_2_FacilityType = FAC_2_FacilityType;
    }

    public String getFAC_3_FacilityAddress() {
        return this.FAC_3_FacilityAddress;
    }

    public void setFAC_3_FacilityAddress(final String FAC_3_FacilityAddress) {
        this.FAC_3_FacilityAddress = FAC_3_FacilityAddress;
    }

    public String getFAC_4_FacilityTelecommunication() {
        return this.FAC_4_FacilityTelecommunication;
    }

    public void setFAC_4_FacilityTelecommunication(final String FAC_4_FacilityTelecommunication) {
        this.FAC_4_FacilityTelecommunication = FAC_4_FacilityTelecommunication;
    }

    public String getFAC_5_ContactPerson() {
        return this.FAC_5_ContactPerson;
    }

    public void setFAC_5_ContactPerson(final String FAC_5_ContactPerson) {
        this.FAC_5_ContactPerson = FAC_5_ContactPerson;
    }

    public String getFAC_6_ContactTitle() {
        return this.FAC_6_ContactTitle;
    }

    public void setFAC_6_ContactTitle(final String FAC_6_ContactTitle) {
        this.FAC_6_ContactTitle = FAC_6_ContactTitle;
    }

    public String getFAC_7_ContactAddress() {
        return this.FAC_7_ContactAddress;
    }

    public void setFAC_7_ContactAddress(final String FAC_7_ContactAddress) {
        this.FAC_7_ContactAddress = FAC_7_ContactAddress;
    }

    public String getFAC_8_ContactTelecommunication() {
        return this.FAC_8_ContactTelecommunication;
    }

    public void setFAC_8_ContactTelecommunication(final String FAC_8_ContactTelecommunication) {
        this.FAC_8_ContactTelecommunication = FAC_8_ContactTelecommunication;
    }

    public String getFAC_9_SignatureAuthority() {
        return this.FAC_9_SignatureAuthority;
    }

    public void setFAC_9_SignatureAuthority(final String FAC_9_SignatureAuthority) {
        this.FAC_9_SignatureAuthority = FAC_9_SignatureAuthority;
    }

    public String getFAC_10_SignatureAuthorityTitle() {
        return this.FAC_10_SignatureAuthorityTitle;
    }

    public void setFAC_10_SignatureAuthorityTitle(final String FAC_10_SignatureAuthorityTitle) {
        this.FAC_10_SignatureAuthorityTitle = FAC_10_SignatureAuthorityTitle;
    }

    public String getFAC_11_SignatureAuthorityAddress() {
        return this.FAC_11_SignatureAuthorityAddress;
    }

    public void setFAC_11_SignatureAuthorityAddress(final String FAC_11_SignatureAuthorityAddress) {
        this.FAC_11_SignatureAuthorityAddress = FAC_11_SignatureAuthorityAddress;
    }

    public String getFAC_12_SignatureAuthorityTelecommunication() {
        return this.FAC_12_SignatureAuthorityTelecommunication;
    }

    public void setFAC_12_SignatureAuthorityTelecommunication(final String FAC_12_SignatureAuthorityTelecommunication) {
        this.FAC_12_SignatureAuthorityTelecommunication = FAC_12_SignatureAuthorityTelecommunication;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

