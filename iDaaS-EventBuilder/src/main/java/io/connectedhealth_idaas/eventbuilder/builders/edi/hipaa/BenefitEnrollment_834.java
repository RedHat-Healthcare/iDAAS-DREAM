package io.connectedhealth_idaas.eventbuilder.builders.edi.hipaa;
import io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BenefitEnrollment_834 {
private ST transactionSetHeader;
private S4S securityHeaderLevel2;
private S4A assuranceHeaderLevel2;
private BGN beginningSegment;
private REF referenceInformation;
private DTP dateorTimeorPeriod;
private AMT monetaryAmountInformation;
private QTY quantityInformation;
private N1 partyIdentification;
private N2 additionalNameInformation;
private N3 partyLocation;
private N4 geographicLocation;
private PER administrativeCommunicationsContact;
private ACT accountIdentification;
private REF referenceInformation1;
private N3 partyLocation1;
private N4 geographicLocation1;
private PER administrativeCommunicationsContact1;
private DTP dateorTimeorPeriod1;
private AMT monetaryAmountInformation1;
private N1 partyIdentification1;
private N2 additionalNameInformation1;
private N3 partyLocation2;
private N4 geographicLocation2;
private PER administrativeCommunicationsContact2;
private ACT accountIdentification1;
private REF referenceInformation2;
private N3 partyLocation3;
private N4 geographicLocation3;
private PER administrativeCommunicationsContact3;
private DTP dateorTimeorPeriod2;
private AMT monetaryAmountInformation2;
private N1 partyIdentification2;
private N2 additionalNameInformation2;
private N3 partyLocation4;
private N4 geographicLocation4;
private PER administrativeCommunicationsContact4;
private ACT accountIdentification2;
private REF referenceInformation3;
private N3 partyLocation5;
private N4 geographicLocation5;
private PER administrativeCommunicationsContact5;
private DTP dateorTimeorPeriod3;
private AMT monetaryAmountInformation3;
private INS insuredBenefit;
private REF referenceInformation4;
private DTP dateorTimeorPeriod4;
private NM1 individualorOrganizationalName;
private PER administrativeCommunicationsContact6;
private N3 partyLocation6;
private N4 geographicLocation6;
private DMG demographicInformation;
private PM electronicFundsTransferInformation;
private EC employmentClass;
private ICM individualIncome;
private AMT monetaryAmountInformation4;
private HLH healthInformation;
private HI healthCareInformationCodes;
private LUI languageUse;
private DSB disabilityInformation;
private DTP dateorTimeorPeriod5;
private AD1 adjustmentAmount;
private HD healthCoverage;
private DTP dateorTimeorPeriod6;
private AMT monetaryAmountInformation5;
private REF referenceInformation5;
private IDC identificationCard;
private LX transactionSetLineNumber;
private NM1 individualorOrganizationalName1;
private N1 partyIdentification3;
private N2 additionalNameInformation3;
private N3 partyLocation7;
private N4 geographicLocation7;
private PER administrativeCommunicationsContact7;
private PRV providerInformation;
private DTP dateorTimeorPeriod7;
private PLA placeorLocation;
private COB coordinationofBenefits;
private REF referenceInformation6;
private DTP dateorTimeorPeriod8;
private NM1 individualorOrganizationalName2;
private N2 additionalNameInformation4;
private N3 partyLocation8;
private N4 geographicLocation8;
private PER administrativeCommunicationsContact8;
private LC lifeCoverage;
private AMT monetaryAmountInformation6;
private DTP dateorTimeorPeriod9;
private REF referenceInformation7;
private BEN beneficiaryorOwnerInformation;
private NM1 individualorOrganizationalName3;
private N1 partyIdentification4;
private N2 additionalNameInformation5;
private N3 partyLocation9;
private N4 geographicLocation9;
private DMG demographicInformation1;
private FSA flexibleSpendingAccount;
private AMT monetaryAmountInformation7;
private DTP dateorTimeorPeriod10;
private REF referenceInformation8;
private RP retirementProduct;
private DTP dateorTimeorPeriod11;
private REF referenceInformation9;
private INV investmentVehicleSelection;
private AMT monetaryAmountInformation8;
private QTY quantityInformation1;
private K3 fileInformation;
private REL relationship;
private NM1 individualorOrganizationalName4;
private N2 additionalNameInformation6;
private DMG demographicInformation2;
private BEN beneficiaryorOwnerInformation1;
private REF referenceInformation10;
private NX1 propertyorEntityIdentification;
private N3 partyLocation10;
private N4 geographicLocation10;
private DTP dateorTimeorPeriod12;
private FC financialContribution;
private DTP dateorTimeorPeriod13;
private INV investmentVehicleSelection1;
private DTP dateorTimeorPeriod14;
private QTY quantityInformation2;
private ENT entity;
private REF referenceInformation11;
private AMT monetaryAmountInformation9;
private K3 fileInformation1;
private AIN income;
private QTY quantityInformation3;
private DTP dateorTimeorPeriod15;
private LS loopHeader;
private LX transactionSetLineNumber1;
private N1 partyIdentification5;
private REF referenceInformation12;
private DTP dateorTimeorPeriod16;
private LE loopTrailer;
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

    public BGN getBeginningSegment() {
        return beginningSegment;
    }

    public void setBeginningSegment(BGN beginningSegment) {
        this.beginningSegment = beginningSegment;
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

    public AMT getMonetaryAmountInformation() {
        return monetaryAmountInformation;
    }

    public void setMonetaryAmountInformation(AMT monetaryAmountInformation) {
        this.monetaryAmountInformation = monetaryAmountInformation;
    }

    public QTY getQuantityInformation() {
        return quantityInformation;
    }

    public void setQuantityInformation(QTY quantityInformation) {
        this.quantityInformation = quantityInformation;
    }

    public N1 getPartyIdentification() {
        return partyIdentification;
    }

    public void setPartyIdentification(N1 partyIdentification) {
        this.partyIdentification = partyIdentification;
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

    public ACT getAccountIdentification() {
        return accountIdentification;
    }

    public void setAccountIdentification(ACT accountIdentification) {
        this.accountIdentification = accountIdentification;
    }

    public REF getReferenceInformation1() {
        return referenceInformation1;
    }

    public void setReferenceInformation1(REF referenceInformation1) {
        this.referenceInformation1 = referenceInformation1;
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

    public DTP getDateorTimeorPeriod1() {
        return dateorTimeorPeriod1;
    }

    public void setDateorTimeorPeriod1(DTP dateorTimeorPeriod1) {
        this.dateorTimeorPeriod1 = dateorTimeorPeriod1;
    }

    public AMT getMonetaryAmountInformation1() {
        return monetaryAmountInformation1;
    }

    public void setMonetaryAmountInformation1(AMT monetaryAmountInformation1) {
        this.monetaryAmountInformation1 = monetaryAmountInformation1;
    }

    public N1 getPartyIdentification1() {
        return partyIdentification1;
    }

    public void setPartyIdentification1(N1 partyIdentification1) {
        this.partyIdentification1 = partyIdentification1;
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

    public ACT getAccountIdentification1() {
        return accountIdentification1;
    }

    public void setAccountIdentification1(ACT accountIdentification1) {
        this.accountIdentification1 = accountIdentification1;
    }

    public REF getReferenceInformation2() {
        return referenceInformation2;
    }

    public void setReferenceInformation2(REF referenceInformation2) {
        this.referenceInformation2 = referenceInformation2;
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

    public DTP getDateorTimeorPeriod2() {
        return dateorTimeorPeriod2;
    }

    public void setDateorTimeorPeriod2(DTP dateorTimeorPeriod2) {
        this.dateorTimeorPeriod2 = dateorTimeorPeriod2;
    }

    public AMT getMonetaryAmountInformation2() {
        return monetaryAmountInformation2;
    }

    public void setMonetaryAmountInformation2(AMT monetaryAmountInformation2) {
        this.monetaryAmountInformation2 = monetaryAmountInformation2;
    }

    public N1 getPartyIdentification2() {
        return partyIdentification2;
    }

    public void setPartyIdentification2(N1 partyIdentification2) {
        this.partyIdentification2 = partyIdentification2;
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

    public ACT getAccountIdentification2() {
        return accountIdentification2;
    }

    public void setAccountIdentification2(ACT accountIdentification2) {
        this.accountIdentification2 = accountIdentification2;
    }

    public REF getReferenceInformation3() {
        return referenceInformation3;
    }

    public void setReferenceInformation3(REF referenceInformation3) {
        this.referenceInformation3 = referenceInformation3;
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

    public DTP getDateorTimeorPeriod3() {
        return dateorTimeorPeriod3;
    }

    public void setDateorTimeorPeriod3(DTP dateorTimeorPeriod3) {
        this.dateorTimeorPeriod3 = dateorTimeorPeriod3;
    }

    public AMT getMonetaryAmountInformation3() {
        return monetaryAmountInformation3;
    }

    public void setMonetaryAmountInformation3(AMT monetaryAmountInformation3) {
        this.monetaryAmountInformation3 = monetaryAmountInformation3;
    }

    public INS getInsuredBenefit() {
        return insuredBenefit;
    }

    public void setInsuredBenefit(INS insuredBenefit) {
        this.insuredBenefit = insuredBenefit;
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

    public NM1 getIndividualorOrganizationalName() {
        return individualorOrganizationalName;
    }

    public void setIndividualorOrganizationalName(NM1 individualorOrganizationalName) {
        this.individualorOrganizationalName = individualorOrganizationalName;
    }

    public PER getAdministrativeCommunicationsContact6() {
        return administrativeCommunicationsContact6;
    }

    public void setAdministrativeCommunicationsContact6(PER administrativeCommunicationsContact6) {
        this.administrativeCommunicationsContact6 = administrativeCommunicationsContact6;
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

    public DMG getDemographicInformation() {
        return demographicInformation;
    }

    public void setDemographicInformation(DMG demographicInformation) {
        this.demographicInformation = demographicInformation;
    }

    public PM getElectronicFundsTransferInformation() {
        return electronicFundsTransferInformation;
    }

    public void setElectronicFundsTransferInformation(PM electronicFundsTransferInformation) {
        this.electronicFundsTransferInformation = electronicFundsTransferInformation;
    }

    public EC getEmploymentClass() {
        return employmentClass;
    }

    public void setEmploymentClass(EC employmentClass) {
        this.employmentClass = employmentClass;
    }

    public ICM getIndividualIncome() {
        return individualIncome;
    }

    public void setIndividualIncome(ICM individualIncome) {
        this.individualIncome = individualIncome;
    }

    public AMT getMonetaryAmountInformation4() {
        return monetaryAmountInformation4;
    }

    public void setMonetaryAmountInformation4(AMT monetaryAmountInformation4) {
        this.monetaryAmountInformation4 = monetaryAmountInformation4;
    }

    public HLH getHealthInformation() {
        return healthInformation;
    }

    public void setHealthInformation(HLH healthInformation) {
        this.healthInformation = healthInformation;
    }

    public HI getHealthCareInformationCodes() {
        return healthCareInformationCodes;
    }

    public void setHealthCareInformationCodes(HI healthCareInformationCodes) {
        this.healthCareInformationCodes = healthCareInformationCodes;
    }

    public LUI getLanguageUse() {
        return languageUse;
    }

    public void setLanguageUse(LUI languageUse) {
        this.languageUse = languageUse;
    }

    public DSB getDisabilityInformation() {
        return disabilityInformation;
    }

    public void setDisabilityInformation(DSB disabilityInformation) {
        this.disabilityInformation = disabilityInformation;
    }

    public DTP getDateorTimeorPeriod5() {
        return dateorTimeorPeriod5;
    }

    public void setDateorTimeorPeriod5(DTP dateorTimeorPeriod5) {
        this.dateorTimeorPeriod5 = dateorTimeorPeriod5;
    }

    public AD1 getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(AD1 adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    public HD getHealthCoverage() {
        return healthCoverage;
    }

    public void setHealthCoverage(HD healthCoverage) {
        this.healthCoverage = healthCoverage;
    }

    public DTP getDateorTimeorPeriod6() {
        return dateorTimeorPeriod6;
    }

    public void setDateorTimeorPeriod6(DTP dateorTimeorPeriod6) {
        this.dateorTimeorPeriod6 = dateorTimeorPeriod6;
    }

    public AMT getMonetaryAmountInformation5() {
        return monetaryAmountInformation5;
    }

    public void setMonetaryAmountInformation5(AMT monetaryAmountInformation5) {
        this.monetaryAmountInformation5 = monetaryAmountInformation5;
    }

    public REF getReferenceInformation5() {
        return referenceInformation5;
    }

    public void setReferenceInformation5(REF referenceInformation5) {
        this.referenceInformation5 = referenceInformation5;
    }

    public IDC getIdentificationCard() {
        return identificationCard;
    }

    public void setIdentificationCard(IDC identificationCard) {
        this.identificationCard = identificationCard;
    }

    public LX getTransactionSetLineNumber() {
        return transactionSetLineNumber;
    }

    public void setTransactionSetLineNumber(LX transactionSetLineNumber) {
        this.transactionSetLineNumber = transactionSetLineNumber;
    }

    public NM1 getIndividualorOrganizationalName1() {
        return individualorOrganizationalName1;
    }

    public void setIndividualorOrganizationalName1(NM1 individualorOrganizationalName1) {
        this.individualorOrganizationalName1 = individualorOrganizationalName1;
    }

    public N1 getPartyIdentification3() {
        return partyIdentification3;
    }

    public void setPartyIdentification3(N1 partyIdentification3) {
        this.partyIdentification3 = partyIdentification3;
    }

    public N2 getAdditionalNameInformation3() {
        return additionalNameInformation3;
    }

    public void setAdditionalNameInformation3(N2 additionalNameInformation3) {
        this.additionalNameInformation3 = additionalNameInformation3;
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

    public PRV getProviderInformation() {
        return providerInformation;
    }

    public void setProviderInformation(PRV providerInformation) {
        this.providerInformation = providerInformation;
    }

    public DTP getDateorTimeorPeriod7() {
        return dateorTimeorPeriod7;
    }

    public void setDateorTimeorPeriod7(DTP dateorTimeorPeriod7) {
        this.dateorTimeorPeriod7 = dateorTimeorPeriod7;
    }

    public PLA getPlaceorLocation() {
        return placeorLocation;
    }

    public void setPlaceorLocation(PLA placeorLocation) {
        this.placeorLocation = placeorLocation;
    }

    public COB getCoordinationofBenefits() {
        return coordinationofBenefits;
    }

    public void setCoordinationofBenefits(COB coordinationofBenefits) {
        this.coordinationofBenefits = coordinationofBenefits;
    }

    public REF getReferenceInformation6() {
        return referenceInformation6;
    }

    public void setReferenceInformation6(REF referenceInformation6) {
        this.referenceInformation6 = referenceInformation6;
    }

    public DTP getDateorTimeorPeriod8() {
        return dateorTimeorPeriod8;
    }

    public void setDateorTimeorPeriod8(DTP dateorTimeorPeriod8) {
        this.dateorTimeorPeriod8 = dateorTimeorPeriod8;
    }

    public NM1 getIndividualorOrganizationalName2() {
        return individualorOrganizationalName2;
    }

    public void setIndividualorOrganizationalName2(NM1 individualorOrganizationalName2) {
        this.individualorOrganizationalName2 = individualorOrganizationalName2;
    }

    public N2 getAdditionalNameInformation4() {
        return additionalNameInformation4;
    }

    public void setAdditionalNameInformation4(N2 additionalNameInformation4) {
        this.additionalNameInformation4 = additionalNameInformation4;
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

    public LC getLifeCoverage() {
        return lifeCoverage;
    }

    public void setLifeCoverage(LC lifeCoverage) {
        this.lifeCoverage = lifeCoverage;
    }

    public AMT getMonetaryAmountInformation6() {
        return monetaryAmountInformation6;
    }

    public void setMonetaryAmountInformation6(AMT monetaryAmountInformation6) {
        this.monetaryAmountInformation6 = monetaryAmountInformation6;
    }

    public DTP getDateorTimeorPeriod9() {
        return dateorTimeorPeriod9;
    }

    public void setDateorTimeorPeriod9(DTP dateorTimeorPeriod9) {
        this.dateorTimeorPeriod9 = dateorTimeorPeriod9;
    }

    public REF getReferenceInformation7() {
        return referenceInformation7;
    }

    public void setReferenceInformation7(REF referenceInformation7) {
        this.referenceInformation7 = referenceInformation7;
    }

    public BEN getBeneficiaryorOwnerInformation() {
        return beneficiaryorOwnerInformation;
    }

    public void setBeneficiaryorOwnerInformation(BEN beneficiaryorOwnerInformation) {
        this.beneficiaryorOwnerInformation = beneficiaryorOwnerInformation;
    }

    public NM1 getIndividualorOrganizationalName3() {
        return individualorOrganizationalName3;
    }

    public void setIndividualorOrganizationalName3(NM1 individualorOrganizationalName3) {
        this.individualorOrganizationalName3 = individualorOrganizationalName3;
    }

    public N1 getPartyIdentification4() {
        return partyIdentification4;
    }

    public void setPartyIdentification4(N1 partyIdentification4) {
        this.partyIdentification4 = partyIdentification4;
    }

    public N2 getAdditionalNameInformation5() {
        return additionalNameInformation5;
    }

    public void setAdditionalNameInformation5(N2 additionalNameInformation5) {
        this.additionalNameInformation5 = additionalNameInformation5;
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

    public DMG getDemographicInformation1() {
        return demographicInformation1;
    }

    public void setDemographicInformation1(DMG demographicInformation1) {
        this.demographicInformation1 = demographicInformation1;
    }

    public FSA getFlexibleSpendingAccount() {
        return flexibleSpendingAccount;
    }

    public void setFlexibleSpendingAccount(FSA flexibleSpendingAccount) {
        this.flexibleSpendingAccount = flexibleSpendingAccount;
    }

    public AMT getMonetaryAmountInformation7() {
        return monetaryAmountInformation7;
    }

    public void setMonetaryAmountInformation7(AMT monetaryAmountInformation7) {
        this.monetaryAmountInformation7 = monetaryAmountInformation7;
    }

    public DTP getDateorTimeorPeriod10() {
        return dateorTimeorPeriod10;
    }

    public void setDateorTimeorPeriod10(DTP dateorTimeorPeriod10) {
        this.dateorTimeorPeriod10 = dateorTimeorPeriod10;
    }

    public REF getReferenceInformation8() {
        return referenceInformation8;
    }

    public void setReferenceInformation8(REF referenceInformation8) {
        this.referenceInformation8 = referenceInformation8;
    }

    public RP getRetirementProduct() {
        return retirementProduct;
    }

    public void setRetirementProduct(RP retirementProduct) {
        this.retirementProduct = retirementProduct;
    }

    public DTP getDateorTimeorPeriod11() {
        return dateorTimeorPeriod11;
    }

    public void setDateorTimeorPeriod11(DTP dateorTimeorPeriod11) {
        this.dateorTimeorPeriod11 = dateorTimeorPeriod11;
    }

    public REF getReferenceInformation9() {
        return referenceInformation9;
    }

    public void setReferenceInformation9(REF referenceInformation9) {
        this.referenceInformation9 = referenceInformation9;
    }

    public INV getInvestmentVehicleSelection() {
        return investmentVehicleSelection;
    }

    public void setInvestmentVehicleSelection(INV investmentVehicleSelection) {
        this.investmentVehicleSelection = investmentVehicleSelection;
    }

    public AMT getMonetaryAmountInformation8() {
        return monetaryAmountInformation8;
    }

    public void setMonetaryAmountInformation8(AMT monetaryAmountInformation8) {
        this.monetaryAmountInformation8 = monetaryAmountInformation8;
    }

    public QTY getQuantityInformation1() {
        return quantityInformation1;
    }

    public void setQuantityInformation1(QTY quantityInformation1) {
        this.quantityInformation1 = quantityInformation1;
    }

    public K3 getFileInformation() {
        return fileInformation;
    }

    public void setFileInformation(K3 fileInformation) {
        this.fileInformation = fileInformation;
    }

    public REL getRelationship() {
        return relationship;
    }

    public void setRelationship(REL relationship) {
        this.relationship = relationship;
    }

    public NM1 getIndividualorOrganizationalName4() {
        return individualorOrganizationalName4;
    }

    public void setIndividualorOrganizationalName4(NM1 individualorOrganizationalName4) {
        this.individualorOrganizationalName4 = individualorOrganizationalName4;
    }

    public N2 getAdditionalNameInformation6() {
        return additionalNameInformation6;
    }

    public void setAdditionalNameInformation6(N2 additionalNameInformation6) {
        this.additionalNameInformation6 = additionalNameInformation6;
    }

    public DMG getDemographicInformation2() {
        return demographicInformation2;
    }

    public void setDemographicInformation2(DMG demographicInformation2) {
        this.demographicInformation2 = demographicInformation2;
    }

    public BEN getBeneficiaryorOwnerInformation1() {
        return beneficiaryorOwnerInformation1;
    }

    public void setBeneficiaryorOwnerInformation1(BEN beneficiaryorOwnerInformation1) {
        this.beneficiaryorOwnerInformation1 = beneficiaryorOwnerInformation1;
    }

    public REF getReferenceInformation10() {
        return referenceInformation10;
    }

    public void setReferenceInformation10(REF referenceInformation10) {
        this.referenceInformation10 = referenceInformation10;
    }

    public NX1 getPropertyorEntityIdentification() {
        return propertyorEntityIdentification;
    }

    public void setPropertyorEntityIdentification(NX1 propertyorEntityIdentification) {
        this.propertyorEntityIdentification = propertyorEntityIdentification;
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

    public DTP getDateorTimeorPeriod12() {
        return dateorTimeorPeriod12;
    }

    public void setDateorTimeorPeriod12(DTP dateorTimeorPeriod12) {
        this.dateorTimeorPeriod12 = dateorTimeorPeriod12;
    }

    public FC getFinancialContribution() {
        return financialContribution;
    }

    public void setFinancialContribution(FC financialContribution) {
        this.financialContribution = financialContribution;
    }

    public DTP getDateorTimeorPeriod13() {
        return dateorTimeorPeriod13;
    }

    public void setDateorTimeorPeriod13(DTP dateorTimeorPeriod13) {
        this.dateorTimeorPeriod13 = dateorTimeorPeriod13;
    }

    public INV getInvestmentVehicleSelection1() {
        return investmentVehicleSelection1;
    }

    public void setInvestmentVehicleSelection1(INV investmentVehicleSelection1) {
        this.investmentVehicleSelection1 = investmentVehicleSelection1;
    }

    public DTP getDateorTimeorPeriod14() {
        return dateorTimeorPeriod14;
    }

    public void setDateorTimeorPeriod14(DTP dateorTimeorPeriod14) {
        this.dateorTimeorPeriod14 = dateorTimeorPeriod14;
    }

    public QTY getQuantityInformation2() {
        return quantityInformation2;
    }

    public void setQuantityInformation2(QTY quantityInformation2) {
        this.quantityInformation2 = quantityInformation2;
    }

    public ENT getEntity() {
        return entity;
    }

    public void setEntity(ENT entity) {
        this.entity = entity;
    }

    public REF getReferenceInformation11() {
        return referenceInformation11;
    }

    public void setReferenceInformation11(REF referenceInformation11) {
        this.referenceInformation11 = referenceInformation11;
    }

    public AMT getMonetaryAmountInformation9() {
        return monetaryAmountInformation9;
    }

    public void setMonetaryAmountInformation9(AMT monetaryAmountInformation9) {
        this.monetaryAmountInformation9 = monetaryAmountInformation9;
    }

    public K3 getFileInformation1() {
        return fileInformation1;
    }

    public void setFileInformation1(K3 fileInformation1) {
        this.fileInformation1 = fileInformation1;
    }

    public AIN getIncome() {
        return income;
    }

    public void setIncome(AIN income) {
        this.income = income;
    }

    public QTY getQuantityInformation3() {
        return quantityInformation3;
    }

    public void setQuantityInformation3(QTY quantityInformation3) {
        this.quantityInformation3 = quantityInformation3;
    }

    public DTP getDateorTimeorPeriod15() {
        return dateorTimeorPeriod15;
    }

    public void setDateorTimeorPeriod15(DTP dateorTimeorPeriod15) {
        this.dateorTimeorPeriod15 = dateorTimeorPeriod15;
    }

    public LS getLoopHeader() {
        return loopHeader;
    }

    public void setLoopHeader(LS loopHeader) {
        this.loopHeader = loopHeader;
    }

    public LX getTransactionSetLineNumber1() {
        return transactionSetLineNumber1;
    }

    public void setTransactionSetLineNumber1(LX transactionSetLineNumber1) {
        this.transactionSetLineNumber1 = transactionSetLineNumber1;
    }

    public N1 getPartyIdentification5() {
        return partyIdentification5;
    }

    public void setPartyIdentification5(N1 partyIdentification5) {
        this.partyIdentification5 = partyIdentification5;
    }

    public REF getReferenceInformation12() {
        return referenceInformation12;
    }

    public void setReferenceInformation12(REF referenceInformation12) {
        this.referenceInformation12 = referenceInformation12;
    }

    public DTP getDateorTimeorPeriod16() {
        return dateorTimeorPeriod16;
    }

    public void setDateorTimeorPeriod16(DTP dateorTimeorPeriod16) {
        this.dateorTimeorPeriod16 = dateorTimeorPeriod16;
    }

    public LE getLoopTrailer() {
        return loopTrailer;
    }

    public void setLoopTrailer(LE loopTrailer) {
        this.loopTrailer = loopTrailer;
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

