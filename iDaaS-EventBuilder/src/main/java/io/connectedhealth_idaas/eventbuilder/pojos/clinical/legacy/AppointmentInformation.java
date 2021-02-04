package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with appointment information
 *
 */
public class AppointmentInformation {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String appointmentInformationSetId;
	private String segmentActionCondition;
	private String universalServiceId;
	private String startDateTime;
	private String startDateTimeOffset;
	private String startDateTimeOffsetUnits;
	private String duration;
	private String durationUnits;
	private String allowSubstituteCode;
	private String fillerStatusCode;
	private String placerSupplmenetalInformation;
	private String fillerSupplementalInformation;
	
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
	public String getAppointmentInformationSetId() {
		return appointmentInformationSetId;
	}
	public void setAppointmentInformationSetId(String appointmentInformationSetId) {
		this.appointmentInformationSetId = appointmentInformationSetId;
	}
	public String getSegmentActionCondition() {
		return segmentActionCondition;
	}
	public void setSegmentActionCondition(String segmentActionCondition) {
		this.segmentActionCondition = segmentActionCondition;
	}
	public String getUniversalServiceId() {
		return universalServiceId;
	}
	public void setUniversalServiceId(String universalServiceId) {
		this.universalServiceId = universalServiceId;
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
	public String getPlacerSupplmenetalInformation() {
		return placerSupplmenetalInformation;
	}
	public void setPlacerSupplmenetalInformation(String placerSupplmenetalInformation) {
		this.placerSupplmenetalInformation = placerSupplmenetalInformation;
	}
	public String getFillerSupplementalInformation() {
		return fillerSupplementalInformation;
	}
	public void setFillerSupplementalInformation(String fillerSupplementalInformation) {
		this.fillerSupplementalInformation = fillerSupplementalInformation;
	}
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
