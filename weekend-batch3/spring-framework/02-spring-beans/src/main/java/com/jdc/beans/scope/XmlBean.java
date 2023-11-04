package com.jdc.beans.scope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class XmlBean implements XmlSuperBean, InitializingBean, DisposableBean {
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Xml disposable bean destroy");		
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Xml preDestroy()");
	}
	
	public void customDestroy() {
		System.out.println("Xml customDestroy()");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Xml afterPropertiesSet()");		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Xml postConstruct()");
	}
	
	public void initBean() {
		System.out.println("Xml Custom Init Method");
	}

}
