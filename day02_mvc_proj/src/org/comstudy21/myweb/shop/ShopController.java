package org.comstudy21.myweb.shop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.shop.service.ShopListService;
import org.comstudy21.myweb.shop.service.ShopRegistService;
import org.comstudy21.myweb.controller.MyController;

public class ShopController implements MyController {

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		
		String fileName = (String)req.getAttribute("fileName");
		String viewName = "shop/list";
		
		if("/list".equals(fileName)) {
			viewName = new ShopListService().service(req, resp);
		} else if("/regist".equals(fileName)) {
			viewName = new ShopRegistService().service(req, resp);
	    }
	      
	    return viewName;
	}

}
