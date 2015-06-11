package com.intellicode.openMarket.vo.delivery;

import com.intellicode.openMarket.util.DateUtils;
import com.intellicode.openMarket.util.enums.ShippingState;

import java.util.UUID;

/**
 * Created by rutes_000 on 2015-06-09.
 */
public class DeliveryRequest extends Delivery {
    private String deliveryDate;
    private int devieryTimestamp;

    public DeliveryRequest() {
        super();
        super.setDeliveryId(UUID.randomUUID().toString());
        super.setShippingState(ShippingState.REQUEST);
        this.deliveryDate = DateUtils.getNowTime();
        this.devieryTimestamp = DateUtils.getTimestamp();
    }

    @Override
    public void setDeliveryId(String deliveryId){
        super.setDeliveryId(deliveryId);
    }
}
