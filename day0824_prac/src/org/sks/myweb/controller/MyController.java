package org.sks.myweb.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sks.myweb.member.MemberDAO;
import org.sks.myweb.product.ProductDAO;


public interface MyController {
	MemberDAO memberDAO = new MemberDAO();
	ProductDAO productDAO = new ProductDAO();

	String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws SQLException;
}
