package io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
/*
 * 	@author Alan Scott
 *	Designed to represent any item defined as a term. A term is specifically referencial data used by platforms for
 *  a more detailed understanding of the data. Some examples are race, ethnicity, insurance plans, diagnosis, procedures,
 *  martial status, etc...
 *
 */
public class CWETerm {

	private String identifierCode;
	private String textValue;
	private String codingSystemName;
	private String alternativeIdentifier;
	private String codingSystemVersionId;
	private String originalText;
	private String codeLocation;
	private String codeType;
	private String applicationName;
	private String organizationName;

	public String getIdentifierCode() {
		return identifierCode;
	}

	public void setIdentifierCode(String identifierCode) {
		this.identifierCode = identifierCode;
	}

	public String getTextValue() {
		return textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

	public String getCodingSystemName() {
		return codingSystemName;
	}

	public void setCodingSystemName(String codingSystemName) {
		this.codingSystemName = codingSystemName;
	}

	public String getAlternativeIdentifier() {
		return alternativeIdentifier;
	}

	public void setAlternativeIdentifier(String alternativeIdentifier) {
		this.alternativeIdentifier = alternativeIdentifier;
	}

	public String getCodingSystemVersionId() {
		return codingSystemVersionId;
	}

	public void setCodingSystemVersionId(String codingSystemVersionId) {
		this.codingSystemVersionId = codingSystemVersionId;
	}

	public String getOriginalText() {
		return originalText;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	public String getCodeLocation() {
		return codeLocation;
	}

	public void setCodeLocation(String codeLocation) {
		this.codeLocation = codeLocation;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	//toString
	public String toString()
	{
		return ReflectionToStringBuilder.toString(this);
	}
}
