package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BDS {
private String BDS_01_FilterIDCode;
private String BDS_02_LengthofBinaryData;
private String BDS_03_BinaryData;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

