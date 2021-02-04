package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PRA {
    private String PRA_1_PrimaryKeyValuePRA;
    private String PRA_2_PractitionerGroup;
    private String PRA_3_PractitionerCategory;
    private String PRA_4_ProviderBilling;
    private String PRA_5_Specialty;
    private String PRA_6_PractitionerIDNumbers;
    private String PRA_7_Privileges;
    private String PRA_8_DateEnteredPractice;
    private String PRA_9_Institution;
    private String PRA_10_DateLeftPractice;
    private String PRA_11_GovernmentReimbursementBillingEligibility;
    private String PRA_12_SetIDPRA;

    public String getPRA_1_PrimaryKeyValuePRA() {
        return this.PRA_1_PrimaryKeyValuePRA;
    }

    public void setPRA_1_PrimaryKeyValuePRA(final String PRA_1_PrimaryKeyValuePRA) {
        this.PRA_1_PrimaryKeyValuePRA = PRA_1_PrimaryKeyValuePRA;
    }

    public String getPRA_2_PractitionerGroup() {
        return this.PRA_2_PractitionerGroup;
    }

    public void setPRA_2_PractitionerGroup(final String PRA_2_PractitionerGroup) {
        this.PRA_2_PractitionerGroup = PRA_2_PractitionerGroup;
    }

    public String getPRA_3_PractitionerCategory() {
        return this.PRA_3_PractitionerCategory;
    }

    public void setPRA_3_PractitionerCategory(final String PRA_3_PractitionerCategory) {
        this.PRA_3_PractitionerCategory = PRA_3_PractitionerCategory;
    }

    public String getPRA_4_ProviderBilling() {
        return this.PRA_4_ProviderBilling;
    }

    public void setPRA_4_ProviderBilling(final String PRA_4_ProviderBilling) {
        this.PRA_4_ProviderBilling = PRA_4_ProviderBilling;
    }

    public String getPRA_5_Specialty() {
        return this.PRA_5_Specialty;
    }

    public void setPRA_5_Specialty(final String PRA_5_Specialty) {
        this.PRA_5_Specialty = PRA_5_Specialty;
    }

    public String getPRA_6_PractitionerIDNumbers() {
        return this.PRA_6_PractitionerIDNumbers;
    }

    public void setPRA_6_PractitionerIDNumbers(final String PRA_6_PractitionerIDNumbers) {
        this.PRA_6_PractitionerIDNumbers = PRA_6_PractitionerIDNumbers;
    }

    public String getPRA_7_Privileges() {
        return this.PRA_7_Privileges;
    }

    public void setPRA_7_Privileges(final String PRA_7_Privileges) {
        this.PRA_7_Privileges = PRA_7_Privileges;
    }

    public String getPRA_8_DateEnteredPractice() {
        return this.PRA_8_DateEnteredPractice;
    }

    public void setPRA_8_DateEnteredPractice(final String PRA_8_DateEnteredPractice) {
        this.PRA_8_DateEnteredPractice = PRA_8_DateEnteredPractice;
    }

    public String getPRA_9_Institution() {
        return this.PRA_9_Institution;
    }

    public void setPRA_9_Institution(final String PRA_9_Institution) {
        this.PRA_9_Institution = PRA_9_Institution;
    }

    public String getPRA_10_DateLeftPractice() {
        return this.PRA_10_DateLeftPractice;
    }

    public void setPRA_10_DateLeftPractice(final String PRA_10_DateLeftPractice) {
        this.PRA_10_DateLeftPractice = PRA_10_DateLeftPractice;
    }

    public String getPRA_11_GovernmentReimbursementBillingEligibility() {
        return this.PRA_11_GovernmentReimbursementBillingEligibility;
    }

    public void setPRA_11_GovernmentReimbursementBillingEligibility(final String PRA_11_GovernmentReimbursementBillingEligibility) {
        this.PRA_11_GovernmentReimbursementBillingEligibility = PRA_11_GovernmentReimbursementBillingEligibility;
    }

    public String getPRA_12_SetIDPRA() {
        return this.PRA_12_SetIDPRA;
    }

    public void setPRA_12_SetIDPRA(final String PRA_12_SetIDPRA) {
        this.PRA_12_SetIDPRA = PRA_12_SetIDPRA;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

