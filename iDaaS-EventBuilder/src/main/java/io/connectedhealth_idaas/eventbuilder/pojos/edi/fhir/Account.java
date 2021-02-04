package io.connectedhealth_idaas.eventbuilder.pojos.edi.fhir;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * https://www.hl7.org/fhir/account.html
 * Represents a FHIR Account Resource
 * This will only contain fields
 * If other structures are referenced are used they can be populated directly
 * The intent is to use these libraries as DTO objects to populate and pass into building methods for simplicity
 *
 */

public class Account {

    public String AccountIdentifier;
    public String AccountStatus;
    public String AccountName;
    public String AccountServicePeriod;
    public String CoveragePriority;
    public String Description;
    public String GuarantorOnHold;
    public String GuarantorPeriod;

    //Getter and Setters
    public String getAccountIdentifier() {
        return AccountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        AccountIdentifier = accountIdentifier;
    }

    public String getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        AccountStatus = accountStatus;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getAccountServicePeriod() {
        return AccountServicePeriod;
    }

    public void setAccountServicePeriod(String accountServicePeriod) {
        AccountServicePeriod = accountServicePeriod;
    }

    public String getCoveragePriority() {
        return CoveragePriority;
    }

    public void setCoveragePriority(String coveragePriority) {
        CoveragePriority = coveragePriority;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getGuarantorOnHold() {
        return GuarantorOnHold;
    }

    public void setGuarantorOnHold(String guarantorOnHold) {
        GuarantorOnHold = guarantorOnHold;
    }

    public String getGuarantorPeriod() {
        return GuarantorPeriod;
    }

    public void setGuarantorPeriod(String guarantorPeriod) {
        GuarantorPeriod = guarantorPeriod;
    }

    //toString
    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
