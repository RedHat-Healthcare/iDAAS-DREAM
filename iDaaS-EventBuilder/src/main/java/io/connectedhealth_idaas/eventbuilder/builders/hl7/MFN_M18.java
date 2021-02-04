package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M18 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private MFI masterFileIdentification;
    private MFE masterFileEntry;
    private PM1 payerMasterFile;
    private MCP masterFileCoverage;
    private DPS diagnosisandProcedureCode;

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

    public PM1 getPayerMasterFile() {
        return payerMasterFile;
    }

    public void setPayerMasterFile(PM1 payerMasterFile) {
        this.payerMasterFile = payerMasterFile;
    }

    public MCP getMasterFileCoverage() {
        return masterFileCoverage;
    }

    public void setMasterFileCoverage(MCP masterFileCoverage) {
        this.masterFileCoverage = masterFileCoverage;
    }

    public DPS getDiagnosisandProcedureCode() {
        return diagnosisandProcedureCode;
    }

    public void setDiagnosisandProcedureCode(DPS diagnosisandProcedureCode) {
        this.diagnosisandProcedureCode = diagnosisandProcedureCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

