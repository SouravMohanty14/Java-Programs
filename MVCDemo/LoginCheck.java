import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//getParameter(0 will get the values from form which
		//was sent by jsp page
		String uname =  request.getParameter("uname");
		String passwd = request.getParameter("passwd");
		model.LoginCredential obj = new model.LoginCredential();
		obj.setUname(uname);
		obj.setPasswd(passwd);
		if(obj.checkLogin())
		{
			RequestDispatcher dispatch = request.getRequestDispatcher("Successfully logged in");
			dispatch.forward(request,response);
			
		}
		else
		{
			RequestDispatcher dispatch = request.getRequestDispatcher("Failed to log in");
			dispatch.forward(request,response);
		}
	}

}
