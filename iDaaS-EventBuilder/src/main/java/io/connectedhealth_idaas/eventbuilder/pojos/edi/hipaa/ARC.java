package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ARC {
private String ARC_01_Count;
private String ARC_02_TestTypeCode;
private String ARC_03_ObservationTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

