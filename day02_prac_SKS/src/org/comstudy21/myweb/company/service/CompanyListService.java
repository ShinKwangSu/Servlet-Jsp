package org.comstudy21.myweb.company.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.company.CompanyDTO;
import static org.comstudy21.myweb.controller.MyController.companyDAO;

public class CompanyListService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		List<CompanyDTO> companyList = companyDAO.selectAll();
        req.setAttribute("companyList", companyList);
        return "company/list";
	}
}
