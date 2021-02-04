package io.connectedhealth_idaas.eventbuilder.builders.edi.hipaa;
import io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HealthcareServicesReview_278 {
private ST transactionSetHeader;
private S4S securityHeaderLevel2;
private S4A assuranceHeaderLevel2;
private BHT beginningofHierarchicalTransaction;
private HL hierarchicalLevel;
private TRN trace;
private AAA requestValidation;
private UM healthCareServicesReviewInformation;
private HCR healthCareServicesReview;
private REF referenceInformation;
private DTP dateorTimeorPeriod;
private HI healthCareInformationCodes;
private SV1 professionalService;
private SV2 institutionalService;
private SV3 dentalService;
private TOO toothIdentification;
private HSD healthCareServicesDelivery;
private CRC conditionsIndicator;
private CL1 claimCodes;
private CR1 ambulanceCertification;
private CR2 chiropracticCertification;
private CR5 oxygenTherapyCertification;
private CR6 homeHealthCareCertification;
private PWK paperwork;
private MSG messageText;
private NM1 individualorOrganizationalName;
private REF referenceInformation1;
private N3 partyLocation;
private N4 geographicLocation;
private PER administrativeCommunicationsContact;
private AAA requestValidation1;
private PRV providerInformation;
private DMG demographicInformation;
private INS insuredBenefit;
private DTP dateorTimeorPeriod1;
private HL hierarchicalLevel1;
private TRN trace1;
private AAA requestValidation2;
private UM healthCareServicesReviewInformation1;
private HCR healthCareServicesReview1;
private REF getReferenceInformation2;
private DTP dateorTimeorPeriod2;
private HI healthCareInformationCodes1;
private SV1 professionalService1;
private SV2 institutionalService1;
private SV3 dentalService1;
private TOO toothIdentification1;
private HSD healthCareServicesDelivery1;
private CRC conditionsIndicator1;
private CL1 claimCodes1;
private CR1 ambulanceCertification1;
private CR2 chiropracticCertification1;
private CR5 oxygenTherapyCertification1;
private CR6 homeHealthCareCertification1;
private PWK paperwork1;
private MSG messageText1;
private NM1 individualorOrganizationalName1;
private REF referenceInformation3;
private N3 partyLocation1;
private N4 geographicLocation1;
private PER administrativeCommunicationsContact1;
private AAA requestValidation3;
private PRV providerInformation1;
private DMG demographicInformation1;
private INS insuredBenefit1;
private DTP dateorTimeorPeriod3;
private HL hierarchicalLevel2;
private TRN trace2;
private AAA requestValidation4;
private UM healthCareServicesReviewInformation2;
private HCR healthCareServicesReview2;
private REF referenceInformation4;
private DTP dateorTimeorPeriod4;
private HI healthCareInformationCodes2;
private SV1 professionalService2;
private SV2 institutionalService2;
private SV3 dentalService2;
private TOO toothIdentification2;
private HSD healthCareServicesDelivery2;
private CRC conditionsIndicator2;
private CL1 claimCodes2;
private CR1 ambulanceCertification2;
private CR2 chiropracticCertification2;
private CR5 oxygenTherapyCertification2;
private CR6 homeHealthCareCertification2;
private PWK paperwork2;
private MSG messageText2;
private NM1 individualorOrganizationalName2;
private REF referenceInformation5;
private N3 partyLocation2;
private N4 geographicLocation2;
private PER administrativeCommunicationsContact2;
private AAA requestValidation5;
private PRV providerInformation2;
private DMG demographicInformation2;
private INS insuredBenefit2;
private DTP dateorTimeorPeriod5;
private HL hierarchicalLevel3;
private TRN trace3;
private AAA requestValidation6;
private UM healthCareServicesReviewInformation3;
private HCR healthCareServicesReview3;
private REF referenceInformation6;
private DTP dateorTimeorPeriod6;
private HI healthCareInformationCodes3;
private SV1 professionalService3;
private SV2 institutionalService3;
private SV3 dentalService3;
private TOO toothIdentification3;
private HSD healthCareServicesDelivery3;
private CRC conditionsIndicator3;
private CL1 claimCodes3;
private CR1 ambulanceCertification3;
private CR2 chiropracticCertification3;
private CR5 oxygenTherapyCertification3;
private CR6 homeHealthCareCertification3;
private PWK paperwork3;
private MSG messageText3;
private NM1 individualorOrganizationalName3;
private REF referenceInformation7;
private N3 partyLocation3;
private N4 geographicLocation3;
private PER administrativeCommunicationsContact3;
private AAA requestValidation7;
private PRV providerInformation3;
private DMG demographicInformation3;
private INS insuredBenefit3;
private DTP dateorTimeorPeriod7;
private HL hierarchicalLevel4;
private TRN trace4;
private AAA requestValidation8;
private UM healthCareServicesReviewInformation4;
private HCR healthCareServicesReview4;
private REF referenceInformation8;
private DTP dateorTimeorPeriod8;
private HI healthCareInformationCodes4;
private SV1 professionalService4;
private SV2 institutionalService4;
private SV3 dentalService4;
private TOO toothIdentification4;
private HSD healthCareServicesDelivery4;
private CRC conditionsIndicator4;
private CL1 claimCodes4;
private CR1 ambulanceCertification4;
private CR2 chiropracticCertification4;
private CR5 oxygenTherapyCertification4;
private CR6 homeHealthCareCertification4;
private PWK paperwork4;
private MSG messageText4;
private NM1 individualorOrganizationalName4;
private REF referenceInformation9;
private N3 partyLocation4;
private N4 geographicLocation4;
private PER administrativeCommunicationsContact4;
private AAA requestValidation9;
private PRV providerInformation4;
private DMG demographicInformation4;
private INS insuredBenefit4;
private DTP dateorTimeorPeriod9;
private HL hierarchicalLevel5;
private TRN trace5;
private AAA requestValidation10;
private UM healthCareServicesReviewInformation5;
private HCR healthCareServicesReview5;
private REF referenceInformation10;
private DTP dateorTimeorPeriod10;
private HI healthCareInformationCodes5;
private SV1 professionalService5;
private SV2 institutionalService5;
private SV3 dentalService5;
private TOO toothIdentification5;
private HSD healthCareServicesDelivery5;
private CRC conditionsIndicator5;
private CL1 claimCodes5;
private CR1 ambulanceCertification5;
private CR2 chiropracticCertification5;
private CR5 oxygenTherapyCertification5;
private CR6 homeHealthCareCertification5;
private PWK paperwork5;
private MSG messageText5;
private NM1 individualorOrganizationalName5;
private REF referenceInformation11;
private N3 partyLocation5;
private N4 geographicLocation5;
private PER administrativeCommunicationsContact5;
private AAA requestValidation11;
private PRV providerInformation5;
private DMG demographicInformation5;
private INS insuredBenefit5;
private DTP dateorTimeorPeriod11;
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

    public HL getHierarchicalLevel() {
        return hierarchicalLevel;
    }

    public void setHierarchicalLevel(HL hierarchicalLevel) {
        this.hierarchicalLevel = hierarchicalLevel;
    }

    public TRN getTrace() {
        return trace;
    }

    public void setTrace(TRN trace) {
        this.trace = trace;
    }

    public AAA getRequestValidation() {
        return requestValidation;
    }

    public void setRequestValidation(AAA requestValidation) {
        this.requestValidation = requestValidation;
    }

    public UM getHealthCareServicesReviewInformation() {
        return healthCareServicesReviewInformation;
    }

    public void setHealthCareServicesReviewInformation(UM healthCareServicesReviewInformation) {
        this.healthCareServicesReviewInformation = healthCareServicesReviewInformation;
    }

    public HCR getHealthCareServicesReview() {
        return healthCareServicesReview;
    }

    public void setHealthCareServicesReview(HCR healthCareServicesReview) {
        this.healthCareServicesReview = healthCareServicesReview;
    }

    public REF getReferenceInformation() {
        return referenceInformation;
    }

    public void setReferenceInformation(REF referenceInformation) {
        this.referenceInformation = referenceInformation;
    }

    public DTP getDateorTimeorPeriod() {
        return dateorTimeorPeriod;
    }

    public void setDateorTimeorPeriod(DTP dateorTimeorPeriod) {
        this.dateorTimeorPeriod = dateorTimeorPeriod;
    }

    public HI getHealthCareInformationCodes() {
        return healthCareInformationCodes;
    }

    public void setHealthCareInformationCodes(HI healthCareInformationCodes) {
        this.healthCareInformationCodes = healthCareInformationCodes;
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

    public HSD getHealthCareServicesDelivery() {
        return healthCareServicesDelivery;
    }

    public void setHealthCareServicesDelivery(HSD healthCareServicesDelivery) {
        this.healthCareServicesDelivery = healthCareServicesDelivery;
    }

    public CRC getConditionsIndicator() {
        return conditionsIndicator;
    }

    public void setConditionsIndicator(CRC conditionsIndicator) {
        this.conditionsIndicator = conditionsIndicator;
    }

    public CL1 getClaimCodes() {
        return claimCodes;
    }

    public void setClaimCodes(CL1 claimCodes) {
        this.claimCodes = claimCodes;
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

    public PWK getPaperwork() {
        return paperwork;
    }

    public void setPaperwork(PWK paperwork) {
        this.paperwork = paperwork;
    }

    public MSG getMessageText() {
        return messageText;
    }

    public void setMessageText(MSG messageText) {
        this.messageText = messageText;
    }

    public NM1 getIndividualorOrganizationalName() {
        return individualorOrganizationalName;
    }

    public void setIndividualorOrganizationalName(NM1 individualorOrganizationalName) {
        this.individualorOrganizationalName = individualorOrganizationalName;
    }

    public REF getReferenceInformation1() {
        return referenceInformation1;
    }

    public void setReferenceInformation1(REF referenceInformation1) {
        this.referenceInformation1 = referenceInformation1;
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

    public PER getAdministrativeCommunicationsContact() {
        return administrativeCommunicationsContact;
    }

    public void setAdministrativeCommunicationsContact(PER administrativeCommunicationsContact) {
        this.administrativeCommunicationsContact = administrativeCommunicationsContact;
    }

    public AAA getRequestValidation1() {
        return requestValidation1;
    }

    public void setRequestValidation1(AAA requestValidation1) {
        this.requestValidation1 = requestValidation1;
    }

    public PRV getProviderInformation() {
        return providerInformation;
    }

    public void setProviderInformation(PRV providerInformation) {
        this.providerInformation = providerInformation;
    }

    public DMG getDemographicInformation() {
        return demographicInformation;
    }

    public void setDemographicInformation(DMG demographicInformation) {
        this.demographicInformation = demographicInformation;
    }

    public INS getInsuredBenefit() {
        return insuredBenefit;
    }

    public void setInsuredBenefit(INS insuredBenefit) {
        this.insuredBenefit = insuredBenefit;
    }

    public DTP getDateorTimeorPeriod1() {
        return dateorTimeorPeriod1;
    }

    public void setDateorTimeorPeriod1(DTP dateorTimeorPeriod1) {
        this.dateorTimeorPeriod1 = dateorTimeorPeriod1;
    }

    public HL getHierarchicalLevel1() {
        return hierarchicalLevel1;
    }

    public void setHierarchicalLevel1(HL hierarchicalLevel1) {
        this.hierarchicalLevel1 = hierarchicalLevel1;
    }

    public TRN getTrace1() {
        return trace1;
    }

    public void setTrace1(TRN trace1) {
        this.trace1 = trace1;
    }

    public AAA getRequestValidation2() {
        return requestValidation2;
    }

    public void setRequestValidation2(AAA requestValidation2) {
        this.requestValidation2 = requestValidation2;
    }

    public UM getHealthCareServicesReviewInformation1() {
        return healthCareServicesReviewInformation1;
    }

    public void setHealthCareServicesReviewInformation1(UM healthCareServicesReviewInformation1) {
        this.healthCareServicesReviewInformation1 = healthCareServicesReviewInformation1;
    }

    public HCR getHealthCareServicesReview1() {
        return healthCareServicesReview1;
    }

    public void setHealthCareServicesReview1(HCR healthCareServicesReview1) {
        this.healthCareServicesReview1 = healthCareServicesReview1;
    }

    public REF getGetReferenceInformation2() {
        return getReferenceInformation2;
    }

    public void setGetReferenceInformation2(REF getReferenceInformation2) {
        this.getReferenceInformation2 = getReferenceInformation2;
    }

    public DTP getDateorTimeorPeriod2() {
        return dateorTimeorPeriod2;
    }

    public void setDateorTimeorPeriod2(DTP dateorTimeorPeriod2) {
        this.dateorTimeorPeriod2 = dateorTimeorPeriod2;
    }

    public HI getHealthCareInformationCodes1() {
        return healthCareInformationCodes1;
    }

    public void setHealthCareInformationCodes1(HI healthCareInformationCodes1) {
        this.healthCareInformationCodes1 = healthCareInformationCodes1;
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

    public HSD getHealthCareServicesDelivery1() {
        return healthCareServicesDelivery1;
    }

    public void setHealthCareServicesDelivery1(HSD healthCareServicesDelivery1) {
        this.healthCareServicesDelivery1 = healthCareServicesDelivery1;
    }

    public CRC getConditionsIndicator1() {
        return conditionsIndicator1;
    }

    public void setConditionsIndicator1(CRC conditionsIndicator1) {
        this.conditionsIndicator1 = conditionsIndicator1;
    }

    public CL1 getClaimCodes1() {
        return claimCodes1;
    }

    public void setClaimCodes1(CL1 claimCodes1) {
        this.claimCodes1 = claimCodes1;
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

    public CR5 getOxygenTherapyCertification1() {
        return oxygenTherapyCertification1;
    }

    public void setOxygenTherapyCertification1(CR5 oxygenTherapyCertification1) {
        this.oxygenTherapyCertification1 = oxygenTherapyCertification1;
    }

    public CR6 getHomeHealthCareCertification1() {
        return homeHealthCareCertification1;
    }

    public void setHomeHealthCareCertification1(CR6 homeHealthCareCertification1) {
        this.homeHealthCareCertification1 = homeHealthCareCertification1;
    }

    public PWK getPaperwork1() {
        return paperwork1;
    }

    public void setPaperwork1(PWK paperwork1) {
        this.paperwork1 = paperwork1;
    }

    public MSG getMessageText1() {
        return messageText1;
    }

    public void setMessageText1(MSG messageText1) {
        this.messageText1 = messageText1;
    }

    public NM1 getIndividualorOrganizationalName1() {
        return individualorOrganizationalName1;
    }

    public void setIndividualorOrganizationalName1(NM1 individualorOrganizationalName1) {
        this.individualorOrganizationalName1 = individualorOrganizationalName1;
    }

    public REF getReferenceInformation3() {
        return referenceInformation3;
    }

    public void setReferenceInformation3(REF referenceInformation3) {
        this.referenceInformation3 = referenceInformation3;
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

    public PER getAdministrativeCommunicationsContact1() {
        return administrativeCommunicationsContact1;
    }

    public void setAdministrativeCommunicationsContact1(PER administrativeCommunicationsContact1) {
        this.administrativeCommunicationsContact1 = administrativeCommunicationsContact1;
    }

    public AAA getRequestValidation3() {
        return requestValidation3;
    }

    public void setRequestValidation3(AAA requestValidation3) {
        this.requestValidation3 = requestValidation3;
    }

    public PRV getProviderInformation1() {
        return providerInformation1;
    }

    public void setProviderInformation1(PRV providerInformation1) {
        this.providerInformation1 = providerInformation1;
    }

    public DMG getDemographicInformation1() {
        return demographicInformation1;
    }

    public void setDemographicInformation1(DMG demographicInformation1) {
        this.demographicInformation1 = demographicInformation1;
    }

    public INS getInsuredBenefit1() {
        return insuredBenefit1;
    }

    public void setInsuredBenefit1(INS insuredBenefit1) {
        this.insuredBenefit1 = insuredBenefit1;
    }

    public DTP getDateorTimeorPeriod3() {
        return dateorTimeorPeriod3;
    }

    public void setDateorTimeorPeriod3(DTP dateorTimeorPeriod3) {
        this.dateorTimeorPeriod3 = dateorTimeorPeriod3;
    }

    public HL getHierarchicalLevel2() {
        return hierarchicalLevel2;
    }

    public void setHierarchicalLevel2(HL hierarchicalLevel2) {
        this.hierarchicalLevel2 = hierarchicalLevel2;
    }

    public TRN getTrace2() {
        return trace2;
    }

    public void setTrace2(TRN trace2) {
        this.trace2 = trace2;
    }

    public AAA getRequestValidation4() {
        return requestValidation4;
    }

    public void setRequestValidation4(AAA requestValidation4) {
        this.requestValidation4 = requestValidation4;
    }

    public UM getHealthCareServicesReviewInformation2() {
        return healthCareServicesReviewInformation2;
    }

    public void setHealthCareServicesReviewInformation2(UM healthCareServicesReviewInformation2) {
        this.healthCareServicesReviewInformation2 = healthCareServicesReviewInformation2;
    }

    public HCR getHealthCareServicesReview2() {
        return healthCareServicesReview2;
    }

    public void setHealthCareServicesReview2(HCR healthCareServicesReview2) {
        this.healthCareServicesReview2 = healthCareServicesReview2;
    }

    public REF getReferenceInformation4() {
        return referenceInformation4;
    }

    public void setReferenceInformation4(REF referenceInformation4) {
        this.referenceInformation4 = referenceInformation4;
    }

    public DTP getDateorTimeorPeriod4() {
        return dateorTimeorPeriod4;
    }

    public void setDateorTimeorPeriod4(DTP dateorTimeorPeriod4) {
        this.dateorTimeorPeriod4 = dateorTimeorPeriod4;
    }

    public HI getHealthCareInformationCodes2() {
        return healthCareInformationCodes2;
    }

    public void setHealthCareInformationCodes2(HI healthCareInformationCodes2) {
        this.healthCareInformationCodes2 = healthCareInformationCodes2;
    }

    public SV1 getProfessionalService2() {
        return professionalService2;
    }

    public void setProfessionalService2(SV1 professionalService2) {
        this.professionalService2 = professionalService2;
    }

    public SV2 getInstitutionalService2() {
        return institutionalService2;
    }

    public void setInstitutionalService2(SV2 institutionalService2) {
        this.institutionalService2 = institutionalService2;
    }

    public SV3 getDentalService2() {
        return dentalService2;
    }

    public void setDentalService2(SV3 dentalService2) {
        this.dentalService2 = dentalService2;
    }

    public TOO getToothIdentification2() {
        return toothIdentification2;
    }

    public void setToothIdentification2(TOO toothIdentification2) {
        this.toothIdentification2 = toothIdentification2;
    }

    public HSD getHealthCareServicesDelivery2() {
        return healthCareServicesDelivery2;
    }

    public void setHealthCareServicesDelivery2(HSD healthCareServicesDelivery2) {
        this.healthCareServicesDelivery2 = healthCareServicesDelivery2;
    }

    public CRC getConditionsIndicator2() {
        return conditionsIndicator2;
    }

    public void setConditionsIndicator2(CRC conditionsIndicator2) {
        this.conditionsIndicator2 = conditionsIndicator2;
    }

    public CL1 getClaimCodes2() {
        return claimCodes2;
    }

    public void setClaimCodes2(CL1 claimCodes2) {
        this.claimCodes2 = claimCodes2;
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

    public CR5 getOxygenTherapyCertification2() {
        return oxygenTherapyCertification2;
    }

    public void setOxygenTherapyCertification2(CR5 oxygenTherapyCertification2) {
        this.oxygenTherapyCertification2 = oxygenTherapyCertification2;
    }

    public CR6 getHomeHealthCareCertification2() {
        return homeHealthCareCertification2;
    }

    public void setHomeHealthCareCertification2(CR6 homeHealthCareCertification2) {
        this.homeHealthCareCertification2 = homeHealthCareCertification2;
    }

    public PWK getPaperwork2() {
        return paperwork2;
    }

    public void setPaperwork2(PWK paperwork2) {
        this.paperwork2 = paperwork2;
    }

    public MSG getMessageText2() {
        return messageText2;
    }

    public void setMessageText2(MSG messageText2) {
        this.messageText2 = messageText2;
    }

    public NM1 getIndividualorOrganizationalName2() {
        return individualorOrganizationalName2;
    }

    public void setIndividualorOrganizationalName2(NM1 individualorOrganizationalName2) {
        this.individualorOrganizationalName2 = individualorOrganizationalName2;
    }

    public REF getReferenceInformation5() {
        return referenceInformation5;
    }

    public void setReferenceInformation5(REF referenceInformation5) {
        this.referenceInformation5 = referenceInformation5;
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

    public PER getAdministrativeCommunicationsContact2() {
        return administrativeCommunicationsContact2;
    }

    public void setAdministrativeCommunicationsContact2(PER administrativeCommunicationsContact2) {
        this.administrativeCommunicationsContact2 = administrativeCommunicationsContact2;
    }

    public AAA getRequestValidation5() {
        return requestValidation5;
    }

    public void setRequestValidation5(AAA requestValidation5) {
        this.requestValidation5 = requestValidation5;
    }

    public PRV getProviderInformation2() {
        return providerInformation2;
    }

    public void setProviderInformation2(PRV providerInformation2) {
        this.providerInformation2 = providerInformation2;
    }

    public DMG getDemographicInformation2() {
        return demographicInformation2;
    }

    public void setDemographicInformation2(DMG demographicInformation2) {
        this.demographicInformation2 = demographicInformation2;
    }

    public INS getInsuredBenefit2() {
        return insuredBenefit2;
    }

    public void setInsuredBenefit2(INS insuredBenefit2) {
        this.insuredBenefit2 = insuredBenefit2;
    }

    public DTP getDateorTimeorPeriod5() {
        return dateorTimeorPeriod5;
    }

    public void setDateorTimeorPeriod5(DTP dateorTimeorPeriod5) {
        this.dateorTimeorPeriod5 = dateorTimeorPeriod5;
    }

    public HL getHierarchicalLevel3() {
        return hierarchicalLevel3;
    }

    public void setHierarchicalLevel3(HL hierarchicalLevel3) {
        this.hierarchicalLevel3 = hierarchicalLevel3;
    }

    public TRN getTrace3() {
        return trace3;
    }

    public void setTrace3(TRN trace3) {
        this.trace3 = trace3;
    }

    public AAA getRequestValidation6() {
        return requestValidation6;
    }

    public void setRequestValidation6(AAA requestValidation6) {
        this.requestValidation6 = requestValidation6;
    }

    public UM getHealthCareServicesReviewInformation3() {
        return healthCareServicesReviewInformation3;
    }

    public void setHealthCareServicesReviewInformation3(UM healthCareServicesReviewInformation3) {
        this.healthCareServicesReviewInformation3 = healthCareServicesReviewInformation3;
    }

    public HCR getHealthCareServicesReview3() {
        return healthCareServicesReview3;
    }

    public void setHealthCareServicesReview3(HCR healthCareServicesReview3) {
        this.healthCareServicesReview3 = healthCareServicesReview3;
    }

    public REF getReferenceInformation6() {
        return referenceInformation6;
    }

    public void setReferenceInformation6(REF referenceInformation6) {
        this.referenceInformation6 = referenceInformation6;
    }

    public DTP getDateorTimeorPeriod6() {
        return dateorTimeorPeriod6;
    }

    public void setDateorTimeorPeriod6(DTP dateorTimeorPeriod6) {
        this.dateorTimeorPeriod6 = dateorTimeorPeriod6;
    }

    public HI getHealthCareInformationCodes3() {
        return healthCareInformationCodes3;
    }

    public void setHealthCareInformationCodes3(HI healthCareInformationCodes3) {
        this.healthCareInformationCodes3 = healthCareInformationCodes3;
    }

    public SV1 getProfessionalService3() {
        return professionalService3;
    }

    public void setProfessionalService3(SV1 professionalService3) {
        this.professionalService3 = professionalService3;
    }

    public SV2 getInstitutionalService3() {
        return institutionalService3;
    }

    public void setInstitutionalService3(SV2 institutionalService3) {
        this.institutionalService3 = institutionalService3;
    }

    public SV3 getDentalService3() {
        return dentalService3;
    }

    public void setDentalService3(SV3 dentalService3) {
        this.dentalService3 = dentalService3;
    }

    public TOO getToothIdentification3() {
        return toothIdentification3;
    }

    public void setToothIdentification3(TOO toothIdentification3) {
        this.toothIdentification3 = toothIdentification3;
    }

    public HSD getHealthCareServicesDelivery3() {
        return healthCareServicesDelivery3;
    }

    public void setHealthCareServicesDelivery3(HSD healthCareServicesDelivery3) {
        this.healthCareServicesDelivery3 = healthCareServicesDelivery3;
    }

    public CRC getConditionsIndicator3() {
        return conditionsIndicator3;
    }

    public void setConditionsIndicator3(CRC conditionsIndicator3) {
        this.conditionsIndicator3 = conditionsIndicator3;
    }

    public CL1 getClaimCodes3() {
        return claimCodes3;
    }

    public void setClaimCodes3(CL1 claimCodes3) {
        this.claimCodes3 = claimCodes3;
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

    public CR5 getOxygenTherapyCertification3() {
        return oxygenTherapyCertification3;
    }

    public void setOxygenTherapyCertification3(CR5 oxygenTherapyCertification3) {
        this.oxygenTherapyCertification3 = oxygenTherapyCertification3;
    }

    public CR6 getHomeHealthCareCertification3() {
        return homeHealthCareCertification3;
    }

    public void setHomeHealthCareCertification3(CR6 homeHealthCareCertification3) {
        this.homeHealthCareCertification3 = homeHealthCareCertification3;
    }

    public PWK getPaperwork3() {
        return paperwork3;
    }

    public void setPaperwork3(PWK paperwork3) {
        this.paperwork3 = paperwork3;
    }

    public MSG getMessageText3() {
        return messageText3;
    }

    public void setMessageText3(MSG messageText3) {
        this.messageText3 = messageText3;
    }

    public NM1 getIndividualorOrganizationalName3() {
        return individualorOrganizationalName3;
    }

    public void setIndividualorOrganizationalName3(NM1 individualorOrganizationalName3) {
        this.individualorOrganizationalName3 = individualorOrganizationalName3;
    }

    public REF getReferenceInformation7() {
        return referenceInformation7;
    }

    public void setReferenceInformation7(REF referenceInformation7) {
        this.referenceInformation7 = referenceInformation7;
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

    public PER getAdministrativeCommunicationsContact3() {
        return administrativeCommunicationsContact3;
    }

    public void setAdministrativeCommunicationsContact3(PER administrativeCommunicationsContact3) {
        this.administrativeCommunicationsContact3 = administrativeCommunicationsContact3;
    }

    public AAA getRequestValidation7() {
        return requestValidation7;
    }

    public void setRequestValidation7(AAA requestValidation7) {
        this.requestValidation7 = requestValidation7;
    }

    public PRV getProviderInformation3() {
        return providerInformation3;
    }

    public void setProviderInformation3(PRV providerInformation3) {
        this.providerInformation3 = providerInformation3;
    }

    public DMG getDemographicInformation3() {
        return demographicInformation3;
    }

    public void setDemographicInformation3(DMG demographicInformation3) {
        this.demographicInformation3 = demographicInformation3;
    }

    public INS getInsuredBenefit3() {
        return insuredBenefit3;
    }

    public void setInsuredBenefit3(INS insuredBenefit3) {
        this.insuredBenefit3 = insuredBenefit3;
    }

    public DTP getDateorTimeorPeriod7() {
        return dateorTimeorPeriod7;
    }

    public void setDateorTimeorPeriod7(DTP dateorTimeorPeriod7) {
        this.dateorTimeorPeriod7 = dateorTimeorPeriod7;
    }

    public HL getHierarchicalLevel4() {
        return hierarchicalLevel4;
    }

    public void setHierarchicalLevel4(HL hierarchicalLevel4) {
        this.hierarchicalLevel4 = hierarchicalLevel4;
    }

    public TRN getTrace4() {
        return trace4;
    }

    public void setTrace4(TRN trace4) {
        this.trace4 = trace4;
    }

    public AAA getRequestValidation8() {
        return requestValidation8;
    }

    public void setRequestValidation8(AAA requestValidation8) {
        this.requestValidation8 = requestValidation8;
    }

    public UM getHealthCareServicesReviewInformation4() {
        return healthCareServicesReviewInformation4;
    }

    public void setHealthCareServicesReviewInformation4(UM healthCareServicesReviewInformation4) {
        this.healthCareServicesReviewInformation4 = healthCareServicesReviewInformation4;
    }

    public HCR getHealthCareServicesReview4() {
        return healthCareServicesReview4;
    }

    public void setHealthCareServicesReview4(HCR healthCareServicesReview4) {
        this.healthCareServicesReview4 = healthCareServicesReview4;
    }

    public REF getReferenceInformation8() {
        return referenceInformation8;
    }

    public void setReferenceInformation8(REF referenceInformation8) {
        this.referenceInformation8 = referenceInformation8;
    }

    public DTP getDateorTimeorPeriod8() {
        return dateorTimeorPeriod8;
    }

    public void setDateorTimeorPeriod8(DTP dateorTimeorPeriod8) {
        this.dateorTimeorPeriod8 = dateorTimeorPeriod8;
    }

    public HI getHealthCareInformationCodes4() {
        return healthCareInformationCodes4;
    }

    public void setHealthCareInformationCodes4(HI healthCareInformationCodes4) {
        this.healthCareInformationCodes4 = healthCareInformationCodes4;
    }

    public SV1 getProfessionalService4() {
        return professionalService4;
    }

    public void setProfessionalService4(SV1 professionalService4) {
        this.professionalService4 = professionalService4;
    }

    public SV2 getInstitutionalService4() {
        return institutionalService4;
    }

    public void setInstitutionalService4(SV2 institutionalService4) {
        this.institutionalService4 = institutionalService4;
    }

    public SV3 getDentalService4() {
        return dentalService4;
    }

    public void setDentalService4(SV3 dentalService4) {
        this.dentalService4 = dentalService4;
    }

    public TOO getToothIdentification4() {
        return toothIdentification4;
    }

    public void setToothIdentification4(TOO toothIdentification4) {
        this.toothIdentification4 = toothIdentification4;
    }

    public HSD getHealthCareServicesDelivery4() {
        return healthCareServicesDelivery4;
    }

    public void setHealthCareServicesDelivery4(HSD healthCareServicesDelivery4) {
        this.healthCareServicesDelivery4 = healthCareServicesDelivery4;
    }

    public CRC getConditionsIndicator4() {
        return conditionsIndicator4;
    }

    public void setConditionsIndicator4(CRC conditionsIndicator4) {
        this.conditionsIndicator4 = conditionsIndicator4;
    }

    public CL1 getClaimCodes4() {
        return claimCodes4;
    }

    public void setClaimCodes4(CL1 claimCodes4) {
        this.claimCodes4 = claimCodes4;
    }

    public CR1 getAmbulanceCertification4() {
        return ambulanceCertification4;
    }

    public void setAmbulanceCertification4(CR1 ambulanceCertification4) {
        this.ambulanceCertification4 = ambulanceCertification4;
    }

    public CR2 getChiropracticCertification4() {
        return chiropracticCertification4;
    }

    public void setChiropracticCertification4(CR2 chiropracticCertification4) {
        this.chiropracticCertification4 = chiropracticCertification4;
    }

    public CR5 getOxygenTherapyCertification4() {
        return oxygenTherapyCertification4;
    }

    public void setOxygenTherapyCertification4(CR5 oxygenTherapyCertification4) {
        this.oxygenTherapyCertification4 = oxygenTherapyCertification4;
    }

    public CR6 getHomeHealthCareCertification4() {
        return homeHealthCareCertification4;
    }

    public void setHomeHealthCareCertification4(CR6 homeHealthCareCertification4) {
        this.homeHealthCareCertification4 = homeHealthCareCertification4;
    }

    public PWK getPaperwork4() {
        return paperwork4;
    }

    public void setPaperwork4(PWK paperwork4) {
        this.paperwork4 = paperwork4;
    }

    public MSG getMessageText4() {
        return messageText4;
    }

    public void setMessageText4(MSG messageText4) {
        this.messageText4 = messageText4;
    }

    public NM1 getIndividualorOrganizationalName4() {
        return individualorOrganizationalName4;
    }

    public void setIndividualorOrganizationalName4(NM1 individualorOrganizationalName4) {
        this.individualorOrganizationalName4 = individualorOrganizationalName4;
    }

    public REF getReferenceInformation9() {
        return referenceInformation9;
    }

    public void setReferenceInformation9(REF referenceInformation9) {
        this.referenceInformation9 = referenceInformation9;
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

    public PER getAdministrativeCommunicationsContact4() {
        return administrativeCommunicationsContact4;
    }

    public void setAdministrativeCommunicationsContact4(PER administrativeCommunicationsContact4) {
        this.administrativeCommunicationsContact4 = administrativeCommunicationsContact4;
    }

    public AAA getRequestValidation9() {
        return requestValidation9;
    }

    public void setRequestValidation9(AAA requestValidation9) {
        this.requestValidation9 = requestValidation9;
    }

    public PRV getProviderInformation4() {
        return providerInformation4;
    }

    public void setProviderInformation4(PRV providerInformation4) {
        this.providerInformation4 = providerInformation4;
    }

    public DMG getDemographicInformation4() {
        return demographicInformation4;
    }

    public void setDemographicInformation4(DMG demographicInformation4) {
        this.demographicInformation4 = demographicInformation4;
    }

    public INS getInsuredBenefit4() {
        return insuredBenefit4;
    }

    public void setInsuredBenefit4(INS insuredBenefit4) {
        this.insuredBenefit4 = insuredBenefit4;
    }

    public DTP getDateorTimeorPeriod9() {
        return dateorTimeorPeriod9;
    }

    public void setDateorTimeorPeriod9(DTP dateorTimeorPeriod9) {
        this.dateorTimeorPeriod9 = dateorTimeorPeriod9;
    }

    public HL getHierarchicalLevel5() {
        return hierarchicalLevel5;
    }

    public void setHierarchicalLevel5(HL hierarchicalLevel5) {
        this.hierarchicalLevel5 = hierarchicalLevel5;
    }

    public TRN getTrace5() {
        return trace5;
    }

    public void setTrace5(TRN trace5) {
        this.trace5 = trace5;
    }

    public AAA getRequestValidation10() {
        return requestValidation10;
    }

    public void setRequestValidation10(AAA requestValidation10) {
        this.requestValidation10 = requestValidation10;
    }

    public UM getHealthCareServicesReviewInformation5() {
        return healthCareServicesReviewInformation5;
    }

    public void setHealthCareServicesReviewInformation5(UM healthCareServicesReviewInformation5) {
        this.healthCareServicesReviewInformation5 = healthCareServicesReviewInformation5;
    }

    public HCR getHealthCareServicesReview5() {
        return healthCareServicesReview5;
    }

    public void setHealthCareServicesReview5(HCR healthCareServicesReview5) {
        this.healthCareServicesReview5 = healthCareServicesReview5;
    }

    public REF getReferenceInformation10() {
        return referenceInformation10;
    }

    public void setReferenceInformation10(REF referenceInformation10) {
        this.referenceInformation10 = referenceInformation10;
    }

    public DTP getDateorTimeorPeriod10() {
        return dateorTimeorPeriod10;
    }

    public void setDateorTimeorPeriod10(DTP dateorTimeorPeriod10) {
        this.dateorTimeorPeriod10 = dateorTimeorPeriod10;
    }

    public HI getHealthCareInformationCodes5() {
        return healthCareInformationCodes5;
    }

    public void setHealthCareInformationCodes5(HI healthCareInformationCodes5) {
        this.healthCareInformationCodes5 = healthCareInformationCodes5;
    }

    public SV1 getProfessionalService5() {
        return professionalService5;
    }

    public void setProfessionalService5(SV1 professionalService5) {
        this.professionalService5 = professionalService5;
    }

    public SV2 getInstitutionalService5() {
        return institutionalService5;
    }

    public void setInstitutionalService5(SV2 institutionalService5) {
        this.institutionalService5 = institutionalService5;
    }

    public SV3 getDentalService5() {
        return dentalService5;
    }

    public void setDentalService5(SV3 dentalService5) {
        this.dentalService5 = dentalService5;
    }

    public TOO getToothIdentification5() {
        return toothIdentification5;
    }

    public void setToothIdentification5(TOO toothIdentification5) {
        this.toothIdentification5 = toothIdentification5;
    }

    public HSD getHealthCareServicesDelivery5() {
        return healthCareServicesDelivery5;
    }

    public void setHealthCareServicesDelivery5(HSD healthCareServicesDelivery5) {
        this.healthCareServicesDelivery5 = healthCareServicesDelivery5;
    }

    public CRC getConditionsIndicator5() {
        return conditionsIndicator5;
    }

    public void setConditionsIndicator5(CRC conditionsIndicator5) {
        this.conditionsIndicator5 = conditionsIndicator5;
    }

    public CL1 getClaimCodes5() {
        return claimCodes5;
    }

    public void setClaimCodes5(CL1 claimCodes5) {
        this.claimCodes5 = claimCodes5;
    }

    public CR1 getAmbulanceCertification5() {
        return ambulanceCertification5;
    }

    public void setAmbulanceCertification5(CR1 ambulanceCertification5) {
        this.ambulanceCertification5 = ambulanceCertification5;
    }

    public CR2 getChiropracticCertification5() {
        return chiropracticCertification5;
    }

    public void setChiropracticCertification5(CR2 chiropracticCertification5) {
        this.chiropracticCertification5 = chiropracticCertification5;
    }

    public CR5 getOxygenTherapyCertification5() {
        return oxygenTherapyCertification5;
    }

    public void setOxygenTherapyCertification5(CR5 oxygenTherapyCertification5) {
        this.oxygenTherapyCertification5 = oxygenTherapyCertification5;
    }

    public CR6 getHomeHealthCareCertification5() {
        return homeHealthCareCertification5;
    }

    public void setHomeHealthCareCertification5(CR6 homeHealthCareCertification5) {
        this.homeHealthCareCertification5 = homeHealthCareCertification5;
    }

    public PWK getPaperwork5() {
        return paperwork5;
    }

    public void setPaperwork5(PWK paperwork5) {
        this.paperwork5 = paperwork5;
    }

    public MSG getMessageText5() {
        return messageText5;
    }

    public void setMessageText5(MSG messageText5) {
        this.messageText5 = messageText5;
    }

    public NM1 getIndividualorOrganizationalName5() {
        return individualorOrganizationalName5;
    }

    public void setIndividualorOrganizationalName5(NM1 individualorOrganizationalName5) {
        this.individualorOrganizationalName5 = individualorOrganizationalName5;
    }

    public REF getReferenceInformation11() {
        return referenceInformation11;
    }

    public void setReferenceInformation11(REF referenceInformation11) {
        this.referenceInformation11 = referenceInformation11;
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

    public PER getAdministrativeCommunicationsContact5() {
        return administrativeCommunicationsContact5;
    }

    public void setAdministrativeCommunicationsContact5(PER administrativeCommunicationsContact5) {
        this.administrativeCommunicationsContact5 = administrativeCommunicationsContact5;
    }

    public AAA getRequestValidation11() {
        return requestValidation11;
    }

    public void setRequestValidation11(AAA requestValidation11) {
        this.requestValidation11 = requestValidation11;
    }

    public PRV getProviderInformation5() {
        return providerInformation5;
    }

    public void setProviderInformation5(PRV providerInformation5) {
        this.providerInformation5 = providerInformation5;
    }

    public DMG getDemographicInformation5() {
        return demographicInformation5;
    }

    public void setDemographicInformation5(DMG demographicInformation5) {
        this.demographicInformation5 = demographicInformation5;
    }

    public INS getInsuredBenefit5() {
        return insuredBenefit5;
    }

    public void setInsuredBenefit5(INS insuredBenefit5) {
        this.insuredBenefit5 = insuredBenefit5;
    }

    public DTP getDateorTimeorPeriod11() {
        return dateorTimeorPeriod11;
    }

    public void setDateorTimeorPeriod11(DTP dateorTimeorPeriod11) {
        this.dateorTimeorPeriod11 = dateorTimeorPeriod11;
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

    public String toString() { return ReflectionToStringBuilder.toString(this);}
}

