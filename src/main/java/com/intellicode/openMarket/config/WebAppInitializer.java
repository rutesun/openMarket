package com.intellicode.openMarket.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import java.nio.charset.StandardCharsets;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected void customizeRegistration(ServletRegistration.Dynamic registration) {
    System.out.println("\n\ncustomizeRegistration\n\n");

    registration.setInitParameter("dispatchOptionsRequest", "true");
    registration.setAsyncSupported(true);
    registration.setMultipartConfig(new MultipartConfigElement("/tmp"));
  }

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[] { AppConfig.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] { WebConfig.class };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] { "/" };
  }

  @Override
  protected Filter[] getServletFilters() {
    CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
    characterEncodingFilter.setEncoding(StandardCharsets.UTF_8.name());

    DelegatingFilterProxy springSecurityFilterChain = new DelegatingFilterProxy();

    return new Filter[] { characterEncodingFilter, springSecurityFilterChain};
  }
}
