package com.jdc.scope;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/", "/counter", "/session-stop"})
public class CounterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession(true).invalidate();
		resp.sendRedirect(req.getContextPath().concat("/counter"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// request scope to count up
		Counter reqCounter = (Counter)req.getAttribute("counter");
		if(null == reqCounter) {
			reqCounter = new Counter();
			req.setAttribute("counter", reqCounter);
		}
		reqCounter.countUp();
		
		// session scope to count up
		HttpSession session = req.getSession(true);
		Counter sessionCounter = (Counter)session.getAttribute("counter");
		if(null == sessionCounter) {
			sessionCounter = new Counter();
			session.setAttribute("counter", sessionCounter);
		}
		sessionCounter.countUp();
		
		// application scope to count up
		ServletContext context = getServletContext();
		Counter applicationCounter = (Counter)context.getAttribute("counter");
		if(null == applicationCounter) {
			applicationCounter = new Counter();
			context.setAttribute("counter", applicationCounter);
		}
		applicationCounter.countUp();
		
		var dispatcher = context.getRequestDispatcher("/counter.jsp");
		dispatcher.forward(req, resp);
		
	}
}