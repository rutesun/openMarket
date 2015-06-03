package com.intellicode.openMarket.mapper;

import com.intellicode.openMarket.vo.product.BaseProduct;
import com.intellicode.openMarket.vo.product.ProductRequest;
import com.intellicode.openMarket.vo.product.RegistSellingRequest;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by rutes_000 on 2015-06-02.
 */
@MapperScan
public interface ProductMapper {
    boolean insertProduct(ProductRequest product) throws Exception;

    boolean updateProduct(ProductRequest product) throws Exception;

    boolean deleteProduct(ProductRequest product) throws Exception;

    boolean registSellingProduct(RegistSellingRequest product) throws Exception;

    boolean pauseSellingProduct(BaseProduct product) throws Exception;

    List<ProductRequest> selectSellingProduct(BaseProduct product) throws Exception;

    List<ProductRequest> selectProduct(BaseProduct product) throws Exception;
}
