package io.connectedhealth_idaas.eventbuilder.pojos.clinicalreasoning;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
/*
 * Designed to support aiDOC - Assigned Insight for Disease, Outbreak and Conditions
 */

public class AIDoc {

	private String observationSetId;
	private String valueType;
	private String observationId;
	private String observationSubId;
	private String observationValue;
	private String observationValueName;
	private String units;
	private String referenceRange;
	private String abnormalFlags;
	private String natureofAbnormalTest;
	private String observationResultStatus;
	private String dateTimeObservation;
	private String producersID;
	private String orderControlId;
	private String placerOrderNumber;
	private String fillerOrderNumber;
	private String orderStatus;
	private String quantityTiming;
	private String transactionDateTime;
	private String enteredBy;
	private String verifiedBy;
	private String parentOrderNumber;
	private String orderingProvider;
	private String facilityLocation;
	private String orderEffectiveDateTime;
	private String orderingFacilityName;
	private String orderingFacilityAddress;
	private String confirmationCode;
	private String orderType;
	private String UniversalServiceId;
	private String priorityCode;
	private String observationDateTime;
	private String observationEndDateTime;
	private String collectionVolume;
	private String collectorIdentifier;
	private String specimenActivationCode;
	private String specimenReceivedDateTime;
	private String specimenSource;
	private String resultRptStatusChangeDateTime;
	private String resultStatus;
	private String QuantityTime;
	private String transportationMode;
	private String studyReason;
	private String technician;
	private String scheduledDateTime;
	private String CollectorComment;
	private String vitalsType;
	private String vitalsTime;
	private String vitalsValue;

	public String getObservationSetId() {
		return observationSetId;
	}

	public void setObservationSetId(String observationSetId) {
		this.observationSetId = observationSetId;
	}

	public String getValueType() {
		return valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

	public String getObservationId() {
		return observationId;
	}

	public void setObservationId(String observationId) {
		this.observationId = observationId;
	}

	public String getObservationSubId() {
		return observationSubId;
	}

	public void setObservationSubId(String observationSubId) {
		this.observationSubId = observationSubId;
	}

	public String getObservationValue() {
		return observationValue;
	}

	public void setObservationValue(String observationValue) {
		this.observationValue = observationValue;
	}

	public String getObservationValueName() {
		return observationValueName;
	}

	public void setObservationValueName(String observationValueName) {
		this.observationValueName = observationValueName;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getReferenceRange() {
		return referenceRange;
	}

	public void setReferenceRange(String referenceRange) {
		this.referenceRange = referenceRange;
	}

	public String getAbnormalFlags() {
		return abnormalFlags;
	}

	public void setAbnormalFlags(String abnormalFlags) {
		this.abnormalFlags = abnormalFlags;
	}

	public String getNatureofAbnormalTest() {
		return natureofAbnormalTest;
	}

	public void setNatureofAbnormalTest(String natureofAbnormalTest) {
		this.natureofAbnormalTest = natureofAbnormalTest;
	}

	public String getObservationResultStatus() {
		return observationResultStatus;
	}

	public void setObservationResultStatus(String observationResultStatus) {
		this.observationResultStatus = observationResultStatus;
	}

	public String getDateTimeObservation() {
		return dateTimeObservation;
	}

	public void setDateTimeObservation(String dateTimeObservation) {
		this.dateTimeObservation = dateTimeObservation;
	}

	public String getProducersID() {
		return producersID;
	}

	public void setProducersID(String producersID) {
		this.producersID = producersID;
	}

	public String getOrderControlId() {
		return orderControlId;
	}

	public void setOrderControlId(String orderControlId) {
		this.orderControlId = orderControlId;
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

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getQuantityTiming() {
		return quantityTiming;
	}

	public void setQuantityTiming(String quantityTiming) {
		this.quantityTiming = quantityTiming;
	}

	public String getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}

	public String getEnteredBy() {
		return enteredBy;
	}

	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}

	public String getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	public String getParentOrderNumber() {
		return parentOrderNumber;
	}

	public void setParentOrderNumber(String parentOrderNumber) {
		this.parentOrderNumber = parentOrderNumber;
	}

	public String getOrderingProvider() {
		return orderingProvider;
	}

	public void setOrderingProvider(String orderingProvider) {
		this.orderingProvider = orderingProvider;
	}

	public String getFacilityLocation() {
		return facilityLocation;
	}

	public void setFacilityLocation(String facilityLocation) {
		this.facilityLocation = facilityLocation;
	}

	public String getOrderEffectiveDateTime() {
		return orderEffectiveDateTime;
	}

	public void setOrderEffectiveDateTime(String orderEffectiveDateTime) {
		this.orderEffectiveDateTime = orderEffectiveDateTime;
	}

	public String getOrderingFacilityName() {
		return orderingFacilityName;
	}

	public void setOrderingFacilityName(String orderingFacilityName) {
		this.orderingFacilityName = orderingFacilityName;
	}

	public String getOrderingFacilityAddress() {
		return orderingFacilityAddress;
	}

	public void setOrderingFacilityAddress(String orderingFacilityAddress) {
		this.orderingFacilityAddress = orderingFacilityAddress;
	}

	public String getConfirmationCode() {
		return confirmationCode;
	}

	public void setConfirmationCode(String confirmationCode) {
		this.confirmationCode = confirmationCode;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
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

	public String getVitalsType() {
		return vitalsType;
	}

	public void setVitalsType(String vitalsType) {
		this.vitalsType = vitalsType;
	}

	public String getVitalsTime() {
		return vitalsTime;
	}

	public void setVitalsTime(String vitalsTime) {
		this.vitalsTime = vitalsTime;
	}

	public String getVitalsValue() {
		return vitalsValue;
	}

	public void setVitalsValue(String vitalsValue) {
		this.vitalsValue = vitalsValue;
	}

	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}

}