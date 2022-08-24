package org.comstudy21.myweb.color.service;

import static org.comstudy21.myweb.controller.MyController.colorDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.color.ColorDTO;

public class ColorAddService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		if ("POST".equals(req.getMethod())) {
			String name = req.getParameter("name");
			String type = req.getParameter("type");
			  
			ColorDTO dto = new ColorDTO(0, name, type);
			colorDAO.insert(dto);
			return "redirect:list.do";
		} else {
			return "color/add";
		}
	}
}
