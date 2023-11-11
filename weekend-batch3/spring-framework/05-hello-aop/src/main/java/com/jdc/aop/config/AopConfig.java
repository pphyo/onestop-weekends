package com.jdc.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.jdc.aop.aspects", "com.jdc.aop.beans"})
@EnableAspectJAutoProxy
public class AopConfig {

}
