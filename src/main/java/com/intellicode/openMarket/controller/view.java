package com.intellicode.openMarket.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intellicode.openMarket.service.ProductService;
import com.intellicode.openMarket.util.interceptor.InitializeProductClassification;
import com.intellicode.openMarket.vo.Status;
import com.intellicode.openMarket.vo.product.BaseProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping(value = "/view")
public class View {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    @ResponseBody
    public Status home(Locale locale, HttpServletRequest request) throws Exception{
        return new Status("OK");
    }

    @RequestMapping(value = "product/regist", method = RequestMethod.GET)
    public ModelAndView regist(Locale locale, HttpServletRequest request) throws Exception{
        ModelAndView mnv = new ModelAndView("registProduct");

        ObjectMapper mapper = new ObjectMapper();
        //mnv.addObject("classifications", InitializeProductClassification.getClassificationMap());
        mnv.addObject("classifications", mapper.writeValueAsString(InitializeProductClassification.getClassificationMap()));
        return mnv;
    }

    @RequestMapping(value = "selling/list", method = RequestMethod.GET)
    public ModelAndView showList(Locale locale, HttpServletRequest request, BaseProduct req) throws Exception{
        ModelAndView mnv = new ModelAndView("listProduct");

        mnv.addObject("companyId", "RHTwsgyJfn");
        return mnv;
    }

    @RequestMapping(value = "selling/regist", method = RequestMethod.GET)
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


}
