package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BEN {
private String BEN_01_PrimaryorContingentCode;
private String BEN_02_PercentageasDecimal;
private String BEN_03_IndividualRelationshipCode;
private String BEN_04_YesNoConditionorResponseCode;
private String BEN_05_YesNoConditionorResponseCode;
private String BEN_06_TypeofAccountCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

