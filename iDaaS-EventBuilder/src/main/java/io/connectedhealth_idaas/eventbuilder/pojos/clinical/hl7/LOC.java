package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LOC {
    private String LOC_1_PrimaryKeyValueLOC;
    private String LOC_2_LocationDescription;
    private String LOC_3_LocationTypeLOC;
    private String LOC_4_OrganizationNameLOC;
    private String LOC_5_LocationAddress;
    private String LOC_6_LocationPhone;
    private String LOC_7_LicenseNumber;
    private String LOC_8_LocationEquipment;
    private String LOC_9_LocationServiceCode;

    public String getLOC_1_PrimaryKeyValueLOC() {
        return this.LOC_1_PrimaryKeyValueLOC;
    }

    public void setLOC_1_PrimaryKeyValueLOC(final String LOC_1_PrimaryKeyValueLOC) {
        this.LOC_1_PrimaryKeyValueLOC = LOC_1_PrimaryKeyValueLOC;
    }

    public String getLOC_2_LocationDescription() {
        return this.LOC_2_LocationDescription;
    }

    public void setLOC_2_LocationDescription(final String LOC_2_LocationDescription) {
        this.LOC_2_LocationDescription = LOC_2_LocationDescription;
    }

    public String getLOC_3_LocationTypeLOC() {
        return this.LOC_3_LocationTypeLOC;
    }

    public void setLOC_3_LocationTypeLOC(final String LOC_3_LocationTypeLOC) {
        this.LOC_3_LocationTypeLOC = LOC_3_LocationTypeLOC;
    }

    public String getLOC_4_OrganizationNameLOC() {
        return this.LOC_4_OrganizationNameLOC;
    }

    public void setLOC_4_OrganizationNameLOC(final String LOC_4_OrganizationNameLOC) {
        this.LOC_4_OrganizationNameLOC = LOC_4_OrganizationNameLOC;
    }

    public String getLOC_5_LocationAddress() {
        return this.LOC_5_LocationAddress;
    }

    public void setLOC_5_LocationAddress(final String LOC_5_LocationAddress) {
        this.LOC_5_LocationAddress = LOC_5_LocationAddress;
    }

    public String getLOC_6_LocationPhone() {
        return this.LOC_6_LocationPhone;
    }

    public void setLOC_6_LocationPhone(final String LOC_6_LocationPhone) {
        this.LOC_6_LocationPhone = LOC_6_LocationPhone;
    }

    public String getLOC_7_LicenseNumber() {
        return this.LOC_7_LicenseNumber;
    }

    public void setLOC_7_LicenseNumber(final String LOC_7_LicenseNumber) {
        this.LOC_7_LicenseNumber = LOC_7_LicenseNumber;
    }

    public String getLOC_8_LocationEquipment() {
        return this.LOC_8_LocationEquipment;
    }

    public void setLOC_8_LocationEquipment(final String LOC_8_LocationEquipment) {
        this.LOC_8_LocationEquipment = LOC_8_LocationEquipment;
    }

    public String getLOC_9_LocationServiceCode() {
        return this.LOC_9_LocationServiceCode;
    }

    public void setLOC_9_LocationServiceCode(final String LOC_9_LocationServiceCode) {
        this.LOC_9_LocationServiceCode = LOC_9_LocationServiceCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

