package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M04 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private MFI masterFileIdentification;
    private NTE notesandComments;
    private MFE masterFileEntry;
    private NTE notesandComments1;
    private CDM chargeDescriptionMaster;
    private NTE notesandComments2;
    private PRC pricing;

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

    public NTE getNotesandComments() {
        return notesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        this.notesandComments = notesandComments;
    }

    public MFE getMasterFileEntry() {
        return masterFileEntry;
    }

    public void setMasterFileEntry(MFE masterFileEntry) {
        this.masterFileEntry = masterFileEntry;
    }

    public NTE getNotesandComments1() {
        return notesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        this.notesandComments1 = notesandComments1;
    }

    public CDM getChargeDescriptionMaster() {
        return chargeDescriptionMaster;
    }

    public void setChargeDescriptionMaster(CDM chargeDescriptionMaster) {
        this.chargeDescriptionMaster = chargeDescriptionMaster;
    }

    public NTE getNotesandComments2() {
        return notesandComments2;
    }

    public void setNotesandComments2(NTE notesandComments2) {
        this.notesandComments2 = notesandComments2;
    }

    public PRC getPricing() {
        return pricing;
    }

    public void setPricing(PRC pricing) {
        this.pricing = pricing;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

