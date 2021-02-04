package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DMI {
    private String DMI_1_DiagnosticRelatedGroup;
    private String DMI_2_MajorDiagnosticCategory;
    private String DMI_3_LowerandUpperTrimPoints;
    private String DMI_4_AverageLengthofStay;
    private String DMI_5_RelativeWeight;

    public String getDMI_1_DiagnosticRelatedGroup() {
        return this.DMI_1_DiagnosticRelatedGroup;
    }

    public void setDMI_1_DiagnosticRelatedGroup(final String DMI_1_DiagnosticRelatedGroup) {
        this.DMI_1_DiagnosticRelatedGroup = DMI_1_DiagnosticRelatedGroup;
    }

    public String getDMI_2_MajorDiagnosticCategory() {
        return this.DMI_2_MajorDiagnosticCategory;
    }

    public void setDMI_2_MajorDiagnosticCategory(final String DMI_2_MajorDiagnosticCategory) {
        this.DMI_2_MajorDiagnosticCategory = DMI_2_MajorDiagnosticCategory;
    }

    public String getDMI_3_LowerandUpperTrimPoints() {
        return this.DMI_3_LowerandUpperTrimPoints;
    }

    public void setDMI_3_LowerandUpperTrimPoints(final String DMI_3_LowerandUpperTrimPoints) {
        this.DMI_3_LowerandUpperTrimPoints = DMI_3_LowerandUpperTrimPoints;
    }

    public String getDMI_4_AverageLengthofStay() {
        return this.DMI_4_AverageLengthofStay;
    }

    public void setDMI_4_AverageLengthofStay(final String DMI_4_AverageLengthofStay) {
        this.DMI_4_AverageLengthofStay = DMI_4_AverageLengthofStay;
    }

    public String getDMI_5_RelativeWeight() {
        return this.DMI_5_RelativeWeight;
    }

    public void setDMI_5_RelativeWeight(final String DMI_5_RelativeWeight) {
        this.DMI_5_RelativeWeight = DMI_5_RelativeWeight;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

