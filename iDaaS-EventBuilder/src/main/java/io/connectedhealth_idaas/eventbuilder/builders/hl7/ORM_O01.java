package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ORM_O01 {
    public MSH messageHeader;
    public NTE notesandComments;
    public PID patientIdentification;
    public PD1 patientAdditionalDemographic;
    public NTE notesandComments1;
    public PV1 patientVisit;
    public PV2 patientVisitAdditionalInformation;
    public IN1 insurance;
    public IN2 insuranceAdditionalInformation;
    public IN3 insuranceAdditionalInformationCertification;
    public GT1 guarantor;
    public AL1 patientAllergyInformation;
    public ORC commonOrder;
    public CTI clinicalTrialIdentification;
    public BLG billing;

    public MSH getMessageHeader() {
        return messageHeader;
    }

    public void setMessageHeader(MSH messageHeader) {
        this.messageHeader = messageHeader;
    }

    public NTE getNotesandComments() {
        return notesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        this.notesandComments = notesandComments;
    }

    public PID getPatientIdentification() {
        return patientIdentification;
    }

    public void setPatientIdentification(PID patientIdentification) {
        this.patientIdentification = patientIdentification;
    }

    public PD1 getPatientAdditionalDemographic() {
        return patientAdditionalDemographic;
    }

    public void setPatientAdditionalDemographic(PD1 patientAdditionalDemographic) {
        this.patientAdditionalDemographic = patientAdditionalDemographic;
    }

    public NTE getNotesandComments1() {
        return notesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        this.notesandComments1 = notesandComments1;
    }

    public PV1 getPatientVisit() {
        return patientVisit;
    }

    public void setPatientVisit(PV1 patientVisit) {
        this.patientVisit = patientVisit;
    }

    public PV2 getPatientVisitAdditionalInformation() {
        return patientVisitAdditionalInformation;
    }

    public void setPatientVisitAdditionalInformation(PV2 patientVisitAdditionalInformation) {
        this.patientVisitAdditionalInformation = patientVisitAdditionalInformation;
    }

    public IN1 getInsurance() {
        return insurance;
    }

    public void setInsurance(IN1 insurance) {
        this.insurance = insurance;
    }

    public IN2 getInsuranceAdditionalInformation() {
        return insuranceAdditionalInformation;
    }

    public void setInsuranceAdditionalInformation(IN2 insuranceAdditionalInformation) {
        this.insuranceAdditionalInformation = insuranceAdditionalInformation;
    }

    public IN3 getInsuranceAdditionalInformationCertification() {
        return insuranceAdditionalInformationCertification;
    }

    public void setInsuranceAdditionalInformationCertification(IN3 insuranceAdditionalInformationCertification) {
        this.insuranceAdditionalInformationCertification = insuranceAdditionalInformationCertification;
    }

    public GT1 getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(GT1 guarantor) {
        this.guarantor = guarantor;
    }

    public AL1 getPatientAllergyInformation() {
        return patientAllergyInformation;
    }

    public void setPatientAllergyInformation(AL1 patientAllergyInformation) {
        this.patientAllergyInformation = patientAllergyInformation;
    }

    public ORC getCommonOrder() {
        return commonOrder;
    }

    public void setCommonOrder(ORC commonOrder) {
        this.commonOrder = commonOrder;
    }

    public CTI getClinicalTrialIdentification() {
        return clinicalTrialIdentification;
    }

    public void setClinicalTrialIdentification(CTI clinicalTrialIdentification) {
        this.clinicalTrialIdentification = clinicalTrialIdentification;
    }

    public BLG getBilling() {
        return billing;
    }

    public void setBilling(BLG billing) {
        this.billing = billing;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
