package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ADT_A03 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private EVN eventType;
    private PID patientIdentification;
    private PD1 patientAdditionalDemographic;
    private ARV accessRestriction;
    private ROL role;
    private NK1 nextofKinAssociatedParties;
    private PV1 patientVisit;
    private PV2 patientVisitAdditionalInformation;
    private ARV accessRestriction1;
    private ROL role1;
    private DB1 disability;
    private AL1 patientAllergyInformation;
    private DG1 diagnosis;
    private DRG diagnosisRelatedGroup;
    private PR1 procedures;
    private ROL role2;
    private OBX observationResult;
    private GT1 guarantor;
    private IN1 insurance;
    private IN2 insuranceAdditionalInformation;
    private IN3 insuranceAdditionalInformationCertification;
    private ROL role3;
    private AUT authorizationInformation;
    private RF1 referralInformation;
    private ACC accident;
    private PDA patientDeathandAutopsy;

    public MSH getMessageHeader() {
        return messageHeader;
    }

    public void setMessageHeader(MSH messageHeader) {
        this.messageHeader = messageHeader;
    }

    public SFT getSoftwareSegment() {
        return softwareSegment;
    }

    public void setSoftwareSegment(SFT softwareSegment) {
        this.softwareSegment = softwareSegment;
    }

    public UAC getUserAuthenticationCredentialSegment() {
        return userAuthenticationCredentialSegment;
    }

    public void setUserAuthenticationCredentialSegment(UAC userAuthenticationCredentialSegment) {
        this.userAuthenticationCredentialSegment = userAuthenticationCredentialSegment;
    }

    public EVN getEventType() {
        return eventType;
    }

    public void setEventType(EVN eventType) {
        this.eventType = eventType;
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

    public ARV getAccessRestriction() {
        return accessRestriction;
    }

    public void setAccessRestriction(ARV accessRestriction) {
        this.accessRestriction = accessRestriction;
    }

    public ROL getRole() {
        return role;
    }

    public void setRole(ROL role) {
        this.role = role;
    }

    public NK1 getNextofKinAssociatedParties() {
        return nextofKinAssociatedParties;
    }

    public void setNextofKinAssociatedParties(NK1 nextofKinAssociatedParties) {
        this.nextofKinAssociatedParties = nextofKinAssociatedParties;
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

    public ARV getAccessRestriction1() {
        return accessRestriction1;
    }

    public void setAccessRestriction1(ARV accessRestriction1) {
        this.accessRestriction1 = accessRestriction1;
    }

    public ROL getRole1() {
        return role1;
    }

    public void setRole1(ROL role1) {
        this.role1 = role1;
    }

    public DB1 getDisability() {
        return disability;
    }

    public void setDisability(DB1 disability) {
        this.disability = disability;
    }

    public AL1 getPatientAllergyInformation() {
        return patientAllergyInformation;
    }

    public void setPatientAllergyInformation(AL1 patientAllergyInformation) {
        this.patientAllergyInformation = patientAllergyInformation;
    }

    public DG1 getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(DG1 diagnosis) {
        this.diagnosis = diagnosis;
    }

    public DRG getDiagnosisRelatedGroup() {
        return diagnosisRelatedGroup;
    }

    public void setDiagnosisRelatedGroup(DRG diagnosisRelatedGroup) {
        this.diagnosisRelatedGroup = diagnosisRelatedGroup;
    }

    public PR1 getProcedures() {
        return procedures;
    }

    public void setProcedures(PR1 procedures) {
        this.procedures = procedures;
    }

    public ROL getRole2() {
        return role2;
    }

    public void setRole2(ROL role2) {
        this.role2 = role2;
    }

    public OBX getObservationResult() {
        return observationResult;
    }

    public void setObservationResult(OBX observationResult) {
        this.observationResult = observationResult;
    }

    public GT1 getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(GT1 guarantor) {
        this.guarantor = guarantor;
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

    public ROL getRole3() {
        return role3;
    }

    public void setRole3(ROL role3) {
        this.role3 = role3;
    }

    public AUT getAuthorizationInformation() {
        return authorizationInformation;
    }

    public void setAuthorizationInformation(AUT authorizationInformation) {
        this.authorizationInformation = authorizationInformation;
    }

    public RF1 getReferralInformation() {
        return referralInformation;
    }

    public void setReferralInformation(RF1 referralInformation) {
        this.referralInformation = referralInformation;
    }

    public ACC getAccident() {
        return accident;
    }

    public void setAccident(ACC accident) {
        this.accident = accident;
    }

    public PDA getPatientDeathandAutopsy() {
        return patientDeathandAutopsy;
    }

    public void setPatientDeathandAutopsy(PDA patientDeathandAutopsy) {
        this.patientDeathandAutopsy = patientDeathandAutopsy;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

