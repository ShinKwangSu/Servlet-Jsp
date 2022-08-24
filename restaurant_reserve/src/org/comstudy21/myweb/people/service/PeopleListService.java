package org.comstudy21.myweb.people.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.people.model.PeopleDTO;
import static org.comstudy21.myweb.controller.MyController.peopleDAO;

public class PeopleListService {
	public String service(HttpServletRequest req, HttpServletResponse resp) {
		List<PeopleDTO> peopleList = peopleDAO.selectAll();
		req.setAttribute("peopleList", peopleList);
		return "people/list";
	}
}
