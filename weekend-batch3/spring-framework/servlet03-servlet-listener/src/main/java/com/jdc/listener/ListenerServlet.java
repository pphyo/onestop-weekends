package com.jdc.listener;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({
	"/attribute", "/start-session", "/stop-session"
})
public class ListenerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var context = getServletContext();
		
		var path = req.getServletPath();
		
		switch(path) {
			case "/attribute":
				context.setAttribute("appListener", "Other Message");
				context.removeAttribute("appListener");
				break;
			case "/start-session":
				var session = req.getSession(true);
				// replace attribute
				session.setAttribute("sesListener", "Attribute Replaced");
				break;
			case "/stop-session":
				req.getSession(true).invalidate();
		}
		
		
		context.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

}










