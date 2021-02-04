package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object that represents user credentials
 *
 */
public class UserAccessCredentials {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String UserAuthCredentialType;
	private String UserAuthCredential;
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
	public String getMessageTriggerEvent() {
		return messageTriggerEvent;
	}
	public void setMessageTriggerEvent(String messageTriggerEvent) {
		this.messageTriggerEvent = messageTriggerEvent;
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
	public String getUserAuthCredentialType() {
		return UserAuthCredentialType;
	}
	public void setUserAuthCredentialType(String userAuthCredentialType) {
		UserAuthCredentialType = userAuthCredentialType;
	}
	public String getUserAuthCredential() {
		return UserAuthCredential;
	}
	public void setUserAuthCredential(String userAuthCredential) {
		UserAuthCredential = userAuthCredential;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
