package com.intellicode.openMarket.mapper;

import com.intellicode.openMarket.vo.product.*;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by rutes_000 on 2015-06-02.
 */
@MapperScan
public interface ProductMapper {
    boolean insertProduct(ProductRequest product) throws Exception;

    boolean updateProduct(ProductRequest product) throws Exception;

    boolean updateProductInventory(ChangeInventory chage) throws Exception;

    boolean deleteProduct(BaseProduct product) throws Exception;

    boolean registSellingProduct(RegistSellingRequest product) throws Exception;

    boolean pauseSellingProduct(BaseProduct product) throws Exception;

    List<ProductResponse> selectSellingProduct(SearchRequest product) throws Exception;

    List<ProductResponse> selectRecentRegisteredSellingProduct(int top) throws Exception;

    List<ProductResponse> selectProduct(BaseProduct product) throws Exception;

    List<ProductClassification> selectProductClassification1() throws Exception;
    List<ProductClassification> selectProductClassification2(ProductClassification classific) throws Exception;
    List<ProductClassification> selectProductClassification3(ProductClassification classific) throws Exception;
    List<ProductClassification> selectProductClassification4(ProductClassification classific) throws Exception;

    boolean insertPurchaseLog(PurchaseRequest purchaseRequest) throws Exception;
    boolean updateDeliveryLog() throws Exception;
    boolean updateKeepingLog() throws Exception;

}
