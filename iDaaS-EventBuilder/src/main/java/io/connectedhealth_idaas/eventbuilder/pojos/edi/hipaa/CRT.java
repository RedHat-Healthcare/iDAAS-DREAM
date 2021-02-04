package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CRT {
private String CRT_01_ReportTypeCode;
private String CRT_04_BreakdownStructureDetailCode;
private String CRT_05_ActionCode;
private String CRT_06_RateorValueTypeCode;
private String CRT_07_ContractActionCode;
private String CRT_08_ProgramTypeCode;
private String CRT_09_FreeformDescription;
private String CRT_10_SecurityLevelCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

