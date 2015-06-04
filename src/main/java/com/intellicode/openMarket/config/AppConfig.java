package com.intellicode.openMarket.config;

import com.intellicode.openMarket.mapper.ProductMapper;
import com.intellicode.openMarket.util.interceptor.InitializeProductClassification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@Import({PropertyPlaceholderConfig.class, DataSourceConfig.class})
@ComponentScan(basePackages = "com.intellicode.openMarket", excludeFilters = {
    @ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION),
    @ComponentScan.Filter(value = Configuration.class, type = FilterType.ANNOTATION)
})
public class AppConfig {

    @Autowired
    ApplicationContext ctx;

    @Bean
    public InitializeProductClassification getProductClassification() throws Exception {
        InitializeProductClassification initial = new InitializeProductClassification();
        initial.setMapper(ctx.getBean(ProductMapper.class));
        initial.init();
        return initial;
    }
}
