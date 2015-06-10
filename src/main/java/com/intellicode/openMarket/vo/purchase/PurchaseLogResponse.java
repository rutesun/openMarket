package com.intellicode.openMarket.vo.purchase;

import com.intellicode.openMarket.util.enums.ShippingState;

/**
 * Created by rutes_000 on 2015-06-10.
 */
public class PurchaseLogResponse {
    private int id;
    private int productId;
    private String productCode;
    private String productName;
    private String productInfo;
    private String productSpec;

    private String customerId;

    private int price;
    private int count;

    private String registerDate;
    private String deliveryDate;
    private String arrivalDate;
    private String keepingDate;

    private int deliveryFlag;
    private String deliveryId;

    private ShippingState shippingState;

    public ShippingState getShippingState() {
        return shippingState;
    }

    public String getShippingStateText() {
        return shippingState.getState();
    }

    public void setShippingState(ShippingState shippingState) {
        this.shippingState = shippingState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getKeepingDate() {
        return keepingDate;
    }

    public void setKeepingDate(String keepingDate) {
        this.keepingDate = keepingDate;
    }

    public int getDeliveryFlag() {
        return deliveryFlag;
    }

    public void setDeliveryFlag(int deliveryFlag) {
        this.deliveryFlag = deliveryFlag;
        this.shippingState = ShippingState.getIndex(deliveryFlag);
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec;
    }
}
