package org.comstudy21.myweb.drink.service;

import static org.comstudy21.myweb.controller.MyController.drinkDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.drink.DrinkDTO;

public class DrinkAddService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		if ("POST".equals(req.getMethod())) {
			String name = req.getParameter("name");
			String type = req.getParameter("type");
			  
			DrinkDTO dto = new DrinkDTO(0, name, type);
			drinkDAO.insert(dto);
			return "redirect:list.do";
		} else {
			return "drink/add";
		}
	}
}
