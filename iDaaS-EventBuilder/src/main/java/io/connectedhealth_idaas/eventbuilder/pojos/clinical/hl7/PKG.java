package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PKG {
    private String PKG_1_SetIdPKG;
    private String PKG_2_PackagingUnits;
    private String PKG_3_DefaultOrderUnitOfMeasureIndicator;
    private String PKG_4_PackageQuantity;
    private String PKG_5_Price;
    private String PKG_6_FutureItemPrice;
    private String PKG_7_FutureItemPriceEffectiveDate;
    private String PKG_8_GlobalTradeItemNumber;

    public String getPKG_1_SetIdPKG() {
        return this.PKG_1_SetIdPKG;
    }

    public void setPKG_1_SetIdPKG(final String PKG_1_SetIdPKG) {
        this.PKG_1_SetIdPKG = PKG_1_SetIdPKG;
    }

    public String getPKG_2_PackagingUnits() {
        return this.PKG_2_PackagingUnits;
    }

    public void setPKG_2_PackagingUnits(final String PKG_2_PackagingUnits) {
        this.PKG_2_PackagingUnits = PKG_2_PackagingUnits;
    }

    public String getPKG_3_DefaultOrderUnitOfMeasureIndicator() {
        return this.PKG_3_DefaultOrderUnitOfMeasureIndicator;
    }

    public void setPKG_3_DefaultOrderUnitOfMeasureIndicator(final String PKG_3_DefaultOrderUnitOfMeasureIndicator) {
        this.PKG_3_DefaultOrderUnitOfMeasureIndicator = PKG_3_DefaultOrderUnitOfMeasureIndicator;
    }

    public String getPKG_4_PackageQuantity() {
        return this.PKG_4_PackageQuantity;
    }

    public void setPKG_4_PackageQuantity(final String PKG_4_PackageQuantity) {
        this.PKG_4_PackageQuantity = PKG_4_PackageQuantity;
    }

    public String getPKG_5_Price() {
        return this.PKG_5_Price;
    }

    public void setPKG_5_Price(final String PKG_5_Price) {
        this.PKG_5_Price = PKG_5_Price;
    }

    public String getPKG_6_FutureItemPrice() {
        return this.PKG_6_FutureItemPrice;
    }

    public void setPKG_6_FutureItemPrice(final String PKG_6_FutureItemPrice) {
        this.PKG_6_FutureItemPrice = PKG_6_FutureItemPrice;
    }

    public String getPKG_7_FutureItemPriceEffectiveDate() {
        return this.PKG_7_FutureItemPriceEffectiveDate;
    }

    public void setPKG_7_FutureItemPriceEffectiveDate(final String PKG_7_FutureItemPriceEffectiveDate) {
        this.PKG_7_FutureItemPriceEffectiveDate = PKG_7_FutureItemPriceEffectiveDate;
    }

    public String getPKG_8_GlobalTradeItemNumber() {
        return this.PKG_8_GlobalTradeItemNumber;
    }

    public void setPKG_8_GlobalTradeItemNumber(final String PKG_8_GlobalTradeItemNumber) {
        this.PKG_8_GlobalTradeItemNumber = PKG_8_GlobalTradeItemNumber;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

