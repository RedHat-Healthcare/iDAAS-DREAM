package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M02 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private MFI masterFileIdentification;
    private MFE masterFileEntry;
    private STF staffIdentification;
    private PRA practitionerDetail;
    private ORG practitionerOrganizationUnit;
    private AFF professionalAffiliation;
    private LAN languageDetail;
    private EDU educationalDetail;
    private CER certificateDetail;
    private NTE notesandComments;

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

    public STF getStaffIdentification() {
        return staffIdentification;
    }

    public void setStaffIdentification(STF staffIdentification) {
        this.staffIdentification = staffIdentification;
    }

    public PRA getPractitionerDetail() {
        return practitionerDetail;
    }

    public void setPractitionerDetail(PRA practitionerDetail) {
        this.practitionerDetail = practitionerDetail;
    }

    public ORG getPractitionerOrganizationUnit() {
        return practitionerOrganizationUnit;
    }

    public void setPractitionerOrganizationUnit(ORG practitionerOrganizationUnit) {
        this.practitionerOrganizationUnit = practitionerOrganizationUnit;
    }

    public AFF getProfessionalAffiliation() {
        return professionalAffiliation;
    }

    public void setProfessionalAffiliation(AFF professionalAffiliation) {
        this.professionalAffiliation = professionalAffiliation;
    }

    public LAN getLanguageDetail() {
        return languageDetail;
    }

    public void setLanguageDetail(LAN languageDetail) {
        this.languageDetail = languageDetail;
    }

    public EDU getEducationalDetail() {
        return educationalDetail;
    }

    public void setEducationalDetail(EDU educationalDetail) {
        this.educationalDetail = educationalDetail;
    }

    public CER getCertificateDetail() {
        return certificateDetail;
    }

    public void setCertificateDetail(CER certificateDetail) {
        this.certificateDetail = certificateDetail;
    }

    public NTE getNotesandComments() {
        return notesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        this.notesandComments = notesandComments;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

