package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PAT {
private String PAT_01_IndividualRelationshipCode;
private String PAT_02_PatientLocationCode;
private String PAT_03_EmploymentStatusCode;
private String PAT_04_StudentStatusCode;
private String PAT_05_DateTimePeriodFormatQualifier;
private String PAT_06_DateTimePeriod;
private String PAT_07_UnitorBasisforMeasurementCode;
private String PAT_08_Weight;
private String PAT_09_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

