package io.connectedhealth_idaas.eventbuilder.builders.edi.hipaa;
import io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HealthcareClaimPayment_835 {
private ST transactionSetHeader;
private S4S securityHeaderLevel2;
private S4A assuranceHeaderLevel2;
private BPR beginningSegmentforPaymentOrderRemittanceAdvice;
private NTE noteSpecialInstruction;
private TRN trace;
private CUR currency;
private REF referenceInformation;
private DTM dateTimeReference;
private N1 partyIdentification;
private N2 additionalNameInformation;
private N3 partyLocation;
private N4 geographicLocation;
private REF referenceInformation1;
private PER administrativeCommunicationsContact;
private RDM remittanceDeliveryMethod;
private DTM dateTimeReference1;
private N1 partyIdentification1;
private N2 additionalNameInformation1;
private N3 partyLocation1;
private N4 geographicLocation1;
private REF referenceInformation2;
private PER administrativeCommunicationsContact1;
private RDM remittanceDeliveryMethod1;
private DTM dateTimeReference2;
private LX transactionSetLineNumber;
private TS3 transactionStatistics;
private TS2 transactionSupplementalStatistics;
private CLP claimLevelData;
private CAS claimsAdjustment;
private NM1 individualorOrganizationalName;
private MIA medicareInpatientAdjudication;
private MOA medicareOutpatientAdjudication;
private REF referenceInformation3;
private DTM dateTimeReference3;
private PER administrativeCommunicationsContact2;
private AMT monetaryAmountInformation;
private QTY quantityInformation;
private SVC serviceInformation;
private DTM dateTimeReference4;
private CAS claimsAdjustment1;
private REF referenceInformation4;
private AMT monetaryAmountInformation1;
private QTY quantityInformation1;
private PLB providerLevelAdjustment;
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

    public BPR getBeginningSegmentforPaymentOrderRemittanceAdvice() {
        return beginningSegmentforPaymentOrderRemittanceAdvice;
    }

    public void setBeginningSegmentforPaymentOrderRemittanceAdvice(BPR beginningSegmentforPaymentOrderRemittanceAdvice) {
        this.beginningSegmentforPaymentOrderRemittanceAdvice = beginningSegmentforPaymentOrderRemittanceAdvice;
    }

    public NTE getNoteSpecialInstruction() {
        return noteSpecialInstruction;
    }

    public void setNoteSpecialInstruction(NTE noteSpecialInstruction) {
        this.noteSpecialInstruction = noteSpecialInstruction;
    }

    public TRN getTrace() {
        return trace;
    }

    public void setTrace(TRN trace) {
        this.trace = trace;
    }

    public CUR getCurrency() {
        return currency;
    }

    public void setCurrency(CUR currency) {
        this.currency = currency;
    }

    public REF getReferenceInformation() {
        return referenceInformation;
    }

    public void setReferenceInformation(REF referenceInformation) {
        this.referenceInformation = referenceInformation;
    }

    public DTM getDateTimeReference() {
        return dateTimeReference;
    }

    public void setDateTimeReference(DTM dateTimeReference) {
        this.dateTimeReference = dateTimeReference;
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

    public REF getReferenceInformation1() {
        return referenceInformation1;
    }

    public void setReferenceInformation1(REF referenceInformation1) {
        this.referenceInformation1 = referenceInformation1;
    }

    public PER getAdministrativeCommunicationsContact() {
        return administrativeCommunicationsContact;
    }

    public void setAdministrativeCommunicationsContact(PER administrativeCommunicationsContact) {
        this.administrativeCommunicationsContact = administrativeCommunicationsContact;
    }

    public RDM getRemittanceDeliveryMethod() {
        return remittanceDeliveryMethod;
    }

    public void setRemittanceDeliveryMethod(RDM remittanceDeliveryMethod) {
        this.remittanceDeliveryMethod = remittanceDeliveryMethod;
    }

    public DTM getDateTimeReference1() {
        return dateTimeReference1;
    }

    public void setDateTimeReference1(DTM dateTimeReference1) {
        this.dateTimeReference1 = dateTimeReference1;
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

    public PER getAdministrativeCommunicationsContact1() {
        return administrativeCommunicationsContact1;
    }

    public void setAdministrativeCommunicationsContact1(PER administrativeCommunicationsContact1) {
        this.administrativeCommunicationsContact1 = administrativeCommunicationsContact1;
    }

    public RDM getRemittanceDeliveryMethod1() {
        return remittanceDeliveryMethod1;
    }

    public void setRemittanceDeliveryMethod1(RDM remittanceDeliveryMethod1) {
        this.remittanceDeliveryMethod1 = remittanceDeliveryMethod1;
    }

    public DTM getDateTimeReference2() {
        return dateTimeReference2;
    }

    public void setDateTimeReference2(DTM dateTimeReference2) {
        this.dateTimeReference2 = dateTimeReference2;
    }

    public LX getTransactionSetLineNumber() {
        return transactionSetLineNumber;
    }

    public void setTransactionSetLineNumber(LX transactionSetLineNumber) {
        this.transactionSetLineNumber = transactionSetLineNumber;
    }

    public TS3 getTransactionStatistics() {
        return transactionStatistics;
    }

    public void setTransactionStatistics(TS3 transactionStatistics) {
        this.transactionStatistics = transactionStatistics;
    }

    public TS2 getTransactionSupplementalStatistics() {
        return transactionSupplementalStatistics;
    }

    public void setTransactionSupplementalStatistics(TS2 transactionSupplementalStatistics) {
        this.transactionSupplementalStatistics = transactionSupplementalStatistics;
    }

    public CLP getClaimLevelData() {
        return claimLevelData;
    }

    public void setClaimLevelData(CLP claimLevelData) {
        this.claimLevelData = claimLevelData;
    }

    public CAS getClaimsAdjustment() {
        return claimsAdjustment;
    }

    public void setClaimsAdjustment(CAS claimsAdjustment) {
        this.claimsAdjustment = claimsAdjustment;
    }

    public NM1 getIndividualorOrganizationalName() {
        return individualorOrganizationalName;
    }

    public void setIndividualorOrganizationalName(NM1 individualorOrganizationalName) {
        this.individualorOrganizationalName = individualorOrganizationalName;
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

    public REF getReferenceInformation3() {
        return referenceInformation3;
    }

    public void setReferenceInformation3(REF referenceInformation3) {
        this.referenceInformation3 = referenceInformation3;
    }

    public DTM getDateTimeReference3() {
        return dateTimeReference3;
    }

    public void setDateTimeReference3(DTM dateTimeReference3) {
        this.dateTimeReference3 = dateTimeReference3;
    }

    public PER getAdministrativeCommunicationsContact2() {
        return administrativeCommunicationsContact2;
    }

    public void setAdministrativeCommunicationsContact2(PER administrativeCommunicationsContact2) {
        this.administrativeCommunicationsContact2 = administrativeCommunicationsContact2;
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

    public SVC getServiceInformation() {
        return serviceInformation;
    }

    public void setServiceInformation(SVC serviceInformation) {
        this.serviceInformation = serviceInformation;
    }

    public DTM getDateTimeReference4() {
        return dateTimeReference4;
    }

    public void setDateTimeReference4(DTM dateTimeReference4) {
        this.dateTimeReference4 = dateTimeReference4;
    }

    public CAS getClaimsAdjustment1() {
        return claimsAdjustment1;
    }

    public void setClaimsAdjustment1(CAS claimsAdjustment1) {
        this.claimsAdjustment1 = claimsAdjustment1;
    }

    public REF getReferenceInformation4() {
        return referenceInformation4;
    }

    public void setReferenceInformation4(REF referenceInformation4) {
        this.referenceInformation4 = referenceInformation4;
    }

    public AMT getMonetaryAmountInformation1() {
        return monetaryAmountInformation1;
    }

    public void setMonetaryAmountInformation1(AMT monetaryAmountInformation1) {
        this.monetaryAmountInformation1 = monetaryAmountInformation1;
    }

    public QTY getQuantityInformation1() {
        return quantityInformation1;
    }

    public void setQuantityInformation1(QTY quantityInformation1) {
        this.quantityInformation1 = quantityInformation1;
    }

    public PLB getProviderLevelAdjustment() {
        return providerLevelAdjustment;
    }

    public void setProviderLevelAdjustment(PLB providerLevelAdjustment) {
        this.providerLevelAdjustment = providerLevelAdjustment;
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

