package org.comstudy21.myweb.royalblue;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;

public class RoyalBlueController extends MyController {

	@Override
	public String handler(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(">>> RoyalBlueController ...");
		return "blue/royalblue";
	}

}
