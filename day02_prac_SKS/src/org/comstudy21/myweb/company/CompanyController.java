package org.comstudy21.myweb.company;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;
import org.comstudy21.myweb.company.service.CompanyAddService;
import org.comstudy21.myweb.company.service.CompanyListService;

public class CompanyController implements MyController {
	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		String fileName = (String)req.getAttribute("fileName");
		String viewName = "company/list";

		if("/list".equals(fileName)) {
			viewName = new CompanyListService().service(req, resp);
		} else if("/add".equals(fileName)) {
			viewName = new CompanyAddService().service(req, resp);
	    }
		
	    return viewName;
	}
}
