package com.intellicode.openMarket.mapper;

import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by rutes_000 on 2015-05-29.
 */
@MapperScan
public interface Test {
    public String getToday() throws Exception;
}
