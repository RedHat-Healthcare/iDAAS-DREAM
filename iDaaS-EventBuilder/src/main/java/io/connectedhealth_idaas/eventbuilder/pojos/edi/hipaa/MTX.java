package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MTX {
private String MTX_01_NoteReferenceCode;
private String MTX_02_TextualData;
private String MTX_03_TextualData;
private String MTX_04_PrinterCarriageControlCode;
private String MTX_05_Number;
private String MTX_06_LanguageCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

