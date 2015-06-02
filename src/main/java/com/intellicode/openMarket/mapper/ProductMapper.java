package com.intellicode.openMarket.mapper;

import com.intellicode.openMarket.vo.product.ProductRequest;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by rutes_000 on 2015-06-02.
 */
@MapperScan
public interface ProductMapper {
    public boolean insertProduct(ProductRequest product) throws Exception;

    public boolean updateProduct(ProductRequest product) throws Exception;

    public boolean deleteProduct(ProductRequest product) throws Exception;

    public boolean registSellingProduct(ProductRequest product) throws Exception;

    public boolean pauseSellingProduct(ProductRequest product) throws Exception;

    public List<ProductRequest> selectSellingProduct(ProductRequest product) throws Exception;

    public List<ProductRequest> selectProduct(ProductRequest product) throws Exception;
}
