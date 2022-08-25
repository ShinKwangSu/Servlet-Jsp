package org.sks.myweb.member;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sks.myweb.controller.MyController;
import org.sks.myweb.member.service.MemberLoginService;
import org.sks.myweb.member.service.MemberLogoutService;
import org.sks.myweb.member.service.MemberRegiService;

public class MemberController implements MyController {
	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws SQLException {

		String fileName = (String) req.getAttribute("fileName");
		String viewName = "member/login";
		
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if ("/login".equals(fileName)) {
			viewName = new MemberLoginService().service(req, resp);
		} else if ("/register".equals(fileName)) {
			viewName = new MemberRegiService().service(req, resp);
		} else if ("/logout".equals(fileName)) {
			viewName = new MemberLogoutService().service(req, resp);
		}

		return viewName;
	}
}
