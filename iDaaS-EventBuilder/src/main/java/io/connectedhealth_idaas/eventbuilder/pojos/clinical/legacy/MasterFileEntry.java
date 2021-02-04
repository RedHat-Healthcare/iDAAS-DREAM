package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the Master File data
 *
 */
public class MasterFileEntry {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String recordLevelEventCode;
	private String mfnControlId;
	private String effectiveDateTime;
	private String primaryKeyValue;
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
	public String getRecordLevelEventCode() {
		return recordLevelEventCode;
	}
	public void setRecordLevelEventCode(String recordLevelEventCode) {
		this.recordLevelEventCode = recordLevelEventCode;
	}
	public String getMfnControlId() {
		return mfnControlId;
	}
	public void setMfnControlId(String mfnControlId) {
		this.mfnControlId = mfnControlId;
	}
	public String getEffectiveDateTime() {
		return effectiveDateTime;
	}
	public void setEffectiveDateTime(String effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	public String getPrimaryKeyValue() {
		return primaryKeyValue;
	}
	public void setPrimaryKeyValue(String primaryKeyValue) {
		this.primaryKeyValue = primaryKeyValue;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
	
}
