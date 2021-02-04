package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DEP {
private String DEP_01_ReferenceIdentification;
private String DEP_02_Date;
private String DEP_03_Time;
private String DEP_04_ReferenceIdentification;
private String DEP_05_DFIIDNumberQualifier;
private String DEP_06_DFIIdentificationNumber;
private String DEP_07_AccountNumberQualifier;
private String DEP_08_AccountNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

