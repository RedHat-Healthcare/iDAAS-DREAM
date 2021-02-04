package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * 	@author Alan Scott
 * 	Object meant to represent an observation of clinical results
 *
 */
public class Observation {
	
	private String observationSetId;
	private String valueType;
	private String observationId;
	private String observationSubId;
	private String observationValue;
	private String units;
	private String referenceRange;
	private String abnormalFlags;
	private String natureofAbnormalTest;
	private String observationResultStatus;
	private String dateTimeObservation;
	private String producersID;
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
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	

}
