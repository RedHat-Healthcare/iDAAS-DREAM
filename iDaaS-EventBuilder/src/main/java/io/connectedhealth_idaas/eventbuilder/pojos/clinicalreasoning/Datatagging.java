package io.connectedhealth_idaas.eventbuilder.pojos.clinicalreasoning;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * Intended to be used for data tagging of streaming data
 */
public class Datatagging {

    private String sendingApp;
    private String facilityId;
    private String messageDateTime;
    private String messageDate;
    private String messageTime;
    private String messageHour;
    private String messageType;
    private String messageEvent;
    private String industrystdName;
    private String messageId;
    private String uniqueMessageId;
    private String messageVersion;
    private String messageVendor;
    private String[] datatags;

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

    public String getMessageDateTime() {
        return messageDateTime;
    }

    public void setMessageDateTime(String messageDateTime) {
        this.messageDateTime = messageDateTime;
    }

    public String getIndustrystdName() {
        return industrystdName;
    }

    public void setIndustrystdName(String industrystdName) {
        this.industrystdName = industrystdName;
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

    public String getMessageVendor() {
        return messageVendor;
    }

    public void setMessageVendor(String messageVendor) {
        this.messageVendor = messageVendor;
    }

    public String[] getDatatags() {
        return datatags;
    }

    public void setDatatags(String[] datatags) {
        this.datatags = datatags;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }

}
