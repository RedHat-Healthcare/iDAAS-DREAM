package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PAC {
    private String PAC_1_SetIdPAC;
    private String PAC_2_PackageID;
    private String PAC_3_ParentPackageID;
    private String PAC_4_PositioninParentPackage;
    private String PAC_5_PackageType;
    private String PAC_6_PackageCondition;
    private String PAC_7_PackageHandlingCode;
    private String PAC_8_PackageRiskCode;

    public String getPAC_1_SetIdPAC() {
        return this.PAC_1_SetIdPAC;
    }

    public void setPAC_1_SetIdPAC(final String PAC_1_SetIdPAC) {
        this.PAC_1_SetIdPAC = PAC_1_SetIdPAC;
    }

    public String getPAC_2_PackageID() {
        return this.PAC_2_PackageID;
    }

    public void setPAC_2_PackageID(final String PAC_2_PackageID) {
        this.PAC_2_PackageID = PAC_2_PackageID;
    }

    public String getPAC_3_ParentPackageID() {
        return this.PAC_3_ParentPackageID;
    }

    public void setPAC_3_ParentPackageID(final String PAC_3_ParentPackageID) {
        this.PAC_3_ParentPackageID = PAC_3_ParentPackageID;
    }

    public String getPAC_4_PositioninParentPackage() {
        return this.PAC_4_PositioninParentPackage;
    }

    public void setPAC_4_PositioninParentPackage(final String PAC_4_PositioninParentPackage) {
        this.PAC_4_PositioninParentPackage = PAC_4_PositioninParentPackage;
    }

    public String getPAC_5_PackageType() {
        return this.PAC_5_PackageType;
    }

    public void setPAC_5_PackageType(final String PAC_5_PackageType) {
        this.PAC_5_PackageType = PAC_5_PackageType;
    }

    public String getPAC_6_PackageCondition() {
        return this.PAC_6_PackageCondition;
    }

    public void setPAC_6_PackageCondition(final String PAC_6_PackageCondition) {
        this.PAC_6_PackageCondition = PAC_6_PackageCondition;
    }

    public String getPAC_7_PackageHandlingCode() {
        return this.PAC_7_PackageHandlingCode;
    }

    public void setPAC_7_PackageHandlingCode(final String PAC_7_PackageHandlingCode) {
        this.PAC_7_PackageHandlingCode = PAC_7_PackageHandlingCode;
    }

    public String getPAC_8_PackageRiskCode() {
        return this.PAC_8_PackageRiskCode;
    }

    public void setPAC_8_PackageRiskCode(final String PAC_8_PackageRiskCode) {
        this.PAC_8_PackageRiskCode = PAC_8_PackageRiskCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

