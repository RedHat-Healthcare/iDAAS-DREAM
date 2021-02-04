package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CQ {
private String CQ_01_CredentialTypeCode;
private String CQ_02_CredentialCategoryCode;
private String CQ_03_IdentificationCodeQualifier;
private String CQ_04_IdentificationCode;
private String CQ_05_LevelofIndividual,Test,orCourseCode;
private String CQ_06_BasisforAcademicCreditorAwardofCredentialCode;
private String CQ_07_CredentialRequirementCode;
private String CQ_08_YesNoConditionorResponseCode;
private String CQ_09_ConditionIndicator;
private String CQ_10_StateorProvinceCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

