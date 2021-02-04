package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RDF {
    private String RDF_1_NumberofColumnsperRow;
    private String RDF_2_ColumnDescription;

    public String getRDF_1_NumberofColumnsperRow() {
        return this.RDF_1_NumberofColumnsperRow;
    }

    public void setRDF_1_NumberofColumnsperRow(final String RDF_1_NumberofColumnsperRow) {
        this.RDF_1_NumberofColumnsperRow = RDF_1_NumberofColumnsperRow;
    }

    public String getRDF_2_ColumnDescription() {
        return this.RDF_2_ColumnDescription;
    }

    public void setRDF_2_ColumnDescription(final String RDF_2_ColumnDescription) {
        this.RDF_2_ColumnDescription = RDF_2_ColumnDescription;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

