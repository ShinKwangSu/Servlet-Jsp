package org.comstudy21.myweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.color.ColorDAO;
import org.comstudy21.myweb.company.CompanyDAO;
import org.comstudy21.myweb.drink.DrinkDAO;

public interface MyController {
	DrinkDAO drinkDAO = new DrinkDAO();
	ColorDAO colorDAO = new ColorDAO();
	CompanyDAO companyDAO = new CompanyDAO();
	
	String handleRequest(HttpServletRequest req, HttpServletResponse resp);
}
