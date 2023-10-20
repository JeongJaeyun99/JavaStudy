package db연결;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB테스트 {

	public static void main(String[] args) {
		
			try {
				// 1. 연결할 부품(커넥터,driver)
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("1. 드라이버 설정 성공....!");
				
				// 2. 커넥터로 db와 연결
				// url - ip + port + db명
				// id, pw				
				
				String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
				String user = "root";
				String password = "1234";
				Connection conn =  DriverManager.getConnection(url,user,password);
				System.out.println("2. shop db 연결 성공....!");
				
				String sql = "insert into member values ('star','1234','star','011')";
				PreparedStatement ps = conn.prepareStatement(sql);
//				String siteN = "http://www.naver.com";
//				URL site = new URL(siteN);
				System.out.println("3. sql문 생성성공....!");
				
				ps.execute();
				System.out.println("4. sql문 mysql로 전송 성공!");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("오류 발생!!!!");
			} 
		
	}

}
