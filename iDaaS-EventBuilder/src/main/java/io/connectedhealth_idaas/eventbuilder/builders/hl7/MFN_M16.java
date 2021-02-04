package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M16 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private MFI masterFileIdentification;
    private MFE masterFileEntry;
    private ITM materialItem;
    private NTE notesandComments;
    private STZ sterilizationParameter;
    private NTE notesandComments1;
    private VND purchasingVendor;
    private PKG itemPackaging;
    private PCE patientChargeCostCenterExceptions;
    private IVT materialLocation;
    private ILT materialLot;
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

    public ITM getMaterialItem() {
        return materialItem;
    }

    public void setMaterialItem(ITM materialItem) {
        this.materialItem = materialItem;
    }

    public NTE getNotesandComments() {
        return notesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        this.notesandComments = notesandComments;
    }

    public STZ getSterilizationParameter() {
        return sterilizationParameter;
    }

    public void setSterilizationParameter(STZ sterilizationParameter) {
        this.sterilizationParameter = sterilizationParameter;
    }

    public NTE getNotesandComments1() {
        return notesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        this.notesandComments1 = notesandComments1;
    }

    public VND getPurchasingVendor() {
        return purchasingVendor;
    }

    public void setPurchasingVendor(VND purchasingVendor) {
        this.purchasingVendor = purchasingVendor;
    }

    public PKG getItemPackaging() {
        return itemPackaging;
    }

    public void setItemPackaging(PKG itemPackaging) {
        this.itemPackaging = itemPackaging;
    }

    public PCE getPatientChargeCostCenterExceptions() {
        return patientChargeCostCenterExceptions;
    }

    public void setPatientChargeCostCenterExceptions(PCE patientChargeCostCenterExceptions) {
        this.patientChargeCostCenterExceptions = patientChargeCostCenterExceptions;
    }

    public IVT getMaterialLocation() {
        return materialLocation;
    }

    public void setMaterialLocation(IVT materialLocation) {
        this.materialLocation = materialLocation;
    }

    public ILT getMaterialLot() {
        return materialLot;
    }

    public void setMaterialLot(ILT materialLot) {
        this.materialLot = materialLot;
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

