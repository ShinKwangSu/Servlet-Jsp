package org.comstudy21.myweb.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.bbs.BoardDAO;
import org.comstudy21.myweb.member.MemberDAO;
import org.comstudy21.myweb.shop.ShopDAO;

public interface MyController {
	MemberDAO memberDAO = new MemberDAO();
	BoardDAO boardDAO = new BoardDAO();
	ShopDAO shopDAO = new ShopDAO();

	String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws SQLException;

}