package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents a guarantor of payment
 *
 */
public class Guarantor {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String guarantorSetId;
	private String guarantorNumber;
	private String guarantorName;
	private String guarantorSurName;
	private String guarantorAddress;
	private String guarantorMobilePhoneNumber;
	private String guarantorBusPhoneNumber;
	private String guarantorDateofBirth;
	private String guarantorGender;
	private String guarantorType;
	private String guarantorRelationship;
	private String guarantorSSN;
	private String guarantorDateBegin;
	private String guarantorDateEnd;
	private String guarantorOrgName;
	private String guarantorMaritalStatus;
	private String guarantorCitizenship;
	private String guarantorEthnicityGrp;
	private String guarantorReligion;
	private String guarantorVIPIndiciator;
	private String guarantorFinClass;
	private String guarantorRace;
	private String employerName;
	private String employerAddress;
	private String employerPhone;
	private String employerId;
	private String employerStatus;
	private String employerStopDate;
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
	public String getGuarantorSetId() {
		return guarantorSetId;
	}
	public void setGuarantorSetId(String guarantorSetId) {
		this.guarantorSetId = guarantorSetId;
	}
	public String getGuarantorNumber() {
		return guarantorNumber;
	}
	public void setGuarantorNumber(String guarantorNumber) {
		this.guarantorNumber = guarantorNumber;
	}
	public String getGuarantorName() {
		return guarantorName;
	}
	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}
	public String getGuarantorSurName() {
		return guarantorSurName;
	}
	public void setGuarantorSurName(String guarantorSurName) {
		this.guarantorSurName = guarantorSurName;
	}
	public String getGuarantorAddress() {
		return guarantorAddress;
	}
	public void setGuarantorAddress(String guarantorAddress) {
		this.guarantorAddress = guarantorAddress;
	}
	public String getGuarantorMobilePhoneNumber() {
		return guarantorMobilePhoneNumber;
	}
	public void setGuarantorMobilePhoneNumber(String guarantorMobilePhoneNumber) {
		this.guarantorMobilePhoneNumber = guarantorMobilePhoneNumber;
	}
	public String getGuarantorBusPhoneNumber() {
		return guarantorBusPhoneNumber;
	}
	public void setGuarantorBusPhoneNumber(String guarantorBusPhoneNumber) {
		this.guarantorBusPhoneNumber = guarantorBusPhoneNumber;
	}
	public String getGuarantorDateofBirth() {
		return guarantorDateofBirth;
	}
	public void setGuarantorDateofBirth(String guarantorDateofBirth) {
		this.guarantorDateofBirth = guarantorDateofBirth;
	}
	public String getGuarantorGender() {
		return guarantorGender;
	}
	public void setGuarantorGender(String guarantorGender) {
		this.guarantorGender = guarantorGender;
	}
	public String getGuarantorType() {
		return guarantorType;
	}
	public void setGuarantorType(String guarantorType) {
		this.guarantorType = guarantorType;
	}
	public String getGuarantorRelationship() {
		return guarantorRelationship;
	}
	public void setGuarantorRelationship(String guarantorRelationship) {
		this.guarantorRelationship = guarantorRelationship;
	}
	public String getGuarantorSSN() {
		return guarantorSSN;
	}
	public void setGuarantorSSN(String guarantorSSN) {
		this.guarantorSSN = guarantorSSN;
	}
	public String getGuarantorDateBegin() {
		return guarantorDateBegin;
	}
	public void setGuarantorDateBegin(String guarantorDateBegin) {
		this.guarantorDateBegin = guarantorDateBegin;
	}
	public String getGuarantorDateEnd() {
		return guarantorDateEnd;
	}
	public void setGuarantorDateEnd(String guarantorDateEnd) {
		this.guarantorDateEnd = guarantorDateEnd;
	}
	public String getGuarantorOrgName() {
		return guarantorOrgName;
	}
	public void setGuarantorOrgName(String guarantorOrgName) {
		this.guarantorOrgName = guarantorOrgName;
	}
	public String getGuarantorMaritalStatus() {
		return guarantorMaritalStatus;
	}
	public void setGuarantorMaritalStatus(String guarantorMaritalStatus) {
		this.guarantorMaritalStatus = guarantorMaritalStatus;
	}
	public String getGuarantorCitizenship() {
		return guarantorCitizenship;
	}
	public void setGuarantorCitizenship(String guarantorCitizenship) {
		this.guarantorCitizenship = guarantorCitizenship;
	}
	public String getGuarantorEthnicityGrp() {
		return guarantorEthnicityGrp;
	}
	public void setGuarantorEthnicityGrp(String guarantorEthnicityGrp) {
		this.guarantorEthnicityGrp = guarantorEthnicityGrp;
	}
	public String getGuarantorReligion() {
		return guarantorReligion;
	}
	public void setGuarantorReligion(String guarantorReligion) {
		this.guarantorReligion = guarantorReligion;
	}
	public String getGuarantorVIPIndiciator() {
		return guarantorVIPIndiciator;
	}
	public void setGuarantorVIPIndiciator(String guarantorVIPIndiciator) {
		this.guarantorVIPIndiciator = guarantorVIPIndiciator;
	}
	public String getGuarantorFinClass() {
		return guarantorFinClass;
	}
	public void setGuarantorFinClass(String guarantorFinClass) {
		this.guarantorFinClass = guarantorFinClass;
	}
	public String getGuarantorRace() {
		return guarantorRace;
	}
	public void setGuarantorRace(String guarantorRace) {
		this.guarantorRace = guarantorRace;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getEmployerAddress() {
		return employerAddress;
	}
	public void setEmployerAddress(String employerAddress) {
		this.employerAddress = employerAddress;
	}
	public String getEmployerPhone() {
		return employerPhone;
	}
	public void setEmployerPhone(String employerPhone) {
		this.employerPhone = employerPhone;
	}
	public String getEmployerId() {
		return employerId;
	}
	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}
	public String getEmployerStatus() {
		return employerStatus;
	}
	public void setEmployerStatus(String employerStatus) {
		this.employerStatus = employerStatus;
	}
	public String getEmployerStopDate() {
		return employerStopDate;
	}
	public void setEmployerStopDate(String employerStopDate) {
		this.employerStopDate = employerStopDate;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
