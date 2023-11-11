package bean;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/hi2")
public class Hi2 extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("서블릿이 탄생함");
		String tel = config.getInitParameter("tel");
		String email = config.getInitParameter("email");
		System.out.println("관리자 전화번호인 " + tel + "로 문자를 보냄");
		System.out.println("관리자 이메일인 " + email + "로 메일를 보냄");
	}
	@Override
	public void destroy() {
		System.out.println("서블릿이 생명을 다함");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()메소드가 자동 호출됨");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()자동 호출");
	}

}
      





