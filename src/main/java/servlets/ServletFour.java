package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s4")
public class ServletFour extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int num1=Integer.parseInt(req.getParameter("num1"));	
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int sum=num1+num2;
		
		PrintWriter p=res.getWriter();
		p.println("Sum of 2 numbers "+sum);
		
	}

}
