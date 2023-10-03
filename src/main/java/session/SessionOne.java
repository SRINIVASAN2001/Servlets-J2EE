package session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionhtml")
public class SessionOne extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("name");
		String password=req.getParameter("password");
		
		HttpSession session=req.getSession();
		session.setAttribute("username",username);
		session.setAttribute("password",password);
		
		RequestDispatcher dispacther=req.getRequestDispatcher("/session2");
		dispacther.forward(req, resp);
		
	
		
	}

}
