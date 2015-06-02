package com.intellicode.openMarket.service;

import com.intellicode.openMarket.vo.Status;
import com.intellicode.openMarket.vo.product.ProductRequest;

import java.util.List;

/**
 * Created by rutes_000 on 2015-06-02.
 */
public interface ProductService {
    public Status insertProduct(ProductRequest product) throws Exception;

    public Status updateProduct(ProductRequest product) throws Exception;

    public Status deleteProduct(ProductRequest product) throws Exception;

    public Status registSellingProduct(ProductRequest product) throws Exception;

    public Status pauseSellingProduct(ProductRequest product) throws Exception;

    public List<ProductRequest> selectSellingProduct(ProductRequest product) throws Exception;

    public List<ProductRequest> selectProduct(ProductRequest product) throws Exception;
}
