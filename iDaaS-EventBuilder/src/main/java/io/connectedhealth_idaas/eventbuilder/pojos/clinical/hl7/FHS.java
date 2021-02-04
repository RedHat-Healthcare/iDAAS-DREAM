package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FHS {
    private String FHS_1_FileFieldSeparator;
    private String FHS_2_FileEncodingCharacters;
    private String FHS_3_FileSendingApplication;
    private String FHS_4_FileSendingFacility;
    private String FHS_5_FileReceivingApplication;
    private String FHS_6_FileReceivingFacility;
    private String FHS_7_FileCreationDateTime;
    private String FHS_8_FileSecurity;
    private String FHS_9_FileNameID;
    private String FHS_10_FileHeaderComment;
    private String FHS_11_FileControlID;
    private String FHS_12_ReferenceFileControlID;
    private String FHS_13_FileSendingNetworkAddress;
    private String FHS_14_FileReceivingNetworkAddress;

    public String getFHS_1_FileFieldSeparator() {
        return this.FHS_1_FileFieldSeparator;
    }

    public void setFHS_1_FileFieldSeparator(final String FHS_1_FileFieldSeparator) {
        this.FHS_1_FileFieldSeparator = FHS_1_FileFieldSeparator;
    }

    public String getFHS_2_FileEncodingCharacters() {
        return this.FHS_2_FileEncodingCharacters;
    }

    public void setFHS_2_FileEncodingCharacters(final String FHS_2_FileEncodingCharacters) {
        this.FHS_2_FileEncodingCharacters = FHS_2_FileEncodingCharacters;
    }

    public String getFHS_3_FileSendingApplication() {
        return this.FHS_3_FileSendingApplication;
    }

    public void setFHS_3_FileSendingApplication(final String FHS_3_FileSendingApplication) {
        this.FHS_3_FileSendingApplication = FHS_3_FileSendingApplication;
    }

    public String getFHS_4_FileSendingFacility() {
        return this.FHS_4_FileSendingFacility;
    }

    public void setFHS_4_FileSendingFacility(final String FHS_4_FileSendingFacility) {
        this.FHS_4_FileSendingFacility = FHS_4_FileSendingFacility;
    }

    public String getFHS_5_FileReceivingApplication() {
        return this.FHS_5_FileReceivingApplication;
    }

    public void setFHS_5_FileReceivingApplication(final String FHS_5_FileReceivingApplication) {
        this.FHS_5_FileReceivingApplication = FHS_5_FileReceivingApplication;
    }

    public String getFHS_6_FileReceivingFacility() {
        return this.FHS_6_FileReceivingFacility;
    }

    public void setFHS_6_FileReceivingFacility(final String FHS_6_FileReceivingFacility) {
        this.FHS_6_FileReceivingFacility = FHS_6_FileReceivingFacility;
    }

    public String getFHS_7_FileCreationDateTime() {
        return this.FHS_7_FileCreationDateTime;
    }

    public void setFHS_7_FileCreationDateTime(final String FHS_7_FileCreationDateTime) {
        this.FHS_7_FileCreationDateTime = FHS_7_FileCreationDateTime;
    }

    public String getFHS_8_FileSecurity() {
        return this.FHS_8_FileSecurity;
    }

    public void setFHS_8_FileSecurity(final String FHS_8_FileSecurity) {
        this.FHS_8_FileSecurity = FHS_8_FileSecurity;
    }

    public String getFHS_9_FileNameID() {
        return this.FHS_9_FileNameID;
    }

    public void setFHS_9_FileNameID(final String FHS_9_FileNameID) {
        this.FHS_9_FileNameID = FHS_9_FileNameID;
    }

    public String getFHS_10_FileHeaderComment() {
        return this.FHS_10_FileHeaderComment;
    }

    public void setFHS_10_FileHeaderComment(final String FHS_10_FileHeaderComment) {
        this.FHS_10_FileHeaderComment = FHS_10_FileHeaderComment;
    }

    public String getFHS_11_FileControlID() {
        return this.FHS_11_FileControlID;
    }

    public void setFHS_11_FileControlID(final String FHS_11_FileControlID) {
        this.FHS_11_FileControlID = FHS_11_FileControlID;
    }

    public String getFHS_12_ReferenceFileControlID() {
        return this.FHS_12_ReferenceFileControlID;
    }

    public void setFHS_12_ReferenceFileControlID(final String FHS_12_ReferenceFileControlID) {
        this.FHS_12_ReferenceFileControlID = FHS_12_ReferenceFileControlID;
    }

    public String getFHS_13_FileSendingNetworkAddress() {
        return this.FHS_13_FileSendingNetworkAddress;
    }

    public void setFHS_13_FileSendingNetworkAddress(final String FHS_13_FileSendingNetworkAddress) {
        this.FHS_13_FileSendingNetworkAddress = FHS_13_FileSendingNetworkAddress;
    }

    public String getFHS_14_FileReceivingNetworkAddress() {
        return this.FHS_14_FileReceivingNetworkAddress;
    }

    public void setFHS_14_FileReceivingNetworkAddress(final String FHS_14_FileReceivingNetworkAddress) {
        this.FHS_14_FileReceivingNetworkAddress = FHS_14_FileReceivingNetworkAddress;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

