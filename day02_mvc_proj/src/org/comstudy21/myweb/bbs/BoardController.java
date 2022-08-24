package org.comstudy21.myweb.bbs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.bbs.service.BoardListService;
import org.comstudy21.myweb.bbs.service.BoardPostService;
import org.comstudy21.myweb.controller.MyController;

public class BoardController implements MyController {

	@Override
	public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
		
		String fileName = (String)req.getAttribute("fileName");
		String viewName = "bbs/list";
		
		if("/list".equals(fileName)) {
			viewName = new BoardListService().service(req, resp);
		} else if("/post".equals(fileName)) {
			viewName = new BoardPostService().service(req, resp);
	    }
	      
	    return viewName;
	}

}
