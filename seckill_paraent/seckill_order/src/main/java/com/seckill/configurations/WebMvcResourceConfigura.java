package com.seckill.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebMvcResourceConfigura extends WebMvcConfigurerAdapter{
	
	/**
	 * 静态资源访问
	 */
	public void addResourceHandlers(ResourceHandlerRegistry register){
		register.addResourceHandler("/**").addResourceLocations("classpath:/static/");
		super.addResourceHandlers(register);
	}
}
