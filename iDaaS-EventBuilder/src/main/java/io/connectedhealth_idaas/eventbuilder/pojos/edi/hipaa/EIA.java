package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EIA {
private String EIA_01_TransactionSetPurposeCode;
private String EIA_02_YesNoConditionorResponseCode;
private String EIA_03_YesNoConditionorResponseCode;
private String EIA_04_YesNoConditionorResponseCode;
private String EIA_05_Count;
private String EIA_06_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

