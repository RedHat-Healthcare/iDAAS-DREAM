package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class UM {
private String UM_01_RequestCategoryCode;
private String UM_02_CertificationTypeCode;
private String UM_03_ServiceTypeCode;
private String UM_06_LevelofServiceCode;
private String UM_07_CurrentHealthConditionCode;
private String UM_08_PrognosisCode;
private String UM_09_ReleaseofInformationCode;
private String UM_10_DelayReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

