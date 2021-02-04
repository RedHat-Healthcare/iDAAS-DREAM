package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SCM {
private String SCM_01_ProductServiceID;
private String SCM_02_Number;
private String SCM_03_EvaluationRatingCode;
private String SCM_04_FreeformMessage;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

