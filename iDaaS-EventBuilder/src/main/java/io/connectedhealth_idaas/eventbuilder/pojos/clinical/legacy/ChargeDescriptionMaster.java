package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the Charge Master item
 * and has been augmented to support additional needed attributes. It can
 * also be further augmented to support additional needs.
 *
 */
public class ChargeDescriptionMaster {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String primaryKeyValue;
	private String chargeCodeAlias;
	private String chargeDescShort;
	private String chargeDescLong;
	private String descOverrideInd;
	private String explodingCharges;
	private String procedureCode;
	private String activityFlag;
	private String inventoryNumber;
	private String contactNumber;
	private String contactOrg;
	private String roomFeeIndicator;
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
	public String getPrimaryKeyValue() {
		return primaryKeyValue;
	}
	public void setPrimaryKeyValue(String primaryKeyValue) {
		this.primaryKeyValue = primaryKeyValue;
	}
	public String getChargeCodeAlias() {
		return chargeCodeAlias;
	}
	public void setChargeCodeAlias(String chargeCodeAlias) {
		this.chargeCodeAlias = chargeCodeAlias;
	}
	public String getChargeDescShort() {
		return chargeDescShort;
	}
	public void setChargeDescShort(String chargeDescShort) {
		this.chargeDescShort = chargeDescShort;
	}
	public String getChargeDescLong() {
		return chargeDescLong;
	}
	public void setChargeDescLong(String chargeDescLong) {
		this.chargeDescLong = chargeDescLong;
	}
	public String getDescOverrideInd() {
		return descOverrideInd;
	}
	public void setDescOverrideInd(String descOverrideInd) {
		this.descOverrideInd = descOverrideInd;
	}
	public String getExplodingCharges() {
		return explodingCharges;
	}
	public void setExplodingCharges(String explodingCharges) {
		this.explodingCharges = explodingCharges;
	}
	public String getProcedureCode() {
		return procedureCode;
	}
	public void setProcedureCode(String procedureCode) {
		this.procedureCode = procedureCode;
	}
	public String getActivityFlag() {
		return activityFlag;
	}
	public void setActivityFlag(String activityFlag) {
		this.activityFlag = activityFlag;
	}
	public String getInventoryNumber() {
		return inventoryNumber;
	}
	public void setInventoryNumber(String inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactOrg() {
		return contactOrg;
	}
	public void setContactOrg(String contactOrg) {
		this.contactOrg = contactOrg;
	}
	public String getRoomFeeIndicator() {
		return roomFeeIndicator;
	}
	public void setRoomFeeIndicator(String roomFeeIndicator) {
		this.roomFeeIndicator = roomFeeIndicator;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
