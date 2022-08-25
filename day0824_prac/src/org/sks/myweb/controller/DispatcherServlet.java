package org.sks.myweb.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.sks.myweb.controller.MyUtil.initPathAttr;

public class DispatcherServlet extends HttpServlet {

	MyController ctrl = new HomeController();
	HandlerMapping handlerMapping = new HandlerMapping();

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PathVO pathVO = initPathAttr(req, resp);

		ctrl = handlerMapping.getController(pathVO.getDirName());

		String viewName = "";
		try {
			if (ctrl != null) {
				viewName = ctrl.handleRequest(req, resp);
				if (viewName.indexOf("redirect:") != -1) {
					resp.sendRedirect(viewName.substring("redirect:".length()));

					return;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		viewName = pathVO.getPrefix() + viewName + pathVO.getSuffix();
		RequestDispatcher dispatcher = req.getRequestDispatcher(viewName);
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}
