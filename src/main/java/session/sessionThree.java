package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import httpServlet.httpServlettwo;

@WebServlet("/session3")
public class sessionThree extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("username");
		String password=(String)session.getAttribute("password");
		
		PrintWriter p=resp.getWriter();
		p.println("Hello "+name+" and Your password is "+password);
	}
}
