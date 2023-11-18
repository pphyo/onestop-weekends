package com.jdc.servlet.communication;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ForwardToServlet", urlPatterns = "/forward-to")
public class ForwardToServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("forwardToMessage", "Hello from ForwardTo Servlet");
		getServletContext().getRequestDispatcher("/forward.jsp").forward(req, resp);
	}

}