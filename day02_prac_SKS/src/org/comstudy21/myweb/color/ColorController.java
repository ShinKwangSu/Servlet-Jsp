package org.comstudy21.myweb.color;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.color.service.ColorAddService;
import org.comstudy21.myweb.color.service.ColorListService;
import org.comstudy21.myweb.controller.MyController;

public class ColorController implements MyController {
	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		String fileName = (String)req.getAttribute("fileName");
		String viewName = "color/list";
		
		if("/list".equals(fileName)) {
			viewName = new ColorListService().service(req, resp);
		} else if("/add".equals(fileName)) {
			viewName = new ColorAddService().service(req, resp);
	    }

	    return viewName;
	}
}
