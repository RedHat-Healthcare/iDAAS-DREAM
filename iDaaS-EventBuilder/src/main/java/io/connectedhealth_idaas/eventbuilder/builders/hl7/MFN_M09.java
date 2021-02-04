package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M09 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private MFI masterFileIdentification;
    private MFE masterFileEntry;
    private OM1 generalSegment;
    private OMC supportingClinicalInformation;
    private PRT participationInformation;
    private OM3 categoricalServiceTestObservation;
    private OM4 observationsthatRequireSpecimens;

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

    public MFI getMasterFileIdentification() {
        return masterFileIdentification;
    }

    public void setMasterFileIdentification(MFI masterFileIdentification) {
        this.masterFileIdentification = masterFileIdentification;
    }

    public MFE getMasterFileEntry() {
        return masterFileEntry;
    }

    public void setMasterFileEntry(MFE masterFileEntry) {
        this.masterFileEntry = masterFileEntry;
    }

    public OM1 getGeneralSegment() {
        return generalSegment;
    }

    public void setGeneralSegment(OM1 generalSegment) {
        this.generalSegment = generalSegment;
    }

    public OMC getSupportingClinicalInformation() {
        return supportingClinicalInformation;
    }

    public void setSupportingClinicalInformation(OMC supportingClinicalInformation) {
        this.supportingClinicalInformation = supportingClinicalInformation;
    }

    public PRT getParticipationInformation() {
        return participationInformation;
    }

    public void setParticipationInformation(PRT participationInformation) {
        this.participationInformation = participationInformation;
    }

    public OM3 getCategoricalServiceTestObservation() {
        return categoricalServiceTestObservation;
    }

    public void setCategoricalServiceTestObservation(OM3 categoricalServiceTestObservation) {
        this.categoricalServiceTestObservation = categoricalServiceTestObservation;
    }

    public OM4 getObservationsthatRequireSpecimens() {
        return observationsthatRequireSpecimens;
    }

    public void setObservationsthatRequireSpecimens(OM4 observationsthatRequireSpecimens) {
        this.observationsthatRequireSpecimens = observationsthatRequireSpecimens;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

