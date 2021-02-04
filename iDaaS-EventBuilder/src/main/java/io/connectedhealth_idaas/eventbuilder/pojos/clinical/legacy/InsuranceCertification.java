package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents insurance certification
 *
 */
public class InsuranceCertification {
	
	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String insuranceCertificationId;
	private String certNumber;
	private String certifiedBy;
	private String certtifiedRequired;
	private String penalty;
	private String certDateTime;
	private String certModifiedDateTime;
	private String operatorName;
	private String certBeginDate;
	private String certEndDate;
	private String certDays;
	private String physicianReviewer;
	private String certContact;
	private String certContactPhoneNumber;
	private String certAgency;
	private String certPhoneNumber;
	private String preCertRqd;
	private String caseMgr;
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
	public String getInsuranceCertificationId() {
		return insuranceCertificationId;
	}
	public void setInsuranceCertificationId(String insuranceCertificationId) {
		this.insuranceCertificationId = insuranceCertificationId;
	}
	public String getCertNumber() {
		return certNumber;
	}
	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
	}
	public String getCertifiedBy() {
		return certifiedBy;
	}
	public void setCertifiedBy(String certifiedBy) {
		this.certifiedBy = certifiedBy;
	}
	public String getCerttifiedRequired() {
		return certtifiedRequired;
	}
	public void setCerttifiedRequired(String certtifiedRequired) {
		this.certtifiedRequired = certtifiedRequired;
	}
	public String getPenalty() {
		return penalty;
	}
	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}
	public String getCertDateTime() {
		return certDateTime;
	}
	public void setCertDateTime(String certDateTime) {
		this.certDateTime = certDateTime;
	}
	public String getCertModifiedDateTime() {
		return certModifiedDateTime;
	}
	public void setCertModifiedDateTime(String certModifiedDateTime) {
		this.certModifiedDateTime = certModifiedDateTime;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getCertBeginDate() {
		return certBeginDate;
	}
	public void setCertBeginDate(String certBeginDate) {
		this.certBeginDate = certBeginDate;
	}
	public String getCertEndDate() {
		return certEndDate;
	}
	public void setCertEndDate(String certEndDate) {
		this.certEndDate = certEndDate;
	}
	public String getCertDays() {
		return certDays;
	}
	public void setCertDays(String certDays) {
		this.certDays = certDays;
	}
	public String getPhysicianReviewer() {
		return physicianReviewer;
	}
	public void setPhysicianReviewer(String physicianReviewer) {
		this.physicianReviewer = physicianReviewer;
	}
	public String getCertContact() {
		return certContact;
	}
	public void setCertContact(String certContact) {
		this.certContact = certContact;
	}
	public String getCertContactPhoneNumber() {
		return certContactPhoneNumber;
	}
	public void setCertContactPhoneNumber(String certContactPhoneNumber) {
		this.certContactPhoneNumber = certContactPhoneNumber;
	}
	public String getCertAgency() {
		return certAgency;
	}
	public void setCertAgency(String certAgency) {
		this.certAgency = certAgency;
	}
	public String getCertPhoneNumber() {
		return certPhoneNumber;
	}
	public void setCertPhoneNumber(String certPhoneNumber) {
		this.certPhoneNumber = certPhoneNumber;
	}
	public String getPreCertRqd() {
		return preCertRqd;
	}
	public void setPreCertRqd(String preCertRqd) {
		this.preCertRqd = preCertRqd;
	}
	public String getCaseMgr() {
		return caseMgr;
	}
	public void setCaseMgr(String caseMgr) {
		this.caseMgr = caseMgr;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
