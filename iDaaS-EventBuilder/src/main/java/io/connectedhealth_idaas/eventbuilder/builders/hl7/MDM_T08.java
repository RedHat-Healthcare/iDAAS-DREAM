package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MDM_T08 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private EVN eventType;
    private PID patientIdentification;
    private PV1 patientVisit;
    private ORC commonOrder;
    private TQ1 timingQuantity;
    private TQ2 timingQuantityRelationship;
    private OBR observationRequest;
    private NTE notesandComments;
    private TXA transcriptionDocumentHeader;
    private CON consentSegment;
    private OBX observationResult;
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

    public PV1 getPatientVisit() {
        return patientVisit;
    }

    public void setPatientVisit(PV1 patientVisit) {
        this.patientVisit = patientVisit;
    }

    public ORC getCommonOrder() {
        return commonOrder;
    }

    public void setCommonOrder(ORC commonOrder) {
        this.commonOrder = commonOrder;
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

    public TXA getTranscriptionDocumentHeader() {
        return transcriptionDocumentHeader;
    }

    public void setTranscriptionDocumentHeader(TXA transcriptionDocumentHeader) {
        this.transcriptionDocumentHeader = transcriptionDocumentHeader;
    }

    public CON getConsentSegment() {
        return consentSegment;
    }

    public void setConsentSegment(CON consentSegment) {
        this.consentSegment = consentSegment;
    }

    public OBX getObservationResult() {
        return observationResult;
    }

    public void setObservationResult(OBX observationResult) {
        this.observationResult = observationResult;
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

