package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Intended to represent Staff
 *
 */
public class StaffIdentification {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String primaryKeySetId;
	private String staffIDList;
	private String staffName;
	private String staffType;
	private String gender;
	private String dateOfBirth;
	private String activityFlag;
	private String department;
	private String hospitalService;
	private String phoneNumber;
	private String officeAddress;
	private String activationDate;
	private String inacvitionDate;
	private String emalAddress;
	private String maritalStatus;
	private String jobTitle;
	private String jobCode;
	private String empStatus;
	private String dlnStaff;
	private String raceCode;
	private String ethnicityGroup;
	private String citizenship;
	private String dateTimeofDeath;
	private String religion;
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
	public String getPrimaryKeySetId() {
		return primaryKeySetId;
	}
	public void setPrimaryKeySetId(String primaryKeySetId) {
		this.primaryKeySetId = primaryKeySetId;
	}
	public String getStaffIDList() {
		return staffIDList;
	}
	public void setStaffIDList(String staffIDList) {
		this.staffIDList = staffIDList;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffType() {
		return staffType;
	}
	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getActivityFlag() {
		return activityFlag;
	}
	public void setActivityFlag(String activityFlag) {
		this.activityFlag = activityFlag;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getHospitalService() {
		return hospitalService;
	}
	public void setHospitalService(String hospitalService) {
		this.hospitalService = hospitalService;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}
	public String getInacvitionDate() {
		return inacvitionDate;
	}
	public void setInacvitionDate(String inacvitionDate) {
		this.inacvitionDate = inacvitionDate;
	}
	public String getEmalAddress() {
		return emalAddress;
	}
	public void setEmalAddress(String emalAddress) {
		this.emalAddress = emalAddress;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getJobCode() {
		return jobCode;
	}
	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	public String getDlnStaff() {
		return dlnStaff;
	}
	public void setDlnStaff(String dlnStaff) {
		this.dlnStaff = dlnStaff;
	}
	public String getRaceCode() {
		return raceCode;
	}
	public void setRaceCode(String raceCode) {
		this.raceCode = raceCode;
	}
	public String getEthnicityGroup() {
		return ethnicityGroup;
	}
	public void setEthnicityGroup(String ethnicityGroup) {
		this.ethnicityGroup = ethnicityGroup;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getDateTimeofDeath() {
		return dateTimeofDeath;
	}
	public void setDateTimeofDeath(String dateTimeofDeath) {
		this.dateTimeofDeath = dateTimeofDeath;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
