package com.jdc.beans.scope;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope
@Lazy(true)
public class AnnotationBean implements InitializingBean, DisposableBean {
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Annotation disposable bean destroy");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("Annotation preDestroy()");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Annotation afterPropertiesSet()");		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Annotation postConstruct()");
	}

}
