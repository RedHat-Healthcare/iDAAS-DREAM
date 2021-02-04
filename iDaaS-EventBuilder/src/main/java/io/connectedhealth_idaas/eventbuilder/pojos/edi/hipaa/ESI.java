package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ESI {
private String ESI_01_YesNoConditionorResponseCode;
private String ESI_02_YesNoConditionorResponseCode;
private String ESI_03_YesNoConditionorResponseCode;
private String ESI_04_Time;
private String ESI_05_Quantity;
private String ESI_06_EmploymentStatusCode;
private String ESI_07_WorkIntensityCode;
private String ESI_08_ReasonStoppedWorkCode;
private String ESI_09_StatusReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

