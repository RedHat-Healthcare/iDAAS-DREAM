package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MSG {
private String MSG_01_FreeformMessageText;
private String MSG_02_PrinterCarriageControlCode;
private String MSG_03_Number;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

