package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the
 * appointment Personal Resource. It has also been enhanced to support additional needed attributes.
 *
 */
public class AppointmentPersonalResource {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String appointmentInfoResourceSetId;
	private String segmentActionCode;
	private String personnelResourceId;
	private String resourceType;
	private String resourceGroup;
	private String startDateTime;
	private String startDateTimeOffset;
	private String startDateTimeOffsetUnits;
	private String duration;
	private String durationUnits;
	private String allowSubstituteCode;
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
	public String getAppointmentInfoResourceSetId() {
		return appointmentInfoResourceSetId;
	}
	public void setAppointmentInfoResourceSetId(String appointmentInfoResourceSetId) {
		this.appointmentInfoResourceSetId = appointmentInfoResourceSetId;
	}
	public String getSegmentActionCode() {
		return segmentActionCode;
	}
	public void setSegmentActionCode(String segmentActionCode) {
		this.segmentActionCode = segmentActionCode;
	}
	public String getPersonnelResourceId() {
		return personnelResourceId;
	}
	public void setPersonnelResourceId(String personnelResourceId) {
		this.personnelResourceId = personnelResourceId;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getResourceGroup() {
		return resourceGroup;
	}
	public void setResourceGroup(String resourceGroup) {
		this.resourceGroup = resourceGroup;
	}
	public String getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}
	public String getStartDateTimeOffset() {
		return startDateTimeOffset;
	}
	public void setStartDateTimeOffset(String startDateTimeOffset) {
		this.startDateTimeOffset = startDateTimeOffset;
	}
	public String getStartDateTimeOffsetUnits() {
		return startDateTimeOffsetUnits;
	}
	public void setStartDateTimeOffsetUnits(String startDateTimeOffsetUnits) {
		this.startDateTimeOffsetUnits = startDateTimeOffsetUnits;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDurationUnits() {
		return durationUnits;
	}
	public void setDurationUnits(String durationUnits) {
		this.durationUnits = durationUnits;
	}
	public String getAllowSubstituteCode() {
		return allowSubstituteCode;
	}
	public void setAllowSubstituteCode(String allowSubstituteCode) {
		this.allowSubstituteCode = allowSubstituteCode;
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
