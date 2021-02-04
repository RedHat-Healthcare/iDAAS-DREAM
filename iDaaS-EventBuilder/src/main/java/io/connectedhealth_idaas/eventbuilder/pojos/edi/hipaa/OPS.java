package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OPS {
private String OPS_01_IdentificationCodeQualifier;
private String OPS_02_IdentificationCode;
private String OPS_03_YesNoConditionorResponseCode;
private String OPS_04_InstructionalSettingCode;
private String OPS_06_Quantity;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

