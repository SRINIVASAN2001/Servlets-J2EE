package servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s5")
public class ServletFive extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		req.setAttribute("uname",name);
		req.setAttribute("upassword", password);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("s6");
		dispatcher.include(req, res);
	}

}
