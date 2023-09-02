package com.jdc.di.beans;

import org.springframework.stereotype.Component;

import com.jdc.di.beans.qualifier.DIQualifier;
import com.jdc.di.beans.qualifier.QualifyType;

@Component
@DIQualifier(QualifyType.ONE)
public class MyDefaultService implements MyService {
	
	@Override
	public void doService() {
		System.out.println("My default service...");		
	}

}
