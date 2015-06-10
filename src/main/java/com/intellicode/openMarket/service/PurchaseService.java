package com.intellicode.openMarket.service;

import com.intellicode.openMarket.vo.Status;
import com.intellicode.openMarket.vo.delivery.ArrivalRequest;
import com.intellicode.openMarket.vo.delivery.Delivery;
import com.intellicode.openMarket.vo.purchase.PurchaseLogRequest;
import com.intellicode.openMarket.vo.purchase.PurchaseLogResponse;
import com.intellicode.openMarket.vo.purchase.PurchaseRequest;

import java.util.List;

/**
 * Created by rutes_000 on 2015-06-10.
 */
public interface PurchaseService {
    Status insertPurchaseLog(PurchaseRequest purchaseRequest) throws Exception;
    List<PurchaseLogResponse> selectPurchaseLog(PurchaseLogRequest purchaseLogRequest) throws Exception;
    Status updateDeliveryLog(Delivery delivery) throws Exception;
    Status updateKeepingLog(ArrivalRequest arrivalRequest) throws Exception;
}
