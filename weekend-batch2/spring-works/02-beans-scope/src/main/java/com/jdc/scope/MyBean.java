package com.jdc.scope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
public class MyBean implements InitializingBean, DisposableBean {
	
	public MyBean() {
		System.out.println("Default Construct");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable.destroy()");
	}
	
	void initMethod() {
		System.out.println("initMethod()");
	}
	
	void customDestroy() {
		System.out.println("Custom Destroy()");
	}
	
	@PreDestroy
	void beforeDestroy() {
		System.out.println("PreDestroy()");
	}
	
	@PostConstruct
	void afterCreateBean() {
		System.out.println("PostConstruct()");
	}

}
