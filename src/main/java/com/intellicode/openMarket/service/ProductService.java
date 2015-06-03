package com.intellicode.openMarket.service;

import com.intellicode.openMarket.vo.Status;
import com.intellicode.openMarket.vo.product.BaseProduct;
import com.intellicode.openMarket.vo.product.ProductRequest;

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

    List<ProductRequest> selectSellingProduct(BaseProduct product) throws Exception;

    List<ProductRequest> selectProduct(BaseProduct product) throws Exception;
}
