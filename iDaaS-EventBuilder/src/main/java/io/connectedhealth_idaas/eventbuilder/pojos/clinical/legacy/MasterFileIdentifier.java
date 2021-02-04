/**
 * 
 */
package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the MFI segment in 
 * HL7 and has been augmented to support additional needed attributes. It can 
 * also be further augmented to support additional needs.
 *
 */
public class MasterFileIdentifier {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String masterFileIdentifier;
	private String masterFileAppIdentifier;
	private String fileLevelEventCode;
	private String enteredDateTime;
	private String effectiveDateTime;
	private String respLevelCode;
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
	public String getMasterFileIdentifier() {
		return masterFileIdentifier;
	}
	public void setMasterFileIdentifier(String masterFileIdentifier) {
		this.masterFileIdentifier = masterFileIdentifier;
	}
	public String getMasterFileAppIdentifier() {
		return masterFileAppIdentifier;
	}
	public void setMasterFileAppIdentifier(String masterFileAppIdentifier) {
		this.masterFileAppIdentifier = masterFileAppIdentifier;
	}
	public String getFileLevelEventCode() {
		return fileLevelEventCode;
	}
	public void setFileLevelEventCode(String fileLevelEventCode) {
		this.fileLevelEventCode = fileLevelEventCode;
	}
	public String getEnteredDateTime() {
		return enteredDateTime;
	}
	public void setEnteredDateTime(String enteredDateTime) {
		this.enteredDateTime = enteredDateTime;
	}
	public String getEffectiveDateTime() {
		return effectiveDateTime;
	}
	public void setEffectiveDateTime(String effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	public String getRespLevelCode() {
		return respLevelCode;
	}
	public void setRespLevelCode(String respLevelCode) {
		this.respLevelCode = respLevelCode;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
