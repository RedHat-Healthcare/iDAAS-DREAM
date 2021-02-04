package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TMD {
private String TMD_01_ProductProcessCharacteristicCode;
private String TMD_02_AgencyQualifierCode;
private String TMD_03_ProductDescriptionCode;
private String TMD_04_TestAdministrationMethodCode;
private String TMD_05_TestMediumCode;
private String TMD_06_Description;
private String TMD_07_Date;
private String TMD_08_ReferenceIdentification;
private String TMD_09_SourceSubqualifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

