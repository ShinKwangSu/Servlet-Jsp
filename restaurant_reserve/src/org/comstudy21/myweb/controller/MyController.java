package org.comstudy21.myweb.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.people.model.PeopleDAO;
import org.comstudy21.myweb.product.model.ProductDAO;

public interface MyController {
	ProductDAO productDAO = new ProductDAO();
	PeopleDAO peopleDAO = new PeopleDAO();
	//ShopDAO shopDAO = new ShopDAO();

	String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws SQLException;
}
