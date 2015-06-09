package com.intellicode.openMarket.vo.delivery;

import com.intellicode.openMarket.util.enums.ShippingState;

import java.util.UUID;

/**
 * Created by rutes_000 on 2015-06-09.
 */
public class DevilveryRequest extends Delivery {
    public DevilveryRequest() {
        super();
        super.setDeliveryId(UUID.randomUUID().toString());
        super.setShippingState(ShippingState.REQUEST);
    }

    @Override
    public void setDeliveryId(String deliveryId){
        super.setDeliveryId(deliveryId);
    }
}
