package org.comstudy21.myweb.product;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;
import org.comstudy21.myweb.product.service.ProductAddService;
import org.comstudy21.myweb.product.service.ProductListService;

public class ProductController implements MyController {
	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		
		String fileName = (String)req.getAttribute("fileName");
		String viewName = "product/list";
		
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			if("/list".equals(fileName)) {
				viewName = new ProductListService().service(req, resp);
			} else if("/add".equals(fileName)) {
				viewName = new ProductAddService().service(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	    return viewName;
	}
}
