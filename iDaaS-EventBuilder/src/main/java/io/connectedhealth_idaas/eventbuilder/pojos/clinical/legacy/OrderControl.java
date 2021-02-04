package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
/*
 * @author Alan Scott
 *
 * Meant to provide an object to work with that represents an Order
 *
 */
public class OrderControl {
	
	private String orderControlId;
	private String placerOrderNumber;
	private String fillerOrderNumber;
	private String orderStatus;
	private String quantityTiming;
	private String transactionDateTime;
	private String enteredBy;
	private String verifiedBy;
	private String orderingProvider;
	private String facilityLocation;
	private String orderEffectiveDateTime;
	private String orderingFacilityName;
	private String orderingFacilityAddress;
	private String confirmationCode;
	private String orderType;
	
	public String getOrderControlId() {
		return orderControlId;
	}
	public void setOrderControlId(String orderControlId) {
		this.orderControlId = orderControlId;
	}
	public String getPlacerOrderNumber() {
		return placerOrderNumber;
	}
	public void setPlacerOrderNumber(String placerOrderNumber) {
		this.placerOrderNumber = placerOrderNumber;
	}
	public String getFillerOrderNumber() {
		return fillerOrderNumber;
	}
	public void setFillerOrderNumber(String fillerOrderNumber) {
		this.fillerOrderNumber = fillerOrderNumber;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getQuantityTiming() {
		return quantityTiming;
	}
	public void setQuantityTiming(String quantityTiming) {
		this.quantityTiming = quantityTiming;
	}
	public String getTransactionDateTime() {
		return transactionDateTime;
	}
	public void setTransactionDateTime(String transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	public String getEnteredBy() {
		return enteredBy;
	}
	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}
	public String getVerifiedBy() {
		return verifiedBy;
	}
	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}
	public String getOrderingProvider() {
		return orderingProvider;
	}
	public void setOrderingProvider(String orderingProvider) {
		this.orderingProvider = orderingProvider;
	}
	public String getFacilityLocation() {
		return facilityLocation;
	}
	public void setFacilityLocation(String facilityLocation) {
		this.facilityLocation = facilityLocation;
	}
	public String getOrderEffectiveDateTime() {
		return orderEffectiveDateTime;
	}
	public void setOrderEffectiveDateTime(String orderEffectiveDateTime) {
		this.orderEffectiveDateTime = orderEffectiveDateTime;
	}
	public String getOrderingFacilityName() {
		return orderingFacilityName;
	}
	public void setOrderingFacilityName(String orderingFacilityName) {
		this.orderingFacilityName = orderingFacilityName;
	}
	public String getOrderingFacilityAddress() {
		return orderingFacilityAddress;
	}
	public void setOrderingFacilityAddress(String orderingFacilityAddress) {
		this.orderingFacilityAddress = orderingFacilityAddress;
	}
	public String getConfirmationCode() {
		return confirmationCode;
	}
	public void setConfirmationCode(String confirmationCode) {
		this.confirmationCode = confirmationCode;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
}
