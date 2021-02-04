package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SHP {
    private String SHP_1_ShipmentID;
    private String SHP_2_InternalShipmentID;
    private String SHP_3_ShipmentStatus;
    private String SHP_4_ShipmentStatusDateTime;
    private String SHP_5_ShipmentStatusReason;
    private String SHP_6_ShipmentPriority;
    private String SHP_7_ShipmentConfidentiality;
    private String SHP_8_NumberofPackagesinShipment;
    private String SHP_9_ShipmentCondition;
    private String SHP_10_ShipmentHandlingCode;
    private String SHP_11_ShipmentRiskCode;

    public String getSHP_1_ShipmentID() {
        return this.SHP_1_ShipmentID;
    }

    public void setSHP_1_ShipmentID(final String SHP_1_ShipmentID) {
        this.SHP_1_ShipmentID = SHP_1_ShipmentID;
    }

    public String getSHP_2_InternalShipmentID() {
        return this.SHP_2_InternalShipmentID;
    }

    public void setSHP_2_InternalShipmentID(final String SHP_2_InternalShipmentID) {
        this.SHP_2_InternalShipmentID = SHP_2_InternalShipmentID;
    }

    public String getSHP_3_ShipmentStatus() {
        return this.SHP_3_ShipmentStatus;
    }

    public void setSHP_3_ShipmentStatus(final String SHP_3_ShipmentStatus) {
        this.SHP_3_ShipmentStatus = SHP_3_ShipmentStatus;
    }

    public String getSHP_4_ShipmentStatusDateTime() {
        return this.SHP_4_ShipmentStatusDateTime;
    }

    public void setSHP_4_ShipmentStatusDateTime(final String SHP_4_ShipmentStatusDateTime) {
        this.SHP_4_ShipmentStatusDateTime = SHP_4_ShipmentStatusDateTime;
    }

    public String getSHP_5_ShipmentStatusReason() {
        return this.SHP_5_ShipmentStatusReason;
    }

    public void setSHP_5_ShipmentStatusReason(final String SHP_5_ShipmentStatusReason) {
        this.SHP_5_ShipmentStatusReason = SHP_5_ShipmentStatusReason;
    }

    public String getSHP_6_ShipmentPriority() {
        return this.SHP_6_ShipmentPriority;
    }

    public void setSHP_6_ShipmentPriority(final String SHP_6_ShipmentPriority) {
        this.SHP_6_ShipmentPriority = SHP_6_ShipmentPriority;
    }

    public String getSHP_7_ShipmentConfidentiality() {
        return this.SHP_7_ShipmentConfidentiality;
    }

    public void setSHP_7_ShipmentConfidentiality(final String SHP_7_ShipmentConfidentiality) {
        this.SHP_7_ShipmentConfidentiality = SHP_7_ShipmentConfidentiality;
    }

    public String getSHP_8_NumberofPackagesinShipment() {
        return this.SHP_8_NumberofPackagesinShipment;
    }

    public void setSHP_8_NumberofPackagesinShipment(final String SHP_8_NumberofPackagesinShipment) {
        this.SHP_8_NumberofPackagesinShipment = SHP_8_NumberofPackagesinShipment;
    }

    public String getSHP_9_ShipmentCondition() {
        return this.SHP_9_ShipmentCondition;
    }

    public void setSHP_9_ShipmentCondition(final String SHP_9_ShipmentCondition) {
        this.SHP_9_ShipmentCondition = SHP_9_ShipmentCondition;
    }

    public String getSHP_10_ShipmentHandlingCode() {
        return this.SHP_10_ShipmentHandlingCode;
    }

    public void setSHP_10_ShipmentHandlingCode(final String SHP_10_ShipmentHandlingCode) {
        this.SHP_10_ShipmentHandlingCode = SHP_10_ShipmentHandlingCode;
    }

    public String getSHP_11_ShipmentRiskCode() {
        return this.SHP_11_ShipmentRiskCode;
    }

    public void setSHP_11_ShipmentRiskCode(final String SHP_11_ShipmentRiskCode) {
        this.SHP_11_ShipmentRiskCode = SHP_11_ShipmentRiskCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

