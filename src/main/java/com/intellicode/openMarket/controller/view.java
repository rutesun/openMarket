package com.intellicode.openMarket.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intellicode.openMarket.service.ProductService;
import com.intellicode.openMarket.service.PurchaseService;
import com.intellicode.openMarket.util.interceptor.InitializeProductClassification;
import com.intellicode.openMarket.vo.Status;
import com.intellicode.openMarket.vo.User;
import com.intellicode.openMarket.vo.product.BaseProduct;
import com.intellicode.openMarket.vo.product.SearchRequest;
import com.intellicode.openMarket.vo.purchase.PurchaseLogRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping(value = "/view")
@SessionAttributes({"userInfo"})
public class view {
    @Autowired
    ProductService productService;
    @Autowired
    PurchaseService purchaseService;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    @ResponseBody
    public Status home(Locale locale, HttpServletRequest request) throws Exception {
        return new Status("OK");
    }

    @RequestMapping(value = "product/regist", method = RequestMethod.GET)
    public ModelAndView regist(Locale locale, HttpServletRequest request
                , @ModelAttribute("userInfo") User userInfo
                               ) throws Exception {
        ModelAndView mnv = new ModelAndView("registProduct");

        ObjectMapper mapper = new ObjectMapper();
        //mnv.addObject("classifications", InitializeProductClassification.getClassificationMap());
        mnv.addObject("classifications", mapper.writeValueAsString(InitializeProductClassification.getClassificationMap()));
        return mnv;
    }

    @RequestMapping(value = "selling/list", method = RequestMethod.GET)
    public ModelAndView showList(Locale locale, HttpServletRequest request, BaseProduct req) throws Exception {
        ModelAndView mnv = new ModelAndView("listProduct");
        Map<String, ?> map = InitializeProductClassification.getClassificationMap();
        ObjectMapper mapper = new ObjectMapper();
        mnv.addObject("companyId", "RHTwsgyJfn");
        mnv.addObject("classifications", mapper.writeValueAsString(map));
        mnv.addObject("productList", mapper.writeValueAsString(productService.selectRecentRegisteredSellingProduct(10)));
        return mnv;
    }

    @RequestMapping(value = "selling/search", method = RequestMethod.GET)
    public ModelAndView searchList(Locale locale, HttpServletRequest request, SearchRequest req) throws Exception {
        ModelAndView mnv = new ModelAndView("listProduct");
        Map<String, ?> map = InitializeProductClassification.getClassificationMap();
        ObjectMapper mapper = new ObjectMapper();
        mnv.addObject("companyId", "RHTwsgyJfn");
        mnv.addObject("classifications", mapper.writeValueAsString(map));
        mnv.addObject("productList", mapper.writeValueAsString(productService.selectSellingProduct(req)));
        return mnv;
    }

    @RequestMapping(value = "selling/regist", method = {RequestMethod.GET})
    public ModelAndView registSelling(Locale locale, HttpServletRequest request) throws Exception {
        ModelAndView mnv = new ModelAndView("registSelling");
        BaseProduct vo = new BaseProduct();
        vo.setCompanyId("RHTwsgyJfn");
        ObjectMapper mapper = new ObjectMapper();

        List<?> list = productService.selectProduct(vo);
        mnv.addObject("productList", list);
        mnv.addObject("parsed", mapper.writeValueAsString(list));
        return mnv;
    }

    @RequestMapping(value = "product/category/{categoryId}", method = RequestMethod.GET)
    public ModelAndView moveCategory(Locale locale, HttpServletRequest request, HttpServletResponse response
            , @PathVariable(value = "id") String id
    ) throws Exception {
        ModelAndView mnv = new ModelAndView("detailProduct");

        Map<String, ?> map = InitializeProductClassification.getClassificationMap();
        ObjectMapper mapper = new ObjectMapper();
        mnv.addObject("companyId", "RHTwsgyJfn");
        mnv.addObject("classifications", mapper.writeValueAsString(map));
        SearchRequest product = new SearchRequest();
        product.setId(id);
        mnv.addObject("productInfo", productService.selectSellingProduct(product));
        return mnv;
    }

    @RequestMapping(value = "product/detail/{id}", method = RequestMethod.GET)
    public ModelAndView detailInfo(Locale locale, HttpServletRequest request, HttpServletResponse response
            , @PathVariable(value = "id") String id
            , @ModelAttribute("userInfo") User userInfo
                                   ) throws Exception {
        ModelAndView mnv = new ModelAndView("detailProduct");

        Map<String, ?> map = InitializeProductClassification.getClassificationMap();
        ObjectMapper mapper = new ObjectMapper();
        mnv.addObject("companyId", "RHTwsgyJfn");
        mnv.addObject("classifications", mapper.writeValueAsString(map));
        SearchRequest product = new SearchRequest();
        product.setId(id);
        mnv.addObject("productInfo", productService.selectSellingProduct(product));
        return mnv;
    }

    @RequestMapping(value = "purchase/list/user", method = RequestMethod.GET)
    public ModelAndView purchaseList(Locale locale, HttpServletRequest request, HttpServletResponse response
            //, @PathVariable("type") String type
            , @ModelAttribute("userInfo") User userInfo
    ) throws Exception {
        ModelAndView mnv = new ModelAndView("listPurchase/user");

        PurchaseLogRequest log = new PurchaseLogRequest();
        log.setUserId("test");
        mnv.addObject("purchaseList", purchaseService.selectPurchaseLog(log));
        return mnv;
    }

    @RequestMapping(value = "purchase/list/seller", method = RequestMethod.GET)
    public ModelAndView purchaseListForSeller(Locale locale, HttpServletRequest request, HttpServletResponse response
                                     //, @PathVariable("type") String type
            , @ModelAttribute("userInfo") User userInfo
    ) throws Exception {
        ModelAndView mnv = new ModelAndView("listPurchase/seller");

        PurchaseLogRequest log = new PurchaseLogRequest();
        log.setCompanyId("RHTwsgyJfn");
        mnv.addObject("purchaseList", purchaseService.selectPurchaseLog(log));
        return mnv;
    }
}
