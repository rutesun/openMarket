package com.intellicode.openMarket.controller;

import com.intellicode.openMarket.config.AppConfig;
import com.intellicode.openMarket.config.WebConfig;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by rutes_000 on 2015-06-01.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class, WebConfig.class})
@WebAppConfiguration
public class DefaultWebAppTest {
    @Autowired
    private ApplicationContext ctx;

    @Autowired
    private WebApplicationContext webCtx;

    protected MockMvc mockMvc;

    public ApplicationContext getCtx() {
        return ctx;
    }

    public WebApplicationContext getWebCtx() {
        return webCtx;
    }

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.getWebCtx()).build();
    }
}
