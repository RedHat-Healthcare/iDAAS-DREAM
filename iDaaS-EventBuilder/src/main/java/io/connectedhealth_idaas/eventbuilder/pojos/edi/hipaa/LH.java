package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LH {
private String LH_01_LadingLineItemNumber;
private String LH_02_HazardousMnemonicCode;
private String LH_03_ReferenceIdentification;
private String LH_04_ReferenceIdentificationQualifier;
private String LH_05_ReportableQuantityCode;
private String LH_06_LimitedQuantityIndicationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

