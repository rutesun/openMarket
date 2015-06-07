package com.intellicode.openMarket.controller;

import com.intellicode.openMarket.service.ProductService;
import com.intellicode.openMarket.vo.Status;
import com.intellicode.openMarket.vo.product.BaseProduct;
import com.intellicode.openMarket.vo.product.ProductRequest;
import com.intellicode.openMarket.vo.product.RegistSellingRequest;
import com.intellicode.openMarket.vo.product.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Locale;

/**
 * Created by rutes_000 on 2015-06-01.
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ApplicationContext ctx;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Status create(Locale locale, HttpServletRequest request, HttpServletResponse response
                         , @ModelAttribute ProductRequest product
        ) throws Exception {

        product.setCompanyId("RHTwsgyJfn");
        return productService.insertProduct(product);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Status update(Locale locale, HttpServletRequest request, HttpServletResponse response
        ) throws Exception {
        return new Status("OK");
    }

    @RequestMapping(value = "/sell", method = RequestMethod.POST)
    public Status regist(Locale locale, HttpServletRequest request, HttpServletResponse response
            , @ModelAttribute RegistSellingRequest req
        ) throws Exception {

        req.setCompanyId("RHTwsgyJfn");
        return productService.registSellingProduct(req);
    }

    @RequestMapping(value = "/sell", method = RequestMethod.GET)
    public List<?> listSellingProduct(Locale locale, HttpServletRequest request, HttpServletResponse response
            , @ModelAttribute SearchRequest req
    ) throws Exception {

        req.setCompanyId("RHTwsgyJfn");
        return productService.selectSellingProduct(req);
    }

    @RequestMapping(value = "/pause", method = RequestMethod.PUT)
    public Status pause(Locale locale, HttpServletRequest request, HttpServletResponse response
        ) throws Exception {
        return new Status("OK");
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public Status delete(Locale locale, HttpServletRequest request, HttpServletResponse response
        ) throws Exception {
        return new Status("OK");
    }


}
