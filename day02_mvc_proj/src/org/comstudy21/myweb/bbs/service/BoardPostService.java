package org.comstudy21.myweb.bbs.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.bbs.BoardDTO;
import static org.comstudy21.myweb.controller.MyController.boardDAO;

public class BoardPostService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		if ("POST".equals(req.getMethod())) {
			String title = req.getParameter("title");
			String post = req.getParameter("post");
			  
			BoardDTO dto = new BoardDTO(0, title, post);
			boardDAO.insert(dto);
			return "redirect:list.do";
		} else {
			return "bbs/post";
		}
	}
}
