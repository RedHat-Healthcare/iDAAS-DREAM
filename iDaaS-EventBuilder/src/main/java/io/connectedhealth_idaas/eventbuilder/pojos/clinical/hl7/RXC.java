package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RXC {
    private String RXC_1_RXComponentType;
    private String RXC_2_ComponentCode;
    private String RXC_3_ComponentAmount;
    private String RXC_4_ComponentUnits;
    private String RXC_5_ComponentStrength;
    private String RXC_6_ComponentStrengthUnits;
    private String RXC_7_SupplementaryCode;
    private String RXC_8_ComponentDrugStrengthVolume;
    private String RXC_9_ComponentDrugStrengthVolumeUnits;
    private String RXC_10_DispenseAmount;
    private String RXC_11_DispenseUnits;

    public String getRXC_1_RXComponentType() {
        return this.RXC_1_RXComponentType;
    }

    public void setRXC_1_RXComponentType(final String RXC_1_RXComponentType) {
        this.RXC_1_RXComponentType = RXC_1_RXComponentType;
    }

    public String getRXC_2_ComponentCode() {
        return this.RXC_2_ComponentCode;
    }

    public void setRXC_2_ComponentCode(final String RXC_2_ComponentCode) {
        this.RXC_2_ComponentCode = RXC_2_ComponentCode;
    }

    public String getRXC_3_ComponentAmount() {
        return this.RXC_3_ComponentAmount;
    }

    public void setRXC_3_ComponentAmount(final String RXC_3_ComponentAmount) {
        this.RXC_3_ComponentAmount = RXC_3_ComponentAmount;
    }

    public String getRXC_4_ComponentUnits() {
        return this.RXC_4_ComponentUnits;
    }

    public void setRXC_4_ComponentUnits(final String RXC_4_ComponentUnits) {
        this.RXC_4_ComponentUnits = RXC_4_ComponentUnits;
    }

    public String getRXC_5_ComponentStrength() {
        return this.RXC_5_ComponentStrength;
    }

    public void setRXC_5_ComponentStrength(final String RXC_5_ComponentStrength) {
        this.RXC_5_ComponentStrength = RXC_5_ComponentStrength;
    }

    public String getRXC_6_ComponentStrengthUnits() {
        return this.RXC_6_ComponentStrengthUnits;
    }

    public void setRXC_6_ComponentStrengthUnits(final String RXC_6_ComponentStrengthUnits) {
        this.RXC_6_ComponentStrengthUnits = RXC_6_ComponentStrengthUnits;
    }

    public String getRXC_7_SupplementaryCode() {
        return this.RXC_7_SupplementaryCode;
    }

    public void setRXC_7_SupplementaryCode(final String RXC_7_SupplementaryCode) {
        this.RXC_7_SupplementaryCode = RXC_7_SupplementaryCode;
    }

    public String getRXC_8_ComponentDrugStrengthVolume() {
        return this.RXC_8_ComponentDrugStrengthVolume;
    }

    public void setRXC_8_ComponentDrugStrengthVolume(final String RXC_8_ComponentDrugStrengthVolume) {
        this.RXC_8_ComponentDrugStrengthVolume = RXC_8_ComponentDrugStrengthVolume;
    }

    public String getRXC_9_ComponentDrugStrengthVolumeUnits() {
        return this.RXC_9_ComponentDrugStrengthVolumeUnits;
    }

    public void setRXC_9_ComponentDrugStrengthVolumeUnits(final String RXC_9_ComponentDrugStrengthVolumeUnits) {
        this.RXC_9_ComponentDrugStrengthVolumeUnits = RXC_9_ComponentDrugStrengthVolumeUnits;
    }

    public String getRXC_10_DispenseAmount() {
        return this.RXC_10_DispenseAmount;
    }

    public void setRXC_10_DispenseAmount(final String RXC_10_DispenseAmount) {
        this.RXC_10_DispenseAmount = RXC_10_DispenseAmount;
    }

    public String getRXC_11_DispenseUnits() {
        return this.RXC_11_DispenseUnits;
    }

    public void setRXC_11_DispenseUnits(final String RXC_11_DispenseUnits) {
        this.RXC_11_DispenseUnits = RXC_11_DispenseUnits;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

