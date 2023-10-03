package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/httpone")
public class HttpServletone extends HttpServlet
{
	
//httpservlet is an sub class of servlet which has some implemented methods(5) from servlet and it has some other methods also.
//httpservlet class is used only for http request and response and not for https,smtp,ftp
//It accepts only the http server only
//	1.do post 2.do get 3.do put 4.do delete 5.do head 6.do option
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		
		PrintWriter p=resp.getWriter();
		p.println("Hello "+name+"Your mail id is "+email);
		
		Cookie c1=new Cookie("uname",name);
		Cookie c2=new Cookie("uemail",email);
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		RequestDispatcher dispatch=req.getRequestDispatcher("hhtptwo");
		dispatch.include(req, resp);

	}
}
