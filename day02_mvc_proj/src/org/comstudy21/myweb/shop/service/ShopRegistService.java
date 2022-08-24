package org.comstudy21.myweb.shop.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.shop.ShopDTO;
import static org.comstudy21.myweb.controller.MyController.shopDAO;

public class ShopRegistService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		if ("POST".equals(req.getMethod())) {
			String name = req.getParameter("name");
			String date = req.getParameter("date");
			  
			ShopDTO dto = new ShopDTO(0, name, date);
			shopDAO.insert(dto);
			return "redirect:list.do";
		} else {
			return "shop/regist";
		}
	}
}
