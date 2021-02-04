package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DMI {
private String DMI_01_MaintenanceOperationCode;
private String DMI_02_DataMaintenanceNumber;
private String DMI_03_Name;
private String DMI_04_AddressInformation;
private String DMI_05_AddressInformation;
private String DMI_06_CityName;
private String DMI_07_StateorProvinceCode;
private String DMI_08_PostalCode;
private String DMI_09_CountryCode;
private String DMI_10_CommunicationNumberQualifier;
private String DMI_11_CommunicationNumber;
private String DMI_12_NoteIdentificationNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

