package in.code.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("test")
public class demo extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   String name1=req.getParameter("name");
	   System.out.println("name="+name1);
		System.out.println("i amin service method");
		
		
		Cookie cookie=new Cookie(name1, name1);
		
		PrintWriter objPrintWriter=res.getWriter();
		objPrintWriter.println("here am in server");
		
	}

}
