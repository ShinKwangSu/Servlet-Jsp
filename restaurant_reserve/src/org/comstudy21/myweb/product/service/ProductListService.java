package org.comstudy21.myweb.product.service;

import static org.comstudy21.myweb.controller.MyController.productDAO;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.product.model.ProductDTO;

public class ProductListService {

	public String service(HttpServletRequest req, HttpServletResponse resp) {
		List<ProductDTO> proList = productDAO.selectAll();
		req.setAttribute("proList", proList);
		return "product/list";
	}

}
