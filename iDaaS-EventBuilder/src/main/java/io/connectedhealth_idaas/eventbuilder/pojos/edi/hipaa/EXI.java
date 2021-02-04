package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EXI {
private String EXI_02_Priority;
private String EXI_03_DateTimePeriodFormatQualifier;
private String EXI_04_DateTimePeriod;
private String EXI_05_TimePeriodUnitQualifier;
private String EXI_06_Quantity;
private String EXI_07_Description;
private String EXI_08_ActionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

