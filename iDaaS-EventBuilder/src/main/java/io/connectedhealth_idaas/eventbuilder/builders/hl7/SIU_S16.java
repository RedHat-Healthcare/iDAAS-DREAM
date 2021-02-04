package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SIU_S16 {
    private MSH messageHeader;
    private SCH schedulingActivityInformation;
    private TQ1 timingQuantity;
    private NTE notesandComments;
    private PID patientIdentification;
    private PD1 patientAdditionalDemographic;
    private PV1 patientVisit;
    private PV2 patientVisitAdditionalInformation;
    private OBX observationResult;
    private DG1 diagnosis;
    private RGS resourceGroup;
    private AIS appointmentInformation;
    private NTE notesandComments1;
    private AIG appointmentInformationGeneralResource;
    private NTE notesandComments2;
    private AIL appointmentInformationLocationResource;
    private NTE notesandComments3;
    private AIP appointmentInformationPersonnelResource;
    private NTE notesandComments4;

    public MSH getMessageHeader() {
        return messageHeader;
    }

    public void setMessageHeader(MSH messageHeader) {
        this.messageHeader = messageHeader;
    }

    public SCH getSchedulingActivityInformation() {
        return schedulingActivityInformation;
    }

    public void setSchedulingActivityInformation(SCH schedulingActivityInformation) {
        this.schedulingActivityInformation = schedulingActivityInformation;
    }

    public TQ1 getTimingQuantity() {
        return timingQuantity;
    }

    public void setTimingQuantity(TQ1 timingQuantity) {
        this.timingQuantity = timingQuantity;
    }

    public NTE getNotesandComments() {
        return notesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        this.notesandComments = notesandComments;
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

    public OBX getObservationResult() {
        return observationResult;
    }

    public void setObservationResult(OBX observationResult) {
        this.observationResult = observationResult;
    }

    public DG1 getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(DG1 diagnosis) {
        this.diagnosis = diagnosis;
    }

    public RGS getResourceGroup() {
        return resourceGroup;
    }

    public void setResourceGroup(RGS resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public AIS getAppointmentInformation() {
        return appointmentInformation;
    }

    public void setAppointmentInformation(AIS appointmentInformation) {
        this.appointmentInformation = appointmentInformation;
    }

    public NTE getNotesandComments1() {
        return notesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        this.notesandComments1 = notesandComments1;
    }

    public AIG getAppointmentInformationGeneralResource() {
        return appointmentInformationGeneralResource;
    }

    public void setAppointmentInformationGeneralResource(AIG appointmentInformationGeneralResource) {
        this.appointmentInformationGeneralResource = appointmentInformationGeneralResource;
    }

    public NTE getNotesandComments2() {
        return notesandComments2;
    }

    public void setNotesandComments2(NTE notesandComments2) {
        this.notesandComments2 = notesandComments2;
    }

    public AIL getAppointmentInformationLocationResource() {
        return appointmentInformationLocationResource;
    }

    public void setAppointmentInformationLocationResource(AIL appointmentInformationLocationResource) {
        this.appointmentInformationLocationResource = appointmentInformationLocationResource;
    }

    public NTE getNotesandComments3() {
        return notesandComments3;
    }

    public void setNotesandComments3(NTE notesandComments3) {
        this.notesandComments3 = notesandComments3;
    }

    public AIP getAppointmentInformationPersonnelResource() {
        return appointmentInformationPersonnelResource;
    }

    public void setAppointmentInformationPersonnelResource(AIP appointmentInformationPersonnelResource) {
        this.appointmentInformationPersonnelResource = appointmentInformationPersonnelResource;
    }

    public NTE getNotesandComments4() {
        return notesandComments4;
    }

    public void setNotesandComments4(NTE notesandComments4) {
        this.notesandComments4 = notesandComments4;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

