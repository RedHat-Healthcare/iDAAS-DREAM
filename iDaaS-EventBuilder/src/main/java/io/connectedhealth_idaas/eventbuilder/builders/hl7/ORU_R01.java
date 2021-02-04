package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ORU_R01 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private PID patientIdentification;
    private PD1 patientAdditionalDemographic;
    private PRT participationInformation;
    private NTE notesandComments;
    private NK1 nextofKinAssociatedParties;
    private ARV accessRestriction;
    private OBX observationResult;
    private PRT participationInformation1;
    private PV1 patientVisit;
    private PV2 patientVisitAdditionalInformation;
    private PRT participationInformation2;
    private ORC commonOrder;
    private PRT participationInformation3;
    private OBX observationResult1;
    private PRT participationInformation4;
    private TXA transcriptionDocumentHeader;
    private OBR observationRequest;
    private NTE notesandComments1;
    private PRT participationInformation5;
    private TQ1 timingQuantity;
    private TQ2 timingQuantityRelationship;
    private CTD contactData;
    private OBX observationResult2;
    private PRT participationInformation6;
    private NTE notesandComments2;
    private FT1 financialTransaction;
    private CTI clinicalTrialIdentification;
    private SPM specimen;
    private OBX observationResult3;
    private PRT participationInformation7;
    private DSC continuationPointer;

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

    public NTE getNotesandComments() {
        return notesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        this.notesandComments = notesandComments;
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

    public OBX getObservationResult1() {
        return observationResult1;
    }

    public void setObservationResult1(OBX observationResult1) {
        this.observationResult1 = observationResult1;
    }

    public PRT getParticipationInformation4() {
        return participationInformation4;
    }

    public void setParticipationInformation4(PRT participationInformation4) {
        this.participationInformation4 = participationInformation4;
    }

    public TXA getTranscriptionDocumentHeader() {
        return transcriptionDocumentHeader;
    }

    public void setTranscriptionDocumentHeader(TXA transcriptionDocumentHeader) {
        this.transcriptionDocumentHeader = transcriptionDocumentHeader;
    }

    public OBR getObservationRequest() {
        return observationRequest;
    }

    public void setObservationRequest(OBR observationRequest) {
        this.observationRequest = observationRequest;
    }

    public NTE getNotesandComments1() {
        return notesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        this.notesandComments1 = notesandComments1;
    }

    public PRT getParticipationInformation5() {
        return participationInformation5;
    }

    public void setParticipationInformation5(PRT participationInformation5) {
        this.participationInformation5 = participationInformation5;
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

    public CTD getContactData() {
        return contactData;
    }

    public void setContactData(CTD contactData) {
        this.contactData = contactData;
    }

    public OBX getObservationResult2() {
        return observationResult2;
    }

    public void setObservationResult2(OBX observationResult2) {
        this.observationResult2 = observationResult2;
    }

    public PRT getParticipationInformation6() {
        return participationInformation6;
    }

    public void setParticipationInformation6(PRT participationInformation6) {
        this.participationInformation6 = participationInformation6;
    }

    public NTE getNotesandComments2() {
        return notesandComments2;
    }

    public void setNotesandComments2(NTE notesandComments2) {
        this.notesandComments2 = notesandComments2;
    }

    public FT1 getFinancialTransaction() {
        return financialTransaction;
    }

    public void setFinancialTransaction(FT1 financialTransaction) {
        this.financialTransaction = financialTransaction;
    }

    public CTI getClinicalTrialIdentification() {
        return clinicalTrialIdentification;
    }

    public void setClinicalTrialIdentification(CTI clinicalTrialIdentification) {
        this.clinicalTrialIdentification = clinicalTrialIdentification;
    }

    public SPM getSpecimen() {
        return specimen;
    }

    public void setSpecimen(SPM specimen) {
        this.specimen = specimen;
    }

    public OBX getObservationResult3() {
        return observationResult3;
    }

    public void setObservationResult3(OBX observationResult3) {
        this.observationResult3 = observationResult3;
    }

    public PRT getParticipationInformation7() {
        return participationInformation7;
    }

    public void setParticipationInformation7(PRT participationInformation7) {
        this.participationInformation7 = participationInformation7;
    }

    public DSC getContinuationPointer() {
        return continuationPointer;
    }

    public void setContinuationPointer(DSC continuationPointer) {
        this.continuationPointer = continuationPointer;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

