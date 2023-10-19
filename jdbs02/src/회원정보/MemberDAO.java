package 회원정보;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	
	public void insert(회원정보VO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
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
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPw());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getTel());
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
	public void delete(회원정보VO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
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
			ps.setString(1, vo.getId());
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
	
	public void update(회원정보VO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
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
			ps.setString(1, vo.getTel());
			ps.setString(2, vo.getId());
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
	
	public 회원정보VO one(String id) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		회원정보VO vo = new 회원정보VO();
		try {
			// 1. 연결할 부품(커넥터,driver)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공....!");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection conn =  DriverManager.getConnection(url,user,password);
			System.out.println("2. shop db 연결 성공....!");
			
			String sql = "select * from member where id = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			System.out.println("3. sql문 생성성공....!");
			
			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. sql문 mysql로 전송 성공!");
//			System.out.println(table.next()); // table안에 데이터가 있으면 true,없으면 false
			if(table.next()) {
				String id2 = table.getString("id");
				String pw = table.getString("pw");
				String name = table.getString("name");
				String tel = table.getString("tel");
				System.out.println(id2);
				System.out.println(pw);
				System.out.println(name);
				System.out.println(tel);
				vo.setId(id2);
				vo.setPw(pw);
				vo.setName(name);
				vo.setTel(tel);
			}else {
				System.out.println("검색결과가 없음.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		return vo;
	}// select
}// class
