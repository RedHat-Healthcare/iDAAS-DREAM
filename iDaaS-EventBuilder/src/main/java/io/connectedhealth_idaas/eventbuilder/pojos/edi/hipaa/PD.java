package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PD {
private String PD_01_UnitofTimePeriodorInterval;
private String PD_02_Date;
private String PD_04_Quantity;
private String PD_05_Name;
private String PD_06_Description;
private String PD_07_BreakdownStructureDetailCode;
private String PD_08_ReferenceIdentification;
private String PD_09_Description;
private String PD_10_ProposalDataDetailIdentifierCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

