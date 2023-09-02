package com.jdc.di.beans;

import org.springframework.stereotype.Component;

import com.jdc.di.beans.qualifier.DIQualifier;
import com.jdc.di.beans.qualifier.QualifyType;

@Component
@DIQualifier(QualifyType.THREE)
public class MyCustomService implements MyService {

	@Override
	public void doService() {
		System.out.println("My custom service...");
	}

}
