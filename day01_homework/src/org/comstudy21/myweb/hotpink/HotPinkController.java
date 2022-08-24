package org.comstudy21.myweb.hotpink;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;

public class HotPinkController extends MyController {
	@Override
	public String handler(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(">>> HopPinkController ...");
		return "red/hotpink";
	}
}
