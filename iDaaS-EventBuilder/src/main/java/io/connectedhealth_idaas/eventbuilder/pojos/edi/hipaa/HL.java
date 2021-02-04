package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HL {
private String HL_01_HierarchicalIDNumber;
private String HL_02_HierarchicalParentIDNumber;
private String HL_03_HierarchicalLevelCode;
private String HL_04_HierarchicalChildCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

