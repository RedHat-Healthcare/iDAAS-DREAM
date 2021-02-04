package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the AL1 segment in 
 * HL7 and has been augmented to support additional needed attributes. It can 
 * also be further augmented to support additional needs.
 *
 */
public class Allergies {

	private String AllergySetID;
	private String AllergyTypeCode;
	private String AllergenCode;
	private String AllergenCodeDesc;
	private String AllergenSeverityCode;
	private String AllergenSeverityDesc;
	private String AllergenReactionCode;
	private String AllergenReactionDesc;
	
	
	public String getAllergySetID() {
		return AllergySetID;
	}
	public void setAllergySetID(String allergySetID) {
		AllergySetID = allergySetID;
	}
	public String getAllergyTypeCode() {
		return AllergyTypeCode;
	}
	public void setAllergyTypeCode(String allergyTypeCode) {
		AllergyTypeCode = allergyTypeCode;
	}
	public String getAllergenCode() {
		return AllergenCode;
	}
	public void setAllergenCode(String allergenCode) {
		AllergenCode = allergenCode;
	}
	public String getAllergenCodeDesc() {
		return AllergenCodeDesc;
	}
	public void setAllergenCodeDesc(String allergenCodeDesc) {
		AllergenCodeDesc = allergenCodeDesc;
	}
	public String getAllergenSeverityCode() {
		return AllergenSeverityCode;
	}
	public void setAllergenSeverityCode(String allergenSeverityCode) {
		AllergenSeverityCode = allergenSeverityCode;
	}
	public String getAllergenSeverityDesc() {
		return AllergenSeverityDesc;
	}
	public void setAllergenSeverityDesc(String allergenSeverityDesc) {
		AllergenSeverityDesc = allergenSeverityDesc;
	}
	public String getAllergenReactionCode() {
		return AllergenReactionCode;
	}
	public void setAllergenReactionCode(String allergenReactionCode) {
		AllergenReactionCode = allergenReactionCode;
	}
	public String getAllergenReactionDesc() {
		return AllergenReactionDesc;
	}
	public void setAllergenReactionDesc(String allergenReactionDesc) {
		AllergenReactionDesc = allergenReactionDesc;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
	
}
