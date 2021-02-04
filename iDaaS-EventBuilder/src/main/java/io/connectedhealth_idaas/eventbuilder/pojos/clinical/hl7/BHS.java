package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BHS {
    private String BHS_1_BatchFieldSeparator;
    private String BHS_2_BatchEncodingCharacters;
    private String BHS_3_BatchSendingApplication;
    private String BHS_4_BatchSendingFacility;
    private String BHS_5_BatchReceivingApplication;
    private String BHS_6_BatchReceivingFacility;
    private String BHS_7_BatchCreationDateTime;
    private String BHS_8_BatchSecurity;
    private String BHS_9_BatchNameIDType;
    private String BHS_10_BatchComment;
    private String BHS_11_BatchControlID;
    private String BHS_12_ReferenceBatchControlID;
    private String BHS_13_BatchSendingNetworkAddress;
    private String BHS_14_BatchReceivingNetworkAddress;

    public String getBHS_1_BatchFieldSeparator() {
        return this.BHS_1_BatchFieldSeparator;
    }

    public void setBHS_1_BatchFieldSeparator(final String BHS_1_BatchFieldSeparator) {
        this.BHS_1_BatchFieldSeparator = BHS_1_BatchFieldSeparator;
    }

    public String getBHS_2_BatchEncodingCharacters() {
        return this.BHS_2_BatchEncodingCharacters;
    }

    public void setBHS_2_BatchEncodingCharacters(final String BHS_2_BatchEncodingCharacters) {
        this.BHS_2_BatchEncodingCharacters = BHS_2_BatchEncodingCharacters;
    }

    public String getBHS_3_BatchSendingApplication() {
        return this.BHS_3_BatchSendingApplication;
    }

    public void setBHS_3_BatchSendingApplication(final String BHS_3_BatchSendingApplication) {
        this.BHS_3_BatchSendingApplication = BHS_3_BatchSendingApplication;
    }

    public String getBHS_4_BatchSendingFacility() {
        return this.BHS_4_BatchSendingFacility;
    }

    public void setBHS_4_BatchSendingFacility(final String BHS_4_BatchSendingFacility) {
        this.BHS_4_BatchSendingFacility = BHS_4_BatchSendingFacility;
    }

    public String getBHS_5_BatchReceivingApplication() {
        return this.BHS_5_BatchReceivingApplication;
    }

    public void setBHS_5_BatchReceivingApplication(final String BHS_5_BatchReceivingApplication) {
        this.BHS_5_BatchReceivingApplication = BHS_5_BatchReceivingApplication;
    }

    public String getBHS_6_BatchReceivingFacility() {
        return this.BHS_6_BatchReceivingFacility;
    }

    public void setBHS_6_BatchReceivingFacility(final String BHS_6_BatchReceivingFacility) {
        this.BHS_6_BatchReceivingFacility = BHS_6_BatchReceivingFacility;
    }

    public String getBHS_7_BatchCreationDateTime() {
        return this.BHS_7_BatchCreationDateTime;
    }

    public void setBHS_7_BatchCreationDateTime(final String BHS_7_BatchCreationDateTime) {
        this.BHS_7_BatchCreationDateTime = BHS_7_BatchCreationDateTime;
    }

    public String getBHS_8_BatchSecurity() {
        return this.BHS_8_BatchSecurity;
    }

    public void setBHS_8_BatchSecurity(final String BHS_8_BatchSecurity) {
        this.BHS_8_BatchSecurity = BHS_8_BatchSecurity;
    }

    public String getBHS_9_BatchNameIDType() {
        return this.BHS_9_BatchNameIDType;
    }

    public void setBHS_9_BatchNameIDType(final String BHS_9_BatchNameIDType) {
        this.BHS_9_BatchNameIDType = BHS_9_BatchNameIDType;
    }

    public String getBHS_10_BatchComment() {
        return this.BHS_10_BatchComment;
    }

    public void setBHS_10_BatchComment(final String BHS_10_BatchComment) {
        this.BHS_10_BatchComment = BHS_10_BatchComment;
    }

    public String getBHS_11_BatchControlID() {
        return this.BHS_11_BatchControlID;
    }

    public void setBHS_11_BatchControlID(final String BHS_11_BatchControlID) {
        this.BHS_11_BatchControlID = BHS_11_BatchControlID;
    }

    public String getBHS_12_ReferenceBatchControlID() {
        return this.BHS_12_ReferenceBatchControlID;
    }

    public void setBHS_12_ReferenceBatchControlID(final String BHS_12_ReferenceBatchControlID) {
        this.BHS_12_ReferenceBatchControlID = BHS_12_ReferenceBatchControlID;
    }

    public String getBHS_13_BatchSendingNetworkAddress() {
        return this.BHS_13_BatchSendingNetworkAddress;
    }

    public void setBHS_13_BatchSendingNetworkAddress(final String BHS_13_BatchSendingNetworkAddress) {
        this.BHS_13_BatchSendingNetworkAddress = BHS_13_BatchSendingNetworkAddress;
    }

    public String getBHS_14_BatchReceivingNetworkAddress() {
        return this.BHS_14_BatchReceivingNetworkAddress;
    }

    public void setBHS_14_BatchReceivingNetworkAddress(final String BHS_14_BatchReceivingNetworkAddress) {
        this.BHS_14_BatchReceivingNetworkAddress = BHS_14_BatchReceivingNetworkAddress;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

