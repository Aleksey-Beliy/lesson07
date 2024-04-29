package edu.training.web.controller.concrete.impl;

import java.io.IOException;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.User;
import edu.training.web.bean.UserRegInfo;
import edu.training.web.controller.concrete.Command;
import edu.training.web.logic.LogicStub;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class DoRegistration implements Command {

	private final LogicStub logic = new LogicStub();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * System.out.println("username " + request.getParameter("username"));
		 * System.out.println("password " + request.getParameter("password"));
		 * System.out.println("name " + request.getParameter("name"));
		 * System.out.println("dob " + request.getParameter("dob"));
		 * System.out.println("country " + request.getParameter("country"));
		 * 
		 * RequestDispatcher dispatcher =
		 * request.getRequestDispatcher("WEB-INF/jsp/registration.jsp");
		 * dispatcher.forward(request, response);
		 */
		String login = request.getParameter("login");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String passwordVerifier = request.getParameter("passwordVerifier");
		User user = logic.checkRegistration(new UserRegInfo(login, email, password, passwordVerifier));
		if (user != null) {
			HttpSession session = (HttpSession) request.getSession(true);
			session.setAttribute("user", user);
			response.sendRedirect("Controller?command=go_to_auth_page");
		} else {
			response.sendRedirect("Controller?command=go_to_index_page");
		}

	}

}