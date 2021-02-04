package io.connectedhealth_idaas.eventbuilder.events.clinical;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SocialDeterminantsEvent {
    private String sendingApp;
    private String facilityId;
    private String messageDate;
    private String messageTime;
    private String messageHour;
    private String messageType;
    private String messageEvent;
    private String industryStandardName;
    private String messageId;
    private String uniqueMessageId;
    private String messageVersion;
    private String messageData;
    private String platformModule;
    private String processingComponent;
    private String[] reportedproblems;
    private String[] disease;
    private String[] procedures;
    private String[] patientDemographicsAdditionalInfo;

    public String getSendingApp() {
        return sendingApp;
    }

    public void setSendingApp(String sendingApp) {
        this.sendingApp = sendingApp;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    public String getMessageHour() {
        return messageHour;
    }

    public void setMessageHour(String messageHour) {
        this.messageHour = messageHour;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageEvent() {
        return messageEvent;
    }

    public void setMessageEvent(String messageEvent) {
        this.messageEvent = messageEvent;
    }

    public String getIndustryStandardName() {
        return industryStandardName;
    }

    public void setIndustryStandardName(String industryStandardName) {
        this.industryStandardName = industryStandardName;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getUniqueMessageId() {
        return uniqueMessageId;
    }

    public void setUniqueMessageId(String uniqueMessageId) {
        this.uniqueMessageId = uniqueMessageId;
    }

    public String getMessageVersion() {
        return messageVersion;
    }

    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    public String getMessageData() {
        return messageData;
    }

    public void setMessageData(String messageData) {
        this.messageData = messageData;
    }

    public String getPlatformModule() {
        return platformModule;
    }

    public void setPlatformModule(String platformModule) {
        this.platformModule = platformModule;
    }

    public String getProcessingComponent() {
        return processingComponent;
    }

    public void setProcessingComponent(String processingComponent) {
        this.processingComponent = processingComponent;
    }

    public String[] getReportedproblems() {
        return reportedproblems;
    }

    public void setReportedproblems(String[] reportedproblems) {
        this.reportedproblems = reportedproblems;
    }

    public String[] getDisease() {
        return disease;
    }

    public void setDisease(String[] disease) {
        this.disease = disease;
    }

    public String[] getProcedures() {
        return procedures;
    }

    public void setProcedures(String[] procedures) {
        this.procedures = procedures;
    }

    public void setPatientDemographicsAdditionalInfo(String[] patientDemographicsAdditionalInfo) {
        this.patientDemographicsAdditionalInfo = patientDemographicsAdditionalInfo; }

    public String[] getPatientDemographicsAdditionalInfo() {
            return patientDemographicsAdditionalInfo;
    }

    //toString
    public String toString ()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
