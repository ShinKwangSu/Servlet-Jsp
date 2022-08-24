package org.comstudy21.myweb.color.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.color.ColorDTO;
import static org.comstudy21.myweb.controller.MyController.colorDAO;

public class ColorListService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		List<ColorDTO> colorList = colorDAO.selectAll();
        req.setAttribute("colorList", colorList);
        return "color/list";
	}
}
