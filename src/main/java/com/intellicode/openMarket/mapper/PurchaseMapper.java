package com.intellicode.openMarket.mapper;

import com.intellicode.openMarket.vo.delivery.ArrivalRequest;
import com.intellicode.openMarket.vo.delivery.Delivery;
import com.intellicode.openMarket.vo.purchase.PurchaseLogRequest;
import com.intellicode.openMarket.vo.purchase.PurchaseLogResponse;
import com.intellicode.openMarket.vo.purchase.PurchaseRequest;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by rutes_000 on 2015-06-10.
 */
@MapperScan
public interface PurchaseMapper {
    boolean insertPurchaseLog(PurchaseRequest purchaseRequest) throws Exception;
    List<PurchaseLogResponse> selectPurchaseLog(PurchaseLogRequest purchaseLogRequest) throws Exception;
    boolean updateDeliveryLog(Delivery delivery) throws Exception;
    boolean updateKeepingLog(ArrivalRequest arrivalRequest) throws Exception;

    boolean updateDeliveryState(Delivery delivery) throws Exception;
}
