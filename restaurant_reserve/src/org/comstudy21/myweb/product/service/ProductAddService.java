package org.comstudy21.myweb.product.service;

import static org.comstudy21.myweb.controller.MyController.productDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.product.model.ProductDTO;

public class ProductAddService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		if ("POST".equals(req.getMethod())) {
			
			String rtitle = req.getParameter("rtitle");
			int rprice = Integer.parseInt(req.getParameter("rprice"));

			ProductDTO dto = new ProductDTO(0, rtitle, rprice);
			productDAO.insert(dto);
			return "redirect:list.do";
		} else {
			//method : get
//			List<ProductDTO> proList = new ArrayList<>();
//			proList = productDAO.selectAll();
//			req.setAttribute("proList", proList);
			
			return "product/add";
		}
	}
}
