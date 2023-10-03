package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/s8")
public class ServletEight extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int num1=(int) req.getAttribute("num1");
		int num2=(int) req.getAttribute("num2");
		
		int product=num1 * num2;
		
		PrintWriter p=res.getWriter();
		p.println("Product of numbers is "+product);
		
	}
	

}
