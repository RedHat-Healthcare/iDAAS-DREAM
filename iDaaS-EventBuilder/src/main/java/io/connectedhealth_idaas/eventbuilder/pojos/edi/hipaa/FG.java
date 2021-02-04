package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FG {
private String FG_01_TerminatorTypeCode;
private String FG_02_GroupControlNumber;
private String FG_03_NumberofTransactionSetsIncluded;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

