package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object that represents a transcribed document
 *
 */
public class TranscriptionDocHeader {
	
	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String transcriptionDocHeaderSetId;
	private String docType;
	private String docContentPresentation;
	private String activityDateTime;
	private String primaryActivityProviderCode;
	private String originationDateTime;
	private String transcriptionDateTime;
	private String editDateTime;
	private String originatorCodeName;
	private String assignedDocAuthenticator;
	private String transcriptionistCodeName;
	private String uniqueDocNumber;
	private String parentDocNumber;
	private String placerOrderNumber;
	private String fillerOrderNumber;
	private String uniqueDocFileName;
	private String docCompletionStatus;
	private String docConfidentialityStatus;
	private String docAvailabilityStatus;
	private String docStoragetatus;
	private String docChangeReason;
	private String authorizedPersonTimeStamp;
	private String distributedCopiesReportNames;
	
	
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
	public String getTranscriptionDocHeaderSetId() {
		return transcriptionDocHeaderSetId;
	}
	public void setTranscriptionDocHeaderSetId(String transcriptionDocHeaderSetId) {
		this.transcriptionDocHeaderSetId = transcriptionDocHeaderSetId;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocContentPresentation() {
		return docContentPresentation;
	}
	public void setDocContentPresentation(String docContentPresentation) {
		this.docContentPresentation = docContentPresentation;
	}
	public String getActivityDateTime() {
		return activityDateTime;
	}
	public void setActivityDateTime(String activityDateTime) {
		this.activityDateTime = activityDateTime;
	}
	public String getPrimaryActivityProviderCode() {
		return primaryActivityProviderCode;
	}
	public void setPrimaryActivityProviderCode(String primaryActivityProviderCode) {
		this.primaryActivityProviderCode = primaryActivityProviderCode;
	}
	public String getOriginationDateTime() {
		return originationDateTime;
	}
	public void setOriginationDateTime(String originationDateTime) {
		this.originationDateTime = originationDateTime;
	}
	public String getTranscriptionDateTime() {
		return transcriptionDateTime;
	}
	public void setTranscriptionDateTime(String transcriptionDateTime) {
		this.transcriptionDateTime = transcriptionDateTime;
	}
	public String getEditDateTime() {
		return editDateTime;
	}
	public void setEditDateTime(String editDateTime) {
		this.editDateTime = editDateTime;
	}
	public String getOriginatorCodeName() {
		return originatorCodeName;
	}
	public void setOriginatorCodeName(String originatorCodeName) {
		this.originatorCodeName = originatorCodeName;
	}
	public String getAssignedDocAuthenticator() {
		return assignedDocAuthenticator;
	}
	public void setAssignedDocAuthenticator(String assignedDocAuthenticator) {
		this.assignedDocAuthenticator = assignedDocAuthenticator;
	}
	public String getTranscriptionistCodeName() {
		return transcriptionistCodeName;
	}
	public void setTranscriptionistCodeName(String transcriptionistCodeName) {
		this.transcriptionistCodeName = transcriptionistCodeName;
	}
	public String getUniqueDocNumber() {
		return uniqueDocNumber;
	}
	public void setUniqueDocNumber(String uniqueDocNumber) {
		this.uniqueDocNumber = uniqueDocNumber;
	}
	public String getParentDocNumber() {
		return parentDocNumber;
	}
	public void setParentDocNumber(String parentDocNumber) {
		this.parentDocNumber = parentDocNumber;
	}
	public String getPlacerOrderNumber() {
		return placerOrderNumber;
	}
	public void setPlacerOrderNumber(String placerOrderNumber) {
		this.placerOrderNumber = placerOrderNumber;
	}
	public String getFillerOrderNumber() {
		return fillerOrderNumber;
	}
	public void setFillerOrderNumber(String fillerOrderNumber) {
		this.fillerOrderNumber = fillerOrderNumber;
	}
	public String getUniqueDocFileName() {
		return uniqueDocFileName;
	}
	public void setUniqueDocFileName(String uniqueDocFileName) {
		this.uniqueDocFileName = uniqueDocFileName;
	}
	public String getDocCompletionStatus() {
		return docCompletionStatus;
	}
	public void setDocCompletionStatus(String docCompletionStatus) {
		this.docCompletionStatus = docCompletionStatus;
	}
	public String getDocConfidentialityStatus() {
		return docConfidentialityStatus;
	}
	public void setDocConfidentialityStatus(String docConfidentialityStatus) {
		this.docConfidentialityStatus = docConfidentialityStatus;
	}
	public String getDocAvailabilityStatus() {
		return docAvailabilityStatus;
	}
	public void setDocAvailabilityStatus(String docAvailabilityStatus) {
		this.docAvailabilityStatus = docAvailabilityStatus;
	}
	public String getDocStoragetatus() {
		return docStoragetatus;
	}
	public void setDocStoragetatus(String docStoragetatus) {
		this.docStoragetatus = docStoragetatus;
	}
	public String getDocChangeReason() {
		return docChangeReason;
	}
	public void setDocChangeReason(String docChangeReason) {
		this.docChangeReason = docChangeReason;
	}
	public String getAuthorizedPersonTimeStamp() {
		return authorizedPersonTimeStamp;
	}
	public void setAuthorizedPersonTimeStamp(String authorizedPersonTimeStamp) {
		this.authorizedPersonTimeStamp = authorizedPersonTimeStamp;
	}
	public String getDistributedCopiesReportNames() {
		return distributedCopiesReportNames;
	}
	public void setDistributedCopiesReportNames(String distributedCopiesReportNames) {
		this.distributedCopiesReportNames = distributedCopiesReportNames;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}

}
