package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PYE {
    private String PYE_1_SetIDPYE;
    private String PYE_2_PayeeType;
    private String PYE_3_PayeeRelationshiptoInvoicePatient;
    private String PYE_4_PayeeIdentificationList;
    private String PYE_5_PayeePersonName;
    private String PYE_6_PayeeAddress;
    private String PYE_7_PaymentMethod;

    public String getPYE_1_SetIDPYE() {
        return this.PYE_1_SetIDPYE;
    }

    public void setPYE_1_SetIDPYE(final String PYE_1_SetIDPYE) {
        this.PYE_1_SetIDPYE = PYE_1_SetIDPYE;
    }

    public String getPYE_2_PayeeType() {
        return this.PYE_2_PayeeType;
    }

    public void setPYE_2_PayeeType(final String PYE_2_PayeeType) {
        this.PYE_2_PayeeType = PYE_2_PayeeType;
    }

    public String getPYE_3_PayeeRelationshiptoInvoicePatient() {
        return this.PYE_3_PayeeRelationshiptoInvoicePatient;
    }

    public void setPYE_3_PayeeRelationshiptoInvoicePatient(final String PYE_3_PayeeRelationshiptoInvoicePatient) {
        this.PYE_3_PayeeRelationshiptoInvoicePatient = PYE_3_PayeeRelationshiptoInvoicePatient;
    }

    public String getPYE_4_PayeeIdentificationList() {
        return this.PYE_4_PayeeIdentificationList;
    }

    public void setPYE_4_PayeeIdentificationList(final String PYE_4_PayeeIdentificationList) {
        this.PYE_4_PayeeIdentificationList = PYE_4_PayeeIdentificationList;
    }

    public String getPYE_5_PayeePersonName() {
        return this.PYE_5_PayeePersonName;
    }

    public void setPYE_5_PayeePersonName(final String PYE_5_PayeePersonName) {
        this.PYE_5_PayeePersonName = PYE_5_PayeePersonName;
    }

    public String getPYE_6_PayeeAddress() {
        return this.PYE_6_PayeeAddress;
    }

    public void setPYE_6_PayeeAddress(final String PYE_6_PayeeAddress) {
        this.PYE_6_PayeeAddress = PYE_6_PayeeAddress;
    }

    public String getPYE_7_PaymentMethod() {
        return this.PYE_7_PaymentMethod;
    }

    public void setPYE_7_PaymentMethod(final String PYE_7_PaymentMethod) {
        this.PYE_7_PaymentMethod = PYE_7_PaymentMethod;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

