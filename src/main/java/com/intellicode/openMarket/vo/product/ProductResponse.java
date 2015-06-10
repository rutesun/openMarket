package com.intellicode.openMarket.vo.product;

/**
 * Created by rutes_000 on 2015-06-03.
 */
public class ProductResponse extends ProductRequest {
    private String companyName;
    private int sellingAmount;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSellingAmount() {
        return sellingAmount;
    }

    public void setSellingAmount(int sellingAmount) {
        this.sellingAmount = sellingAmount;
    }
}
