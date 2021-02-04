package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RC {
private String RC_01_ProductServiceIDQualifier;
private String RC_02_ProductServiceID;
private String RC_03_Name;
private String RC_04_AgencyQualifierCode;
private String RC_05_SourceSubqualifier;
private String RC_06_CausalPartConditionCode;
private String RC_07_Description;
private String RC_08_FreeformMessageText;
private String RC_09_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

