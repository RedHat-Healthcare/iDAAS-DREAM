package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * 	@author Alan Scott
 *	An object intended to represent all aspect of a specific observations details
 *
 */
public class ObservationRequest {

	private String observationId;
	private String placerOrderNumber;
	private String fillerOrderNumber;
	private String UniversalServiceId;
	private String priorityCode;
	private String observationDateTime;
	private String observationEndDateTime;
	private String collectionVolume;
	private String collectorIdentifier;
	private String specimenActivationCode;
	private String specimenReceivedDateTime;
	private String specimenSource;
	private String orderingProvider;
	private String resultRptStatusChangeDateTime;
	private String resultStatus;
	private String QuantityTime;
	private String transportationMode;
	private String studyReason;
	private String technician;
	private String scheduledDateTime;
	private String CollectorComment;
	public String getObservationId() {
		return observationId;
	}
	public void setObservationId(String observationId) {
		this.observationId = observationId;
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
	public String getUniversalServiceId() {
		return UniversalServiceId;
	}
	public void setUniversalServiceId(String universalServiceId) {
		UniversalServiceId = universalServiceId;
	}
	public String getPriorityCode() {
		return priorityCode;
	}
	public void setPriorityCode(String priorityCode) {
		this.priorityCode = priorityCode;
	}
	public String getObservationDateTime() {
		return observationDateTime;
	}
	public void setObservationDateTime(String observationDateTime) {
		this.observationDateTime = observationDateTime;
	}
	public String getObservationEndDateTime() {
		return observationEndDateTime;
	}
	public void setObservationEndDateTime(String observationEndDateTime) {
		this.observationEndDateTime = observationEndDateTime;
	}
	public String getCollectionVolume() {
		return collectionVolume;
	}
	public void setCollectionVolume(String collectionVolume) {
		this.collectionVolume = collectionVolume;
	}
	public String getCollectorIdentifier() {
		return collectorIdentifier;
	}
	public void setCollectorIdentifier(String collectorIdentifier) {
		this.collectorIdentifier = collectorIdentifier;
	}
	public String getSpecimenActivationCode() {
		return specimenActivationCode;
	}
	public void setSpecimenActivationCode(String specimenActivationCode) {
		this.specimenActivationCode = specimenActivationCode;
	}
	public String getSpecimenReceivedDateTime() {
		return specimenReceivedDateTime;
	}
	public void setSpecimenReceivedDateTime(String specimenReceivedDateTime) {
		this.specimenReceivedDateTime = specimenReceivedDateTime;
	}
	public String getSpecimenSource() {
		return specimenSource;
	}
	public void setSpecimenSource(String specimenSource) {
		this.specimenSource = specimenSource;
	}
	public String getOrderingProvider() {
		return orderingProvider;
	}
	public void setOrderingProvider(String orderingProvider) {
		this.orderingProvider = orderingProvider;
	}
	public String getResultRptStatusChangeDateTime() {
		return resultRptStatusChangeDateTime;
	}
	public void setResultRptStatusChangeDateTime(String resultRptStatusChangeDateTime) {
		this.resultRptStatusChangeDateTime = resultRptStatusChangeDateTime;
	}
	public String getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getQuantityTime() {
		return QuantityTime;
	}
	public void setQuantityTime(String quantityTime) {
		QuantityTime = quantityTime;
	}
	public String getTransportationMode() {
		return transportationMode;
	}
	public void setTransportationMode(String transportationMode) {
		this.transportationMode = transportationMode;
	}
	public String getStudyReason() {
		return studyReason;
	}
	public void setStudyReason(String studyReason) {
		this.studyReason = studyReason;
	}
	public String getTechnician() {
		return technician;
	}
	public void setTechnician(String technician) {
		this.technician = technician;
	}
	public String getScheduledDateTime() {
		return scheduledDateTime;
	}
	public void setScheduledDateTime(String scheduledDateTime) {
		this.scheduledDateTime = scheduledDateTime;
	}
	public String getCollectorComment() {
		return CollectorComment;
	}
	public void setCollectorComment(String collectorComment) {
		CollectorComment = collectorComment;
	}
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
	
}
