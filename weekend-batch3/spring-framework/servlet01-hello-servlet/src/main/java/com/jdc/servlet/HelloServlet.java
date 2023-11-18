package com.jdc.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public final class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public HelloServlet() {
		System.out.println("Constructor...");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init()");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet()");
		req.setAttribute("message", "Welcome form Hello Servlet");
		getServletContext().getRequestDispatcher("/hello.jsp").forward(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

}






