package org.sks.myweb.product;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sks.myweb.controller.MyController;
import org.sks.myweb.product.service.CartAddService;
import org.sks.myweb.product.service.ProductListService;

public class ProductController implements MyController {
	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

		String fileName = (String) req.getAttribute("fileName");
		String viewName = "product/list";

		if ("/list".equals(fileName)) {
			viewName = new ProductListService().service(req, resp);
		} 
		else if ("/cart_list".equals(fileName)) {
			viewName = new CartAddService().service(req, resp);
		}

		return viewName;
	}
}
