package com.intellicode.openMarket.config;

import com.intellicode.openMarket.util.interceptor.MultiFileInterceptor;
import com.intellicode.openMarket.util.interceptor.SessionInterceptor;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.mvc.WebContentInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@EnableWebMvc
@ComponentScan(
        basePackages = "com.intellicode.openMarket",
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION),
        }
)
public class WebConfig extends WebMvcConfigurerAdapter {

  @Bean
  public InternalResourceViewResolver getInternalResourceViewResolver() {
    System.out.println("\n\ngetInternalResourceViewResolver\n\n");

    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    resolver.setOrder(2);
    return resolver;
  }

  @Bean
  @Profile("develop")
  public UrlBasedViewResolver getUrlBasedViewResolver(){
    UrlBasedViewResolver resolver = new UrlBasedViewResolver();
    resolver.setViewClass(TilesView.class);
    resolver.setOrder(1);
    return resolver;
  }

  @Bean
  @Profile("develop")
  public TilesConfigurer getTilesConfigurer(){
    TilesConfigurer configure = new TilesConfigurer();
    configure.setDefinitions("classpath:/tiles/*.xml");
    return configure;
  }

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }

  @Bean
  public WebContentInterceptor webContentInterceptor() {
    WebContentInterceptor interceptor = new WebContentInterceptor();
    interceptor.setCacheSeconds(0);
    interceptor.setUseExpiresHeader(true);
    interceptor.setUseCacheControlHeader(true);
    interceptor.setUseCacheControlNoStore(true);

    return interceptor;
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/js/**").addResourceLocations("/resources/js/");
    registry.addResourceHandler("/css/**").addResourceLocations("/resources/css/");
    registry.addResourceHandler("/html/**").addResourceLocations("/resources/html/");
    registry.addResourceHandler("/img/**").addResourceLocations("/resources/img/");
    registry.addResourceHandler("/product_img/**").addResourceLocations("/resources/productImages/");
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(webContentInterceptor());
    registry.addInterceptor(new SessionInterceptor());
    registry.addInterceptor(new MultiFileInterceptor()).addPathPatterns("/view/product/create");
  }

  @Bean
  public MultipartResolver multipartResolver(){

    return new StandardServletMultipartResolver();
  }
}
