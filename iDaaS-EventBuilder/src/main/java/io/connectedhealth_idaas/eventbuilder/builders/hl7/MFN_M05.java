package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M05 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private MFI masterFileIdentification;
    private MFE masterFileEntry;
    private LOC locationIdentification;
    private LCH locationCharacteristic;
    private LRL locationRelationship;
    private LDP locationDepartment;
    private LCH locationCharacteristic1;
    private LCC locationChargeCode;

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

    public LOC getLocationIdentification() {
        return locationIdentification;
    }

    public void setLocationIdentification(LOC locationIdentification) {
        this.locationIdentification = locationIdentification;
    }

    public LCH getLocationCharacteristic() {
        return locationCharacteristic;
    }

    public void setLocationCharacteristic(LCH locationCharacteristic) {
        this.locationCharacteristic = locationCharacteristic;
    }

    public LRL getLocationRelationship() {
        return locationRelationship;
    }

    public void setLocationRelationship(LRL locationRelationship) {
        this.locationRelationship = locationRelationship;
    }

    public LDP getLocationDepartment() {
        return locationDepartment;
    }

    public void setLocationDepartment(LDP locationDepartment) {
        this.locationDepartment = locationDepartment;
    }

    public LCH getLocationCharacteristic1() {
        return locationCharacteristic1;
    }

    public void setLocationCharacteristic1(LCH locationCharacteristic1) {
        this.locationCharacteristic1 = locationCharacteristic1;
    }

    public LCC getLocationChargeCode() {
        return locationChargeCode;
    }

    public void setLocationChargeCode(LCC locationChargeCode) {
        this.locationChargeCode = locationChargeCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

