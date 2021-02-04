package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LDP {
    private String LDP_1_PrimaryKeyValueLDP;
    private String LDP_2_LocationDepartment;
    private String LDP_3_LocationService;
    private String LDP_4_SpecialtyType;
    private String LDP_5_ValidPatientClasses;
    private String LDP_6_ActiveInactiveFlag;
    private String LDP_7_ActivationDateLDP;
    private String LDP_8_InactivationDateLDP;
    private String LDP_9_InactivatedReason;
    private String LDP_10_VisitingHours;
    private String LDP_11_ContactPhone;
    private String LDP_12_LocationCostCenter;

    public String getLDP_1_PrimaryKeyValueLDP() {
        return this.LDP_1_PrimaryKeyValueLDP;
    }

    public void setLDP_1_PrimaryKeyValueLDP(final String LDP_1_PrimaryKeyValueLDP) {
        this.LDP_1_PrimaryKeyValueLDP = LDP_1_PrimaryKeyValueLDP;
    }

    public String getLDP_2_LocationDepartment() {
        return this.LDP_2_LocationDepartment;
    }

    public void setLDP_2_LocationDepartment(final String LDP_2_LocationDepartment) {
        this.LDP_2_LocationDepartment = LDP_2_LocationDepartment;
    }

    public String getLDP_3_LocationService() {
        return this.LDP_3_LocationService;
    }

    public void setLDP_3_LocationService(final String LDP_3_LocationService) {
        this.LDP_3_LocationService = LDP_3_LocationService;
    }

    public String getLDP_4_SpecialtyType() {
        return this.LDP_4_SpecialtyType;
    }

    public void setLDP_4_SpecialtyType(final String LDP_4_SpecialtyType) {
        this.LDP_4_SpecialtyType = LDP_4_SpecialtyType;
    }

    public String getLDP_5_ValidPatientClasses() {
        return this.LDP_5_ValidPatientClasses;
    }

    public void setLDP_5_ValidPatientClasses(final String LDP_5_ValidPatientClasses) {
        this.LDP_5_ValidPatientClasses = LDP_5_ValidPatientClasses;
    }

    public String getLDP_6_ActiveInactiveFlag() {
        return this.LDP_6_ActiveInactiveFlag;
    }

    public void setLDP_6_ActiveInactiveFlag(final String LDP_6_ActiveInactiveFlag) {
        this.LDP_6_ActiveInactiveFlag = LDP_6_ActiveInactiveFlag;
    }

    public String getLDP_7_ActivationDateLDP() {
        return this.LDP_7_ActivationDateLDP;
    }

    public void setLDP_7_ActivationDateLDP(final String LDP_7_ActivationDateLDP) {
        this.LDP_7_ActivationDateLDP = LDP_7_ActivationDateLDP;
    }

    public String getLDP_8_InactivationDateLDP() {
        return this.LDP_8_InactivationDateLDP;
    }

    public void setLDP_8_InactivationDateLDP(final String LDP_8_InactivationDateLDP) {
        this.LDP_8_InactivationDateLDP = LDP_8_InactivationDateLDP;
    }

    public String getLDP_9_InactivatedReason() {
        return this.LDP_9_InactivatedReason;
    }

    public void setLDP_9_InactivatedReason(final String LDP_9_InactivatedReason) {
        this.LDP_9_InactivatedReason = LDP_9_InactivatedReason;
    }

    public String getLDP_10_VisitingHours() {
        return this.LDP_10_VisitingHours;
    }

    public void setLDP_10_VisitingHours(final String LDP_10_VisitingHours) {
        this.LDP_10_VisitingHours = LDP_10_VisitingHours;
    }

    public String getLDP_11_ContactPhone() {
        return this.LDP_11_ContactPhone;
    }

    public void setLDP_11_ContactPhone(final String LDP_11_ContactPhone) {
        this.LDP_11_ContactPhone = LDP_11_ContactPhone;
    }

    public String getLDP_12_LocationCostCenter() {
        return this.LDP_12_LocationCostCenter;
    }

    public void setLDP_12_LocationCostCenter(final String LDP_12_LocationCostCenter) {
        this.LDP_12_LocationCostCenter = LDP_12_LocationCostCenter;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

