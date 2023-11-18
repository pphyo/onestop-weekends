package com.jdc.listener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener {
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("session is created");
		se.getSession().setAttribute("sesListener", "Hello From Session Listener");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("session is destroyed");
	}

}
