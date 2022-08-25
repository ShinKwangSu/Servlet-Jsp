package org.sks.myweb.member.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberLogoutService {
	public String service(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
		
		req.getSession().invalidate();
		
		return "redirect:/home.do";
	}
}
