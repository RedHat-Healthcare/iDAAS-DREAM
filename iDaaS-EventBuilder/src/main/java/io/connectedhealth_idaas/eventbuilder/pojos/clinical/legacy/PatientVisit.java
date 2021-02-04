package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
/*
 *    Specific Pt Visit Information
 */
public class PatientVisit {

  private String ptClass;
  private String ptLocation;
  private String ptAdmitType;
  private String drAdmitting;
  private String drAttending;
  private String drConsulting;
  private String drReferring;
  private String department;
  private String serviceArea;
  private String admitSource;
  private String ptType;
  private String admitDate;
  private String dischargeDate;

  public String getPtClass() {
    return ptClass;
  }

  public void setPtClass(String ptClass) {
    this.ptClass = ptClass;
  }

  public String getPtLocation() {
    return ptLocation;
  }

  public void setPtLocation(String ptLocation) {
    this.ptLocation = ptLocation;
  }

  public String getPtAdmitType() {
    return ptAdmitType;
  }

  public void setPtAdmitType(String ptAdmitType) {
    this.ptAdmitType = ptAdmitType;
  }

  public String getDrAdmitting() {
    return drAdmitting;
  }

  public void setDrAdmitting(String drAdmitting) {
    this.drAdmitting = drAdmitting;
  }

  public String getDrAttending() {
    return drAttending;
  }

  public void setDrAttending(String drAttending) {
    this.drAttending = drAttending;
  }

  public String getDrConsulting() {
    return drConsulting;
  }

  public void setDrConsulting(String drConsulting) {
    this.drConsulting = drConsulting;
  }

  public String getDrReferring() {
    return drReferring;
  }

  public void setDrReferring(String drReferring) {
    this.drReferring = drReferring;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getServiceArea() {
    return serviceArea;
  }

  public void setServiceArea(String serviceArea) {
    this.serviceArea = serviceArea;
  }

  public String getAdmitSource() {
    return admitSource;
  }

  public void setAdmitSource(String admitSource) {
    this.admitSource = admitSource;
  }

  public String getPtType() {
    return ptType;
  }

  public void setPtType(String ptType) {
    this.ptType = ptType;
  }

  public String getAdmitDate() {
    return admitDate;
  }

  public void setAdmitDate(String admitDate) {
    this.admitDate = admitDate;
  }

  public String getDischargeDate() {
    return dischargeDate;
  }

  public void setDischargeDate(String dischargeDate) {
    this.dischargeDate = dischargeDate;
  }
  
//toString 
public String toString() 
{
	return ReflectionToStringBuilder.toString(this);
}
}
