package com.intellicode.openMarket.vo.delivery;

import com.intellicode.openMarket.util.enums.ShippingState;

/**
 * Created by rutes_000 on 2015-06-09.
 */
public class Delivery {
    private ShippingState shippingState;
    private int productId;
    private String deliveryId;
    private int delivery_flag;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public ShippingState getShippingState() {
        return shippingState;
    }

    public void setShippingState(ShippingState shippingState) {
        this.shippingState = shippingState;
        this.delivery_flag = shippingState.getValue();
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getDelivery_flag() {
        return delivery_flag;
    }

}
