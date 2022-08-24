package org.comstudy21.myweb.firebrick;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;

public class FireBrickController extends MyController {

	@Override
	public String handler(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(">>> FireBrickController ...");
		return "red/firebrick";
	}

}
