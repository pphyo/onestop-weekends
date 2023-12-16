package com.jdc.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

@Configuration
@ComponentScan(basePackages = "com.jdc.hello.controller")
@EnableWebMvc
public class MvcAppConfig implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
	}
	
	// Thymeleaf Bean Configuration
	// TemplateResolver => SpringResourceTemplateResolver
	
	@Bean
	SpringResourceTemplateResolver springResourceTemplateResolver() {
		var templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setPrefix("/views/");
		templateResolver.setSuffix(".html");
		templateResolver.setCacheable(false);
		return templateResolver;
	}
	
	// TemplateEngine => SpringTemplateEngine
	
	@Bean
	SpringTemplateEngine springTemplateEngine(SpringResourceTemplateResolver templateResolver) {
		var templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver);
		return templateEngine;
	}
	
	// ViewResolver => ThymeleafViewResolver

	@Bean
	ThymeleafViewResolver thymeleafViewResolver(SpringTemplateEngine templateEngine) {
		var viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine);
		return viewResolver;
	}
}







