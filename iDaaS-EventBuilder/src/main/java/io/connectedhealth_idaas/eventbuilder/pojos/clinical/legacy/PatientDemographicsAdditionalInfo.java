package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the additional demographic information from patients
 *
 */
public class PatientDemographicsAdditionalInfo {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String livingDependency;
	private String livingArrangement;
	private String patientPrimaryFacility;
	private String patientPrimaryProviderName;
	private String patientPrimaryProviderId;
	private String handicap;
	private String livingwill;
	private String organDonor;
	private String publicityCode;
	private String protectionCode;
	private String advancedDirective;
	private String militaryBranch;
	private String militaryRank;
	private String militaryStatus;
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
	public String getLivingDependency() {
		return livingDependency;
	}
	public void setLivingDependency(String livingDependency) {
		this.livingDependency = livingDependency;
	}
	public String getLivingArrangement() {
		return livingArrangement;
	}
	public void setLivingArrangement(String livingArrangement) {
		this.livingArrangement = livingArrangement;
	}
	public String getPatientPrimaryFacility() {
		return patientPrimaryFacility;
	}
	public void setPatientPrimaryFacility(String patientPrimaryFacility) {
		this.patientPrimaryFacility = patientPrimaryFacility;
	}
	public String getPatientPrimaryProviderName() {
		return patientPrimaryProviderName;
	}
	public void setPatientPrimaryProviderName(String patientPrimaryProviderName) {
		this.patientPrimaryProviderName = patientPrimaryProviderName;
	}
	public String getPatientPrimaryProviderId() {
		return patientPrimaryProviderId;
	}
	public void setPatientPrimaryProviderId(String patientPrimaryProviderId) {
		this.patientPrimaryProviderId = patientPrimaryProviderId;
	}
	public String getHandicap() {
		return handicap;
	}
	public void setHandicap(String handicap) {
		this.handicap = handicap;
	}
	public String getLivingwill() {
		return livingwill;
	}
	public void setLivingwill(String livingwill) {
		this.livingwill = livingwill;
	}
	public String getOrganDonor() {
		return organDonor;
	}
	public void setOrganDonor(String organDonor) {
		this.organDonor = organDonor;
	}
	public String getPublicityCode() {
		return publicityCode;
	}
	public void setPublicityCode(String publicityCode) {
		this.publicityCode = publicityCode;
	}
	public String getProtectionCode() {
		return protectionCode;
	}
	public void setProtectionCode(String protectionCode) {
		this.protectionCode = protectionCode;
	}
	public String getAdvancedDirective() {
		return advancedDirective;
	}
	public void setAdvancedDirective(String advancedDirective) {
		this.advancedDirective = advancedDirective;
	}
	public String getMilitaryBranch() {
		return militaryBranch;
	}
	public void setMilitaryBranch(String militaryBranch) {
		this.militaryBranch = militaryBranch;
	}
	public String getMilitaryRank() {
		return militaryRank;
	}
	public void setMilitaryRank(String militaryRank) {
		this.militaryRank = militaryRank;
	}
	public String getMilitaryStatus() {
		return militaryStatus;
	}
	public void setMilitaryStatus(String militaryStatus) {
		this.militaryStatus = militaryStatus;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
}
