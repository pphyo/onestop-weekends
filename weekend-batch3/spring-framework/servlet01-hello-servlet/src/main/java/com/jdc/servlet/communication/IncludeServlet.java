package com.jdc.servlet.communication;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/include")
public class IncludeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		var writer = resp.getWriter();
		
		writer.append("""
				<!DOCTYPE html>
				<html>
					<head>
						<title>Include</title>
					</head>
					<body>
				""");
		
		RequestDispatcher reqDisp = req.getRequestDispatcher("header");
		
		// include header
		reqDisp.include(req, resp);
		
		// response include servlet 
		writer.append("<p>This is include servlet.</p>");
		
		reqDisp = this.getServletContext().getRequestDispatcher("/footer");
		
		// include footer
		reqDisp.include(req, resp);
		
		writer.append("</body> </html>");
		
	}

}