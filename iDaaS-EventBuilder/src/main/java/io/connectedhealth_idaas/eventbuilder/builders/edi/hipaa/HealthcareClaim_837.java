package io.connectedhealth_idaas.eventbuilder.builders.edi.hipaa;
import io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HealthcareClaim_837 {
private ST transactionSetHeader;
private S4S securityHeaderLevel2;
private S4A assuranceHeaderLevel2;
private BHT beginningofHierarchicalTransaction;
private REF referenceInformation;
private NM1 individualorOrganizationalName;
private PER administrativeCommunicationsContact;
private NM1 individualorOrganizationalName1;
private HL hierarchicalLevel;
private PRV providerInformation;
private SBR subscriberInformation;
private PAT patientInformation;
private DTP dateorTimeorPeriod;
private CUR currency;
private NM1 individualorOrganizationalName2;
private N3 partyLocation;
private N4 geographicLocation;
private REF referenceInformation1;
private PER administrativeCommunicationsContact1;
private NM1 individualorOrganizationalName3;
private N3 partyLocation1;
private N4 geographicLocation1;
private REF referenceInformation2;
private NM1 individualorOrganizationalName4;
private N3 partyLocation2;
private N4 geographicLocation2;
private REF referenceInformation3;
private HL hierarchicalLevel1;
private SBR subscriberInformation1;
private PAT patientInformation1;
private NM1 individualorOrganizationalName5;
private N3 partyLocation3;
private N4 geographicLocation3;
private DMG demographicInformation;
private REF referenceInformation4;
private PER administrativeCommunicationsContact2;
private NM1 individualorOrganizationalName6;
private N3 partyLocation4;
private N4 geographicLocation4;
private DMG demographicInformation1;
private REF referenceInformation5;
private PER administrativeCommunicationsContact3;
private CLM healthClaim;
private DTP dateorTimeorPeriod1;
private CL1 claimCodes;
private DN1 orthodonticInformation;
private DN2 toothSummary;
private PWK paperwork;
private CN1 contractInformation;
private DSB disabilityInformation;
private UR peerReviewOrganizationorUtilizationReview;
private AMT monetaryAmountInformation;
private REF referenceInformation6;
private K3 fileInformation;
private NTE noteSpecialInstruction;
private CR1 ambulanceCertification;
private CR2 chiropracticCertification;
private CR3 durableMedicalEquipmentCertification;
private CR4 enteralorParenteralTherapyCertification;
private CR5 oxygenTherapyCertification;
private CR6 homeHealthCareCertification;
private CR8 pacemakerCertification;
private CRC conditionsIndicator;
private QTY quantityInformation;
private HCP healthCarePricing;
private CR7 homeHealthTreatmentPlanCertification;
private HSD healthCareServicesDelivery;
private NM1 individualorOrganizationalName7;
private PRV providerInformation1;
private N3 partyLocation5;
private N4 geographicLocation5;
private REF referenceInformation7;
private PER administrativeCommunicationsContact8;
private SBR subscriberInformation2;
private CAS claimsAdjustment;
private AMT monetaryAmountInformation1;
private DMG demographicInformation2;
private OI otherHealthInsuranceInformation;
private MIA medicareInpatientAdjudication;
private MOA medicareOutpatientAdjudication;
private NM1 individualorOrganizationalName8;
private N3 partyLocation6;
private N4 geographicLocation6;
private DTP dateorTimeorPeriod2;
private REF referenceInformation8;
private LX transactionSetLineNumber;
private SV1 professionalService;
private SV2 institutionalService;
private SV3 dentalService;
private TOO toothIdentification;
private SV4 drugService;
private SV5 durableMedicalEquipmentService;
private SV6 anesthesiaService;
private SV7 drugAdjudication;
private PWK paperwork1;
private CR1 ambulanceCertification1;
private CR2 chiropracticCertification1;
private CR3 durableMedicalEquipmentCertification1;
private CR4 enteralorParenteralTherapyCertification1;
private CR5 oxygenTherapyCertification1;
private CRC conditionsIndicator1;
private DTP dateorTimeorPeriod3;
private QTY quantityInformation1;
private MEA measurements;
private CN1 contractInformation1;
private REF referenceInformation9;
private AMT monetaryAmountInformation2;
private K3 fileInformation1;
private NTE noteSpecialInstruction1;
private PS1 purchaseService;
private IMM immunizationStatus;
private HSD healthCareServicesDelivery1;
private HCP healthCarePricing1;
private LIN itemIdentification;
private CTP pricingInformation;
private REF referenceInformation10;
private NM1 individualorOrganizationalName9;
private PRV providerInformation2;
private N3 partyLocation7;
private N4 geographicLocation7;
private REF referenceInformation11;
private PER administrativeCommunicationsContact9;
private SVD serviceLineAdjudication;
private CAS claimsAdjustment1;
private DTP dateorTimeorPeriod4;
private AMT monetaryAmountInformation3;
private LQ industryCodeIdentification;
private FRM supportingDocumentation;
private HL hierarchicalLevel2;
private PRV providerInformation3;
private SBR subscriberInformation3;
private PAT patientInformation2;
private DTP dateorTimeorPeriod5;
private CUR currency1;
private NM1 individualorOrganizationalName10;
private N3 partyLocation8;
private N4 geographicLocation8;
private DMG demographicInformation3;
private REF referenceInformation12;
private PER administrativeCommunicationsContact10;
private CLM healthClaim1;
private DTP dateorTimeorPeriod6;
private CL1 claimCodes1;
private DN1 orthodonticInformation1;
private DN2 toothSummary1;
private PWK paperwork2;
private CN1 contractInformation2;
private DSB disabilityInformation1;
private UR peerReviewOrganizationorUtilizationReview1;
private AMT monetaryAmountInformation4;
private REF referenceInformation13;
private K3 fileInformation2;
private NTE noteSpecialInstruction2;
private CR1 ambulanceCertification2;
private CR2 chiropracticCertification2;
private CR3 durableMedicalEquipmentCertification2;
private CR4 enteralorParenteralTherapyCertification2;
private CR5 oxygenTherapyCertification2;
private CR6 homeHealthCareCertification1;
private CR8 pacemakerCertification1;
private CRC conditionsIndicator2;
private QTY quantityInformation2;
private HCP healthCarePricing2;
private CR7 homeHealthTreatmentPlanCertification1;
private HSD healthCareServicesDelivery2;
private NM1 individualorOrganizationalName11;
private PRV providerInformation4;
private N3 partyLocation9;
private N4 geographicLocation9;
private REF referenceInformation14;
private PER administrativeCommunicationsContact11;
private SBR subscriberInformation4;
private CAS claimsAdjustment2;
private AMT monetaryAmountInformation5;
private DMG demographicInformation4;
private OI otherHealthInsuranceInformation1;
private MIA medicareInpatientAdjudication1;
private MOA medicareOutpatientAdjudication1;
private NM1 individualorOrganizationalName12;
private N3 partyLocation10;
private N4 geographicLocation10;
private DTP dateorTimeorPeriod7;
private REF referenceInformation15;
private LX transactionSetLineNumber1;
private SV1 professionalService1;
private SV2 institutionalService1;
private SV3 dentalService1;
private TOO toothIdentification1;
private SV4 drugService1;
private SV5 durableMedicalEquipmentService1;
private SV6 anesthesiaService1;
private SV7 drugAdjudication1;
private PWK paperwork3;
private CR1 ambulanceCertification3;
private CR2 chiropracticCertification3;
private CR3 durableMedicalEquipmentCertification3;
private CR4 enteralorParenteralTherapyCertification3;
private CR5 oxygenTherapyCertification3;
private CRC conditionsIndicator3;
private DTP dateorTimeorPeriod8;
private QTY quantityInformation3;
private MEA measurements1;
private CN1 contractInformation3;
private REF referenceInformation16;
private AMT monetaryAmountInformation6;
private K3 fileInformation3;
private NTE noteSpecialInstruction3;
private PS1 purchaseService1;
private IMM immunizationStatus1;
private HSD healthCareServicesDelivery3;
private HCP healthCarePricing3;
private LIN itemIdentification1;
private CTP pricingInformation1;
private REF referenceInformation17;
private NM1 individualorOrganizationalName13;
private PRV providerInformation5;
private N3 partyLocation11;
private N4 geographicLocation11;
private REF referenceInformation18;
private PER administrativeCommunicationsContact12;
private SVD serviceLineAdjudication1;
private CAS claimsAdjustment3;
private DTP dateorTimeorPeriod9;
private AMT monetaryAmountInformation7;
private LQ industryCodeIdentification1;
private FRM supportingDocumentation1;
private SVA securityValue;
private S4E securityTrailerLevel2;
private SE transactionSetTrailer;

    public ST getTransactionSetHeader() {
        return transactionSetHeader;
    }

    public void setTransactionSetHeader(ST transactionSetHeader) {
        this.transactionSetHeader = transactionSetHeader;
    }

    public S4S getSecurityHeaderLevel2() {
        return securityHeaderLevel2;
    }

    public void setSecurityHeaderLevel2(S4S securityHeaderLevel2) {
        this.securityHeaderLevel2 = securityHeaderLevel2;
    }

    public S4A getAssuranceHeaderLevel2() {
        return assuranceHeaderLevel2;
    }

    public void setAssuranceHeaderLevel2(S4A assuranceHeaderLevel2) {
        this.assuranceHeaderLevel2 = assuranceHeaderLevel2;
    }

    public BHT getBeginningofHierarchicalTransaction() {
        return beginningofHierarchicalTransaction;
    }

    public void setBeginningofHierarchicalTransaction(BHT beginningofHierarchicalTransaction) {
        this.beginningofHierarchicalTransaction = beginningofHierarchicalTransaction;
    }

    public REF getReferenceInformation() {
        return referenceInformation;
    }

    public void setReferenceInformation(REF referenceInformation) {
        this.referenceInformation = referenceInformation;
    }

    public K3 getFileInformation() {
        return fileInformation;
    }

    public void setFileInformation(K3 fileInformation) {
        this.fileInformation = fileInformation;
    }

    public NTE getNoteSpecialInstruction() {
        return noteSpecialInstruction;
    }

    public void setNoteSpecialInstruction(NTE noteSpecialInstruction) {
        this.noteSpecialInstruction = noteSpecialInstruction;
    }

    public CR1 getAmbulanceCertification() {
        return ambulanceCertification;
    }

    public void setAmbulanceCertification(CR1 ambulanceCertification) {
        this.ambulanceCertification = ambulanceCertification;
    }

    public CR2 getChiropracticCertification() {
        return chiropracticCertification;
    }

    public void setChiropracticCertification(CR2 chiropracticCertification) {
        this.chiropracticCertification = chiropracticCertification;
    }

    public CR3 getDurableMedicalEquipmentCertification() {
        return durableMedicalEquipmentCertification;
    }

    public void setDurableMedicalEquipmentCertification(CR3 durableMedicalEquipmentCertification) {
        this.durableMedicalEquipmentCertification = durableMedicalEquipmentCertification;
    }

    public CR4 getEnteralorParenteralTherapyCertification() {
        return enteralorParenteralTherapyCertification;
    }

    public void setEnteralorParenteralTherapyCertification(CR4 enteralorParenteralTherapyCertification) {
        this.enteralorParenteralTherapyCertification = enteralorParenteralTherapyCertification;
    }

    public CR5 getOxygenTherapyCertification() {
        return oxygenTherapyCertification;
    }

    public void setOxygenTherapyCertification(CR5 oxygenTherapyCertification) {
        this.oxygenTherapyCertification = oxygenTherapyCertification;
    }

    public CR6 getHomeHealthCareCertification() {
        return homeHealthCareCertification;
    }

    public void setHomeHealthCareCertification(CR6 homeHealthCareCertification) {
        this.homeHealthCareCertification = homeHealthCareCertification;
    }

    public CR8 getPacemakerCertification() {
        return pacemakerCertification;
    }

    public void setPacemakerCertification(CR8 pacemakerCertification) {
        this.pacemakerCertification = pacemakerCertification;
    }

    public CRC getConditionsIndicator() {
        return conditionsIndicator;
    }

    public void setConditionsIndicator(CRC conditionsIndicator) {
        this.conditionsIndicator = conditionsIndicator;
    }

    public QTY getQuantityInformation() {
        return quantityInformation;
    }

    public void setQuantityInformation(QTY quantityInformation) {
        this.quantityInformation = quantityInformation;
    }

    public HCP getHealthCarePricing() {
        return healthCarePricing;
    }

    public void setHealthCarePricing(HCP healthCarePricing) {
        this.healthCarePricing = healthCarePricing;
    }

    public CR7 getHomeHealthTreatmentPlanCertification() {
        return homeHealthTreatmentPlanCertification;
    }

    public void setHomeHealthTreatmentPlanCertification(CR7 homeHealthTreatmentPlanCertification) {
        this.homeHealthTreatmentPlanCertification = homeHealthTreatmentPlanCertification;
    }

    public HSD getHealthCareServicesDelivery() {
        return healthCareServicesDelivery;
    }

    public void setHealthCareServicesDelivery(HSD healthCareServicesDelivery) {
        this.healthCareServicesDelivery = healthCareServicesDelivery;
    }

    public NM1 getIndividualorOrganizationalName7() {
        return individualorOrganizationalName7;
    }

    public void setIndividualorOrganizationalName7(NM1 individualorOrganizationalName7) {
        this.individualorOrganizationalName7 = individualorOrganizationalName7;
    }

    public PRV getProviderInformation1() {
        return providerInformation1;
    }

    public void setProviderInformation1(PRV providerInformation1) {
        this.providerInformation1 = providerInformation1;
    }

    public N3 getPartyLocation5() {
        return partyLocation5;
    }

    public void setPartyLocation5(N3 partyLocation5) {
        this.partyLocation5 = partyLocation5;
    }

    public N4 getGeographicLocation5() {
        return geographicLocation5;
    }

    public void setGeographicLocation5(N4 geographicLocation5) {
        this.geographicLocation5 = geographicLocation5;
    }

    public REF getReferenceInformation6() {
        return referenceInformation6;
    }

    public void setReferenceInformation6(REF referenceInformation6) {
        this.referenceInformation6 = referenceInformation6;
    }

    public PER getAdministrativeCommunicationsContact8() {
        return administrativeCommunicationsContact8;
    }

    public void setAdministrativeCommunicationsContact8(PER administrativeCommunicationsContact8) {
        this.administrativeCommunicationsContact8 = administrativeCommunicationsContact8;
    }

    public SBR getSubscriberInformation2() {
        return subscriberInformation2;
    }

    public void setSubscriberInformation2(SBR subscriberInformation2) {
        this.subscriberInformation2 = subscriberInformation2;
    }

    public CAS getClaimsAdjustment() {
        return claimsAdjustment;
    }

    public void setClaimsAdjustment(CAS claimsAdjustment) {
        this.claimsAdjustment = claimsAdjustment;
    }

    public AMT getMonetaryAmountInformation1() {
        return monetaryAmountInformation1;
    }

    public void setMonetaryAmountInformation1(AMT monetaryAmountInformation1) {
        this.monetaryAmountInformation1 = monetaryAmountInformation1;
    }

    public DMG getDemographicInformation2() {
        return demographicInformation2;
    }

    public void setDemographicInformation2(DMG demographicInformation2) {
        this.demographicInformation2 = demographicInformation2;
    }

    public OI getOtherHealthInsuranceInformation() {
        return otherHealthInsuranceInformation;
    }

    public void setOtherHealthInsuranceInformation(OI otherHealthInsuranceInformation) {
        this.otherHealthInsuranceInformation = otherHealthInsuranceInformation;
    }

    public MIA getMedicareInpatientAdjudication() {
        return medicareInpatientAdjudication;
    }

    public void setMedicareInpatientAdjudication(MIA medicareInpatientAdjudication) {
        this.medicareInpatientAdjudication = medicareInpatientAdjudication;
    }

    public MOA getMedicareOutpatientAdjudication() {
        return medicareOutpatientAdjudication;
    }

    public void setMedicareOutpatientAdjudication(MOA medicareOutpatientAdjudication) {
        this.medicareOutpatientAdjudication = medicareOutpatientAdjudication;
    }

    public NM1 getIndividualorOrganizationalName8() {
        return individualorOrganizationalName8;
    }

    public void setIndividualorOrganizationalName8(NM1 individualorOrganizationalName8) {
        this.individualorOrganizationalName8 = individualorOrganizationalName8;
    }

    public N3 getPartyLocation6() {
        return partyLocation6;
    }

    public void setPartyLocation6(N3 partyLocation6) {
        this.partyLocation6 = partyLocation6;
    }

    public N4 getGeographicLocation6() {
        return geographicLocation6;
    }

    public void setGeographicLocation6(N4 geographicLocation6) {
        this.geographicLocation6 = geographicLocation6;
    }

    public DTP getDateorTimeorPeriod2() {
        return dateorTimeorPeriod2;
    }

    public void setDateorTimeorPeriod2(DTP dateorTimeorPeriod2) {
        this.dateorTimeorPeriod2 = dateorTimeorPeriod2;
    }

    public REF getReferenceInformation7() {
        return referenceInformation7;
    }

    public void setReferenceInformation7(REF referenceInformation7) {
        this.referenceInformation7 = referenceInformation7;
    }

    public LX getTransactionSetLineNumber() {
        return transactionSetLineNumber;
    }

    public void setTransactionSetLineNumber(LX transactionSetLineNumber) {
        this.transactionSetLineNumber = transactionSetLineNumber;
    }

    public SV1 getProfessionalService() {
        return professionalService;
    }

    public void setProfessionalService(SV1 professionalService) {
        this.professionalService = professionalService;
    }

    public SV2 getInstitutionalService() {
        return institutionalService;
    }

    public void setInstitutionalService(SV2 institutionalService) {
        this.institutionalService = institutionalService;
    }

    public SV3 getDentalService() {
        return dentalService;
    }

    public void setDentalService(SV3 dentalService) {
        this.dentalService = dentalService;
    }

    public TOO getToothIdentification() {
        return toothIdentification;
    }

    public void setToothIdentification(TOO toothIdentification) {
        this.toothIdentification = toothIdentification;
    }

    public SV4 getDrugService() {
        return drugService;
    }

    public void setDrugService(SV4 drugService) {
        this.drugService = drugService;
    }

    public SV5 getDurableMedicalEquipmentService() {
        return durableMedicalEquipmentService;
    }

    public void setDurableMedicalEquipmentService(SV5 durableMedicalEquipmentService) {
        this.durableMedicalEquipmentService = durableMedicalEquipmentService;
    }

    public SV6 getAnesthesiaService() {
        return anesthesiaService;
    }

    public void setAnesthesiaService(SV6 anesthesiaService) {
        this.anesthesiaService = anesthesiaService;
    }

    public SV7 getDrugAdjudication() {
        return drugAdjudication;
    }

    public void setDrugAdjudication(SV7 drugAdjudication) {
        this.drugAdjudication = drugAdjudication;
    }

    public PWK getPaperwork1() {
        return paperwork1;
    }

    public void setPaperwork1(PWK paperwork1) {
        this.paperwork1 = paperwork1;
    }

    public CR1 getAmbulanceCertification1() {
        return ambulanceCertification1;
    }

    public void setAmbulanceCertification1(CR1 ambulanceCertification1) {
        this.ambulanceCertification1 = ambulanceCertification1;
    }

    public CR2 getChiropracticCertification1() {
        return chiropracticCertification1;
    }

    public void setChiropracticCertification1(CR2 chiropracticCertification1) {
        this.chiropracticCertification1 = chiropracticCertification1;
    }

    public CR3 getDurableMedicalEquipmentCertification1() {
        return durableMedicalEquipmentCertification1;
    }

    public void setDurableMedicalEquipmentCertification1(CR3 durableMedicalEquipmentCertification1) {
        this.durableMedicalEquipmentCertification1 = durableMedicalEquipmentCertification1;
    }

    public CR4 getEnteralorParenteralTherapyCertification1() {
        return enteralorParenteralTherapyCertification1;
    }

    public void setEnteralorParenteralTherapyCertification1(CR4 enteralorParenteralTherapyCertification1) {
        this.enteralorParenteralTherapyCertification1 = enteralorParenteralTherapyCertification1;
    }

    public CR5 getOxygenTherapyCertification1() {
        return oxygenTherapyCertification1;
    }

    public void setOxygenTherapyCertification1(CR5 oxygenTherapyCertification1) {
        this.oxygenTherapyCertification1 = oxygenTherapyCertification1;
    }

    public CRC getConditionsIndicator1() {
        return conditionsIndicator1;
    }

    public void setConditionsIndicator1(CRC conditionsIndicator1) {
        this.conditionsIndicator1 = conditionsIndicator1;
    }

    public DTP getDateorTimeorPeriod3() {
        return dateorTimeorPeriod3;
    }

    public void setDateorTimeorPeriod3(DTP dateorTimeorPeriod3) {
        this.dateorTimeorPeriod3 = dateorTimeorPeriod3;
    }

    public QTY getQuantityInformation1() {
        return quantityInformation1;
    }

    public void setQuantityInformation1(QTY quantityInformation1) {
        this.quantityInformation1 = quantityInformation1;
    }

    public MEA getMeasurements() {
        return measurements;
    }

    public void setMeasurements(MEA measurements) {
        this.measurements = measurements;
    }

    public CN1 getContractInformation1() {
        return contractInformation1;
    }

    public void setContractInformation1(CN1 contractInformation1) {
        this.contractInformation1 = contractInformation1;
    }

    public REF getReferenceInformation8() {
        return referenceInformation8;
    }

    public void setReferenceInformation8(REF referenceInformation8) {
        this.referenceInformation8 = referenceInformation8;
    }

    public AMT getMonetaryAmountInformation2() {
        return monetaryAmountInformation2;
    }

    public void setMonetaryAmountInformation2(AMT monetaryAmountInformation2) {
        this.monetaryAmountInformation2 = monetaryAmountInformation2;
    }

    public K3 getFileInformation1() {
        return fileInformation1;
    }

    public void setFileInformation1(K3 fileInformation1) {
        this.fileInformation1 = fileInformation1;
    }

    public NTE getNoteSpecialInstruction1() {
        return noteSpecialInstruction1;
    }

    public void setNoteSpecialInstruction1(NTE noteSpecialInstruction1) {
        this.noteSpecialInstruction1 = noteSpecialInstruction1;
    }

    public PS1 getPurchaseService() {
        return purchaseService;
    }

    public void setPurchaseService(PS1 purchaseService) {
        this.purchaseService = purchaseService;
    }

    public IMM getImmunizationStatus() {
        return immunizationStatus;
    }

    public void setImmunizationStatus(IMM immunizationStatus) {
        this.immunizationStatus = immunizationStatus;
    }

    public HSD getHealthCareServicesDelivery1() {
        return healthCareServicesDelivery1;
    }

    public void setHealthCareServicesDelivery1(HSD healthCareServicesDelivery1) {
        this.healthCareServicesDelivery1 = healthCareServicesDelivery1;
    }

    public HCP getHealthCarePricing1() {
        return healthCarePricing1;
    }

    public void setHealthCarePricing1(HCP healthCarePricing1) {
        this.healthCarePricing1 = healthCarePricing1;
    }

    public LIN getItemIdentification() {
        return itemIdentification;
    }

    public void setItemIdentification(LIN itemIdentification) {
        this.itemIdentification = itemIdentification;
    }

    public CTP getPricingInformation() {
        return pricingInformation;
    }

    public void setPricingInformation(CTP pricingInformation) {
        this.pricingInformation = pricingInformation;
    }

    public REF getReferenceInformation9() {
        return referenceInformation9;
    }

    public void setReferenceInformation9(REF referenceInformation9) {
        this.referenceInformation9 = referenceInformation9;
    }

    public NM1 getIndividualorOrganizationalName9() {
        return individualorOrganizationalName9;
    }

    public void setIndividualorOrganizationalName9(NM1 individualorOrganizationalName9) {
        this.individualorOrganizationalName9 = individualorOrganizationalName9;
    }

    public PRV getProviderInformation2() {
        return providerInformation2;
    }

    public void setProviderInformation2(PRV providerInformation2) {
        this.providerInformation2 = providerInformation2;
    }

    public N3 getPartyLocation7() {
        return partyLocation7;
    }

    public void setPartyLocation7(N3 partyLocation7) {
        this.partyLocation7 = partyLocation7;
    }

    public N4 getGeographicLocation7() {
        return geographicLocation7;
    }

    public void setGeographicLocation7(N4 geographicLocation7) {
        this.geographicLocation7 = geographicLocation7;
    }

    public REF getReferenceInformation10() {
        return referenceInformation10;
    }

    public void setReferenceInformation10(REF referenceInformation10) {
        this.referenceInformation10 = referenceInformation10;
    }

    public PER getAdministrativeCommunicationsContact9() {
        return administrativeCommunicationsContact9;
    }

    public void setAdministrativeCommunicationsContact9(PER administrativeCommunicationsContact9) {
        this.administrativeCommunicationsContact9 = administrativeCommunicationsContact9;
    }

    public SVD getServiceLineAdjudication() {
        return serviceLineAdjudication;
    }

    public void setServiceLineAdjudication(SVD serviceLineAdjudication) {
        this.serviceLineAdjudication = serviceLineAdjudication;
    }

    public CAS getClaimsAdjustment1() {
        return claimsAdjustment1;
    }

    public void setClaimsAdjustment1(CAS claimsAdjustment1) {
        this.claimsAdjustment1 = claimsAdjustment1;
    }

    public DTP getDateorTimeorPeriod4() {
        return dateorTimeorPeriod4;
    }

    public void setDateorTimeorPeriod4(DTP dateorTimeorPeriod4) {
        this.dateorTimeorPeriod4 = dateorTimeorPeriod4;
    }

    public AMT getMonetaryAmountInformation3() {
        return monetaryAmountInformation3;
    }

    public void setMonetaryAmountInformation3(AMT monetaryAmountInformation3) {
        this.monetaryAmountInformation3 = monetaryAmountInformation3;
    }

    public LQ getIndustryCodeIdentification() {
        return industryCodeIdentification;
    }

    public void setIndustryCodeIdentification(LQ industryCodeIdentification) {
        this.industryCodeIdentification = industryCodeIdentification;
    }

    public FRM getSupportingDocumentation() {
        return supportingDocumentation;
    }

    public void setSupportingDocumentation(FRM supportingDocumentation) {
        this.supportingDocumentation = supportingDocumentation;
    }

    public HL getHierarchicalLevel2() {
        return hierarchicalLevel2;
    }

    public void setHierarchicalLevel2(HL hierarchicalLevel2) {
        this.hierarchicalLevel2 = hierarchicalLevel2;
    }

    public PRV getProviderInformation3() {
        return providerInformation3;
    }

    public void setProviderInformation3(PRV providerInformation3) {
        this.providerInformation3 = providerInformation3;
    }

    public SBR getSubscriberInformation3() {
        return subscriberInformation3;
    }

    public void setSubscriberInformation3(SBR subscriberInformation3) {
        this.subscriberInformation3 = subscriberInformation3;
    }

    public PAT getPatientInformation2() {
        return patientInformation2;
    }

    public void setPatientInformation2(PAT patientInformation2) {
        this.patientInformation2 = patientInformation2;
    }

    public DTP getDateorTimeorPeriod5() {
        return dateorTimeorPeriod5;
    }

    public void setDateorTimeorPeriod5(DTP dateorTimeorPeriod5) {
        this.dateorTimeorPeriod5 = dateorTimeorPeriod5;
    }

    public CUR getCurrency1() {
        return currency1;
    }

    public void setCurrency1(CUR currency1) {
        this.currency1 = currency1;
    }

    public NM1 getIndividualorOrganizationalName10() {
        return individualorOrganizationalName10;
    }

    public void setIndividualorOrganizationalName10(NM1 individualorOrganizationalName10) {
        this.individualorOrganizationalName10 = individualorOrganizationalName10;
    }

    public N3 getPartyLocation8() {
        return partyLocation8;
    }

    public void setPartyLocation8(N3 partyLocation8) {
        this.partyLocation8 = partyLocation8;
    }

    public N4 getGeographicLocation8() {
        return geographicLocation8;
    }

    public void setGeographicLocation8(N4 geographicLocation8) {
        this.geographicLocation8 = geographicLocation8;
    }

    public DMG getDemographicInformation3() {
        return demographicInformation3;
    }

    public void setDemographicInformation3(DMG demographicInformation3) {
        this.demographicInformation3 = demographicInformation3;
    }

    public REF getReferenceInformation11() {
        return referenceInformation11;
    }

    public void setReferenceInformation11(REF referenceInformation11) {
        this.referenceInformation11 = referenceInformation11;
    }

    public PER getAdministrativeCommunicationsContact10() {
        return administrativeCommunicationsContact10;
    }

    public void setAdministrativeCommunicationsContact10(PER administrativeCommunicationsContact10) {
        this.administrativeCommunicationsContact10 = administrativeCommunicationsContact10;
    }

    public CLM getHealthClaim1() {
        return healthClaim1;
    }

    public void setHealthClaim1(CLM healthClaim1) {
        this.healthClaim1 = healthClaim1;
    }

    public DTP getDateorTimeorPeriod6() {
        return dateorTimeorPeriod6;
    }

    public void setDateorTimeorPeriod6(DTP dateorTimeorPeriod6) {
        this.dateorTimeorPeriod6 = dateorTimeorPeriod6;
    }

    public CL1 getClaimCodes1() {
        return claimCodes1;
    }

    public void setClaimCodes1(CL1 claimCodes1) {
        this.claimCodes1 = claimCodes1;
    }

    public DN1 getOrthodonticInformation1() {
        return orthodonticInformation1;
    }

    public void setOrthodonticInformation1(DN1 orthodonticInformation1) {
        this.orthodonticInformation1 = orthodonticInformation1;
    }

    public DN2 getToothSummary1() {
        return toothSummary1;
    }

    public void setToothSummary1(DN2 toothSummary1) {
        this.toothSummary1 = toothSummary1;
    }

    public PWK getPaperwork2() {
        return paperwork2;
    }

    public void setPaperwork2(PWK paperwork2) {
        this.paperwork2 = paperwork2;
    }

    public CN1 getContractInformation2() {
        return contractInformation2;
    }

    public void setContractInformation2(CN1 contractInformation2) {
        this.contractInformation2 = contractInformation2;
    }

    public DSB getDisabilityInformation1() {
        return disabilityInformation1;
    }

    public void setDisabilityInformation1(DSB disabilityInformation1) {
        this.disabilityInformation1 = disabilityInformation1;
    }

    public UR getPeerReviewOrganizationorUtilizationReview1() {
        return peerReviewOrganizationorUtilizationReview1;
    }

    public void setPeerReviewOrganizationorUtilizationReview1(UR peerReviewOrganizationorUtilizationReview1) {
        this.peerReviewOrganizationorUtilizationReview1 = peerReviewOrganizationorUtilizationReview1;
    }

    public AMT getMonetaryAmountInformation4() {
        return monetaryAmountInformation4;
    }

    public void setMonetaryAmountInformation4(AMT monetaryAmountInformation4) {
        this.monetaryAmountInformation4 = monetaryAmountInformation4;
    }

    public REF getReferenceInformation12() {
        return referenceInformation12;
    }

    public void setReferenceInformation12(REF referenceInformation12) {
        this.referenceInformation12 = referenceInformation12;
    }

    public K3 getFileInformation2() {
        return fileInformation2;
    }

    public void setFileInformation2(K3 fileInformation2) {
        this.fileInformation2 = fileInformation2;
    }

    public NTE getNoteSpecialInstruction2() {
        return noteSpecialInstruction2;
    }

    public void setNoteSpecialInstruction2(NTE noteSpecialInstruction2) {
        this.noteSpecialInstruction2 = noteSpecialInstruction2;
    }

    public CR1 getAmbulanceCertification2() {
        return ambulanceCertification2;
    }

    public void setAmbulanceCertification2(CR1 ambulanceCertification2) {
        this.ambulanceCertification2 = ambulanceCertification2;
    }

    public CR2 getChiropracticCertification2() {
        return chiropracticCertification2;
    }

    public void setChiropracticCertification2(CR2 chiropracticCertification2) {
        this.chiropracticCertification2 = chiropracticCertification2;
    }

    public CR3 getDurableMedicalEquipmentCertification2() {
        return durableMedicalEquipmentCertification2;
    }

    public void setDurableMedicalEquipmentCertification2(CR3 durableMedicalEquipmentCertification2) {
        this.durableMedicalEquipmentCertification2 = durableMedicalEquipmentCertification2;
    }

    public CR4 getEnteralorParenteralTherapyCertification2() {
        return enteralorParenteralTherapyCertification2;
    }

    public void setEnteralorParenteralTherapyCertification2(CR4 enteralorParenteralTherapyCertification2) {
        this.enteralorParenteralTherapyCertification2 = enteralorParenteralTherapyCertification2;
    }

    public CR5 getOxygenTherapyCertification2() {
        return oxygenTherapyCertification2;
    }

    public void setOxygenTherapyCertification2(CR5 oxygenTherapyCertification2) {
        this.oxygenTherapyCertification2 = oxygenTherapyCertification2;
    }

    public CR6 getHomeHealthCareCertification1() {
        return homeHealthCareCertification1;
    }

    public void setHomeHealthCareCertification1(CR6 homeHealthCareCertification1) {
        this.homeHealthCareCertification1 = homeHealthCareCertification1;
    }

    public CR8 getPacemakerCertification1() {
        return pacemakerCertification1;
    }

    public void setPacemakerCertification1(CR8 pacemakerCertification1) {
        this.pacemakerCertification1 = pacemakerCertification1;
    }

    public CRC getConditionsIndicator2() {
        return conditionsIndicator2;
    }

    public void setConditionsIndicator2(CRC conditionsIndicator2) {
        this.conditionsIndicator2 = conditionsIndicator2;
    }

    public QTY getQuantityInformation2() {
        return quantityInformation2;
    }

    public void setQuantityInformation2(QTY quantityInformation2) {
        this.quantityInformation2 = quantityInformation2;
    }

    public HCP getHealthCarePricing2() {
        return healthCarePricing2;
    }

    public void setHealthCarePricing2(HCP healthCarePricing2) {
        this.healthCarePricing2 = healthCarePricing2;
    }

    public CR7 getHomeHealthTreatmentPlanCertification1() {
        return homeHealthTreatmentPlanCertification1;
    }

    public void setHomeHealthTreatmentPlanCertification1(CR7 homeHealthTreatmentPlanCertification1) {
        this.homeHealthTreatmentPlanCertification1 = homeHealthTreatmentPlanCertification1;
    }

    public HSD getHealthCareServicesDelivery2() {
        return healthCareServicesDelivery2;
    }

    public void setHealthCareServicesDelivery2(HSD healthCareServicesDelivery2) {
        this.healthCareServicesDelivery2 = healthCareServicesDelivery2;
    }

    public NM1 getIndividualorOrganizationalName11() {
        return individualorOrganizationalName11;
    }

    public void setIndividualorOrganizationalName11(NM1 individualorOrganizationalName11) {
        this.individualorOrganizationalName11 = individualorOrganizationalName11;
    }

    public PRV getProviderInformation4() {
        return providerInformation4;
    }

    public void setProviderInformation4(PRV providerInformation4) {
        this.providerInformation4 = providerInformation4;
    }

    public N3 getPartyLocation9() {
        return partyLocation9;
    }

    public void setPartyLocation9(N3 partyLocation9) {
        this.partyLocation9 = partyLocation9;
    }

    public N4 getGeographicLocation9() {
        return geographicLocation9;
    }

    public void setGeographicLocation9(N4 geographicLocation9) {
        this.geographicLocation9 = geographicLocation9;
    }

    public REF getReferenceInformation13() {
        return referenceInformation13;
    }

    public void setReferenceInformation13(REF referenceInformation13) {
        this.referenceInformation13 = referenceInformation13;
    }

    public PER getAdministrativeCommunicationsContact11() {
        return administrativeCommunicationsContact11;
    }

    public void setAdministrativeCommunicationsContact11(PER administrativeCommunicationsContact11) {
        this.administrativeCommunicationsContact11 = administrativeCommunicationsContact11;
    }

    public SBR getSubscriberInformation4() {
        return subscriberInformation4;
    }

    public void setSubscriberInformation4(SBR subscriberInformation4) {
        this.subscriberInformation4 = subscriberInformation4;
    }

    public CAS getClaimsAdjustment2() {
        return claimsAdjustment2;
    }

    public void setClaimsAdjustment2(CAS claimsAdjustment2) {
        this.claimsAdjustment2 = claimsAdjustment2;
    }

    public AMT getMonetaryAmountInformation5() {
        return monetaryAmountInformation5;
    }

    public void setMonetaryAmountInformation5(AMT monetaryAmountInformation5) {
        this.monetaryAmountInformation5 = monetaryAmountInformation5;
    }

    public DMG getDemographicInformation4() {
        return demographicInformation4;
    }

    public void setDemographicInformation4(DMG demographicInformation4) {
        this.demographicInformation4 = demographicInformation4;
    }

    public OI getOtherHealthInsuranceInformation1() {
        return otherHealthInsuranceInformation1;
    }

    public void setOtherHealthInsuranceInformation1(OI otherHealthInsuranceInformation1) {
        this.otherHealthInsuranceInformation1 = otherHealthInsuranceInformation1;
    }

    public MIA getMedicareInpatientAdjudication1() {
        return medicareInpatientAdjudication1;
    }

    public void setMedicareInpatientAdjudication1(MIA medicareInpatientAdjudication1) {
        this.medicareInpatientAdjudication1 = medicareInpatientAdjudication1;
    }

    public MOA getMedicareOutpatientAdjudication1() {
        return medicareOutpatientAdjudication1;
    }

    public void setMedicareOutpatientAdjudication1(MOA medicareOutpatientAdjudication1) {
        this.medicareOutpatientAdjudication1 = medicareOutpatientAdjudication1;
    }

    public NM1 getIndividualorOrganizationalName12() {
        return individualorOrganizationalName12;
    }

    public void setIndividualorOrganizationalName12(NM1 individualorOrganizationalName12) {
        this.individualorOrganizationalName12 = individualorOrganizationalName12;
    }

    public N3 getPartyLocation10() {
        return partyLocation10;
    }

    public void setPartyLocation10(N3 partyLocation10) {
        this.partyLocation10 = partyLocation10;
    }

    public N4 getGeographicLocation10() {
        return geographicLocation10;
    }

    public void setGeographicLocation10(N4 geographicLocation10) {
        this.geographicLocation10 = geographicLocation10;
    }

    public DTP getDateorTimeorPeriod7() {
        return dateorTimeorPeriod7;
    }

    public void setDateorTimeorPeriod7(DTP dateorTimeorPeriod7) {
        this.dateorTimeorPeriod7 = dateorTimeorPeriod7;
    }

    public REF getReferenceInformation14() {
        return referenceInformation14;
    }

    public void setReferenceInformation14(REF referenceInformation14) {
        this.referenceInformation14 = referenceInformation14;
    }

    public LX getTransactionSetLineNumber1() {
        return transactionSetLineNumber1;
    }

    public void setTransactionSetLineNumber1(LX transactionSetLineNumber1) {
        this.transactionSetLineNumber1 = transactionSetLineNumber1;
    }

    public SV1 getProfessionalService1() {
        return professionalService1;
    }

    public void setProfessionalService1(SV1 professionalService1) {
        this.professionalService1 = professionalService1;
    }

    public SV2 getInstitutionalService1() {
        return institutionalService1;
    }

    public void setInstitutionalService1(SV2 institutionalService1) {
        this.institutionalService1 = institutionalService1;
    }

    public SV3 getDentalService1() {
        return dentalService1;
    }

    public void setDentalService1(SV3 dentalService1) {
        this.dentalService1 = dentalService1;
    }

    public TOO getToothIdentification1() {
        return toothIdentification1;
    }

    public void setToothIdentification1(TOO toothIdentification1) {
        this.toothIdentification1 = toothIdentification1;
    }

    public SV4 getDrugService1() {
        return drugService1;
    }

    public void setDrugService1(SV4 drugService1) {
        this.drugService1 = drugService1;
    }

    public SV5 getDurableMedicalEquipmentService1() {
        return durableMedicalEquipmentService1;
    }

    public void setDurableMedicalEquipmentService1(SV5 durableMedicalEquipmentService1) {
        this.durableMedicalEquipmentService1 = durableMedicalEquipmentService1;
    }

    public SV6 getAnesthesiaService1() {
        return anesthesiaService1;
    }

    public void setAnesthesiaService1(SV6 anesthesiaService1) {
        this.anesthesiaService1 = anesthesiaService1;
    }

    public SV7 getDrugAdjudication1() {
        return drugAdjudication1;
    }

    public void setDrugAdjudication1(SV7 drugAdjudication1) {
        this.drugAdjudication1 = drugAdjudication1;
    }

    public PWK getPaperwork3() {
        return paperwork3;
    }

    public void setPaperwork3(PWK paperwork3) {
        this.paperwork3 = paperwork3;
    }

    public CR1 getAmbulanceCertification3() {
        return ambulanceCertification3;
    }

    public void setAmbulanceCertification3(CR1 ambulanceCertification3) {
        this.ambulanceCertification3 = ambulanceCertification3;
    }

    public CR2 getChiropracticCertification3() {
        return chiropracticCertification3;
    }

    public void setChiropracticCertification3(CR2 chiropracticCertification3) {
        this.chiropracticCertification3 = chiropracticCertification3;
    }

    public CR3 getDurableMedicalEquipmentCertification3() {
        return durableMedicalEquipmentCertification3;
    }

    public void setDurableMedicalEquipmentCertification3(CR3 durableMedicalEquipmentCertification3) {
        this.durableMedicalEquipmentCertification3 = durableMedicalEquipmentCertification3;
    }

    public CR4 getEnteralorParenteralTherapyCertification3() {
        return enteralorParenteralTherapyCertification3;
    }

    public void setEnteralorParenteralTherapyCertification3(CR4 enteralorParenteralTherapyCertification3) {
        this.enteralorParenteralTherapyCertification3 = enteralorParenteralTherapyCertification3;
    }

    public CR5 getOxygenTherapyCertification3() {
        return oxygenTherapyCertification3;
    }

    public void setOxygenTherapyCertification3(CR5 oxygenTherapyCertification3) {
        this.oxygenTherapyCertification3 = oxygenTherapyCertification3;
    }

    public CRC getConditionsIndicator3() {
        return conditionsIndicator3;
    }

    public void setConditionsIndicator3(CRC conditionsIndicator3) {
        this.conditionsIndicator3 = conditionsIndicator3;
    }

    public DTP getDateorTimeorPeriod8() {
        return dateorTimeorPeriod8;
    }

    public void setDateorTimeorPeriod8(DTP dateorTimeorPeriod8) {
        this.dateorTimeorPeriod8 = dateorTimeorPeriod8;
    }

    public QTY getQuantityInformation3() {
        return quantityInformation3;
    }

    public void setQuantityInformation3(QTY quantityInformation3) {
        this.quantityInformation3 = quantityInformation3;
    }

    public MEA getMeasurements1() {
        return measurements1;
    }

    public void setMeasurements1(MEA measurements1) {
        this.measurements1 = measurements1;
    }

    public CN1 getContractInformation3() {
        return contractInformation3;
    }

    public void setContractInformation3(CN1 contractInformation3) {
        this.contractInformation3 = contractInformation3;
    }

    public REF getReferenceInformation15() {
        return referenceInformation15;
    }

    public void setReferenceInformation15(REF referenceInformation15) {
        this.referenceInformation15 = referenceInformation15;
    }

    public AMT getMonetaryAmountInformation6() {
        return monetaryAmountInformation6;
    }

    public void setMonetaryAmountInformation6(AMT monetaryAmountInformation6) {
        this.monetaryAmountInformation6 = monetaryAmountInformation6;
    }

    public K3 getFileInformation3() {
        return fileInformation3;
    }

    public void setFileInformation3(K3 fileInformation3) {
        this.fileInformation3 = fileInformation3;
    }

    public NTE getNoteSpecialInstruction3() {
        return noteSpecialInstruction3;
    }

    public void setNoteSpecialInstruction3(NTE noteSpecialInstruction3) {
        this.noteSpecialInstruction3 = noteSpecialInstruction3;
    }

    public PS1 getPurchaseService1() {
        return purchaseService1;
    }

    public void setPurchaseService1(PS1 purchaseService1) {
        this.purchaseService1 = purchaseService1;
    }

    public IMM getImmunizationStatus1() {
        return immunizationStatus1;
    }

    public void setImmunizationStatus1(IMM immunizationStatus1) {
        this.immunizationStatus1 = immunizationStatus1;
    }

    public HSD getHealthCareServicesDelivery3() {
        return healthCareServicesDelivery3;
    }

    public void setHealthCareServicesDelivery3(HSD healthCareServicesDelivery3) {
        this.healthCareServicesDelivery3 = healthCareServicesDelivery3;
    }

    public HCP getHealthCarePricing3() {
        return healthCarePricing3;
    }

    public void setHealthCarePricing3(HCP healthCarePricing3) {
        this.healthCarePricing3 = healthCarePricing3;
    }

    public LIN getItemIdentification1() {
        return itemIdentification1;
    }

    public void setItemIdentification1(LIN itemIdentification1) {
        this.itemIdentification1 = itemIdentification1;
    }

    public CTP getPricingInformation1() {
        return pricingInformation1;
    }

    public void setPricingInformation1(CTP pricingInformation1) {
        this.pricingInformation1 = pricingInformation1;
    }

    public REF getReferenceInformation16() {
        return referenceInformation16;
    }

    public void setReferenceInformation16(REF referenceInformation16) {
        this.referenceInformation16 = referenceInformation16;
    }

    public NM1 getIndividualorOrganizationalName13() {
        return individualorOrganizationalName13;
    }

    public void setIndividualorOrganizationalName13(NM1 individualorOrganizationalName13) {
        this.individualorOrganizationalName13 = individualorOrganizationalName13;
    }

    public PRV getProviderInformation5() {
        return providerInformation5;
    }

    public void setProviderInformation5(PRV providerInformation5) {
        this.providerInformation5 = providerInformation5;
    }

    public N3 getPartyLocation11() {
        return partyLocation11;
    }

    public void setPartyLocation11(N3 partyLocation11) {
        this.partyLocation11 = partyLocation11;
    }

    public N4 getGeographicLocation11() {
        return geographicLocation11;
    }

    public void setGeographicLocation11(N4 geographicLocation11) {
        this.geographicLocation11 = geographicLocation11;
    }

    public REF getReferenceInformation17() {
        return referenceInformation17;
    }

    public void setReferenceInformation17(REF referenceInformation17) {
        this.referenceInformation17 = referenceInformation17;
    }

    public PER getAdministrativeCommunicationsContact12() {
        return administrativeCommunicationsContact12;
    }

    public void setAdministrativeCommunicationsContact12(PER administrativeCommunicationsContact12) {
        this.administrativeCommunicationsContact12 = administrativeCommunicationsContact12;
    }

    public SVD getServiceLineAdjudication1() {
        return serviceLineAdjudication1;
    }

    public void setServiceLineAdjudication1(SVD serviceLineAdjudication1) {
        this.serviceLineAdjudication1 = serviceLineAdjudication1;
    }

    public CAS getClaimsAdjustment3() {
        return claimsAdjustment3;
    }

    public void setClaimsAdjustment3(CAS claimsAdjustment3) {
        this.claimsAdjustment3 = claimsAdjustment3;
    }

    public DTP getDateorTimeorPeriod9() {
        return dateorTimeorPeriod9;
    }

    public void setDateorTimeorPeriod9(DTP dateorTimeorPeriod9) {
        this.dateorTimeorPeriod9 = dateorTimeorPeriod9;
    }

    public AMT getMonetaryAmountInformation7() {
        return monetaryAmountInformation7;
    }

    public void setMonetaryAmountInformation7(AMT monetaryAmountInformation7) {
        this.monetaryAmountInformation7 = monetaryAmountInformation7;
    }

    public LQ getIndustryCodeIdentification1() {
        return industryCodeIdentification1;
    }

    public void setIndustryCodeIdentification1(LQ industryCodeIdentification1) {
        this.industryCodeIdentification1 = industryCodeIdentification1;
    }

    public FRM getSupportingDocumentation1() {
        return supportingDocumentation1;
    }

    public void setSupportingDocumentation1(FRM supportingDocumentation1) {
        this.supportingDocumentation1 = supportingDocumentation1;
    }

    public SVA getSecurityValue() {
        return securityValue;
    }

    public void setSecurityValue(SVA securityValue) {
        this.securityValue = securityValue;
    }

    public S4E getSecurityTrailerLevel2() {
        return securityTrailerLevel2;
    }

    public void setSecurityTrailerLevel2(S4E securityTrailerLevel2) {
        this.securityTrailerLevel2 = securityTrailerLevel2;
    }

    public SE getTransactionSetTrailer() {
        return transactionSetTrailer;
    }

    public void setTransactionSetTrailer(SE transactionSetTrailer) {
        this.transactionSetTrailer = transactionSetTrailer;
    }

    public NM1 getIndividualorOrganizationalName() {
        return individualorOrganizationalName;
    }

    public void setIndividualorOrganizationalName(NM1 individualorOrganizationalName) {
        this.individualorOrganizationalName = individualorOrganizationalName;
    }

    public PER getAdministrativeCommunicationsContact() {
        return administrativeCommunicationsContact;
    }

    public void setAdministrativeCommunicationsContact(PER administrativeCommunicationsContact) {
        this.administrativeCommunicationsContact = administrativeCommunicationsContact;
    }

    public NM1 getIndividualorOrganizationalName1() {
        return individualorOrganizationalName1;
    }

    public void setIndividualorOrganizationalName1(NM1 individualorOrganizationalName1) {
        this.individualorOrganizationalName1 = individualorOrganizationalName1;
    }

    public HL getHierarchicalLevel() {
        return hierarchicalLevel;
    }

    public void setHierarchicalLevel(HL hierarchicalLevel) {
        this.hierarchicalLevel = hierarchicalLevel;
    }

    public PRV getProviderInformation() {
        return providerInformation;
    }

    public void setProviderInformation(PRV providerInformation) {
        this.providerInformation = providerInformation;
    }

    public SBR getSubscriberInformation() {
        return subscriberInformation;
    }

    public void setSubscriberInformation(SBR subscriberInformation) {
        this.subscriberInformation = subscriberInformation;
    }

    public PAT getPatientInformation() {
        return patientInformation;
    }

    public void setPatientInformation(PAT patientInformation) {
        this.patientInformation = patientInformation;
    }

    public DTP getDateorTimeorPeriod() {
        return dateorTimeorPeriod;
    }

    public void setDateorTimeorPeriod(DTP dateorTimeorPeriod) {
        this.dateorTimeorPeriod = dateorTimeorPeriod;
    }

    public CUR getCurrency() {
        return currency;
    }

    public void setCurrency(CUR currency) {
        this.currency = currency;
    }

    public NM1 getIndividualorOrganizationalName2() {
        return individualorOrganizationalName2;
    }

    public void setIndividualorOrganizationalName2(NM1 individualorOrganizationalName2) {
        this.individualorOrganizationalName2 = individualorOrganizationalName2;
    }

    public N3 getPartyLocation() {
        return partyLocation;
    }

    public void setPartyLocation(N3 partyLocation) {
        this.partyLocation = partyLocation;
    }

    public N4 getGeographicLocation() {
        return geographicLocation;
    }

    public void setGeographicLocation(N4 geographicLocation) {
        this.geographicLocation = geographicLocation;
    }

    public REF getReferenceInformation1() {
        return referenceInformation1;
    }

    public void setReferenceInformation1(REF referenceInformation1) {
        this.referenceInformation1 = referenceInformation1;
    }

    public PER getAdministrativeCommunicationsContact1() {
        return administrativeCommunicationsContact1;
    }

    public void setAdministrativeCommunicationsContact1(PER administrativeCommunicationsContact1) {
        this.administrativeCommunicationsContact1 = administrativeCommunicationsContact1;
    }

    public NM1 getIndividualorOrganizationalName3() {
        return individualorOrganizationalName3;
    }

    public void setIndividualorOrganizationalName3(NM1 individualorOrganizationalName3) {
        this.individualorOrganizationalName3 = individualorOrganizationalName3;
    }

    public N3 getPartyLocation1() {
        return partyLocation1;
    }

    public void setPartyLocation1(N3 partyLocation1) {
        this.partyLocation1 = partyLocation1;
    }

    public N4 getGeographicLocation1() {
        return geographicLocation1;
    }

    public void setGeographicLocation1(N4 geographicLocation1) {
        this.geographicLocation1 = geographicLocation1;
    }

    public REF getReferenceInformation2() {
        return referenceInformation2;
    }

    public void setReferenceInformation2(REF referenceInformation2) {
        this.referenceInformation2 = referenceInformation2;
    }

    public NM1 getIndividualorOrganizationalName4() {
        return individualorOrganizationalName4;
    }

    public void setIndividualorOrganizationalName4(NM1 individualorOrganizationalName4) {
        this.individualorOrganizationalName4 = individualorOrganizationalName4;
    }

    public N3 getPartyLocation2() {
        return partyLocation2;
    }

    public void setPartyLocation2(N3 partyLocation2) {
        this.partyLocation2 = partyLocation2;
    }

    public N4 getGeographicLocation2() {
        return geographicLocation2;
    }

    public void setGeographicLocation2(N4 geographicLocation2) {
        this.geographicLocation2 = geographicLocation2;
    }

    public REF getReferenceInformation3() {
        return referenceInformation3;
    }

    public void setReferenceInformation3(REF referenceInformation3) {
        this.referenceInformation3 = referenceInformation3;
    }

    public HL getHierarchicalLevel1() {
        return hierarchicalLevel1;
    }

    public void setHierarchicalLevel1(HL hierarchicalLevel1) {
        this.hierarchicalLevel1 = hierarchicalLevel1;
    }

    public SBR getSubscriberInformation1() {
        return subscriberInformation1;
    }

    public void setSubscriberInformation1(SBR subscriberInformation1) {
        this.subscriberInformation1 = subscriberInformation1;
    }

    public PAT getPatientInformation1() {
        return patientInformation1;
    }

    public void setPatientInformation1(PAT patientInformation1) {
        this.patientInformation1 = patientInformation1;
    }

    public NM1 getIndividualorOrganizationalName5() {
        return individualorOrganizationalName5;
    }

    public void setIndividualorOrganizationalName5(NM1 individualorOrganizationalName5) {
        this.individualorOrganizationalName5 = individualorOrganizationalName5;
    }

    public N3 getPartyLocation3() {
        return partyLocation3;
    }

    public void setPartyLocation3(N3 partyLocation3) {
        this.partyLocation3 = partyLocation3;
    }

    public N4 getGeographicLocation3() {
        return geographicLocation3;
    }

    public void setGeographicLocation3(N4 geographicLocation3) {
        this.geographicLocation3 = geographicLocation3;
    }

    public DMG getDemographicInformation() {
        return demographicInformation;
    }

    public void setDemographicInformation(DMG demographicInformation) {
        this.demographicInformation = demographicInformation;
    }

    public REF getReferenceInformation4() {
        return referenceInformation4;
    }

    public void setReferenceInformation4(REF referenceInformation4) {
        this.referenceInformation4 = referenceInformation4;
    }

    public PER getAdministrativeCommunicationsContact2() {
        return administrativeCommunicationsContact2;
    }

    public void setAdministrativeCommunicationsContact2(PER administrativeCommunicationsContact2) {
        this.administrativeCommunicationsContact2 = administrativeCommunicationsContact2;
    }

    public NM1 getIndividualorOrganizationalName6() {
        return individualorOrganizationalName6;
    }

    public void setIndividualorOrganizationalName6(NM1 individualorOrganizationalName6) {
        this.individualorOrganizationalName6 = individualorOrganizationalName6;
    }

    public N3 getPartyLocation4() {
        return partyLocation4;
    }

    public void setPartyLocation4(N3 partyLocation4) {
        this.partyLocation4 = partyLocation4;
    }

    public N4 getGeographicLocation4() {
        return geographicLocation4;
    }

    public void setGeographicLocation4(N4 geographicLocation4) {
        this.geographicLocation4 = geographicLocation4;
    }

    public DMG getDemographicInformation1() {
        return demographicInformation1;
    }

    public void setDemographicInformation1(DMG demographicInformation1) {
        this.demographicInformation1 = demographicInformation1;
    }

    public REF getReferenceInformation5() {
        return referenceInformation5;
    }

    public void setReferenceInformation5(REF referenceInformation5) {
        this.referenceInformation5 = referenceInformation5;
    }

    public PER getAdministrativeCommunicationsContact3() {
        return administrativeCommunicationsContact3;
    }

    public void setAdministrativeCommunicationsContact3(PER administrativeCommunicationsContact3) {
        this.administrativeCommunicationsContact3 = administrativeCommunicationsContact3;
    }

    public CLM getHealthClaim() {
        return healthClaim;
    }

    public void setHealthClaim(CLM healthClaim) {
        this.healthClaim = healthClaim;
    }

    public DTP getDateorTimeorPeriod1() {
        return dateorTimeorPeriod1;
    }

    public void setDateorTimeorPeriod1(DTP dateorTimeorPeriod1) {
        this.dateorTimeorPeriod1 = dateorTimeorPeriod1;
    }

    public CL1 getClaimCodes() {
        return claimCodes;
    }

    public void setClaimCodes(CL1 claimCodes) {
        this.claimCodes = claimCodes;
    }

    public DN1 getOrthodonticInformation() {
        return orthodonticInformation;
    }

    public void setOrthodonticInformation(DN1 orthodonticInformation) {
        this.orthodonticInformation = orthodonticInformation;
    }

    public DN2 getToothSummary() {
        return toothSummary;
    }

    public void setToothSummary(DN2 toothSummary) {
        this.toothSummary = toothSummary;
    }

    public PWK getPaperwork() {
        return paperwork;
    }

    public void setPaperwork(PWK paperwork) {
        this.paperwork = paperwork;
    }

    public CN1 getContractInformation() {
        return contractInformation;
    }

    public void setContractInformation(CN1 contractInformation) {
        this.contractInformation = contractInformation;
    }

    public DSB getDisabilityInformation() {
        return disabilityInformation;
    }

    public void setDisabilityInformation(DSB disabilityInformation) {
        this.disabilityInformation = disabilityInformation;
    }

    public UR getPeerReviewOrganizationorUtilizationReview() {
        return peerReviewOrganizationorUtilizationReview;
    }

    public void setPeerReviewOrganizationorUtilizationReview(UR peerReviewOrganizationorUtilizationReview) {
        this.peerReviewOrganizationorUtilizationReview = peerReviewOrganizationorUtilizationReview;
    }

    public AMT getMonetaryAmountInformation() {
        return monetaryAmountInformation;
    }

    public void setMonetaryAmountInformation(AMT monetaryAmountInformation) {
        this.monetaryAmountInformation = monetaryAmountInformation;
    }

    public String toString() { return ReflectionToStringBuilder.toString(this);}
}

