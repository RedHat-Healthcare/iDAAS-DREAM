package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ORU_R32 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private PID patientIdentification;
    private PD1 patientAdditionalDemographic;
    private PRT participationInformation;
    private ARV accessRestriction;
    private OBX observationResult;
    private PRT participationInformation1;
    private PV1 patientVisit;
    private PV2 patientVisitAdditionalInformation;
    private PRT participationInformation2;
    private ORC commonOrder;
    private PRT participationInformation3;
    private OBR observationRequest;
    private NTE notesandComments;
    private PRT participationInformation4;
    private TQ1 timingQuantity;
    private TQ2 timingQuantityRelationship;
    private OBX observationResult1;
    private PRT participationInformation5;
    private NTE notesandComments1;

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

    public PRT getParticipationInformation() {
        return participationInformation;
    }

    public void setParticipationInformation(PRT participationInformation) {
        this.participationInformation = participationInformation;
    }

    public ARV getAccessRestriction() {
        return accessRestriction;
    }

    public void setAccessRestriction(ARV accessRestriction) {
        this.accessRestriction = accessRestriction;
    }

    public OBX getObservationResult() {
        return observationResult;
    }

    public void setObservationResult(OBX observationResult) {
        this.observationResult = observationResult;
    }

    public PRT getParticipationInformation1() {
        return participationInformation1;
    }

    public void setParticipationInformation1(PRT participationInformation1) {
        this.participationInformation1 = participationInformation1;
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

    public PRT getParticipationInformation2() {
        return participationInformation2;
    }

    public void setParticipationInformation2(PRT participationInformation2) {
        this.participationInformation2 = participationInformation2;
    }

    public ORC getCommonOrder() {
        return commonOrder;
    }

    public void setCommonOrder(ORC commonOrder) {
        this.commonOrder = commonOrder;
    }

    public PRT getParticipationInformation3() {
        return participationInformation3;
    }

    public void setParticipationInformation3(PRT participationInformation3) {
        this.participationInformation3 = participationInformation3;
    }

    public OBR getObservationRequest() {
        return observationRequest;
    }

    public void setObservationRequest(OBR observationRequest) {
        this.observationRequest = observationRequest;
    }

    public NTE getNotesandComments() {
        return notesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        this.notesandComments = notesandComments;
    }

    public PRT getParticipationInformation4() {
        return participationInformation4;
    }

    public void setParticipationInformation4(PRT participationInformation4) {
        this.participationInformation4 = participationInformation4;
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

    public OBX getObservationResult1() {
        return observationResult1;
    }

    public void setObservationResult1(OBX observationResult1) {
        this.observationResult1 = observationResult1;
    }

    public PRT getParticipationInformation5() {
        return participationInformation5;
    }

    public void setParticipationInformation5(PRT participationInformation5) {
        this.participationInformation5 = participationInformation5;
    }

    public NTE getNotesandComments1() {
        return notesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        this.notesandComments1 = notesandComments1;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

