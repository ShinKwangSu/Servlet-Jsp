package org.comstudy21.myweb.shop.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.shop.ShopDTO;
import static org.comstudy21.myweb.controller.MyController.shopDAO;

public class ShopListService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		List<ShopDTO> shopList = shopDAO.selectAll();
        req.setAttribute("shopList", shopList);
        return "shop/list";
	}
}
