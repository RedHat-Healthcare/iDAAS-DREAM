/**
 * 
 */
package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represent Master File Detailed Information
 *
 */
public class MasterFileMetadata {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String seqTestObservationMasterFile;
	private String observationId;
	private String permittedDataTypes;
	private String specimenRod;
	private String providerId;
	private String observationDesc;
	private String otherServiceDescId;
	private String otherNames;
	private String preferredReportName;
	private String preferredShortNameMnemonic;
	private String preferredLongNameMnemonic;
	private String orderability;
	private String coderepMethod;
	private String portDeviceInd;
	private String observationProdDept;
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
	public String getSeqTestObservationMasterFile() {
		return seqTestObservationMasterFile;
	}
	public void setSeqTestObservationMasterFile(String seqTestObservationMasterFile) {
		this.seqTestObservationMasterFile = seqTestObservationMasterFile;
	}
	public String getObservationId() {
		return observationId;
	}
	public void setObservationId(String observationId) {
		this.observationId = observationId;
	}
	public String getPermittedDataTypes() {
		return permittedDataTypes;
	}
	public void setPermittedDataTypes(String permittedDataTypes) {
		this.permittedDataTypes = permittedDataTypes;
	}
	public String getSpecimenRod() {
		return specimenRod;
	}
	public void setSpecimenRod(String specimenRod) {
		this.specimenRod = specimenRod;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getObservationDesc() {
		return observationDesc;
	}
	public void setObservationDesc(String observationDesc) {
		this.observationDesc = observationDesc;
	}
	public String getOtherServiceDescId() {
		return otherServiceDescId;
	}
	public void setOtherServiceDescId(String otherServiceDescId) {
		this.otherServiceDescId = otherServiceDescId;
	}
	public String getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	public String getPreferredReportName() {
		return preferredReportName;
	}
	public void setPreferredReportName(String preferredReportName) {
		this.preferredReportName = preferredReportName;
	}
	public String getPreferredShortNameMnemonic() {
		return preferredShortNameMnemonic;
	}
	public void setPreferredShortNameMnemonic(String preferredShortNameMnemonic) {
		this.preferredShortNameMnemonic = preferredShortNameMnemonic;
	}
	public String getPreferredLongNameMnemonic() {
		return preferredLongNameMnemonic;
	}
	public void setPreferredLongNameMnemonic(String preferredLongNameMnemonic) {
		this.preferredLongNameMnemonic = preferredLongNameMnemonic;
	}
	public String getOrderability() {
		return orderability;
	}
	public void setOrderability(String orderability) {
		this.orderability = orderability;
	}
	public String getCoderepMethod() {
		return coderepMethod;
	}
	public void setCoderepMethod(String coderepMethod) {
		this.coderepMethod = coderepMethod;
	}
	public String getPortDeviceInd() {
		return portDeviceInd;
	}
	public void setPortDeviceInd(String portDeviceInd) {
		this.portDeviceInd = portDeviceInd;
	}
	public String getObservationProdDept() {
		return observationProdDept;
	}
	public void setObservationProdDept(String observationProdDept) {
		this.observationProdDept = observationProdDept;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
