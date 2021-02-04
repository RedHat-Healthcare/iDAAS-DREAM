package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ADT_A02 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private EVN eventType;
    private PID patientIdentification;
    private PD1 patientAdditionalDemographic;
    private ARV accessRestriction;
    private ROL role;
    private PV1 patientVisit;
    private PV2 patientVisitAdditionalInformation;
    private ARV accessRestriction1;
    private ROL role1;
    private DB1 disability;
    private OBX observationResult;
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

    public OBX getObservationResult() {
        return observationResult;
    }

    public void setObservationResult(OBX observationResult) {
        this.observationResult = observationResult;
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

