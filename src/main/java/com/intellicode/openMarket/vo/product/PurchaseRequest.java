package com.intellicode.openMarket.vo.product;

/**
 * Created by rutes_000 on 2015-06-09.
 */
public class PurchaseRequest {
    private String productCode;
    private int price;
    private int count;
    private String userId;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
