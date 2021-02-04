package io.connectedhealth_idaas.eventbuilder.pojos.lifesciences;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents a genomics context.
 * https://en.wikipedia.org/wiki/DNA
 *
 */
public class PersonGenomics {
	private String basePairing;
	private String senseSequence;
	private String antisenseSequence;
	private String superCoiling;
	private String alternativeDNAStructure;
	private String alternativeDNAChemistry;
	private String quadraplexStructures;
	private String branchDNA;
	private String artificialBasis;
	private String baseDNAPackaging;
	private String genesDetail;
	private String genesTransciption;
	private String genesReplication;
	private String extracellularNucleicAcid;
	private String dNAModifyingEnzymes;

	public String getBasePairing() {
		return basePairing;
	}

	public void setBasePairing(String basePairing) {
		this.basePairing = basePairing;
	}

	public String getSenseSequence() {
		return senseSequence;
	}

	public void setSenseSequence(String senseSequence) {
		this.senseSequence = senseSequence;
	}

	public String getAntisenseSequence() {
		return antisenseSequence;
	}

	public void setAntisenseSequence(String antisenseSequence) {
		this.antisenseSequence = antisenseSequence;
	}

	public String getSuperCoiling() {
		return superCoiling;
	}

	public void setSuperCoiling(String superCoiling) {
		this.superCoiling = superCoiling;
	}

	public String getAlternativeDNAStructure() {
		return alternativeDNAStructure;
	}

	public void setAlternativeDNAStructure(String alternativeDNAStructure) {
		this.alternativeDNAStructure = alternativeDNAStructure;
	}

	public String getAlternativeDNAChemistry() {
		return alternativeDNAChemistry;
	}

	public void setAlternativeDNAChemistry(String alternativeDNAChemistry) {
		this.alternativeDNAChemistry = alternativeDNAChemistry;
	}

	public String getQuadraplexStructures() {
		return quadraplexStructures;
	}

	public void setQuadraplexStructures(String quadraplexStructures) {
		this.quadraplexStructures = quadraplexStructures;
	}

	public String getBranchDNA() {
		return branchDNA;
	}

	public void setBranchDNA(String branchDNA) {
		this.branchDNA = branchDNA;
	}

	public String getArtificialBasis() {
		return artificialBasis;
	}

	public void setArtificialBasis(String artificialBasis) {
		this.artificialBasis = artificialBasis;
	}

	public String getBaseDNAPackaging() {
		return baseDNAPackaging;
	}

	public void setBaseDNAPackaging(String baseDNAPackaging) {
		this.baseDNAPackaging = baseDNAPackaging;
	}

	public String getGenesDetail() {
		return genesDetail;
	}

	public void setGenesDetail(String genesDetail) {
		this.genesDetail = genesDetail;
	}

	public String getGenesTransciption() {
		return genesTransciption;
	}

	public void setGenesTransciption(String genesTransciption) {
		this.genesTransciption = genesTransciption;
	}

	public String getGenesReplication() {
		return genesReplication;
	}

	public void setGenesReplication(String genesReplication) {
		this.genesReplication = genesReplication;
	}

	public String getExtracellularNucleicAcid() {
		return extracellularNucleicAcid;
	}

	public void setExtracellularNucleicAcid(String extracellularNucleicAcid) {
		this.extracellularNucleicAcid = extracellularNucleicAcid;
	}

	public String getdNAModifyingEnzymes() {
		return dNAModifyingEnzymes;
	}

	public void setdNAModifyingEnzymes(String dNAModifyingEnzymes) {
		this.dNAModifyingEnzymes = dNAModifyingEnzymes;
	}

	//toString
	public String toString()
	{
		return ReflectionToStringBuilder.toString(this);
	}

}
