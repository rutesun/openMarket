package com.intellicode.openMarket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@PropertySource({"classpath:env/base.properties", "classpath:env/${spring.profiles.active:develop}.properties"})
public class PropertyPlaceholderConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		System.out.println("\n\npropertySourcesPlaceholderConfigurer\n\n");

		Resource[] resources = new ClassPathResource[ ]	{ new ClassPathResource( "message/message.properties" ) };
		
		 PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
	        propertySourcesPlaceholderConfigurer.setLocations(resources);
	        return propertySourcesPlaceholderConfigurer;
	}
}