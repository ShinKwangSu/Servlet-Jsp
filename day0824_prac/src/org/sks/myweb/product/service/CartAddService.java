package org.sks.myweb.product.service;

import static org.sks.myweb.controller.MyController.productDAO;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sks.myweb.product.ProductDTO;

public class CartAddService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		
		
		
        return "product/cart_list";
	}
}
