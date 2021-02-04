package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AFF {
    private String AFF_1_SetIDAFF;
    private String AFF_2_ProfessionalOrganization;
    private String AFF_3_ProfessionalOrganizationAddress;
    private String AFF_4_ProfessionalOrganizationAffiliationDateRange;
    private String AFF_5_ProfessionalAffiliationAdditionalInformation;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getAFF_1_SetIDAFF() {
        return this.AFF_1_SetIDAFF;
    }

    public void setAFF_1_SetIDAFF(final String AFF_1_SetIDAFF) {
        this.AFF_1_SetIDAFF = AFF_1_SetIDAFF;
    }

    public String getAFF_2_ProfessionalOrganization() {
        return this.AFF_2_ProfessionalOrganization;
    }

    public void setAFF_2_ProfessionalOrganization(final String AFF_2_ProfessionalOrganization) {
        this.AFF_2_ProfessionalOrganization = AFF_2_ProfessionalOrganization;
    }

    public String getAFF_3_ProfessionalOrganizationAddress() {
        return this.AFF_3_ProfessionalOrganizationAddress;
    }

    public void setAFF_3_ProfessionalOrganizationAddress(final String AFF_3_ProfessionalOrganizationAddress) {
        this.AFF_3_ProfessionalOrganizationAddress = AFF_3_ProfessionalOrganizationAddress;
    }

    public String getAFF_4_ProfessionalOrganizationAffiliationDateRange() {
        return this.AFF_4_ProfessionalOrganizationAffiliationDateRange;
    }

    public void setAFF_4_ProfessionalOrganizationAffiliationDateRange(final String AFF_4_ProfessionalOrganizationAffiliationDateRange) {
        this.AFF_4_ProfessionalOrganizationAffiliationDateRange = AFF_4_ProfessionalOrganizationAffiliationDateRange;
    }

    public String getAFF_5_ProfessionalAffiliationAdditionalInformation() {
        return this.AFF_5_ProfessionalAffiliationAdditionalInformation;
    }

    public void setAFF_5_ProfessionalAffiliationAdditionalInformation(final String AFF_5_ProfessionalAffiliationAdditionalInformation) {
        this.AFF_5_ProfessionalAffiliationAdditionalInformation = AFF_5_ProfessionalAffiliationAdditionalInformation;
    }
}

