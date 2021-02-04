package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CTD {
    private String CTD_1_ContactRole;
    private String CTD_2_ContactName;
    private String CTD_3_ContactAddress;
    private String CTD_4_ContactLocation;
    private String CTD_5_ContactCommunicationInformation;
    private String CTD_6_PreferredMethodofContact;
    private String CTD_7_ContactIdentifiers;

    public String getCTD_1_ContactRole() {
        return this.CTD_1_ContactRole;
    }

    public void setCTD_1_ContactRole(final String CTD_1_ContactRole) {
        this.CTD_1_ContactRole = CTD_1_ContactRole;
    }

    public String getCTD_2_ContactName() {
        return this.CTD_2_ContactName;
    }

    public void setCTD_2_ContactName(final String CTD_2_ContactName) {
        this.CTD_2_ContactName = CTD_2_ContactName;
    }

    public String getCTD_3_ContactAddress() {
        return this.CTD_3_ContactAddress;
    }

    public void setCTD_3_ContactAddress(final String CTD_3_ContactAddress) {
        this.CTD_3_ContactAddress = CTD_3_ContactAddress;
    }

    public String getCTD_4_ContactLocation() {
        return this.CTD_4_ContactLocation;
    }

    public void setCTD_4_ContactLocation(final String CTD_4_ContactLocation) {
        this.CTD_4_ContactLocation = CTD_4_ContactLocation;
    }

    public String getCTD_5_ContactCommunicationInformation() {
        return this.CTD_5_ContactCommunicationInformation;
    }

    public void setCTD_5_ContactCommunicationInformation(final String CTD_5_ContactCommunicationInformation) {
        this.CTD_5_ContactCommunicationInformation = CTD_5_ContactCommunicationInformation;
    }

    public String getCTD_6_PreferredMethodofContact() {
        return this.CTD_6_PreferredMethodofContact;
    }

    public void setCTD_6_PreferredMethodofContact(final String CTD_6_PreferredMethodofContact) {
        this.CTD_6_PreferredMethodofContact = CTD_6_PreferredMethodofContact;
    }

    public String getCTD_7_ContactIdentifiers() {
        return this.CTD_7_ContactIdentifiers;
    }

    public void setCTD_7_ContactIdentifiers(final String CTD_7_ContactIdentifiers) {
        this.CTD_7_ContactIdentifiers = CTD_7_ContactIdentifiers;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

