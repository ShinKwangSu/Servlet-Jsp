package org.comstudy21.myweb.bbs.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.bbs.BoardDTO;
import static org.comstudy21.myweb.controller.MyController.boardDAO;

public class BoardListService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		List<BoardDTO> bbsList = boardDAO.selectAll();
        req.setAttribute("bbsList", bbsList);
        return "bbs/list";
	}
}
