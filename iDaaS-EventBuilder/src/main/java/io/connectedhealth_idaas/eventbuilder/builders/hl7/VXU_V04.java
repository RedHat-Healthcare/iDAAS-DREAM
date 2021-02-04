package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VXU_V04 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private PID patientIdentification;
    private PD1 patientAdditionalDemographic;
    private NK1 nextofKinAssociatedParties;
    private ARV accessRestriction;
    private PV1 patientVisit;
    private PV2 patientVisitAdditionalInformation;
    private ARV accessRestriction1;
    private GT1 guarantor;
    private IN1 insurance;
    private IN2 insuranceAdditionalInformation;
    private IN3 insuranceAdditionalInformationCertification;
    private OBX observationResult;
    private PRT participationInformation;
    private NTE notesandComments;
    private ORC commonOrder;
    private PRT participationInformation1;
    private TQ1 timingQuantity;
    private TQ2 timingQuantityRelationship;
    private RXA pharmacyTreatmentAdministration;
    private RXR pharmacyTreatmentRoute;
    private OBX observationResult1;
    private PRT participationInformation2;
    private NTE notesandComments2;

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

    public NK1 getNextofKinAssociatedParties() {
        return nextofKinAssociatedParties;
    }

    public void setNextofKinAssociatedParties(NK1 nextofKinAssociatedParties) {
        this.nextofKinAssociatedParties = nextofKinAssociatedParties;
    }

    public ARV getAccessRestriction() {
        return accessRestriction;
    }

    public void setAccessRestriction(ARV accessRestriction) {
        this.accessRestriction = accessRestriction;
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

    public OBX getObservationResult() {
        return observationResult;
    }

    public void setObservationResult(OBX observationResult) {
        this.observationResult = observationResult;
    }

    public PRT getParticipationInformation() {
        return participationInformation;
    }

    public void setParticipationInformation(PRT participationInformation) {
        this.participationInformation = participationInformation;
    }

    public NTE getNotesandComments() {
        return notesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        this.notesandComments = notesandComments;
    }

    public ORC getCommonOrder() {
        return commonOrder;
    }

    public void setCommonOrder(ORC commonOrder) {
        this.commonOrder = commonOrder;
    }

    public PRT getParticipationInformation1() {
        return participationInformation1;
    }

    public void setParticipationInformation1(PRT participationInformation1) {
        this.participationInformation1 = participationInformation1;
    }

    public TQ1 getTimingQuantity() {
        return timingQuantity;
    }

    public void setTimingQuantity(TQ1 timingQuantity) {
        this.timingQuantity = timingQuantity;
    }

    public TQ2 getTimingQuantityRelationship() {
        return timingQuantityRelationship;
    }

    public void setTimingQuantityRelationship(TQ2 timingQuantityRelationship) {
        this.timingQuantityRelationship = timingQuantityRelationship;
    }

    public RXA getPharmacyTreatmentAdministration() {
        return pharmacyTreatmentAdministration;
    }

    public void setPharmacyTreatmentAdministration(RXA pharmacyTreatmentAdministration) {
        this.pharmacyTreatmentAdministration = pharmacyTreatmentAdministration;
    }

    public RXR getPharmacyTreatmentRoute() {
        return pharmacyTreatmentRoute;
    }

    public void setPharmacyTreatmentRoute(RXR pharmacyTreatmentRoute) {
        this.pharmacyTreatmentRoute = pharmacyTreatmentRoute;
    }

    public OBX getObservationResult1() {
        return observationResult1;
    }

    public void setObservationResult1(OBX observationResult1) {
        this.observationResult1 = observationResult1;
    }

    public PRT getParticipationInformation2() {
        return participationInformation2;
    }

    public void setParticipationInformation2(PRT participationInformation2) {
        this.participationInformation2 = participationInformation2;
    }

    public NTE getNotesandComments2() {
        return notesandComments2;
    }

    public void setNotesandComments2(NTE notesandComments2) {
        this.notesandComments2 = notesandComments2;
    }
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
