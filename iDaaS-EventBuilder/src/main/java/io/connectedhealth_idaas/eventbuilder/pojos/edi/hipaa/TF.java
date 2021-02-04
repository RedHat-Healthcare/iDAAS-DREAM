package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TF {
private String TF_01_TariffAgencyCode;
private String TF_02_TariffNumber;
private String TF_03_TariffNumberSuffix;
private String TF_04_TariffSupplementIdentifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

