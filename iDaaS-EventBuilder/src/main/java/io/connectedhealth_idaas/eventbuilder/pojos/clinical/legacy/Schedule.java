package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents a schedule
 *
 */
public class Schedule {
	
	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String placerAppId;
	private String placerfillerId;
	private String occurenceNumber;
	private String placerGroupNumber;
	private String scheduleID;
	private String eventReason;
	private String apptReason;
	private String apptType;
	private String apptDuration;
	private String appDurationUnits;
	private String apptTimingQuantity;
	private String placerContactPerson;
	private String placerContactPhoneNumber;
	private String placerContactAddress;
	private String placerContactLocation;
	private String fillerContactPerson;
	private String fillerContactPhoneNumber;
	private String fillerContactAddress;
	private String fillerContactLocation;
	private String enteredByPerson;
	private String enteredByPhoneNumber;
	private String enteredByLocation;
	private String parentPlacerAppointmentId;
	private String parentFillerAppointmentId;
	private String fillerStatusCode;
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
	public String getPlacerAppId() {
		return placerAppId;
	}
	public void setPlacerAppId(String placerAppId) {
		this.placerAppId = placerAppId;
	}
	public String getPlacerfillerId() {
		return placerfillerId;
	}
	public void setPlacerfillerId(String placerfillerId) {
		this.placerfillerId = placerfillerId;
	}
	public String getOccurenceNumber() {
		return occurenceNumber;
	}
	public void setOccurenceNumber(String occurenceNumber) {
		this.occurenceNumber = occurenceNumber;
	}
	public String getPlacerGroupNumber() {
		return placerGroupNumber;
	}
	public void setPlacerGroupNumber(String placerGroupNumber) {
		this.placerGroupNumber = placerGroupNumber;
	}
	public String getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(String scheduleID) {
		this.scheduleID = scheduleID;
	}
	public String getEventReason() {
		return eventReason;
	}
	public void setEventReason(String eventReason) {
		this.eventReason = eventReason;
	}
	public String getApptReason() {
		return apptReason;
	}
	public void setApptReason(String apptReason) {
		this.apptReason = apptReason;
	}
	public String getApptType() {
		return apptType;
	}
	public void setApptType(String apptType) {
		this.apptType = apptType;
	}
	public String getApptDuration() {
		return apptDuration;
	}
	public void setApptDuration(String apptDuration) {
		this.apptDuration = apptDuration;
	}
	public String getAppDurationUnits() {
		return appDurationUnits;
	}
	public void setAppDurationUnits(String appDurationUnits) {
		this.appDurationUnits = appDurationUnits;
	}
	public String getApptTimingQuantity() {
		return apptTimingQuantity;
	}
	public void setApptTimingQuantity(String apptTimingQuantity) {
		this.apptTimingQuantity = apptTimingQuantity;
	}
	public String getPlacerContactPerson() {
		return placerContactPerson;
	}
	public void setPlacerContactPerson(String placerContactPerson) {
		this.placerContactPerson = placerContactPerson;
	}
	public String getPlacerContactPhoneNumber() {
		return placerContactPhoneNumber;
	}
	public void setPlacerContactPhoneNumber(String placerContactPhoneNumber) {
		this.placerContactPhoneNumber = placerContactPhoneNumber;
	}
	public String getPlacerContactAddress() {
		return placerContactAddress;
	}
	public void setPlacerContactAddress(String placerContactAddress) {
		this.placerContactAddress = placerContactAddress;
	}
	public String getPlacerContactLocation() {
		return placerContactLocation;
	}
	public void setPlacerContactLocation(String placerContactLocation) {
		this.placerContactLocation = placerContactLocation;
	}
	public String getFillerContactPerson() {
		return fillerContactPerson;
	}
	public void setFillerContactPerson(String fillerContactPerson) {
		this.fillerContactPerson = fillerContactPerson;
	}
	public String getFillerContactPhoneNumber() {
		return fillerContactPhoneNumber;
	}
	public void setFillerContactPhoneNumber(String fillerContactPhoneNumber) {
		this.fillerContactPhoneNumber = fillerContactPhoneNumber;
	}
	public String getFillerContactAddress() {
		return fillerContactAddress;
	}
	public void setFillerContactAddress(String fillerContactAddress) {
		this.fillerContactAddress = fillerContactAddress;
	}
	public String getFillerContactLocation() {
		return fillerContactLocation;
	}
	public void setFillerContactLocation(String fillerContactLocation) {
		this.fillerContactLocation = fillerContactLocation;
	}
	public String getEnteredByPerson() {
		return enteredByPerson;
	}
	public void setEnteredByPerson(String enteredByPerson) {
		this.enteredByPerson = enteredByPerson;
	}
	public String getEnteredByPhoneNumber() {
		return enteredByPhoneNumber;
	}
	public void setEnteredByPhoneNumber(String enteredByPhoneNumber) {
		this.enteredByPhoneNumber = enteredByPhoneNumber;
	}
	public String getEnteredByLocation() {
		return enteredByLocation;
	}
	public void setEnteredByLocation(String enteredByLocation) {
		this.enteredByLocation = enteredByLocation;
	}
	public String getParentPlacerAppointmentId() {
		return parentPlacerAppointmentId;
	}
	public void setParentPlacerAppointmentId(String parentPlacerAppointmentId) {
		this.parentPlacerAppointmentId = parentPlacerAppointmentId;
	}
	public String getParentFillerAppointmentId() {
		return parentFillerAppointmentId;
	}
	public void setParentFillerAppointmentId(String parentFillerAppointmentId) {
		this.parentFillerAppointmentId = parentFillerAppointmentId;
	}
	public String getFillerStatusCode() {
		return fillerStatusCode;
	}
	public void setFillerStatusCode(String fillerStatusCode) {
		this.fillerStatusCode = fillerStatusCode;
	}

	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
}
