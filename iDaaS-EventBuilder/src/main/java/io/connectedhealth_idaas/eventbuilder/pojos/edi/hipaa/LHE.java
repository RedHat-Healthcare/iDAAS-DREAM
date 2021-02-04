package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LHE {
private String LHE_01_HazardousMaterialShippingName;
private String LHE_02_HazardousPlacardNotation;
private String LHE_03_ReferenceIdentificationQualifier;
private String LHE_04_ReferenceIdentification;
private String LHE_05_ReportableQuantityCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

