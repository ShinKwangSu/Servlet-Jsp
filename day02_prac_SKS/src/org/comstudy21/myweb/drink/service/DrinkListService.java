package org.comstudy21.myweb.drink.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.drink.DrinkDTO;
import static org.comstudy21.myweb.controller.MyController.drinkDAO;;

public class DrinkListService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		List<DrinkDTO> drinkList = drinkDAO.selectAll();
        req.setAttribute("drinkList", drinkList);
        return "drink/list";
	}
}
