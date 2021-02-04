package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ROL {
    private String ROL_1_RoleInstanceID;
    private String ROL_2_ActionCode;
    private String ROL_3_RoleROL;
    private String ROL_4_RolePerson;
    private String ROL_5_RoleBeginDateTime;
    private String ROL_6_RoleEndDateTime;
    private String ROL_7_RoleDuration;
    private String ROL_8_RoleActionReason;
    private String ROL_9_ProviderType;
    private String ROL_10_OrganizationUnitType;
    private String ROL_11_OfficeHomeAddressBirthplace;
    private String ROL_12_Phone;
    private String ROL_13_PersonsLocation;
    private String ROL_14_Organization;

    public String getROL_1_RoleInstanceID() {
        return this.ROL_1_RoleInstanceID;
    }

    public void setROL_1_RoleInstanceID(final String ROL_1_RoleInstanceID) {
        this.ROL_1_RoleInstanceID = ROL_1_RoleInstanceID;
    }

    public String getROL_2_ActionCode() {
        return this.ROL_2_ActionCode;
    }

    public void setROL_2_ActionCode(final String ROL_2_ActionCode) {
        this.ROL_2_ActionCode = ROL_2_ActionCode;
    }

    public String getROL_3_RoleROL() {
        return this.ROL_3_RoleROL;
    }

    public void setROL_3_RoleROL(final String ROL_3_RoleROL) {
        this.ROL_3_RoleROL = ROL_3_RoleROL;
    }

    public String getROL_4_RolePerson() {
        return this.ROL_4_RolePerson;
    }

    public void setROL_4_RolePerson(final String ROL_4_RolePerson) {
        this.ROL_4_RolePerson = ROL_4_RolePerson;
    }

    public String getROL_5_RoleBeginDateTime() {
        return this.ROL_5_RoleBeginDateTime;
    }

    public void setROL_5_RoleBeginDateTime(final String ROL_5_RoleBeginDateTime) {
        this.ROL_5_RoleBeginDateTime = ROL_5_RoleBeginDateTime;
    }

    public String getROL_6_RoleEndDateTime() {
        return this.ROL_6_RoleEndDateTime;
    }

    public void setROL_6_RoleEndDateTime(final String ROL_6_RoleEndDateTime) {
        this.ROL_6_RoleEndDateTime = ROL_6_RoleEndDateTime;
    }

    public String getROL_7_RoleDuration() {
        return this.ROL_7_RoleDuration;
    }

    public void setROL_7_RoleDuration(final String ROL_7_RoleDuration) {
        this.ROL_7_RoleDuration = ROL_7_RoleDuration;
    }

    public String getROL_8_RoleActionReason() {
        return this.ROL_8_RoleActionReason;
    }

    public void setROL_8_RoleActionReason(final String ROL_8_RoleActionReason) {
        this.ROL_8_RoleActionReason = ROL_8_RoleActionReason;
    }

    public String getROL_9_ProviderType() {
        return this.ROL_9_ProviderType;
    }

    public void setROL_9_ProviderType(final String ROL_9_ProviderType) {
        this.ROL_9_ProviderType = ROL_9_ProviderType;
    }

    public String getROL_10_OrganizationUnitType() {
        return this.ROL_10_OrganizationUnitType;
    }

    public void setROL_10_OrganizationUnitType(final String ROL_10_OrganizationUnitType) {
        this.ROL_10_OrganizationUnitType = ROL_10_OrganizationUnitType;
    }

    public String getROL_11_OfficeHomeAddressBirthplace() {
        return this.ROL_11_OfficeHomeAddressBirthplace;
    }

    public void setROL_11_OfficeHomeAddressBirthplace(final String ROL_11_OfficeHomeAddressBirthplace) {
        this.ROL_11_OfficeHomeAddressBirthplace = ROL_11_OfficeHomeAddressBirthplace;
    }

    public String getROL_12_Phone() {
        return this.ROL_12_Phone;
    }

    public void setROL_12_Phone(final String ROL_12_Phone) {
        this.ROL_12_Phone = ROL_12_Phone;
    }

    public String getROL_13_PersonsLocation() {
        return this.ROL_13_PersonsLocation;
    }

    public void setROL_13_PersonsLocation(final String ROL_13_PersonsLocation) {
        this.ROL_13_PersonsLocation = ROL_13_PersonsLocation;
    }

    public String getROL_14_Organization() {
        return this.ROL_14_Organization;
    }

    public void setROL_14_Organization(final String ROL_14_Organization) {
        this.ROL_14_Organization = ROL_14_Organization;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

