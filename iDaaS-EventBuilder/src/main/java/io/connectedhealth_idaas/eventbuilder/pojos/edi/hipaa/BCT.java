package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BCT {
private String BCT_01_CatalogPurposeCode;
private String BCT_02_CatalogNumber;
private String BCT_03_CatalogVersionNumber;
private String BCT_04_CatalogRevisionNumber;
private String BCT_05_UnitorBasisforMeasurementCode;
private String BCT_06_CatalogNumber;
private String BCT_07_CatalogVersionNumber;
private String BCT_08_CatalogRevisionNumber;
private String BCT_09_Description;
private String BCT_10_TransactionSetPurposeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

