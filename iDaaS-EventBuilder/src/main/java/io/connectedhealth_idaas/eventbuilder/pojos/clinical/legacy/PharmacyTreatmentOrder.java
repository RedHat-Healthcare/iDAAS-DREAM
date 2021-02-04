package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 	@author Alan Scott
 *	represent Pharmacy Treatment Details
 *
 */
public class PharmacyTreatmentOrder {

	private String giveCode;
	private String giveAmtMinimum;
	private String giveAmtMaximum;
	private String giveAmountUnits;
	private String dosageForm;
	private String treatmentInstructions;
	private String administrativeUnstructions;
	private String deliverToLocation;
	private String allowSubstitutions;
	private String requestedDispenseCode;
	private String requestedDispenseAmount;
	private String requestedDispenseUnits;
	private String numberRefills;
	private String orderingDEANumber;
	private String suplierVerifiedId;
	private String humanReview;
	private String requestedGiveTime;
	private String requestedGiveStrength;
	private String requestedGiveStrengthUnit;
	private String indications;
	private String giveRateAmount;
	private String giveRateUnits;
	private String totalDailyDose;
	private String supplemntaryCode;
	private String requestedDrugStrengthVolume;
	private String requestedDrugStrengthVolumeUnits;
	private String pharmacyOrderType;
	private String dispensingInterval;
	private String medInstanceId;
	private String segmentInstanceId;
	private String moodCode;
	private String dispencingPharmacy;
	private String dispencingPharmacyAddress;
	private String deliverToPatientLocation;
	private String deliverToPatientLocationAddress;
	public String getGiveCode() {
		return giveCode;
	}
	public void setGiveCode(String giveCode) {
		this.giveCode = giveCode;
	}
	public String getGiveAmtMinimum() {
		return giveAmtMinimum;
	}
	public void setGiveAmtMinimum(String giveAmtMinimum) {
		this.giveAmtMinimum = giveAmtMinimum;
	}
	public String getGiveAmtMaximum() {
		return giveAmtMaximum;
	}
	public void setGiveAmtMaximum(String giveAmtMaximum) {
		this.giveAmtMaximum = giveAmtMaximum;
	}
	public String getGiveAmountUnits() {
		return giveAmountUnits;
	}
	public void setGiveAmountUnits(String giveAmountUnits) {
		this.giveAmountUnits = giveAmountUnits;
	}
	public String getDosageForm() {
		return dosageForm;
	}
	public void setDosageForm(String dosageForm) {
		this.dosageForm = dosageForm;
	}
	public String getTreatmentInstructions() {
		return treatmentInstructions;
	}
	public void setTreatmentInstructions(String treatmentInstructions) {
		this.treatmentInstructions = treatmentInstructions;
	}
	public String getAdministrativeUnstructions() {
		return administrativeUnstructions;
	}
	public void setAdministrativeUnstructions(String administrativeUnstructions) {
		this.administrativeUnstructions = administrativeUnstructions;
	}
	public String getDeliverToLocation() {
		return deliverToLocation;
	}
	public void setDeliverToLocation(String deliverToLocation) {
		this.deliverToLocation = deliverToLocation;
	}
	public String getAllowSubstitutions() {
		return allowSubstitutions;
	}
	public void setAllowSubstitutions(String allowSubstitutions) {
		this.allowSubstitutions = allowSubstitutions;
	}
	public String getRequestedDispenseCode() {
		return requestedDispenseCode;
	}
	public void setRequestedDispenseCode(String requestedDispenseCode) {
		this.requestedDispenseCode = requestedDispenseCode;
	}
	public String getRequestedDispenseAmount() {
		return requestedDispenseAmount;
	}
	public void setRequestedDispenseAmount(String requestedDispenseAmount) {
		this.requestedDispenseAmount = requestedDispenseAmount;
	}
	public String getRequestedDispenseUnits() {
		return requestedDispenseUnits;
	}
	public void setRequestedDispenseUnits(String requestedDispenseUnits) {
		this.requestedDispenseUnits = requestedDispenseUnits;
	}
	public String getNumberRefills() {
		return numberRefills;
	}
	public void setNumberRefills(String numberRefills) {
		this.numberRefills = numberRefills;
	}
	public String getOrderingDEANumber() {
		return orderingDEANumber;
	}
	public void setOrderingDEANumber(String orderingDEANumber) {
		this.orderingDEANumber = orderingDEANumber;
	}
	public String getSuplierVerifiedId() {
		return suplierVerifiedId;
	}
	public void setSuplierVerifiedId(String suplierVerifiedId) {
		this.suplierVerifiedId = suplierVerifiedId;
	}
	public String getHumanReview() {
		return humanReview;
	}
	public void setHumanReview(String humanReview) {
		this.humanReview = humanReview;
	}
	public String getRequestedGiveTime() {
		return requestedGiveTime;
	}
	public void setRequestedGiveTime(String requestedGiveTime) {
		this.requestedGiveTime = requestedGiveTime;
	}
	public String getRequestedGiveStrength() {
		return requestedGiveStrength;
	}
	public void setRequestedGiveStrength(String requestedGiveStrength) {
		this.requestedGiveStrength = requestedGiveStrength;
	}
	public String getRequestedGiveStrengthUnit() {
		return requestedGiveStrengthUnit;
	}
	public void setRequestedGiveStrengthUnit(String requestedGiveStrengthUnit) {
		this.requestedGiveStrengthUnit = requestedGiveStrengthUnit;
	}
	public String getIndications() {
		return indications;
	}
	public void setIndications(String indications) {
		this.indications = indications;
	}
	public String getGiveRateAmount() {
		return giveRateAmount;
	}
	public void setGiveRateAmount(String giveRateAmount) {
		this.giveRateAmount = giveRateAmount;
	}
	public String getGiveRateUnits() {
		return giveRateUnits;
	}
	public void setGiveRateUnits(String giveRateUnits) {
		this.giveRateUnits = giveRateUnits;
	}
	public String getTotalDailyDose() {
		return totalDailyDose;
	}
	public void setTotalDailyDose(String totalDailyDose) {
		this.totalDailyDose = totalDailyDose;
	}
	public String getSupplemntaryCode() {
		return supplemntaryCode;
	}
	public void setSupplemntaryCode(String supplemntaryCode) {
		this.supplemntaryCode = supplemntaryCode;
	}
	public String getRequestedDrugStrengthVolume() {
		return requestedDrugStrengthVolume;
	}
	public void setRequestedDrugStrengthVolume(String requestedDrugStrengthVolume) {
		this.requestedDrugStrengthVolume = requestedDrugStrengthVolume;
	}
	public String getRequestedDrugStrengthVolumeUnits() {
		return requestedDrugStrengthVolumeUnits;
	}
	public void setRequestedDrugStrengthVolumeUnits(String requestedDrugStrengthVolumeUnits) {
		this.requestedDrugStrengthVolumeUnits = requestedDrugStrengthVolumeUnits;
	}
	public String getPharmacyOrderType() {
		return pharmacyOrderType;
	}
	public void setPharmacyOrderType(String pharmacyOrderType) {
		this.pharmacyOrderType = pharmacyOrderType;
	}
	public String getDispensingInterval() {
		return dispensingInterval;
	}
	public void setDispensingInterval(String dispensingInterval) {
		this.dispensingInterval = dispensingInterval;
	}
	public String getMedInstanceId() {
		return medInstanceId;
	}
	public void setMedInstanceId(String medInstanceId) {
		this.medInstanceId = medInstanceId;
	}
	public String getSegmentInstanceId() {
		return segmentInstanceId;
	}
	public void setSegmentInstanceId(String segmentInstanceId) {
		this.segmentInstanceId = segmentInstanceId;
	}
	public String getMoodCode() {
		return moodCode;
	}
	public void setMoodCode(String moodCode) {
		this.moodCode = moodCode;
	}
	public String getDispencingPharmacy() {
		return dispencingPharmacy;
	}
	public void setDispencingPharmacy(String dispencingPharmacy) {
		this.dispencingPharmacy = dispencingPharmacy;
	}
	public String getDispencingPharmacyAddress() {
		return dispencingPharmacyAddress;
	}
	public void setDispencingPharmacyAddress(String dispencingPharmacyAddress) {
		this.dispencingPharmacyAddress = dispencingPharmacyAddress;
	}
	public String getDeliverToPatientLocation() {
		return deliverToPatientLocation;
	}
	public void setDeliverToPatientLocation(String deliverToPatientLocation) {
		this.deliverToPatientLocation = deliverToPatientLocation;
	}
	public String getDeliverToPatientLocationAddress() {
		return deliverToPatientLocationAddress;
	}
	public void setDeliverToPatientLocationAddress(String deliverToPatientLocationAddress) {
		this.deliverToPatientLocationAddress = deliverToPatientLocationAddress;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
