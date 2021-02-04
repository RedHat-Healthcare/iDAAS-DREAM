package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CLI {
private String CLI_01_EntityIdentifierCode;
private String CLI_02_BreakdownStructureDetailCode;
private String CLI_03_AssignedIdentification;
private String CLI_04_FreeformDescription;
private String CLI_05_RateorValueTypeCode;
private String CLI_06_ContractTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

