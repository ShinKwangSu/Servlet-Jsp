package org.sks.myweb.member.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sks.myweb.member.MemberDAO;
import org.sks.myweb.member.MemberDTO;

import static org.sks.myweb.controller.MyController.memberDAO;

public class MemberRegiService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		if ("POST".equals(req.getMethod())) {
			String name = req.getParameter("mname");
			String email = req.getParameter("email");
			String pw = req.getParameter("pw");
			String success = "회원가입 성공!";
			
			MemberDTO dto = new MemberDTO(0, name, email, pw);
			memberDAO.insert(dto);
			req.setAttribute("success", success);
			return "redirect:login.do";
		} else {
			return "member/register";
		}
	}
}
