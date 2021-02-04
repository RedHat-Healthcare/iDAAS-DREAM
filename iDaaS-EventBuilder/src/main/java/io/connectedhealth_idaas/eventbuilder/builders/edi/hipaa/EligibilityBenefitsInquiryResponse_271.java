package io.connectedhealth_idaas.eventbuilder.builders.edi.hipaa;
import io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EligibilityBenefitsInquiryResponse_271 {
private ST transactionSetHeader;
private S4S securityHeaderLevel2;
private S4A assuranceHeaderLevel2;
private BHT beginningofHierarchicalTransaction;
private HL hierarchicalLevel;
private TRN trace;
private AAA requestValidation;
private NM1 individualorOrganizationalName;
private REF referenceInformation;
private N2 additionalNameInformation;
private N3 partyLocation;
private N4 geographicLocation;
private PER administrativeCommunicationsContact;
private AAA requestValidation1;
private PRV providerInformation;
private DMG demographicInformation;
private INS insuredBenefit;
private HI healthCareInformationCodes;
private DTP dateorTimeorPeriod;
private LUI languageUse;
private MPI militaryPersonnelInformation;
private EB eligibilityorBenefitInformation;
private HSD healthCareServicesDelivery;
private REF referenceInformation1;
private DTP dateorTimeorPeriod1;
private AAA requestValidation2;
private VEH vehicleInformation;
private PID productItemDescription;
private PDR propertyDescriptionReal;
private PDP propertyDescriptionPersonal;
private LIN itemIdentification;
private EM equipmentCharacteristics;
private SD1 safetyData;
private PKD packagingDescription;
private MSG messageText;
private III information;
private DTP dateorTimeorPeriod3;
private AMT monetaryAmountInformation;
private PCT percentAmounts;
private LQ industryCodeIdentification;
private AMT monetaryAmountInformation3;
private PCT percentAmounts3;
private LS loopHeader;
private NM1 individualorOrganizationalName3;
private N2 additionalNameInformation3;
private N3 partyLocation3;
private N4 geographicLocation3;
private PER administrativeCommunicationsContact3;
private PRV providerInformation3;
private LE loopTrailer;
private HL hierarchicalLevel3;
private TRN trace3;
private AAA requestValidation3;
private NM1 individualorOrganizationalName4;
private REF referenceInformation3;
private N2 additionalNameInformation4;
private N3 partyLocation1;
private N4 geographicLocation1;
private PER administrativeCommunicationsContact1;
private AAA requestValidation4;
private PRV providerInformation4;
private DMG demographicInformation1;
private INS insuredBenefit1;
private HI healthCareInformationCodes1;
private DTP dateorTimeorPeriod2;
private LUI languageUse1;
private MPI militaryPersonnelInformation1;
private EB eligibilityorBenefitInformation1;
private HSD healthCareServicesDelivery1;
private REF referenceInformation2;
private DTP dateorTimeorPeriod4;
private AAA requestValidation5;
private VEH vehicleInformation1;
private PID productItemDescription1;
private PDR propertyDescriptionReal1;
private PDP propertyDescriptionPersonal1;
private LIN itemIdentification1;
private EM equipmentCharacteristics1;
private SD1 safetyData1;
private PKD packagingDescription1;
private MSG messageText1;
private III information1;
private DTP dateorTimeorPeriod5;
private AMT monetaryAmountInformation4;
private PCT percentAmounts1;
private LQ industryCodeIdentification1;
private AMT monetaryAmountInformation1;
private PCT percentAmounts2;
private LS loopHeader1;
private NM1 individualorOrganizationalName1;
private N2 additionalNameInformation1;
private N3 partyLocation2;
private N4 geographicLocation2;
private PER administrativeCommunicationsContact2;
private PRV providerInformation1;
private LE loopTrailer1;
private HL hierarchicalLevel1;
private TRN trace1;
private AAA requestValidation6;
private NM1 individualorOrganizationalName2;
private REF referenceInformation4;
private N2 additionalNameInformation2;
private N3 partyLocation4;
private N4 geographicLocation4;
private PER administrativeCommunicationsContact4;
private AAA requestValidation7;
private PRV providerInformation2;
private DMG demographicInformation2;
private INS insuredBenefit2;
private HI healthCareInformationCodes2;
private DTP dateorTimeorPeriod6;
private LUI languageUse2;
private MPI militaryPersonnelInformation2;
private EB eligibilityorBenefitInformation2;
private HSD healthCareServicesDelivery2;
private REF referenceInformation5;
private DTP dateorTimeorPeriod7;
private AAA requestValidation8;
private VEH vehicleInformation2;
private PID productItemDescription2;
private PDR propertyDescriptionReal2;
private PDP propertyDescriptionPersonal2;
private LIN itemIdentification2;
private EM equipmentCharacteristics2;
private SD1 safetyData2;
private PKD packagingDescription2;
private MSG messageText2;
private III information2;
private DTP dateorTimeorPeriod8;
private AMT monetaryAmountInformation2;
private PCT percentAmounts4;
private LQ industryCodeIdentification2;
private AMT monetaryAmountInformation5;
private PCT percentAmounts5;
private LS loopHeader2;
private NM1 individualorOrganizationalName5;
private N2 additionalNameInformation5;
private N3 partyLocation5;
private N4 geographicLocation5;
private PER administrativeCommunicationsContact5;
private PRV providerInformation5;
private LE loopTrailer2;
private HL hierarchicalLevel2;
private TRN trace2;
private AAA requestValidation9;
private NM1 individualorOrganizationalName6;
private REF referenceInformation6;
private N2 additionalNameInformation6;
private N3 partyLocation6;
private N4 geographicLocation6;
private PER administrativeCommunicationsContact6;
private AAA requestValidation10;
private PRV providerInformation6;
private DMG demographicInformation3;
private INS insuredBenefit3;
private HI healthCareInformationCodes3;
private DTP dateorTimeorPeriod9;
private LUI languageUse3;
private MPI militaryPersonnelInformation3;
private EB eligibilityorBenefitInformation3;
private HSD healthCareServicesDelivery3;
private REF referenceInformation7;
private DTP dateorTimeorPeriod10;
private AAA requestValidation11;
private VEH vehicleInformation3;
private PID productItemDescription3;
private PDR propertyDescriptionReal3;
private PDP propertyDescriptionPersonal3;
private LIN itemIdentification3;
private EM equipmentCharacteristics3;
private SD1 safetyData3;
private PKD packagingDescription3;
private MSG messageText3;
private III information3;
private DTP dateorTimeorPeriod11;
private AMT monetaryAmountInformation6;
private PCT percentAmounts6;
private LQ industryCodeIdentification3;
private AMT monetaryAmountInformation7;
private PCT percentAmounts7;
private LS loopHeader3;
private NM1 individualorOrganizationalName7;
private N2 additionalNameInformation7;
private N3 partyLocation7;
private N4 geographicLocation7;
private PER administrativeCommunicationsContact7;
private PRV providerInformation7;
private LE loopTrailer3;
private HL hierarchicalLevel4;
private TRN trace4;
private AAA requestValidation12;
private NM1 individualorOrganizationalName8;
private REF referenceInformation8;
private N2 additionalNameInformation8;
private N3 partyLocation8;
private N4 geographicLocation8;
private PER administrativeCommunicationsContact8;
private AAA requestValidation13;
private PRV providerInformation8;
private DMG demographicInformation4;
private INS insuredBenefit4;
private HI healthCareInformationCodes4;
private DTP dateorTimeorPeriod12;
private LUI languageUse4;
private MPI militaryPersonnelInformation4;
private EB eligibilityorBenefitInformation4;
private HSD healthCareServicesDelivery4;
private REF referenceInformation9;
private DTP dateorTimeorPeriod13;
private AAA requestValidation14;
private VEH vehicleInformation4;
private PID productItemDescription4;
private PDR propertyDescriptionReal4;
private PDP propertyDescriptionPersonal4;
private LIN itemIdentificatio4n;
private EM equipmentCharacteristics4;
private SD1 safetyData4;
private PKD packagingDescription4;
private MSG messageText4;
private III information4;
private DTP dateorTimeorPeriod14;
private AMT monetaryAmountInformation8;
private PCT percentAmounts8;
private LQ industryCodeIdentification4;
private AMT monetaryAmountInformation9;
private PCT percentAmounts9;
private LS loopHeader4;
private NM1 individualorOrganizationalName9;
private N2 additionalNameInformation9;
private N3 partyLocation9;
private N4 geographicLocation9;
private PER administrativeCommunicationsContact9;
private PRV providerInformation9;
private LE loopTrailer4;
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

    public NM1 getIndividualorOrganizationalName() {
        return individualorOrganizationalName;
    }

    public void setIndividualorOrganizationalName(NM1 individualorOrganizationalName) {
        this.individualorOrganizationalName = individualorOrganizationalName;
    }

    public REF getReferenceInformation() {
        return referenceInformation;
    }

    public void setReferenceInformation(REF referenceInformation) {
        this.referenceInformation = referenceInformation;
    }

    public N2 getAdditionalNameInformation() {
        return additionalNameInformation;
    }

    public void setAdditionalNameInformation(N2 additionalNameInformation) {
        this.additionalNameInformation = additionalNameInformation;
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

    public HI getHealthCareInformationCodes() {
        return healthCareInformationCodes;
    }

    public void setHealthCareInformationCodes(HI healthCareInformationCodes) {
        this.healthCareInformationCodes = healthCareInformationCodes;
    }

    public DTP getDateorTimeorPeriod() {
        return dateorTimeorPeriod;
    }

    public void setDateorTimeorPeriod(DTP dateorTimeorPeriod) {
        this.dateorTimeorPeriod = dateorTimeorPeriod;
    }

    public LUI getLanguageUse() {
        return languageUse;
    }

    public void setLanguageUse(LUI languageUse) {
        this.languageUse = languageUse;
    }

    public MPI getMilitaryPersonnelInformation() {
        return militaryPersonnelInformation;
    }

    public void setMilitaryPersonnelInformation(MPI militaryPersonnelInformation) {
        this.militaryPersonnelInformation = militaryPersonnelInformation;
    }

    public EB getEligibilityorBenefitInformation() {
        return eligibilityorBenefitInformation;
    }

    public void setEligibilityorBenefitInformation(EB eligibilityorBenefitInformation) {
        this.eligibilityorBenefitInformation = eligibilityorBenefitInformation;
    }

    public HSD getHealthCareServicesDelivery() {
        return healthCareServicesDelivery;
    }

    public void setHealthCareServicesDelivery(HSD healthCareServicesDelivery) {
        this.healthCareServicesDelivery = healthCareServicesDelivery;
    }

    public REF getReferenceInformation1() {
        return referenceInformation1;
    }

    public void setReferenceInformation1(REF referenceInformation1) {
        this.referenceInformation1 = referenceInformation1;
    }

    public DTP getDateorTimeorPeriod1() {
        return dateorTimeorPeriod1;
    }

    public void setDateorTimeorPeriod1(DTP dateorTimeorPeriod1) {
        this.dateorTimeorPeriod1 = dateorTimeorPeriod1;
    }

    public AAA getRequestValidation2() {
        return requestValidation2;
    }

    public void setRequestValidation2(AAA requestValidation2) {
        this.requestValidation2 = requestValidation2;
    }

    public VEH getVehicleInformation() {
        return vehicleInformation;
    }

    public void setVehicleInformation(VEH vehicleInformation) {
        this.vehicleInformation = vehicleInformation;
    }

    public PID getProductItemDescription() {
        return productItemDescription;
    }

    public void setProductItemDescription(PID productItemDescription) {
        this.productItemDescription = productItemDescription;
    }

    public PDR getPropertyDescriptionReal() {
        return propertyDescriptionReal;
    }

    public void setPropertyDescriptionReal(PDR propertyDescriptionReal) {
        this.propertyDescriptionReal = propertyDescriptionReal;
    }

    public PDP getPropertyDescriptionPersonal() {
        return propertyDescriptionPersonal;
    }

    public void setPropertyDescriptionPersonal(PDP propertyDescriptionPersonal) {
        this.propertyDescriptionPersonal = propertyDescriptionPersonal;
    }

    public LIN getItemIdentification() {
        return itemIdentification;
    }

    public void setItemIdentification(LIN itemIdentification) {
        this.itemIdentification = itemIdentification;
    }

    public EM getEquipmentCharacteristics() {
        return equipmentCharacteristics;
    }

    public void setEquipmentCharacteristics(EM equipmentCharacteristics) {
        this.equipmentCharacteristics = equipmentCharacteristics;
    }

    public SD1 getSafetyData() {
        return safetyData;
    }

    public void setSafetyData(SD1 safetyData) {
        this.safetyData = safetyData;
    }

    public PKD getPackagingDescription() {
        return packagingDescription;
    }

    public void setPackagingDescription(PKD packagingDescription) {
        this.packagingDescription = packagingDescription;
    }

    public MSG getMessageText() {
        return messageText;
    }

    public void setMessageText(MSG messageText) {
        this.messageText = messageText;
    }

    public III getInformation() {
        return information;
    }

    public void setInformation(III information) {
        this.information = information;
    }

    public DTP getDateorTimeorPeriod3() {
        return dateorTimeorPeriod3;
    }

    public void setDateorTimeorPeriod3(DTP dateorTimeorPeriod3) {
        this.dateorTimeorPeriod3 = dateorTimeorPeriod3;
    }

    public AMT getMonetaryAmountInformation() {
        return monetaryAmountInformation;
    }

    public void setMonetaryAmountInformation(AMT monetaryAmountInformation) {
        this.monetaryAmountInformation = monetaryAmountInformation;
    }

    public PCT getPercentAmounts() {
        return percentAmounts;
    }

    public void setPercentAmounts(PCT percentAmounts) {
        this.percentAmounts = percentAmounts;
    }

    public LQ getIndustryCodeIdentification() {
        return industryCodeIdentification;
    }

    public void setIndustryCodeIdentification(LQ industryCodeIdentification) {
        this.industryCodeIdentification = industryCodeIdentification;
    }

    public AMT getMonetaryAmountInformation3() {
        return monetaryAmountInformation3;
    }

    public void setMonetaryAmountInformation3(AMT monetaryAmountInformation3) {
        this.monetaryAmountInformation3 = monetaryAmountInformation3;
    }

    public PCT getPercentAmounts3() {
        return percentAmounts3;
    }

    public void setPercentAmounts3(PCT percentAmounts3) {
        this.percentAmounts3 = percentAmounts3;
    }

    public LS getLoopHeader() {
        return loopHeader;
    }

    public void setLoopHeader(LS loopHeader) {
        this.loopHeader = loopHeader;
    }

    public NM1 getIndividualorOrganizationalName3() {
        return individualorOrganizationalName3;
    }

    public void setIndividualorOrganizationalName3(NM1 individualorOrganizationalName3) {
        this.individualorOrganizationalName3 = individualorOrganizationalName3;
    }

    public N2 getAdditionalNameInformation3() {
        return additionalNameInformation3;
    }

    public void setAdditionalNameInformation3(N2 additionalNameInformation3) {
        this.additionalNameInformation3 = additionalNameInformation3;
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

    public PRV getProviderInformation3() {
        return providerInformation3;
    }

    public void setProviderInformation3(PRV providerInformation3) {
        this.providerInformation3 = providerInformation3;
    }

    public LE getLoopTrailer() {
        return loopTrailer;
    }

    public void setLoopTrailer(LE loopTrailer) {
        this.loopTrailer = loopTrailer;
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

    public AAA getRequestValidation3() {
        return requestValidation3;
    }

    public void setRequestValidation3(AAA requestValidation3) {
        this.requestValidation3 = requestValidation3;
    }

    public NM1 getIndividualorOrganizationalName4() {
        return individualorOrganizationalName4;
    }

    public void setIndividualorOrganizationalName4(NM1 individualorOrganizationalName4) {
        this.individualorOrganizationalName4 = individualorOrganizationalName4;
    }

    public REF getReferenceInformation3() {
        return referenceInformation3;
    }

    public void setReferenceInformation3(REF referenceInformation3) {
        this.referenceInformation3 = referenceInformation3;
    }

    public N2 getAdditionalNameInformation4() {
        return additionalNameInformation4;
    }

    public void setAdditionalNameInformation4(N2 additionalNameInformation4) {
        this.additionalNameInformation4 = additionalNameInformation4;
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

    public AAA getRequestValidation4() {
        return requestValidation4;
    }

    public void setRequestValidation4(AAA requestValidation4) {
        this.requestValidation4 = requestValidation4;
    }

    public PRV getProviderInformation4() {
        return providerInformation4;
    }

    public void setProviderInformation4(PRV providerInformation4) {
        this.providerInformation4 = providerInformation4;
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

    public HI getHealthCareInformationCodes1() {
        return healthCareInformationCodes1;
    }

    public void setHealthCareInformationCodes1(HI healthCareInformationCodes1) {
        this.healthCareInformationCodes1 = healthCareInformationCodes1;
    }

    public DTP getDateorTimeorPeriod2() {
        return dateorTimeorPeriod2;
    }

    public void setDateorTimeorPeriod2(DTP dateorTimeorPeriod2) {
        this.dateorTimeorPeriod2 = dateorTimeorPeriod2;
    }

    public LUI getLanguageUse1() {
        return languageUse1;
    }

    public void setLanguageUse1(LUI languageUse1) {
        this.languageUse1 = languageUse1;
    }

    public MPI getMilitaryPersonnelInformation1() {
        return militaryPersonnelInformation1;
    }

    public void setMilitaryPersonnelInformation1(MPI militaryPersonnelInformation1) {
        this.militaryPersonnelInformation1 = militaryPersonnelInformation1;
    }

    public EB getEligibilityorBenefitInformation1() {
        return eligibilityorBenefitInformation1;
    }

    public void setEligibilityorBenefitInformation1(EB eligibilityorBenefitInformation1) {
        this.eligibilityorBenefitInformation1 = eligibilityorBenefitInformation1;
    }

    public HSD getHealthCareServicesDelivery1() {
        return healthCareServicesDelivery1;
    }

    public void setHealthCareServicesDelivery1(HSD healthCareServicesDelivery1) {
        this.healthCareServicesDelivery1 = healthCareServicesDelivery1;
    }

    public REF getReferenceInformation2() {
        return referenceInformation2;
    }

    public void setReferenceInformation2(REF referenceInformation2) {
        this.referenceInformation2 = referenceInformation2;
    }

    public DTP getDateorTimeorPeriod4() {
        return dateorTimeorPeriod4;
    }

    public void setDateorTimeorPeriod4(DTP dateorTimeorPeriod4) {
        this.dateorTimeorPeriod4 = dateorTimeorPeriod4;
    }

    public AAA getRequestValidation5() {
        return requestValidation5;
    }

    public void setRequestValidation5(AAA requestValidation5) {
        this.requestValidation5 = requestValidation5;
    }

    public VEH getVehicleInformation1() {
        return vehicleInformation1;
    }

    public void setVehicleInformation1(VEH vehicleInformation1) {
        this.vehicleInformation1 = vehicleInformation1;
    }

    public PID getProductItemDescription1() {
        return productItemDescription1;
    }

    public void setProductItemDescription1(PID productItemDescription1) {
        this.productItemDescription1 = productItemDescription1;
    }

    public PDR getPropertyDescriptionReal1() {
        return propertyDescriptionReal1;
    }

    public void setPropertyDescriptionReal1(PDR propertyDescriptionReal1) {
        this.propertyDescriptionReal1 = propertyDescriptionReal1;
    }

    public PDP getPropertyDescriptionPersonal1() {
        return propertyDescriptionPersonal1;
    }

    public void setPropertyDescriptionPersonal1(PDP propertyDescriptionPersonal1) {
        this.propertyDescriptionPersonal1 = propertyDescriptionPersonal1;
    }

    public LIN getItemIdentification1() {
        return itemIdentification1;
    }

    public void setItemIdentification1(LIN itemIdentification1) {
        this.itemIdentification1 = itemIdentification1;
    }

    public EM getEquipmentCharacteristics1() {
        return equipmentCharacteristics1;
    }

    public void setEquipmentCharacteristics1(EM equipmentCharacteristics1) {
        this.equipmentCharacteristics1 = equipmentCharacteristics1;
    }

    public SD1 getSafetyData1() {
        return safetyData1;
    }

    public void setSafetyData1(SD1 safetyData1) {
        this.safetyData1 = safetyData1;
    }

    public PKD getPackagingDescription1() {
        return packagingDescription1;
    }

    public void setPackagingDescription1(PKD packagingDescription1) {
        this.packagingDescription1 = packagingDescription1;
    }

    public MSG getMessageText1() {
        return messageText1;
    }

    public void setMessageText1(MSG messageText1) {
        this.messageText1 = messageText1;
    }

    public III getInformation1() {
        return information1;
    }

    public void setInformation1(III information1) {
        this.information1 = information1;
    }

    public DTP getDateorTimeorPeriod5() {
        return dateorTimeorPeriod5;
    }

    public void setDateorTimeorPeriod5(DTP dateorTimeorPeriod5) {
        this.dateorTimeorPeriod5 = dateorTimeorPeriod5;
    }

    public AMT getMonetaryAmountInformation4() {
        return monetaryAmountInformation4;
    }

    public void setMonetaryAmountInformation4(AMT monetaryAmountInformation4) {
        this.monetaryAmountInformation4 = monetaryAmountInformation4;
    }

    public PCT getPercentAmounts1() {
        return percentAmounts1;
    }

    public void setPercentAmounts1(PCT percentAmounts1) {
        this.percentAmounts1 = percentAmounts1;
    }

    public LQ getIndustryCodeIdentification1() {
        return industryCodeIdentification1;
    }

    public void setIndustryCodeIdentification1(LQ industryCodeIdentification1) {
        this.industryCodeIdentification1 = industryCodeIdentification1;
    }

    public AMT getMonetaryAmountInformation1() {
        return monetaryAmountInformation1;
    }

    public void setMonetaryAmountInformation1(AMT monetaryAmountInformation1) {
        this.monetaryAmountInformation1 = monetaryAmountInformation1;
    }

    public PCT getPercentAmounts2() {
        return percentAmounts2;
    }

    public void setPercentAmounts2(PCT percentAmounts2) {
        this.percentAmounts2 = percentAmounts2;
    }

    public LS getLoopHeader1() {
        return loopHeader1;
    }

    public void setLoopHeader1(LS loopHeader1) {
        this.loopHeader1 = loopHeader1;
    }

    public NM1 getIndividualorOrganizationalName1() {
        return individualorOrganizationalName1;
    }

    public void setIndividualorOrganizationalName1(NM1 individualorOrganizationalName1) {
        this.individualorOrganizationalName1 = individualorOrganizationalName1;
    }

    public N2 getAdditionalNameInformation1() {
        return additionalNameInformation1;
    }

    public void setAdditionalNameInformation1(N2 additionalNameInformation1) {
        this.additionalNameInformation1 = additionalNameInformation1;
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

    public PRV getProviderInformation1() {
        return providerInformation1;
    }

    public void setProviderInformation1(PRV providerInformation1) {
        this.providerInformation1 = providerInformation1;
    }

    public LE getLoopTrailer1() {
        return loopTrailer1;
    }

    public void setLoopTrailer1(LE loopTrailer1) {
        this.loopTrailer1 = loopTrailer1;
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

    public AAA getRequestValidation6() {
        return requestValidation6;
    }

    public void setRequestValidation6(AAA requestValidation6) {
        this.requestValidation6 = requestValidation6;
    }

    public NM1 getIndividualorOrganizationalName2() {
        return individualorOrganizationalName2;
    }

    public void setIndividualorOrganizationalName2(NM1 individualorOrganizationalName2) {
        this.individualorOrganizationalName2 = individualorOrganizationalName2;
    }

    public REF getReferenceInformation4() {
        return referenceInformation4;
    }

    public void setReferenceInformation4(REF referenceInformation4) {
        this.referenceInformation4 = referenceInformation4;
    }

    public N2 getAdditionalNameInformation2() {
        return additionalNameInformation2;
    }

    public void setAdditionalNameInformation2(N2 additionalNameInformation2) {
        this.additionalNameInformation2 = additionalNameInformation2;
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

    public AAA getRequestValidation7() {
        return requestValidation7;
    }

    public void setRequestValidation7(AAA requestValidation7) {
        this.requestValidation7 = requestValidation7;
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

    public HI getHealthCareInformationCodes2() {
        return healthCareInformationCodes2;
    }

    public void setHealthCareInformationCodes2(HI healthCareInformationCodes2) {
        this.healthCareInformationCodes2 = healthCareInformationCodes2;
    }

    public DTP getDateorTimeorPeriod6() {
        return dateorTimeorPeriod6;
    }

    public void setDateorTimeorPeriod6(DTP dateorTimeorPeriod6) {
        this.dateorTimeorPeriod6 = dateorTimeorPeriod6;
    }

    public LUI getLanguageUse2() {
        return languageUse2;
    }

    public void setLanguageUse2(LUI languageUse2) {
        this.languageUse2 = languageUse2;
    }

    public MPI getMilitaryPersonnelInformation2() {
        return militaryPersonnelInformation2;
    }

    public void setMilitaryPersonnelInformation2(MPI militaryPersonnelInformation2) {
        this.militaryPersonnelInformation2 = militaryPersonnelInformation2;
    }

    public EB getEligibilityorBenefitInformation2() {
        return eligibilityorBenefitInformation2;
    }

    public void setEligibilityorBenefitInformation2(EB eligibilityorBenefitInformation2) {
        this.eligibilityorBenefitInformation2 = eligibilityorBenefitInformation2;
    }

    public HSD getHealthCareServicesDelivery2() {
        return healthCareServicesDelivery2;
    }

    public void setHealthCareServicesDelivery2(HSD healthCareServicesDelivery2) {
        this.healthCareServicesDelivery2 = healthCareServicesDelivery2;
    }

    public REF getReferenceInformation5() {
        return referenceInformation5;
    }

    public void setReferenceInformation5(REF referenceInformation5) {
        this.referenceInformation5 = referenceInformation5;
    }

    public DTP getDateorTimeorPeriod7() {
        return dateorTimeorPeriod7;
    }

    public void setDateorTimeorPeriod7(DTP dateorTimeorPeriod7) {
        this.dateorTimeorPeriod7 = dateorTimeorPeriod7;
    }

    public AAA getRequestValidation8() {
        return requestValidation8;
    }

    public void setRequestValidation8(AAA requestValidation8) {
        this.requestValidation8 = requestValidation8;
    }

    public VEH getVehicleInformation2() {
        return vehicleInformation2;
    }

    public void setVehicleInformation2(VEH vehicleInformation2) {
        this.vehicleInformation2 = vehicleInformation2;
    }

    public PID getProductItemDescription2() {
        return productItemDescription2;
    }

    public void setProductItemDescription2(PID productItemDescription2) {
        this.productItemDescription2 = productItemDescription2;
    }

    public PDR getPropertyDescriptionReal2() {
        return propertyDescriptionReal2;
    }

    public void setPropertyDescriptionReal2(PDR propertyDescriptionReal2) {
        this.propertyDescriptionReal2 = propertyDescriptionReal2;
    }

    public PDP getPropertyDescriptionPersonal2() {
        return propertyDescriptionPersonal2;
    }

    public void setPropertyDescriptionPersonal2(PDP propertyDescriptionPersonal2) {
        this.propertyDescriptionPersonal2 = propertyDescriptionPersonal2;
    }

    public LIN getItemIdentification2() {
        return itemIdentification2;
    }

    public void setItemIdentification2(LIN itemIdentification2) {
        this.itemIdentification2 = itemIdentification2;
    }

    public EM getEquipmentCharacteristics2() {
        return equipmentCharacteristics2;
    }

    public void setEquipmentCharacteristics2(EM equipmentCharacteristics2) {
        this.equipmentCharacteristics2 = equipmentCharacteristics2;
    }

    public SD1 getSafetyData2() {
        return safetyData2;
    }

    public void setSafetyData2(SD1 safetyData2) {
        this.safetyData2 = safetyData2;
    }

    public PKD getPackagingDescription2() {
        return packagingDescription2;
    }

    public void setPackagingDescription2(PKD packagingDescription2) {
        this.packagingDescription2 = packagingDescription2;
    }

    public MSG getMessageText2() {
        return messageText2;
    }

    public void setMessageText2(MSG messageText2) {
        this.messageText2 = messageText2;
    }

    public III getInformation2() {
        return information2;
    }

    public void setInformation2(III information2) {
        this.information2 = information2;
    }

    public DTP getDateorTimeorPeriod8() {
        return dateorTimeorPeriod8;
    }

    public void setDateorTimeorPeriod8(DTP dateorTimeorPeriod8) {
        this.dateorTimeorPeriod8 = dateorTimeorPeriod8;
    }

    public AMT getMonetaryAmountInformation2() {
        return monetaryAmountInformation2;
    }

    public void setMonetaryAmountInformation2(AMT monetaryAmountInformation2) {
        this.monetaryAmountInformation2 = monetaryAmountInformation2;
    }

    public PCT getPercentAmounts4() {
        return percentAmounts4;
    }

    public void setPercentAmounts4(PCT percentAmounts4) {
        this.percentAmounts4 = percentAmounts4;
    }

    public LQ getIndustryCodeIdentification2() {
        return industryCodeIdentification2;
    }

    public void setIndustryCodeIdentification2(LQ industryCodeIdentification2) {
        this.industryCodeIdentification2 = industryCodeIdentification2;
    }

    public AMT getMonetaryAmountInformation5() {
        return monetaryAmountInformation5;
    }

    public void setMonetaryAmountInformation5(AMT monetaryAmountInformation5) {
        this.monetaryAmountInformation5 = monetaryAmountInformation5;
    }

    public PCT getPercentAmounts5() {
        return percentAmounts5;
    }

    public void setPercentAmounts5(PCT percentAmounts5) {
        this.percentAmounts5 = percentAmounts5;
    }

    public LS getLoopHeader2() {
        return loopHeader2;
    }

    public void setLoopHeader2(LS loopHeader2) {
        this.loopHeader2 = loopHeader2;
    }

    public NM1 getIndividualorOrganizationalName5() {
        return individualorOrganizationalName5;
    }

    public void setIndividualorOrganizationalName5(NM1 individualorOrganizationalName5) {
        this.individualorOrganizationalName5 = individualorOrganizationalName5;
    }

    public N2 getAdditionalNameInformation5() {
        return additionalNameInformation5;
    }

    public void setAdditionalNameInformation5(N2 additionalNameInformation5) {
        this.additionalNameInformation5 = additionalNameInformation5;
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

    public PRV getProviderInformation5() {
        return providerInformation5;
    }

    public void setProviderInformation5(PRV providerInformation5) {
        this.providerInformation5 = providerInformation5;
    }

    public LE getLoopTrailer2() {
        return loopTrailer2;
    }

    public void setLoopTrailer2(LE loopTrailer2) {
        this.loopTrailer2 = loopTrailer2;
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

    public AAA getRequestValidation9() {
        return requestValidation9;
    }

    public void setRequestValidation9(AAA requestValidation9) {
        this.requestValidation9 = requestValidation9;
    }

    public NM1 getIndividualorOrganizationalName6() {
        return individualorOrganizationalName6;
    }

    public void setIndividualorOrganizationalName6(NM1 individualorOrganizationalName6) {
        this.individualorOrganizationalName6 = individualorOrganizationalName6;
    }

    public REF getReferenceInformation6() {
        return referenceInformation6;
    }

    public void setReferenceInformation6(REF referenceInformation6) {
        this.referenceInformation6 = referenceInformation6;
    }

    public N2 getAdditionalNameInformation6() {
        return additionalNameInformation6;
    }

    public void setAdditionalNameInformation6(N2 additionalNameInformation6) {
        this.additionalNameInformation6 = additionalNameInformation6;
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

    public PER getAdministrativeCommunicationsContact6() {
        return administrativeCommunicationsContact6;
    }

    public void setAdministrativeCommunicationsContact6(PER administrativeCommunicationsContact6) {
        this.administrativeCommunicationsContact6 = administrativeCommunicationsContact6;
    }

    public AAA getRequestValidation10() {
        return requestValidation10;
    }

    public void setRequestValidation10(AAA requestValidation10) {
        this.requestValidation10 = requestValidation10;
    }

    public PRV getProviderInformation6() {
        return providerInformation6;
    }

    public void setProviderInformation6(PRV providerInformation6) {
        this.providerInformation6 = providerInformation6;
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

    public HI getHealthCareInformationCodes3() {
        return healthCareInformationCodes3;
    }

    public void setHealthCareInformationCodes3(HI healthCareInformationCodes3) {
        this.healthCareInformationCodes3 = healthCareInformationCodes3;
    }

    public DTP getDateorTimeorPeriod9() {
        return dateorTimeorPeriod9;
    }

    public void setDateorTimeorPeriod9(DTP dateorTimeorPeriod9) {
        this.dateorTimeorPeriod9 = dateorTimeorPeriod9;
    }

    public LUI getLanguageUse3() {
        return languageUse3;
    }

    public void setLanguageUse3(LUI languageUse3) {
        this.languageUse3 = languageUse3;
    }

    public MPI getMilitaryPersonnelInformation3() {
        return militaryPersonnelInformation3;
    }

    public void setMilitaryPersonnelInformation3(MPI militaryPersonnelInformation3) {
        this.militaryPersonnelInformation3 = militaryPersonnelInformation3;
    }

    public EB getEligibilityorBenefitInformation3() {
        return eligibilityorBenefitInformation3;
    }

    public void setEligibilityorBenefitInformation3(EB eligibilityorBenefitInformation3) {
        this.eligibilityorBenefitInformation3 = eligibilityorBenefitInformation3;
    }

    public HSD getHealthCareServicesDelivery3() {
        return healthCareServicesDelivery3;
    }

    public void setHealthCareServicesDelivery3(HSD healthCareServicesDelivery3) {
        this.healthCareServicesDelivery3 = healthCareServicesDelivery3;
    }

    public REF getReferenceInformation7() {
        return referenceInformation7;
    }

    public void setReferenceInformation7(REF referenceInformation7) {
        this.referenceInformation7 = referenceInformation7;
    }

    public DTP getDateorTimeorPeriod10() {
        return dateorTimeorPeriod10;
    }

    public void setDateorTimeorPeriod10(DTP dateorTimeorPeriod10) {
        this.dateorTimeorPeriod10 = dateorTimeorPeriod10;
    }

    public AAA getRequestValidation11() {
        return requestValidation11;
    }

    public void setRequestValidation11(AAA requestValidation11) {
        this.requestValidation11 = requestValidation11;
    }

    public VEH getVehicleInformation3() {
        return vehicleInformation3;
    }

    public void setVehicleInformation3(VEH vehicleInformation3) {
        this.vehicleInformation3 = vehicleInformation3;
    }

    public PID getProductItemDescription3() {
        return productItemDescription3;
    }

    public void setProductItemDescription3(PID productItemDescription3) {
        this.productItemDescription3 = productItemDescription3;
    }

    public PDR getPropertyDescriptionReal3() {
        return propertyDescriptionReal3;
    }

    public void setPropertyDescriptionReal3(PDR propertyDescriptionReal3) {
        this.propertyDescriptionReal3 = propertyDescriptionReal3;
    }

    public PDP getPropertyDescriptionPersonal3() {
        return propertyDescriptionPersonal3;
    }

    public void setPropertyDescriptionPersonal3(PDP propertyDescriptionPersonal3) {
        this.propertyDescriptionPersonal3 = propertyDescriptionPersonal3;
    }

    public LIN getItemIdentification3() {
        return itemIdentification3;
    }

    public void setItemIdentification3(LIN itemIdentification3) {
        this.itemIdentification3 = itemIdentification3;
    }

    public EM getEquipmentCharacteristics3() {
        return equipmentCharacteristics3;
    }

    public void setEquipmentCharacteristics3(EM equipmentCharacteristics3) {
        this.equipmentCharacteristics3 = equipmentCharacteristics3;
    }

    public SD1 getSafetyData3() {
        return safetyData3;
    }

    public void setSafetyData3(SD1 safetyData3) {
        this.safetyData3 = safetyData3;
    }

    public PKD getPackagingDescription3() {
        return packagingDescription3;
    }

    public void setPackagingDescription3(PKD packagingDescription3) {
        this.packagingDescription3 = packagingDescription3;
    }

    public MSG getMessageText3() {
        return messageText3;
    }

    public void setMessageText3(MSG messageText3) {
        this.messageText3 = messageText3;
    }

    public III getInformation3() {
        return information3;
    }

    public void setInformation3(III information3) {
        this.information3 = information3;
    }

    public DTP getDateorTimeorPeriod11() {
        return dateorTimeorPeriod11;
    }

    public void setDateorTimeorPeriod11(DTP dateorTimeorPeriod11) {
        this.dateorTimeorPeriod11 = dateorTimeorPeriod11;
    }

    public AMT getMonetaryAmountInformation6() {
        return monetaryAmountInformation6;
    }

    public void setMonetaryAmountInformation6(AMT monetaryAmountInformation6) {
        this.monetaryAmountInformation6 = monetaryAmountInformation6;
    }

    public PCT getPercentAmounts6() {
        return percentAmounts6;
    }

    public void setPercentAmounts6(PCT percentAmounts6) {
        this.percentAmounts6 = percentAmounts6;
    }

    public LQ getIndustryCodeIdentification3() {
        return industryCodeIdentification3;
    }

    public void setIndustryCodeIdentification3(LQ industryCodeIdentification3) {
        this.industryCodeIdentification3 = industryCodeIdentification3;
    }

    public AMT getMonetaryAmountInformation7() {
        return monetaryAmountInformation7;
    }

    public void setMonetaryAmountInformation7(AMT monetaryAmountInformation7) {
        this.monetaryAmountInformation7 = monetaryAmountInformation7;
    }

    public PCT getPercentAmounts7() {
        return percentAmounts7;
    }

    public void setPercentAmounts7(PCT percentAmounts7) {
        this.percentAmounts7 = percentAmounts7;
    }

    public LS getLoopHeader3() {
        return loopHeader3;
    }

    public void setLoopHeader3(LS loopHeader3) {
        this.loopHeader3 = loopHeader3;
    }

    public NM1 getIndividualorOrganizationalName7() {
        return individualorOrganizationalName7;
    }

    public void setIndividualorOrganizationalName7(NM1 individualorOrganizationalName7) {
        this.individualorOrganizationalName7 = individualorOrganizationalName7;
    }

    public N2 getAdditionalNameInformation7() {
        return additionalNameInformation7;
    }

    public void setAdditionalNameInformation7(N2 additionalNameInformation7) {
        this.additionalNameInformation7 = additionalNameInformation7;
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

    public PER getAdministrativeCommunicationsContact7() {
        return administrativeCommunicationsContact7;
    }

    public void setAdministrativeCommunicationsContact7(PER administrativeCommunicationsContact7) {
        this.administrativeCommunicationsContact7 = administrativeCommunicationsContact7;
    }

    public PRV getProviderInformation7() {
        return providerInformation7;
    }

    public void setProviderInformation7(PRV providerInformation7) {
        this.providerInformation7 = providerInformation7;
    }

    public LE getLoopTrailer3() {
        return loopTrailer3;
    }

    public void setLoopTrailer3(LE loopTrailer3) {
        this.loopTrailer3 = loopTrailer3;
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

    public AAA getRequestValidation12() {
        return requestValidation12;
    }

    public void setRequestValidation12(AAA requestValidation12) {
        this.requestValidation12 = requestValidation12;
    }

    public NM1 getIndividualorOrganizationalName8() {
        return individualorOrganizationalName8;
    }

    public void setIndividualorOrganizationalName8(NM1 individualorOrganizationalName8) {
        this.individualorOrganizationalName8 = individualorOrganizationalName8;
    }

    public REF getReferenceInformation8() {
        return referenceInformation8;
    }

    public void setReferenceInformation8(REF referenceInformation8) {
        this.referenceInformation8 = referenceInformation8;
    }

    public N2 getAdditionalNameInformation8() {
        return additionalNameInformation8;
    }

    public void setAdditionalNameInformation8(N2 additionalNameInformation8) {
        this.additionalNameInformation8 = additionalNameInformation8;
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

    public PER getAdministrativeCommunicationsContact8() {
        return administrativeCommunicationsContact8;
    }

    public void setAdministrativeCommunicationsContact8(PER administrativeCommunicationsContact8) {
        this.administrativeCommunicationsContact8 = administrativeCommunicationsContact8;
    }

    public AAA getRequestValidation13() {
        return requestValidation13;
    }

    public void setRequestValidation13(AAA requestValidation13) {
        this.requestValidation13 = requestValidation13;
    }

    public PRV getProviderInformation8() {
        return providerInformation8;
    }

    public void setProviderInformation8(PRV providerInformation8) {
        this.providerInformation8 = providerInformation8;
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

    public HI getHealthCareInformationCodes4() {
        return healthCareInformationCodes4;
    }

    public void setHealthCareInformationCodes4(HI healthCareInformationCodes4) {
        this.healthCareInformationCodes4 = healthCareInformationCodes4;
    }

    public DTP getDateorTimeorPeriod12() {
        return dateorTimeorPeriod12;
    }

    public void setDateorTimeorPeriod12(DTP dateorTimeorPeriod12) {
        this.dateorTimeorPeriod12 = dateorTimeorPeriod12;
    }

    public LUI getLanguageUse4() {
        return languageUse4;
    }

    public void setLanguageUse4(LUI languageUse4) {
        this.languageUse4 = languageUse4;
    }

    public MPI getMilitaryPersonnelInformation4() {
        return militaryPersonnelInformation4;
    }

    public void setMilitaryPersonnelInformation4(MPI militaryPersonnelInformation4) {
        this.militaryPersonnelInformation4 = militaryPersonnelInformation4;
    }

    public EB getEligibilityorBenefitInformation4() {
        return eligibilityorBenefitInformation4;
    }

    public void setEligibilityorBenefitInformation4(EB eligibilityorBenefitInformation4) {
        this.eligibilityorBenefitInformation4 = eligibilityorBenefitInformation4;
    }

    public HSD getHealthCareServicesDelivery4() {
        return healthCareServicesDelivery4;
    }

    public void setHealthCareServicesDelivery4(HSD healthCareServicesDelivery4) {
        this.healthCareServicesDelivery4 = healthCareServicesDelivery4;
    }

    public REF getReferenceInformation9() {
        return referenceInformation9;
    }

    public void setReferenceInformation9(REF referenceInformation9) {
        this.referenceInformation9 = referenceInformation9;
    }

    public DTP getDateorTimeorPeriod13() {
        return dateorTimeorPeriod13;
    }

    public void setDateorTimeorPeriod13(DTP dateorTimeorPeriod13) {
        this.dateorTimeorPeriod13 = dateorTimeorPeriod13;
    }

    public AAA getRequestValidation14() {
        return requestValidation14;
    }

    public void setRequestValidation14(AAA requestValidation14) {
        this.requestValidation14 = requestValidation14;
    }

    public VEH getVehicleInformation4() {
        return vehicleInformation4;
    }

    public void setVehicleInformation4(VEH vehicleInformation4) {
        this.vehicleInformation4 = vehicleInformation4;
    }

    public PID getProductItemDescription4() {
        return productItemDescription4;
    }

    public void setProductItemDescription4(PID productItemDescription4) {
        this.productItemDescription4 = productItemDescription4;
    }

    public PDR getPropertyDescriptionReal4() {
        return propertyDescriptionReal4;
    }

    public void setPropertyDescriptionReal4(PDR propertyDescriptionReal4) {
        this.propertyDescriptionReal4 = propertyDescriptionReal4;
    }

    public PDP getPropertyDescriptionPersonal4() {
        return propertyDescriptionPersonal4;
    }

    public void setPropertyDescriptionPersonal4(PDP propertyDescriptionPersonal4) {
        this.propertyDescriptionPersonal4 = propertyDescriptionPersonal4;
    }

    public LIN getItemIdentificatio4n() {
        return itemIdentificatio4n;
    }

    public void setItemIdentificatio4n(LIN itemIdentificatio4n) {
        this.itemIdentificatio4n = itemIdentificatio4n;
    }

    public EM getEquipmentCharacteristics4() {
        return equipmentCharacteristics4;
    }

    public void setEquipmentCharacteristics4(EM equipmentCharacteristics4) {
        this.equipmentCharacteristics4 = equipmentCharacteristics4;
    }

    public SD1 getSafetyData4() {
        return safetyData4;
    }

    public void setSafetyData4(SD1 safetyData4) {
        this.safetyData4 = safetyData4;
    }

    public PKD getPackagingDescription4() {
        return packagingDescription4;
    }

    public void setPackagingDescription4(PKD packagingDescription4) {
        this.packagingDescription4 = packagingDescription4;
    }

    public MSG getMessageText4() {
        return messageText4;
    }

    public void setMessageText4(MSG messageText4) {
        this.messageText4 = messageText4;
    }

    public III getInformation4() {
        return information4;
    }

    public void setInformation4(III information4) {
        this.information4 = information4;
    }

    public DTP getDateorTimeorPeriod14() {
        return dateorTimeorPeriod14;
    }

    public void setDateorTimeorPeriod14(DTP dateorTimeorPeriod14) {
        this.dateorTimeorPeriod14 = dateorTimeorPeriod14;
    }

    public AMT getMonetaryAmountInformation8() {
        return monetaryAmountInformation8;
    }

    public void setMonetaryAmountInformation8(AMT monetaryAmountInformation8) {
        this.monetaryAmountInformation8 = monetaryAmountInformation8;
    }

    public PCT getPercentAmounts8() {
        return percentAmounts8;
    }

    public void setPercentAmounts8(PCT percentAmounts8) {
        this.percentAmounts8 = percentAmounts8;
    }

    public LQ getIndustryCodeIdentification4() {
        return industryCodeIdentification4;
    }

    public void setIndustryCodeIdentification4(LQ industryCodeIdentification4) {
        this.industryCodeIdentification4 = industryCodeIdentification4;
    }

    public AMT getMonetaryAmountInformation9() {
        return monetaryAmountInformation9;
    }

    public void setMonetaryAmountInformation9(AMT monetaryAmountInformation9) {
        this.monetaryAmountInformation9 = monetaryAmountInformation9;
    }

    public PCT getPercentAmounts9() {
        return percentAmounts9;
    }

    public void setPercentAmounts9(PCT percentAmounts9) {
        this.percentAmounts9 = percentAmounts9;
    }

    public LS getLoopHeader4() {
        return loopHeader4;
    }

    public void setLoopHeader4(LS loopHeader4) {
        this.loopHeader4 = loopHeader4;
    }

    public NM1 getIndividualorOrganizationalName9() {
        return individualorOrganizationalName9;
    }

    public void setIndividualorOrganizationalName9(NM1 individualorOrganizationalName9) {
        this.individualorOrganizationalName9 = individualorOrganizationalName9;
    }

    public N2 getAdditionalNameInformation9() {
        return additionalNameInformation9;
    }

    public void setAdditionalNameInformation9(N2 additionalNameInformation9) {
        this.additionalNameInformation9 = additionalNameInformation9;
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

    public PER getAdministrativeCommunicationsContact9() {
        return administrativeCommunicationsContact9;
    }

    public void setAdministrativeCommunicationsContact9(PER administrativeCommunicationsContact9) {
        this.administrativeCommunicationsContact9 = administrativeCommunicationsContact9;
    }

    public PRV getProviderInformation9() {
        return providerInformation9;
    }

    public void setProviderInformation9(PRV providerInformation9) {
        this.providerInformation9 = providerInformation9;
    }

    public LE getLoopTrailer4() {
        return loopTrailer4;
    }

    public void setLoopTrailer4(LE loopTrailer4) {
        this.loopTrailer4 = loopTrailer4;
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

