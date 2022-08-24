package org.comstudy21.myweb.company.service;

import static org.comstudy21.myweb.controller.MyController.companyDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.company.CompanyDTO;

public class CompanyAddService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		if ("POST".equals(req.getMethod())) {
			String name = req.getParameter("name");
			String nation = req.getParameter("nation");
			  
			CompanyDTO dto = new CompanyDTO(0, name, nation);
			companyDAO.insert(dto);
			return "redirect:list.do";
		} else {
			return "company/add";
		}
	}
}
