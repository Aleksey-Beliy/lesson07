package edu.training.web.controller.concrete.impl;

import java.io.IOException;

import edu.training.web.bean.News;
import edu.training.web.controller.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToIndexPage implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// stub
		News news = new News("New Java Course!!!", "adasd iauhdiauhda iaudiauh");
		request.setAttribute("mainNews", news);

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main_index.jsp");
		dispatcher.forward(request, response);

	}

}
