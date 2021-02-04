package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RAS_O17 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private NTE notesandComments;
    private PID patientIdentification;
    private PD1 patientAdditionalDemographic;
    private PRT participationInformation;
    private NTE notesandComments1;
    private ARV accessRestriction;
    private AL1 patientAllergyInformation;
    private PV1 patientVisit;
    private PV2 patientVisitAdditionalInformation;
    private PRT participationInformation1;
    private ARV accessRestriction1;
    private ORC commonOrder;
    private PRT participationInformation2;
    private TQ1 timingQuantity;
    private TQ2 timingQuantityRelationship;
    private RXO pharmacyTreatmentOrder;
    private NTE notesandComments2;
    private RXR pharmacyTreatmentRoute;
    private RXC pharmacyTreatmentComponentOrder;
    private NTE notesandComments3;
    private RXE pharmacyTreatmentEncodedOrder;
    private PRT participationInformation3;
    private NTE notesandComments4;
    private TQ1 timingQuantity1;
    private TQ2 timingQuantityRelationship1;
    private RXR pharmacyTreatmentRoute1;
    private RXC pharmacyTreatmentComponentOrder1;
    private CDO cumulativeDosage;
    private RXA pharmacyTreatmentAdministration;
    private PRT participationInformation4;
    private RXR pharmacyTreatmentRoute2;
    private OBX observationResult;
    private PRT participationInformation5;
    private NTE notesandComments5;
    private CTI clinicalTrialIdentification;

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

    public PRT getParticipationInformation() {
        return participationInformation;
    }

    public void setParticipationInformation(PRT participationInformation) {
        this.participationInformation = participationInformation;
    }

    public NTE getNotesandComments1() {
        return notesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        this.notesandComments1 = notesandComments1;
    }

    public ARV getAccessRestriction() {
        return accessRestriction;
    }

    public void setAccessRestriction(ARV accessRestriction) {
        this.accessRestriction = accessRestriction;
    }

    public AL1 getPatientAllergyInformation() {
        return patientAllergyInformation;
    }

    public void setPatientAllergyInformation(AL1 patientAllergyInformation) {
        this.patientAllergyInformation = patientAllergyInformation;
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

    public PRT getParticipationInformation1() {
        return participationInformation1;
    }

    public void setParticipationInformation1(PRT participationInformation1) {
        this.participationInformation1 = participationInformation1;
    }

    public ARV getAccessRestriction1() {
        return accessRestriction1;
    }

    public void setAccessRestriction1(ARV accessRestriction1) {
        this.accessRestriction1 = accessRestriction1;
    }

    public ORC getCommonOrder() {
        return commonOrder;
    }

    public void setCommonOrder(ORC commonOrder) {
        this.commonOrder = commonOrder;
    }

    public PRT getParticipationInformation2() {
        return participationInformation2;
    }

    public void setParticipationInformation2(PRT participationInformation2) {
        this.participationInformation2 = participationInformation2;
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

    public RXO getPharmacyTreatmentOrder() {
        return pharmacyTreatmentOrder;
    }

    public void setPharmacyTreatmentOrder(RXO pharmacyTreatmentOrder) {
        this.pharmacyTreatmentOrder = pharmacyTreatmentOrder;
    }

    public NTE getNotesandComments2() {
        return notesandComments2;
    }

    public void setNotesandComments2(NTE notesandComments2) {
        this.notesandComments2 = notesandComments2;
    }

    public RXR getPharmacyTreatmentRoute() {
        return pharmacyTreatmentRoute;
    }

    public void setPharmacyTreatmentRoute(RXR pharmacyTreatmentRoute) {
        this.pharmacyTreatmentRoute = pharmacyTreatmentRoute;
    }

    public RXC getPharmacyTreatmentComponentOrder() {
        return pharmacyTreatmentComponentOrder;
    }

    public void setPharmacyTreatmentComponentOrder(RXC pharmacyTreatmentComponentOrder) {
        this.pharmacyTreatmentComponentOrder = pharmacyTreatmentComponentOrder;
    }

    public NTE getNotesandComments3() {
        return notesandComments3;
    }

    public void setNotesandComments3(NTE notesandComments3) {
        this.notesandComments3 = notesandComments3;
    }

    public RXE getPharmacyTreatmentEncodedOrder() {
        return pharmacyTreatmentEncodedOrder;
    }

    public void setPharmacyTreatmentEncodedOrder(RXE pharmacyTreatmentEncodedOrder) {
        this.pharmacyTreatmentEncodedOrder = pharmacyTreatmentEncodedOrder;
    }

    public PRT getParticipationInformation3() {
        return participationInformation3;
    }

    public void setParticipationInformation3(PRT participationInformation3) {
        this.participationInformation3 = participationInformation3;
    }

    public NTE getNotesandComments4() {
        return notesandComments4;
    }

    public void setNotesandComments4(NTE notesandComments4) {
        this.notesandComments4 = notesandComments4;
    }

    public TQ1 getTimingQuantity1() {
        return timingQuantity1;
    }

    public void setTimingQuantity1(TQ1 timingQuantity1) {
        this.timingQuantity1 = timingQuantity1;
    }

    public TQ2 getTimingQuantityRelationship1() {
        return timingQuantityRelationship1;
    }

    public void setTimingQuantityRelationship1(TQ2 timingQuantityRelationship1) {
        this.timingQuantityRelationship1 = timingQuantityRelationship1;
    }

    public RXR getPharmacyTreatmentRoute1() {
        return pharmacyTreatmentRoute1;
    }

    public void setPharmacyTreatmentRoute1(RXR pharmacyTreatmentRoute1) {
        this.pharmacyTreatmentRoute1 = pharmacyTreatmentRoute1;
    }

    public RXC getPharmacyTreatmentComponentOrder1() {
        return pharmacyTreatmentComponentOrder1;
    }

    public void setPharmacyTreatmentComponentOrder1(RXC pharmacyTreatmentComponentOrder1) {
        this.pharmacyTreatmentComponentOrder1 = pharmacyTreatmentComponentOrder1;
    }

    public CDO getCumulativeDosage() {
        return cumulativeDosage;
    }

    public void setCumulativeDosage(CDO cumulativeDosage) {
        this.cumulativeDosage = cumulativeDosage;
    }

    public RXA getPharmacyTreatmentAdministration() {
        return pharmacyTreatmentAdministration;
    }

    public void setPharmacyTreatmentAdministration(RXA pharmacyTreatmentAdministration) {
        this.pharmacyTreatmentAdministration = pharmacyTreatmentAdministration;
    }

    public PRT getParticipationInformation4() {
        return participationInformation4;
    }

    public void setParticipationInformation4(PRT participationInformation4) {
        this.participationInformation4 = participationInformation4;
    }

    public RXR getPharmacyTreatmentRoute2() {
        return pharmacyTreatmentRoute2;
    }

    public void setPharmacyTreatmentRoute2(RXR pharmacyTreatmentRoute2) {
        this.pharmacyTreatmentRoute2 = pharmacyTreatmentRoute2;
    }

    public OBX getObservationResult() {
        return observationResult;
    }

    public void setObservationResult(OBX observationResult) {
        this.observationResult = observationResult;
    }

    public PRT getParticipationInformation5() {
        return participationInformation5;
    }

    public void setParticipationInformation5(PRT participationInformation5) {
        this.participationInformation5 = participationInformation5;
    }

    public NTE getNotesandComments5() {
        return notesandComments5;
    }

    public void setNotesandComments5(NTE notesandComments5) {
        this.notesandComments5 = notesandComments5;
    }

    public CTI getClinicalTrialIdentification() {
        return clinicalTrialIdentification;
    }

    public void setClinicalTrialIdentification(CTI clinicalTrialIdentification) {
        this.clinicalTrialIdentification = clinicalTrialIdentification;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

