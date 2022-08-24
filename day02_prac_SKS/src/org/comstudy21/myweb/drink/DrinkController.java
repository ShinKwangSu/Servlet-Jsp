package org.comstudy21.myweb.drink;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;
import org.comstudy21.myweb.drink.service.DrinkAddService;
import org.comstudy21.myweb.drink.service.DrinkListService;

public class DrinkController implements MyController {
	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		String fileName = (String)req.getAttribute("fileName");
		String viewName = "drink/list";
		
		if("/list".equals(fileName)) {
			viewName = new DrinkListService().service(req, resp);
		} else if("/add".equals(fileName)) {
			viewName = new DrinkAddService().service(req, resp);
	    }

	    return viewName;
	}
}
