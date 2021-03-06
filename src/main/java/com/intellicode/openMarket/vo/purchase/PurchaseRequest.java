package com.intellicode.openMarket.vo.purchase;

/**
 * Created by rutes_000 on 2015-06-09.
 */
public class PurchaseRequest {
    private String productId;
    private int price;
    private int count;
    private String customerId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productCode) {
        this.productId = productCode;
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

}
