package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IMA {
private String IMA_01_MovementAuthorityCode;
private String IMA_02_StandardCarrierAlphaCode;
private String IMA_03_TariffApplicationCode;
private String IMA_04_TariffApplicationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

