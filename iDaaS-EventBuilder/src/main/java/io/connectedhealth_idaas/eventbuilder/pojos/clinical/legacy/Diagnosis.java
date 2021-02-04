package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * Meant to represent a clinical diagnosis
 *
 */
public class Diagnosis {

	private String diagnosisSetId;
	private String diagnosisCodeMethod;
	private String diagnosisCode;
	private String diagnossiDesc;
	private String diagnosisDateTime;
	private String mdcGroup;
	private String drgGroup;
	private String drgApprovalId;
	private String outlierType;
	private String diagnosisPriority;
	private String diagnosingClinician;
	private String diagnosisClassification;
	private String confidentiality;
	private String attestionDate;
	private String parentDiagnosis;
	private String presentOnAdmissionIndicator;
	public String getDiagnosisSetId() {
		return diagnosisSetId;
	}
	public void setDiagnosisSetId(String diagnosisSetId) {
		this.diagnosisSetId = diagnosisSetId;
	}
	public String getDiagnosisCodeMethod() {
		return diagnosisCodeMethod;
	}
	public void setDiagnosisCodeMethod(String diagnosisCodeMethod) {
		this.diagnosisCodeMethod = diagnosisCodeMethod;
	}
	public String getDiagnosisCode() {
		return diagnosisCode;
	}
	public void setDiagnosisCode(String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}
	public String getDiagnossiDesc() {
		return diagnossiDesc;
	}
	public void setDiagnossiDesc(String diagnossiDesc) {
		this.diagnossiDesc = diagnossiDesc;
	}
	public String getDiagnosisDateTime() {
		return diagnosisDateTime;
	}
	public void setDiagnosisDateTime(String diagnosisDateTime) {
		this.diagnosisDateTime = diagnosisDateTime;
	}
	public String getMdcGroup() {
		return mdcGroup;
	}
	public void setMdcGroup(String mdcGroup) {
		this.mdcGroup = mdcGroup;
	}
	public String getDrgGroup() {
		return drgGroup;
	}
	public void setDrgGroup(String drgGroup) {
		this.drgGroup = drgGroup;
	}
	public String getDrgApprovalId() {
		return drgApprovalId;
	}
	public void setDrgApprovalId(String drgApprovalId) {
		this.drgApprovalId = drgApprovalId;
	}
	public String getOutlierType() {
		return outlierType;
	}
	public void setOutlierType(String outlierType) {
		this.outlierType = outlierType;
	}
	public String getDiagnosisPriority() {
		return diagnosisPriority;
	}
	public void setDiagnosisPriority(String diagnosisPriority) {
		this.diagnosisPriority = diagnosisPriority;
	}
	public String getDiagnosingClinician() {
		return diagnosingClinician;
	}
	public void setDiagnosingClinician(String diagnosingClinician) {
		this.diagnosingClinician = diagnosingClinician;
	}
	public String getDiagnosisClassification() {
		return diagnosisClassification;
	}
	public void setDiagnosisClassification(String diagnosisClassification) {
		this.diagnosisClassification = diagnosisClassification;
	}
	public String getConfidentiality() {
		return confidentiality;
	}
	public void setConfidentiality(String confidentiality) {
		this.confidentiality = confidentiality;
	}
	public String getAttestionDate() {
		return attestionDate;
	}
	public void setAttestionDate(String attestionDate) {
		this.attestionDate = attestionDate;
	}
	public String getParentDiagnosis() {
		return parentDiagnosis;
	}
	public void setParentDiagnosis(String parentDiagnosis) {
		this.parentDiagnosis = parentDiagnosis;
	}
	public String getPresentOnAdmissionIndicator() {
		return presentOnAdmissionIndicator;
	}
	public void setPresentOnAdmissionIndicator(String presentOnAdmissionIndicator) {
		this.presentOnAdmissionIndicator = presentOnAdmissionIndicator;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}

	
}
