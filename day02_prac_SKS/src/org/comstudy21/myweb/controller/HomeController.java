package org.comstudy21.myweb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements MyController {
	static Map<String, String> items = null;

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		String ctxPath = req.getContextPath();
		if(items == null){
			items = new HashMap();
			items.put("음료 목록", ctxPath + "/drink/list.do");
			items.put("색상 목록", ctxPath + "/color/list.do");
			items.put("기업 목록", ctxPath + "/company/list.do");
		}
		
		//System.out.println(">>> HomeController ... ");
		
		req.setAttribute("message", "Hello World!");
		req.setAttribute("items", items);
		
		return "home";
	}
}
