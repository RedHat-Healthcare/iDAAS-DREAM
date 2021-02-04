package io.connectedhealth_idaas.eventbuilder.pojos.platform;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EMPI {
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
    private String lastName;
    private String firstName;
    private String address;
    private String SSN;
    private String DLN;
    private String accountNumber;
    private String incidentofcareID;
    private String[] PhoneNumber;
    private String platformModule;
    private String processingComponent;
    private String[] empiNumnber;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getDLN() {
        return DLN;
    }

    public void setDLN(String DLN) {
        this.DLN = DLN;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIncidentofcareID() {
        return incidentofcareID;
    }

    public void setIncidentofcareID(String incidentofcareID) {
        this.incidentofcareID = incidentofcareID;
    }

    public String[] getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String[] phoneNumber) {
        PhoneNumber = phoneNumber;
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

    public String[] getEmpiNumnber() {
        return empiNumnber;
    }

    public void setEmpiNumnber(String[] empiNumnber) {
        this.empiNumnber = empiNumnber;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }


}
