package org.sks.myweb.member.service;

import static org.sks.myweb.controller.MyController.memberDAO;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.sks.myweb.member.MemberDTO;

public class MemberLoginService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		
		String viewName = "member/login";
		
		if ("POST".equals(req.getMethod())) {
			String email = req.getParameter("email");
			String pw = req.getParameter("pw");
			
			 MemberDTO mdto = memberDAO.selectCheck(email, pw);
			 if(mdto != null) {
				 HttpSession session = req.getSession(true);
				 session.setAttribute("login", mdto.getEmail());
				 session.setMaxInactiveInterval(60*30); //30분
				 
				 viewName="redirect:/home.do";
			 }else {
				 req.setAttribute("message", "로그인 실패 !!!");
			 }
			
			return viewName;
		} else {
			return "member/login";
		}
	}
}
