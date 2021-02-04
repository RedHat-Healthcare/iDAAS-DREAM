package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FH {
private String FH_01_IndividualRelationshipCode;
private String FH_02_QuantityQualifier;
private String FH_03_Quantity;
private String FH_04_CurrentHealthConditionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

