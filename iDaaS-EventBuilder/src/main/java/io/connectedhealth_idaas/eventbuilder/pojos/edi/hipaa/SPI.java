package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SPI {
private String SPI_01_SecurityLevelCode;
private String SPI_02_ReferenceIdentificationQualifier;
private String SPI_03_ReferenceIdentification;
private String SPI_04_EntityTitle;
private String SPI_05_EntityPurpose;
private String SPI_06_EntityStatusCode;
private String SPI_07_TransactionSetPurposeCode;
private String SPI_08_ReportTypeCode;
private String SPI_09_SecurityLevelCode;
private String SPI_10_AgencyQualifierCode;
private String SPI_11_SourceSubqualifier;
private String SPI_12_AssignedNumber;
private String SPI_13_CertificationTypeCode;
private String SPI_14_ProposalDataDetailIdentifierCode;
private String SPI_15_HierarchicalStructureCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

