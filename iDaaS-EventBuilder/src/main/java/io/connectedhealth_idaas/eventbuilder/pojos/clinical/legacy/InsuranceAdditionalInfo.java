package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents additional information for insurance
 *
 */
public class InsuranceAdditionalInfo {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String employeeId;
	private String insuredSSN;
	private String empName;
	private String employerId;
	private String medicareNumber;
	private String medicaidCaseNumber;
	private String militaryId;
	private String militaryDependant;
	private String militaryOrg;
	private String militaryStation;
	private String militaryService;
	private String militaryRetireDate;
	private String militaryNonVailCertDate;
	private String babyCoverage;
	private String specialCoverageApprovalName;
	private String specialCoverageApprovalTitle;
	private String nonCoveredInsuranceCode;
	private String payorId;
	private String payorSubscriberId;
	private String eligibilitySource;
	private String employerContactPersonName;
	private String employerContactPersonPhoneNumber;
	private String employerContactPersonReason;
	
	
	public String getEmployerContactPersonName() {
		return employerContactPersonName;
	}
	public void setEmployerContactPersonName(String employerContactPersonName) {
		this.employerContactPersonName = employerContactPersonName;
	}
	public String getEmployerContactPersonPhoneNumber() {
		return employerContactPersonPhoneNumber;
	}
	public void setEmployerContactPersonPhoneNumber(String employerContactPersonPhoneNumber) {
		this.employerContactPersonPhoneNumber = employerContactPersonPhoneNumber;
	}
	public String getEmployerContactPersonReason() {
		return employerContactPersonReason;
	}
	public void setEmployerContactPersonReason(String employerContactPersonReason) {
		this.employerContactPersonReason = employerContactPersonReason;
	}
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getInsuredSSN() {
		return insuredSSN;
	}
	public void setInsuredSSN(String insuredSSN) {
		this.insuredSSN = insuredSSN;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmployerId() {
		return employerId;
	}
	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}
	public String getMedicareNumber() {
		return medicareNumber;
	}
	public void setMedicareNumber(String medicareNumber) {
		this.medicareNumber = medicareNumber;
	}
	public String getMedicaidCaseNumber() {
		return medicaidCaseNumber;
	}
	public void setMedicaidCaseNumber(String medicaidCaseNumber) {
		this.medicaidCaseNumber = medicaidCaseNumber;
	}
	public String getMilitaryId() {
		return militaryId;
	}
	public void setMilitaryId(String militaryId) {
		this.militaryId = militaryId;
	}
	public String getMilitaryDependant() {
		return militaryDependant;
	}
	public void setMilitaryDependant(String militaryDependant) {
		this.militaryDependant = militaryDependant;
	}
	public String getMilitaryOrg() {
		return militaryOrg;
	}
	public void setMilitaryOrg(String militaryOrg) {
		this.militaryOrg = militaryOrg;
	}
	public String getMilitaryStation() {
		return militaryStation;
	}
	public void setMilitaryStation(String militaryStation) {
		this.militaryStation = militaryStation;
	}
	public String getMilitaryService() {
		return militaryService;
	}
	public void setMilitaryService(String militaryService) {
		this.militaryService = militaryService;
	}
	public String getMilitaryRetireDate() {
		return militaryRetireDate;
	}
	public void setMilitaryRetireDate(String militaryRetireDate) {
		this.militaryRetireDate = militaryRetireDate;
	}
	public String getMilitaryNonVailCertDate() {
		return militaryNonVailCertDate;
	}
	public void setMilitaryNonVailCertDate(String militaryNonVailCertDate) {
		this.militaryNonVailCertDate = militaryNonVailCertDate;
	}
	public String getBabyCoverage() {
		return babyCoverage;
	}
	public void setBabyCoverage(String babyCoverage) {
		this.babyCoverage = babyCoverage;
	}
	public String getSpecialCoverageApprovalName() {
		return specialCoverageApprovalName;
	}
	public void setSpecialCoverageApprovalName(String specialCoverageApprovalName) {
		this.specialCoverageApprovalName = specialCoverageApprovalName;
	}
	public String getSpecialCoverageApprovalTitle() {
		return specialCoverageApprovalTitle;
	}
	public void setSpecialCoverageApprovalTitle(String specialCoverageApprovalTitle) {
		this.specialCoverageApprovalTitle = specialCoverageApprovalTitle;
	}
	public String getNonCoveredInsuranceCode() {
		return nonCoveredInsuranceCode;
	}
	public void setNonCoveredInsuranceCode(String nonCoveredInsuranceCode) {
		this.nonCoveredInsuranceCode = nonCoveredInsuranceCode;
	}
	public String getPayorId() {
		return payorId;
	}
	public void setPayorId(String payorId) {
		this.payorId = payorId;
	}
	public String getPayorSubscriberId() {
		return payorSubscriberId;
	}
	public void setPayorSubscriberId(String payorSubscriberId) {
		this.payorSubscriberId = payorSubscriberId;
	}
	public String getEligibilitySource() {
		return eligibilitySource;
	}
	public void setEligibilitySource(String eligibilitySource) {
		this.eligibilitySource = eligibilitySource;
	}
	
	//toString 
	public String toString() 
	{
			return ReflectionToStringBuilder.toString(this);
	}
	
}
