package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BPO {
    private String BPO_1_SetIDBPO;
    private String BPO_2_BPUniversalServiceIdentifier;
    private String BPO_3_BPProcessingRequirements;
    private String BPO_4_BPQuantity;
    private String BPO_5_BPAmount;
    private String BPO_6_BPUnits;
    private String BPO_7_BPIntendedUseDateTime;
    private String BPO_8_BPIntendedDispenseFromLocation;
    private String BPO_9_BPIntendedDispenseFromAddress;
    private String BPO_10_BPRequestedDispenseDateTime;
    private String BPO_11_BPRequestedDispenseToLocation;
    private String BPO_12_BPRequestedDispenseToAddress;
    private String BPO_13_BPIndicationforUse;
    private String BPO_14_BPInformedConsentIndicator;

    public String getBPO_1_SetIDBPO() {
        return this.BPO_1_SetIDBPO;
    }

    public void setBPO_1_SetIDBPO(final String BPO_1_SetIDBPO) {
        this.BPO_1_SetIDBPO = BPO_1_SetIDBPO;
    }

    public String getBPO_2_BPUniversalServiceIdentifier() {
        return this.BPO_2_BPUniversalServiceIdentifier;
    }

    public void setBPO_2_BPUniversalServiceIdentifier(final String BPO_2_BPUniversalServiceIdentifier) {
        this.BPO_2_BPUniversalServiceIdentifier = BPO_2_BPUniversalServiceIdentifier;
    }

    public String getBPO_3_BPProcessingRequirements() {
        return this.BPO_3_BPProcessingRequirements;
    }

    public void setBPO_3_BPProcessingRequirements(final String BPO_3_BPProcessingRequirements) {
        this.BPO_3_BPProcessingRequirements = BPO_3_BPProcessingRequirements;
    }

    public String getBPO_4_BPQuantity() {
        return this.BPO_4_BPQuantity;
    }

    public void setBPO_4_BPQuantity(final String BPO_4_BPQuantity) {
        this.BPO_4_BPQuantity = BPO_4_BPQuantity;
    }

    public String getBPO_5_BPAmount() {
        return this.BPO_5_BPAmount;
    }

    public void setBPO_5_BPAmount(final String BPO_5_BPAmount) {
        this.BPO_5_BPAmount = BPO_5_BPAmount;
    }

    public String getBPO_6_BPUnits() {
        return this.BPO_6_BPUnits;
    }

    public void setBPO_6_BPUnits(final String BPO_6_BPUnits) {
        this.BPO_6_BPUnits = BPO_6_BPUnits;
    }

    public String getBPO_7_BPIntendedUseDateTime() {
        return this.BPO_7_BPIntendedUseDateTime;
    }

    public void setBPO_7_BPIntendedUseDateTime(final String BPO_7_BPIntendedUseDateTime) {
        this.BPO_7_BPIntendedUseDateTime = BPO_7_BPIntendedUseDateTime;
    }

    public String getBPO_8_BPIntendedDispenseFromLocation() {
        return this.BPO_8_BPIntendedDispenseFromLocation;
    }

    public void setBPO_8_BPIntendedDispenseFromLocation(final String BPO_8_BPIntendedDispenseFromLocation) {
        this.BPO_8_BPIntendedDispenseFromLocation = BPO_8_BPIntendedDispenseFromLocation;
    }

    public String getBPO_9_BPIntendedDispenseFromAddress() {
        return this.BPO_9_BPIntendedDispenseFromAddress;
    }

    public void setBPO_9_BPIntendedDispenseFromAddress(final String BPO_9_BPIntendedDispenseFromAddress) {
        this.BPO_9_BPIntendedDispenseFromAddress = BPO_9_BPIntendedDispenseFromAddress;
    }

    public String getBPO_10_BPRequestedDispenseDateTime() {
        return this.BPO_10_BPRequestedDispenseDateTime;
    }

    public void setBPO_10_BPRequestedDispenseDateTime(final String BPO_10_BPRequestedDispenseDateTime) {
        this.BPO_10_BPRequestedDispenseDateTime = BPO_10_BPRequestedDispenseDateTime;
    }

    public String getBPO_11_BPRequestedDispenseToLocation() {
        return this.BPO_11_BPRequestedDispenseToLocation;
    }

    public void setBPO_11_BPRequestedDispenseToLocation(final String BPO_11_BPRequestedDispenseToLocation) {
        this.BPO_11_BPRequestedDispenseToLocation = BPO_11_BPRequestedDispenseToLocation;
    }

    public String getBPO_12_BPRequestedDispenseToAddress() {
        return this.BPO_12_BPRequestedDispenseToAddress;
    }

    public void setBPO_12_BPRequestedDispenseToAddress(final String BPO_12_BPRequestedDispenseToAddress) {
        this.BPO_12_BPRequestedDispenseToAddress = BPO_12_BPRequestedDispenseToAddress;
    }

    public String getBPO_13_BPIndicationforUse() {
        return this.BPO_13_BPIndicationforUse;
    }

    public void setBPO_13_BPIndicationforUse(final String BPO_13_BPIndicationforUse) {
        this.BPO_13_BPIndicationforUse = BPO_13_BPIndicationforUse;
    }

    public String getBPO_14_BPInformedConsentIndicator() {
        return this.BPO_14_BPInformedConsentIndicator;
    }

    public void setBPO_14_BPInformedConsentIndicator(final String BPO_14_BPInformedConsentIndicator) {
        this.BPO_14_BPInformedConsentIndicator = BPO_14_BPInformedConsentIndicator;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

