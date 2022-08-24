package org.comstudy21.myweb.coral;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;

public class CoralController extends MyController {
	@Override
	public String handler(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(">>> CoralController ...");
		return "red/coral";
	}
}
