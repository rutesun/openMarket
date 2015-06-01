package com.intellicode.openMarket.controller;

import com.intellicode.openMarket.vo.Status;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping(value = "/")
public class Home {

    @RequestMapping(value = "home", method = RequestMethod.GET)
    @ResponseBody
    public Status home(Locale locale, HttpServletRequest request){
        return new Status("OK");
    }

    @RequestMapping(value = "regist", method = RequestMethod.GET)
    public String regist(Locale locale, HttpServletRequest request){
        return "registProduct";
    }


}
