package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PL {
private String PL_01_AssignedNumber;
private String PL_03_Name;
private String PL_04_CalculationOperationCode;
private String PL_05_Description;
private String PL_06_Count;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

