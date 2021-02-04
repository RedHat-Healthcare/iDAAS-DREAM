package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SUP {
private String SUP_01_SupplementaryInformationQualifier;
private String SUP_02_CertificationClauseCode;
private String SUP_03_FreeformMessage;
private String SUP_04_PrintOptionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

