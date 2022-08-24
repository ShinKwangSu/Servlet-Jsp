package org.comstudy21.myweb.people;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;
import org.comstudy21.myweb.people.service.PeopleAddService;
import org.comstudy21.myweb.people.service.PeopleListService;

public class PeopleController implements MyController {
	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		
		String fileName = (String)req.getAttribute("fileName");
		String viewName = "people/list";
		
		// req parameter encoding utf-8
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			if("/list".equals(fileName)) {
				viewName = new PeopleListService().service(req, resp);
			} else if("/add".equals(fileName)) {
				viewName = new PeopleAddService().service(req, resp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	    return viewName;
	}
}
