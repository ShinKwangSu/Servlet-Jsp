package org.comstudy21.myweb.member;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.comstudy21.myweb.controller.MyController;
import org.comstudy21.myweb.controller.PathVO;
import org.comstudy21.myweb.member.service.MemberDeleteService;
import org.comstudy21.myweb.member.service.MemberJoinService;
import org.comstudy21.myweb.member.service.MemberListService;
import org.comstudy21.myweb.member.service.MemberSelectIdService;
import org.comstudy21.myweb.member.service.MemberUpdateService;

public class MemberController implements MyController {
   

   @Override
   public String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
      
      String fileName = (String)req.getAttribute("fileName");
      String viewName = "member/list";
      
      if("/list".equals(fileName)) {
         viewName = new MemberListService().service(req, resp);
      } else if("/join".equals(fileName)) {
         viewName = new MemberJoinService().service(req, resp);
      } else if ("/delete".equals(fileName)) {
    	  viewName = new MemberDeleteService().service(req, resp);
      } else if ("/update".equals(fileName)) {
    	  viewName = new MemberUpdateService().service(req, resp);
      } else if ("/selectid".equals(fileName)) {
    	  viewName = new MemberSelectIdService().service(req, resp);
      }
      
      return viewName;
   }

}