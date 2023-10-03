package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/httptwo")
public class httpServlettwo extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Cookie[] cook=req.getCookies();
		
		String name=null;
		for(Cookie c:cook)
		{
			if(c.getValue().equals("dinga"))
			{
				name="dinga";
			}
		}
		
		if(name!=null)
		{
			PrintWriter p=resp.getWriter();
			p.println("Hello dinga ");
		}
		else
		{
			PrintWriter p=resp.getWriter();
			p.println("bye user");
		}
	}
}
