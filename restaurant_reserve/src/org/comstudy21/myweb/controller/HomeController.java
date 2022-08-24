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
			items.put("예약 신청(고객용)", ctxPath + "/people/add.do");
			items.put("길동이네 식당 예약 고객 목록(관리용)", ctxPath + "/people/list.do");
			items.put("길동이네 식당 메뉴 관리(관리용)", ctxPath + "/product/list.do");
		}
		
		//System.out.println(">>> HomeController ... ");

		req.setAttribute("items", items);
		
		return "home";
	}
}
