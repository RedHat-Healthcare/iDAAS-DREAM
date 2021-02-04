package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CHB {
private String CHB_01_LocationQualifier;
private String CHB_02_LocationIdentifier;
private String CHB_03_ReasonStoppedWorkCode;
private String CHB_04_ClaimTypeCode;
private String CHB_05_ClaimStatusCode;
private String CHB_06_EntityIdentifierCode;
private String CHB_07_CreditDebitFlagCode;
private String CHB_08_IndustryCode;
private String CHB_09_AllowanceorChargeIndicator;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

