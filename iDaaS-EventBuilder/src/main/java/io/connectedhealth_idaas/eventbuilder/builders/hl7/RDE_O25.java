package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RDE_O25 {
    private MSH messageHeader;
    private SFT softwareSegment;
    private UAC userAuthenticationCredentialSegment;
    private NTE notesandComments;
    private PID patientIdentification;
    private PD1 patientAdditionalDemographic;
    private PRT participationInformation;
    private NTE notesandComments1;
    private ARV accessRestriction;
    private PV1 patientVisit;
    private PV2 patientVisitAdditionalInformation;
    private PRT participationInformation1;
    private ARV accessRestriction1;
    private IN1 insurance;
    private IN2 insuranceAdditionalInformation;
    private IN3 insuranceAdditionalInformationCertification;
    private GT1 guarantor;
    private AL1 patientAllergyInformation;
    private ORC commonOrder;
    private PRT participationInformation2;
    private TQ1 timingQuantity;
    private TQ2 timingQuantityRelationship;
    private RXO pharmacyTreatmentOrder;
    private PRT participationInformation3;
    private NTE notesandComments2;
    private RXR pharmacyTreatmentRoute;
    private RXC pharmacyTreatmentComponentOrder;
    private NTE notesandComments3;
    private RXE pharmacyTreatmentEncodedOrder;
    private PRT participationInformation4;
    private NTE notesandComments4;
    private TQ1 timingQuantity1;
    private TQ2 timingQuantityRelationship1;
    private RXV pharmacyTreatmentInfusion;
    private PRT participationInformation5;
    private NTE notesandComments5;
    private TQ1 timingQuantity2;
    private TQ2 timingQuantityRelationship2;
    private RXR pharmacyTreatmentRoute2;
    private RXC pharmacyTreatmentComponentOrder2;
    private CDO cumulativeDosage;
    private OBX observationResult;
    private PRT participationInformation6;
    private NTE notesandComments6;
    private FT1 financialTransaction;
    private BLG billing;
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

    public IN1 getInsurance() {
        return insurance;
    }

    public void setInsurance(IN1 insurance) {
        this.insurance = insurance;
    }

    public IN2 getInsuranceAdditionalInformation() {
        return insuranceAdditionalInformation;
    }

    public void setInsuranceAdditionalInformation(IN2 insuranceAdditionalInformation) {
        this.insuranceAdditionalInformation = insuranceAdditionalInformation;
    }

    public IN3 getInsuranceAdditionalInformationCertification() {
        return insuranceAdditionalInformationCertification;
    }

    public void setInsuranceAdditionalInformationCertification(IN3 insuranceAdditionalInformationCertification) {
        this.insuranceAdditionalInformationCertification = insuranceAdditionalInformationCertification;
    }

    public GT1 getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(GT1 guarantor) {
        this.guarantor = guarantor;
    }

    public AL1 getPatientAllergyInformation() {
        return patientAllergyInformation;
    }

    public void setPatientAllergyInformation(AL1 patientAllergyInformation) {
        this.patientAllergyInformation = patientAllergyInformation;
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

    public PRT getParticipationInformation3() {
        return participationInformation3;
    }

    public void setParticipationInformation3(PRT participationInformation3) {
        this.participationInformation3 = participationInformation3;
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

    public PRT getParticipationInformation4() {
        return participationInformation4;
    }

    public void setParticipationInformation4(PRT participationInformation4) {
        this.participationInformation4 = participationInformation4;
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

    public RXV getPharmacyTreatmentInfusion() {
        return pharmacyTreatmentInfusion;
    }

    public void setPharmacyTreatmentInfusion(RXV pharmacyTreatmentInfusion) {
        this.pharmacyTreatmentInfusion = pharmacyTreatmentInfusion;
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

    public TQ1 getTimingQuantity2() {
        return timingQuantity2;
    }

    public void setTimingQuantity2(TQ1 timingQuantity2) {
        this.timingQuantity2 = timingQuantity2;
    }

    public TQ2 getTimingQuantityRelationship2() {
        return timingQuantityRelationship2;
    }

    public void setTimingQuantityRelationship2(TQ2 timingQuantityRelationship2) {
        this.timingQuantityRelationship2 = timingQuantityRelationship2;
    }

    public RXR getPharmacyTreatmentRoute2() {
        return pharmacyTreatmentRoute2;
    }

    public void setPharmacyTreatmentRoute2(RXR pharmacyTreatmentRoute2) {
        this.pharmacyTreatmentRoute2 = pharmacyTreatmentRoute2;
    }

    public RXC getPharmacyTreatmentComponentOrder2() {
        return pharmacyTreatmentComponentOrder2;
    }

    public void setPharmacyTreatmentComponentOrder2(RXC pharmacyTreatmentComponentOrder2) {
        this.pharmacyTreatmentComponentOrder2 = pharmacyTreatmentComponentOrder2;
    }

    public CDO getCumulativeDosage() {
        return cumulativeDosage;
    }

    public void setCumulativeDosage(CDO cumulativeDosage) {
        this.cumulativeDosage = cumulativeDosage;
    }

    public OBX getObservationResult() {
        return observationResult;
    }

    public void setObservationResult(OBX observationResult) {
        this.observationResult = observationResult;
    }

    public PRT getParticipationInformation6() {
        return participationInformation6;
    }

    public void setParticipationInformation6(PRT participationInformation6) {
        this.participationInformation6 = participationInformation6;
    }

    public NTE getNotesandComments6() {
        return notesandComments6;
    }

    public void setNotesandComments6(NTE notesandComments6) {
        this.notesandComments6 = notesandComments6;
    }

    public FT1 getFinancialTransaction() {
        return financialTransaction;
    }

    public void setFinancialTransaction(FT1 financialTransaction) {
        this.financialTransaction = financialTransaction;
    }

    public BLG getBilling() {
        return billing;
    }

    public void setBilling(BLG billing) {
        this.billing = billing;
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

