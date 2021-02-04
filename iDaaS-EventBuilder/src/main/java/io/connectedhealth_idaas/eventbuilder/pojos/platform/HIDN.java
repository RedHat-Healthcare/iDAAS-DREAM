package io.connectedhealth_idaas.eventbuilder.pojos.platform;

// Healthcare Integrated Data Network
public class HIDN {
    private String serverId;
    private String serverIP;
    private String sendingApp;
    private String facilityId;
    private String organizationId;
    private String messageDate;
    private String messageTime;
    private String messageHour;
    private String messageType;
    private String messageEvent;
    private String messageId;
    private String uniqueMessageId;
    private String messageVersion;
    private String messageDataType;
    private String specialInstructions;
    private String[] dataTags;

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

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

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
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

    public String[] getDataTags() {
        return dataTags;
    }

    public void setMessageEvent(String messageEvent) {
        this.messageEvent = messageEvent;
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

    public String getMessageDataType() {
        return messageDataType;
    }

    public void setMessageDataType(String messageDataType) {
        this.messageDataType = messageDataType;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public void setDataTags(String[] dataTags) {
        this.dataTags = dataTags;
    }
}
