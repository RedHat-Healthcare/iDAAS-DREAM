package io.connectedhealth_idaas.eventbuilder.builders.edi.hipaa;
import io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PaymentOrderRemittence_820 {
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
private PER administrativeCommunicationsContact;
private RDM remittanceDeliveryMethod;
private N1 partyIdentification1;
private N2 additionalNameInformation1;
private N3 partyLocation1;
private N4 geographicLocation1;
private PER administrativeCommunicationsContact1;
private RDM remittanceDeliveryMethod1;
private N1 partyIdentification2;
private N2 additionalNameInformation2;
private N3 partyLocation2;
private N4 geographicLocation2;
private PER administrativeCommunicationsContact2;
private RDM remittanceDeliveryMethod2;
private ENT entity;
private NM1 individualorOrganizationalName;
private ADX adjustment;
private RMR remittanceAdviceAccountsReceivableOpenItemReference;
private REF referenceInformation1;
private DTM dateTimeReference1;
private IT1 baselineItemDataInvoice;
private SAC service,Promotion,Allowance,orChargeInformation;
private SLN sublineItemDetail;
private ADX adjustment1;
private ENT entity1;
private NM1 individualorOrganizationalName1;
private ADX adjustment2;
private RMR remittanceAdviceAccountsReceivableOpenItemReference2;
private REF referenceInformation2;
private DTM dateTimeReference2;
private ADX adjustment3;
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

    public RDM getRemittanceDeliveryMethod2() {
        return remittanceDeliveryMethod2;
    }

    public void setRemittanceDeliveryMethod2(RDM remittanceDeliveryMethod2) {
        this.remittanceDeliveryMethod2 = remittanceDeliveryMethod2;
    }

    public ENT getEntity() {
        return entity;
    }

    public void setEntity(ENT entity) {
        this.entity = entity;
    }

    public NM1 getIndividualorOrganizationalName() {
        return individualorOrganizationalName;
    }

    public void setIndividualorOrganizationalName(NM1 individualorOrganizationalName) {
        this.individualorOrganizationalName = individualorOrganizationalName;
    }

    public ADX getAdjustment() {
        return adjustment;
    }

    public void setAdjustment(ADX adjustment) {
        this.adjustment = adjustment;
    }

    public RMR getRemittanceAdviceAccountsReceivableOpenItemReference() {
        return remittanceAdviceAccountsReceivableOpenItemReference;
    }

    public void setRemittanceAdviceAccountsReceivableOpenItemReference(RMR remittanceAdviceAccountsReceivableOpenItemReference) {
        this.remittanceAdviceAccountsReceivableOpenItemReference = remittanceAdviceAccountsReceivableOpenItemReference;
    }

    public REF getReferenceInformation1() {
        return referenceInformation1;
    }

    public void setReferenceInformation1(REF referenceInformation1) {
        this.referenceInformation1 = referenceInformation1;
    }

    public DTM getDateTimeReference1() {
        return dateTimeReference1;
    }

    public void setDateTimeReference1(DTM dateTimeReference1) {
        this.dateTimeReference1 = dateTimeReference1;
    }

    public IT1 getBaselineItemDataInvoice() {
        return baselineItemDataInvoice;
    }

    public void setBaselineItemDataInvoice(IT1 baselineItemDataInvoice) {
        this.baselineItemDataInvoice = baselineItemDataInvoice;
    }

    public SAC getService() {
        return service;
    }

    public void setService(SAC service) {
        this.service = service;
    }

    public SAC getPromotion() {
        return Promotion;
    }

    public void setPromotion(SAC promotion) {
        Promotion = promotion;
    }

    public SAC getAllowance() {
        return Allowance;
    }

    public void setAllowance(SAC allowance) {
        Allowance = allowance;
    }

    public SAC getOrChargeInformation() {
        return orChargeInformation;
    }

    public void setOrChargeInformation(SAC orChargeInformation) {
        this.orChargeInformation = orChargeInformation;
    }

    public SLN getSublineItemDetail() {
        return sublineItemDetail;
    }

    public void setSublineItemDetail(SLN sublineItemDetail) {
        this.sublineItemDetail = sublineItemDetail;
    }

    public ADX getAdjustment1() {
        return adjustment1;
    }

    public void setAdjustment1(ADX adjustment1) {
        this.adjustment1 = adjustment1;
    }

    public ENT getEntity1() {
        return entity1;
    }

    public void setEntity1(ENT entity1) {
        this.entity1 = entity1;
    }

    public NM1 getIndividualorOrganizationalName1() {
        return individualorOrganizationalName1;
    }

    public void setIndividualorOrganizationalName1(NM1 individualorOrganizationalName1) {
        this.individualorOrganizationalName1 = individualorOrganizationalName1;
    }

    public ADX getAdjustment2() {
        return adjustment2;
    }

    public void setAdjustment2(ADX adjustment2) {
        this.adjustment2 = adjustment2;
    }

    public RMR getRemittanceAdviceAccountsReceivableOpenItemReference2() {
        return remittanceAdviceAccountsReceivableOpenItemReference2;
    }

    public void setRemittanceAdviceAccountsReceivableOpenItemReference2(RMR remittanceAdviceAccountsReceivableOpenItemReference2) {
        this.remittanceAdviceAccountsReceivableOpenItemReference2 = remittanceAdviceAccountsReceivableOpenItemReference2;
    }

    public REF getReferenceInformation2() {
        return referenceInformation2;
    }

    public void setReferenceInformation2(REF referenceInformation2) {
        this.referenceInformation2 = referenceInformation2;
    }

    public DTM getDateTimeReference2() {
        return dateTimeReference2;
    }

    public void setDateTimeReference2(DTM dateTimeReference2) {
        this.dateTimeReference2 = dateTimeReference2;
    }

    public ADX getAdjustment3() {
        return adjustment3;
    }

    public void setAdjustment3(ADX adjustment3) {
        this.adjustment3 = adjustment3;
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

