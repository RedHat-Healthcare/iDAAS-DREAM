package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ILT {
    private String ILT_1_SetIdILT;
    private String ILT_2_InventoryLotNumber;
    private String ILT_3_InventoryExpirationDate;
    private String ILT_4_InventoryReceivedDate;
    private String ILT_5_InventoryReceivedQuantity;
    private String ILT_6_InventoryReceivedQuantityUnit;
    private String ILT_7_InventoryReceivedItemCost;
    private String ILT_8_InventoryOnHandDate;
    private String ILT_9_InventoryOnHandQuantity;
    private String ILT_10_InventoryOnHandQuantityUnit;

    public String getILT_1_SetIdILT() {
        return this.ILT_1_SetIdILT;
    }

    public void setILT_1_SetIdILT(final String ILT_1_SetIdILT) {
        this.ILT_1_SetIdILT = ILT_1_SetIdILT;
    }

    public String getILT_2_InventoryLotNumber() {
        return this.ILT_2_InventoryLotNumber;
    }

    public void setILT_2_InventoryLotNumber(final String ILT_2_InventoryLotNumber) {
        this.ILT_2_InventoryLotNumber = ILT_2_InventoryLotNumber;
    }

    public String getILT_3_InventoryExpirationDate() {
        return this.ILT_3_InventoryExpirationDate;
    }

    public void setILT_3_InventoryExpirationDate(final String ILT_3_InventoryExpirationDate) {
        this.ILT_3_InventoryExpirationDate = ILT_3_InventoryExpirationDate;
    }

    public String getILT_4_InventoryReceivedDate() {
        return this.ILT_4_InventoryReceivedDate;
    }

    public void setILT_4_InventoryReceivedDate(final String ILT_4_InventoryReceivedDate) {
        this.ILT_4_InventoryReceivedDate = ILT_4_InventoryReceivedDate;
    }

    public String getILT_5_InventoryReceivedQuantity() {
        return this.ILT_5_InventoryReceivedQuantity;
    }

    public void setILT_5_InventoryReceivedQuantity(final String ILT_5_InventoryReceivedQuantity) {
        this.ILT_5_InventoryReceivedQuantity = ILT_5_InventoryReceivedQuantity;
    }

    public String getILT_6_InventoryReceivedQuantityUnit() {
        return this.ILT_6_InventoryReceivedQuantityUnit;
    }

    public void setILT_6_InventoryReceivedQuantityUnit(final String ILT_6_InventoryReceivedQuantityUnit) {
        this.ILT_6_InventoryReceivedQuantityUnit = ILT_6_InventoryReceivedQuantityUnit;
    }

    public String getILT_7_InventoryReceivedItemCost() {
        return this.ILT_7_InventoryReceivedItemCost;
    }

    public void setILT_7_InventoryReceivedItemCost(final String ILT_7_InventoryReceivedItemCost) {
        this.ILT_7_InventoryReceivedItemCost = ILT_7_InventoryReceivedItemCost;
    }

    public String getILT_8_InventoryOnHandDate() {
        return this.ILT_8_InventoryOnHandDate;
    }

    public void setILT_8_InventoryOnHandDate(final String ILT_8_InventoryOnHandDate) {
        this.ILT_8_InventoryOnHandDate = ILT_8_InventoryOnHandDate;
    }

    public String getILT_9_InventoryOnHandQuantity() {
        return this.ILT_9_InventoryOnHandQuantity;
    }

    public void setILT_9_InventoryOnHandQuantity(final String ILT_9_InventoryOnHandQuantity) {
        this.ILT_9_InventoryOnHandQuantity = ILT_9_InventoryOnHandQuantity;
    }

    public String getILT_10_InventoryOnHandQuantityUnit() {
        return this.ILT_10_InventoryOnHandQuantityUnit;
    }

    public void setILT_10_InventoryOnHandQuantityUnit(final String ILT_10_InventoryOnHandQuantityUnit) {
        this.ILT_10_InventoryOnHandQuantityUnit = ILT_10_InventoryOnHandQuantityUnit;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

