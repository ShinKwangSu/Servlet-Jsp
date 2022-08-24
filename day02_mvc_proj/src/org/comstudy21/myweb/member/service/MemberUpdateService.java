package org.comstudy21.myweb.member.service;

import static org.comstudy21.myweb.controller.MyController.memberDAO;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.member.MemberDTO;

public class MemberUpdateService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		if ("POST".equals(req.getMethod())) {
			int no = Integer.parseInt(req.getParameter("no"));
			String name = req.getParameter("name");
			String phone = req.getParameter("phone");
			
			MemberDTO dto = new MemberDTO(no, name, phone);
			
			memberDAO.update(dto);
			return "redirect:list.do";
		} else {
			return "member/update";
		}
	}
}
