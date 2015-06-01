package com.intellicode.openMarket.util.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by rutes_000 on 2015-06-01.
 */
public class MultiFileInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(MultiFileInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

//        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;  //다중파일 업로드
//        List<MultipartFile> files = multipartRequest.getFiles("image");
//
//        if (files.isEmpty())
//            throw new IllegalArgumentException("You have to set one more file in request.");
//
//        for (MultipartFile file : files) {
//            logger.info("> file Name : {}\tfile Size : {}", file.getOriginalFilename(), file.getSize());
//
//            if (file.getBytes().length > 1024 * 1024)
//                throw new IllegalArgumentException("Upload file must be smaller than 1 megabytes.");
//        }
//        request.getParts();
        //request.getParameterMap();

        //Assert.isAssignable(MultipartHttpServletRequest.class, request.getClass());
        //Assert.isInstanceOf(type, obj, message);
        return true;
    }
}
