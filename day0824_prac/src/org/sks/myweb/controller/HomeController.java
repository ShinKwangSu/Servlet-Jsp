package org.sks.myweb.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements MyController {
	static Map<String, String> items = null;

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {

		return "home";
	}

}