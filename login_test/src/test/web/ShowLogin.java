package test.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String name = "";
		String id = "";
		String pw = "";
		
		HttpSession session = req.getSession(false);
		
		if (session != null) {
			name = (String)session.getAttribute("login.name");
			id = (String)session.getAttribute("login.id");
			pw = (String)session.getAttribute("login.pw");
		} else {
			resp.sendRedirect("loginSession.html");
		}
		
		out.print("<html><body>");
		out.print("이름 : " + name + "<br/>");
		out.print("아이디 : " + id + "<br/>");
		out.print("비밀번호 : " + pw + "<br/>");
		out.print("</body></html>");
		
	}
}

