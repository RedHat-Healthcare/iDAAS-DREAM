package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M06 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private MFI masterFileIdentification;
    private MFE masterFileEntry;
    private CM0 clinicalStudyMaster;
    private CM1 clinicalStudyPhaseMaster;
    private CM2 clinicalStudyScheduleMaster;

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

    public CM0 getClinicalStudyMaster() {
        return clinicalStudyMaster;
    }

    public void setClinicalStudyMaster(CM0 clinicalStudyMaster) {
        this.clinicalStudyMaster = clinicalStudyMaster;
    }

    public CM1 getClinicalStudyPhaseMaster() {
        return clinicalStudyPhaseMaster;
    }

    public void setClinicalStudyPhaseMaster(CM1 clinicalStudyPhaseMaster) {
        this.clinicalStudyPhaseMaster = clinicalStudyPhaseMaster;
    }

    public CM2 getClinicalStudyScheduleMaster() {
        return clinicalStudyScheduleMaster;
    }

    public void setClinicalStudyScheduleMaster(CM2 clinicalStudyScheduleMaster) {
        this.clinicalStudyScheduleMaster = clinicalStudyScheduleMaster;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

