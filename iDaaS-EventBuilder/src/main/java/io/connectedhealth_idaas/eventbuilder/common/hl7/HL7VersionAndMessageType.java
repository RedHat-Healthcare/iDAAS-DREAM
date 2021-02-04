package io.connectedhealth_idaas.eventbuilder.common.hl7;

public enum HL7VersionAndMessageType {
    VERSION_251_ADTA01("2.5.1"),
    VERSION_251_ADTA02("2.6"),
    VERSION_251_ORM_O01("MSH:12,EVN:4,PID:5");

    private String value;

    HL7VersionAndMessageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
