package db연결;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {
	
	public void insert(String id,String pw,String name,String tel) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
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
			
			String sql = "insert into member values (?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
//				String siteN = "http://www.naver.com";
//				URL site = new URL(siteN);
			System.out.println("3. sql문 생성성공....!");
			
			ps.execute();
			System.out.println("4. sql문 mysql로 전송 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		
	} // class
	public void delete(String id) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
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
			
			String sql = "delete from member where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
//				String siteN = "http://www.naver.com";
//				URL site = new URL(siteN);
			System.out.println("3. sql문 생성성공....!");
			
			ps.execute();
			System.out.println("4. sql문 mysql로 전송 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		
	}// delete
	
	public void update(String tel,String id) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
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
			
			String sql = "update member set tel = ? where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);
//				String siteN = "http://www.naver.com";
//				URL site = new URL(siteN);
			System.out.println("3. sql문 생성성공....!");
			
			ps.execute();
			System.out.println("4. sql문 mysql로 전송 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		
	}// update
}
