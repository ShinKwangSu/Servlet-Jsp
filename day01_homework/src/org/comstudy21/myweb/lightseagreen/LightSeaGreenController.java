package org.comstudy21.myweb.lightseagreen;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;

public class LightSeaGreenController extends MyController {

	@Override
	public String handler(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println(">>> LightSeaGreenController ...");
		return "green/lightseagreen";
	}

}
