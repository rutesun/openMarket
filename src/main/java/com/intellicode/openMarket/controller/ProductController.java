package com.intellicode.openMarket.controller;

import com.intellicode.openMarket.vo.Status;
import com.intellicode.openMarket.vo.product.ProductRequest;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * Created by rutes_000 on 2015-06-01.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Status create(Locale locale, HttpServletRequest request, HttpServletResponse response
                         , @ModelAttribute ProductRequest product
        ) throws Exception {

        return new Status("OK");
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Status update(Locale locale, HttpServletRequest request, HttpServletResponse response
        ) throws Exception {
        return new Status("OK");
    }

    @RequestMapping(value = "/sell/regist", method = RequestMethod.POST)
    public Status regist(Locale locale, HttpServletRequest request, HttpServletResponse response
        ) throws Exception {
        return new Status("OK");
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
