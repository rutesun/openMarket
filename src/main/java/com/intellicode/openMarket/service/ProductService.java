package com.intellicode.openMarket.service;

import com.intellicode.openMarket.vo.Status;
import com.intellicode.openMarket.vo.delivery.ArrivalRequest;
import com.intellicode.openMarket.vo.delivery.Delivery;
import com.intellicode.openMarket.vo.product.*;

import java.util.List;

/**
 * Created by rutes_000 on 2015-06-02.
 */
public interface ProductService {
    Status insertProduct(ProductRequest product) throws Exception;

    Status updateProduct(ProductRequest product) throws Exception;

    Status deleteProduct(BaseProduct product) throws Exception;

    Status registSellingProduct(BaseProduct product) throws Exception;

    Status pauseSellingProduct(BaseProduct product) throws Exception;

    List<ProductResponse> selectSellingProduct(SearchRequest product) throws Exception;
    List<ProductResponse> selectRecentRegisteredSellingProduct(int top) throws Exception;

    List<ProductResponse> selectProduct(BaseProduct product) throws Exception;

    Status insertPurchaseLog(PurchaseRequest purchaseRequest) throws Exception;
    Status updateDeliveryLog(Delivery delivery) throws Exception;
    Status updateKeepingLog(ArrivalRequest arrivalRequest) throws Exception;
}
