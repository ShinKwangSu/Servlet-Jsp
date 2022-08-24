package org.comstudy21.myweb.people.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.people.model.PeopleDTO;
import org.comstudy21.myweb.product.model.ProductDTO;

import static org.comstudy21.myweb.controller.MyController.peopleDAO;
import static org.comstudy21.myweb.controller.MyController.productDAO;

public class PeopleAddService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		if ("POST".equals(req.getMethod())) {
			  
			PeopleDTO pdto = new PeopleDTO();
			pdto.setName(req.getParameter("name"));
			pdto.setPhone(req.getParameter("phone"));
			pdto.setRpay(req.getParameter("rpay"));
			pdto.setRno(Integer.parseInt(req.getParameter("rno")));
			
			peopleDAO.insert(pdto);
			return "redirect:list.do";
		} else {
			//method : get
			List<ProductDTO> proList = new ArrayList<>();
			proList = productDAO.selectAll();
			req.setAttribute("proList", proList);
			
			return "people/add";
		}
	}
}
