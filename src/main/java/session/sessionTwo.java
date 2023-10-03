package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session2")
public class sessionTwo extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("username");
		String password=(String)session.getAttribute("password");
		
		if(name!=null && password!=null) {
			req.setAttribute("op",name);
//			RequestDispatcher dispatcher=req.getRequestDispatcher("session.jsp");
//			dispatcher.include(req, resp);
			RequestDispatcher dispatcher=req.getRequestDispatcher("session3");
			dispatcher.forward(req, resp);
		}
		
		
	}

}
