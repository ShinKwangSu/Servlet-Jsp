package org.comstudy21.myweb.member.service;

import static org.comstudy21.myweb.controller.MyController.memberDAO;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberSelectIdService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		if ("POST".equals(req.getMethod())) {
			int id = Integer.parseInt(req.getParameter("id"));
			  
			memberDAO.selectId(id);
			return "redirect:list.do";
		} else {
			return "member/selectid";
		}
	}
}
