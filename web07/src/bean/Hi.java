package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hi")
public class Hi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get요청이 들어왔음");
		String q = request.getParameter("q");
		PrintWriter out = response.getWriter();
		out.print("<h1>your data : " + q + "<h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post요청이 들어왔음");	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		PrintWriter out = response.getWriter();
		out.print("<h1>your id : " + id + "<br>your pw : " + pw + "<h1>");
		
	}

}
