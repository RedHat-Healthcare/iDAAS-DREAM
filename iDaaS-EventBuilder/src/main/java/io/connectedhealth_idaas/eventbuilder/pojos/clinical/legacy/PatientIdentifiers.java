package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 *    Patient identifiers
 */
public class PatientIdentifiers {

  private String ptExternalId;
  private String ptInternalId;
  private String ptRace;
  private String ptBusinessPhone;
  private String ptHomePhone;
  private String ptAddress;
  private String ptEthnicity;
  private String ptMaritalStatus;
  private String ptInsuranceType;
  private String ptLocation;
  private String ptType;

  public String getPtMaritalStatus() {
    return ptMaritalStatus;
  }

  public void setPtMaritalStatus(String ptMaritalStatus) {
    this.ptMaritalStatus = ptMaritalStatus;
  }

  public String getPtInsuranceType() {
    return ptInsuranceType;
  }

  public void setPtInsuranceType(String ptInsuranceType) {
    this.ptInsuranceType = ptInsuranceType;
  }

  public String getPtLocation() {
    return ptLocation;
  }

  public void setPtLocation(String ptLocation) {
    this.ptLocation = ptLocation;
  }

  public String getPtType() {
    return ptType;
  }

  public void setPtType(String ptType) {
    this.ptType = ptType;
  }

  public String getPtExternalId() {
    return ptExternalId;
  }

  public void setPtExternalId(String ptExternalId) {
    this.ptExternalId = ptExternalId;
  }

  public String getPtInternalId() {
    return ptInternalId;
  }

  public void setPtInternalId(String ptInternalId) {
    this.ptInternalId = ptInternalId;
  }

  public String getPtRace() {
    return ptRace;
  }

  public void setPtRace(String ptRace) {
    this.ptRace = ptRace;
  }

  public String getPtBusinessPhone() {
    return ptBusinessPhone;
  }

  public void setPtBusinessPhone(String ptBusinessPhone) {
    this.ptBusinessPhone = ptBusinessPhone;
  }

  public String getPtHomePhone() {
    return ptHomePhone;
  }

  public void setPtHomePhone(String ptHomePhone) {
    this.ptHomePhone = ptHomePhone;
  }

  public String getPtAddress() {
    return ptAddress;
  }

  public void setPtAddress(String ptAddress) {
    this.ptAddress = ptAddress;
  }

  public String getPtEthnicity() {
    return ptEthnicity;
  }

  public void setPtEthnicity(String ptEthnicity) {
    this.ptEthnicity = ptEthnicity;
  }
  
//toString 
public String toString() 
{
	return ReflectionToStringBuilder.toString(this);
}
}
