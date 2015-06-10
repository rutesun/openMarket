package com.intellicode.openMarket.service;

import com.intellicode.openMarket.mapper.ProductMapper;
import com.intellicode.openMarket.mapper.PurchaseMapper;
import com.intellicode.openMarket.vo.Status;
import com.intellicode.openMarket.vo.delivery.ArrivalRequest;
import com.intellicode.openMarket.vo.delivery.Delivery;
import com.intellicode.openMarket.vo.product.ChangeInventory;
import com.intellicode.openMarket.vo.product.ProductResponse;
import com.intellicode.openMarket.vo.product.SearchRequest;
import com.intellicode.openMarket.vo.purchase.PurchaseLogRequest;
import com.intellicode.openMarket.vo.purchase.PurchaseLogResponse;
import com.intellicode.openMarket.vo.purchase.PurchaseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by rutes_000 on 2015-06-10.
 */
@Service
public class DefaultPurchaseService implements PurchaseService{
    @Autowired
    ApplicationContext ctx;

    //@Autowired
    ProductMapper productMapper;

    //@Autowired
    PurchaseMapper purchaseMapper;

    @PostConstruct
    public void init(){
        this.productMapper = (ProductMapper) ctx.getBean("productMapper");
        this.purchaseMapper = (PurchaseMapper) ctx.getBean("purchaseMapper");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Status insertPurchaseLog(PurchaseRequest purchaseRequest) throws Exception {
        String productId = purchaseRequest.getProductId();
        SearchRequest req =  new SearchRequest();
        req.setId(productId);
        List<ProductResponse> list = productMapper.selectSellingProduct(req);
        int price = list.get(0).getPrice();
        purchaseRequest.setPrice(price * purchaseRequest.getCount());
        purchaseMapper.insertPurchaseLog(purchaseRequest);
        productMapper.updateSellingProductInventory(new ChangeInventory(Integer.valueOf(productId), purchaseRequest.getCount()));

        return new Status("OK");
    }

    @Override
    public List<PurchaseLogResponse> selectPurchaseLog(PurchaseLogRequest purchaseLogRequest) throws Exception {
        return purchaseMapper.selectPurchaseLog(purchaseLogRequest);
    }

    @Override
    public Status updateDeliveryLog(Delivery delivery) throws Exception {
        purchaseMapper.updateDeliveryLog(delivery);
        return new Status("OK");
    }

    @Override
    public Status updateKeepingLog(ArrivalRequest arrivalRequest) throws Exception {
        purchaseMapper.updateKeepingLog(arrivalRequest);
        return new Status("OK");
    }
}
