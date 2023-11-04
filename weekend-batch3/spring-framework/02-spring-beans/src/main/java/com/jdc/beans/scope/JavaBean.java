package com.jdc.beans.scope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class JavaBean implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("Java disposable bean destroy");		
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Java preDestroy()");
	}
	
	public void customDestroy() {
		System.out.println("Java customDestroy()");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Java afterPropertiesSet()");		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Java postConstruct()");
	}
	
	public void initBean() {
		System.out.println("Java Custom Init Method");
	}

}
