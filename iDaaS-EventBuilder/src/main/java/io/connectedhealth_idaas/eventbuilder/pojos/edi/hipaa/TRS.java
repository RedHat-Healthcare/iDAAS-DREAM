package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TRS {
private String TRS_01_ActionCode;
private String TRS_02_FreeformDescription;
private String TRS_03_PercentageasDecimal;
private String TRS_04_YesNoConditionorResponseCode;
private String TRS_05_RateApplicationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

