package com.intellicode.openMarket.service;

import com.intellicode.openMarket.mapper.ProductMapper;
import com.intellicode.openMarket.util.interceptor.CustomFileUtils;
import com.intellicode.openMarket.vo.Status;
import com.intellicode.openMarket.vo.product.BaseProduct;
import com.intellicode.openMarket.vo.product.ProductRequest;
import com.intellicode.openMarket.vo.product.RegistSellingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by rutes_000 on 2015-06-02.
 */
@Service
public class DefaultProductService implements ProductService{
    @Autowired
    ApplicationContext ctx;

    ProductMapper productMapper;

    @PostConstruct
    public void init(){
        String[] getBeanDefinitionNames = ctx.getBeanDefinitionNames();
        for(String name : getBeanDefinitionNames){
            System.out.println("\n\nBean Name : "+ name);
            System.out.println("Bean : "+ ctx.getBean(name));
        }
        this.productMapper = (ProductMapper) ctx.getBean("productMapper");
        ctx.getBean(ProductMapper.class);
    }

    @Override
    public Status insertProduct(ProductRequest product) throws Exception {

        String fileId = CustomFileUtils.getImageFileId(product.getCompanyId(), product.getCode(), product.getImage());
        product.setImageUrl(fileId);
        boolean ret = productMapper.insertProduct(product);
        return new Status("OK");
    }

    @Override
    public Status updateProduct(ProductRequest product) throws Exception {
        return null;
    }

    @Override
    public Status deleteProduct(BaseProduct product) throws Exception {
        return null;
    }

    @Override
    public Status registSellingProduct(BaseProduct product) throws Exception {
        boolean ret = productMapper.registSellingProduct((RegistSellingRequest) product);
        return new Status("OK");
    }

    @Override
    public Status pauseSellingProduct(BaseProduct product) throws Exception {
        return null;
    }

    @Override
    public List<ProductRequest> selectSellingProduct(BaseProduct product) throws Exception {
        return productMapper.selectSellingProduct(product);
    }

    @Override
    public List<ProductRequest> selectProduct(BaseProduct product) throws Exception {
        return productMapper.selectProduct(product);
    }
}
