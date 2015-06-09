package com.intellicode.openMarket.util.interceptor;

import com.intellicode.openMarket.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by rutes_000 on 2015-06-01.
 */
public class SessionInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(SessionInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        User userInfo = (User) session.getAttribute("userInfo");

        if(userInfo == null){
            userInfo = new User();
            userInfo.setUserId("test");
            userInfo.setAccountNumber("21-123456");
            userInfo.setAccountBalance(101881);
        }
        session.setAttribute("userInfo", userInfo);
        return true;
    }
}
