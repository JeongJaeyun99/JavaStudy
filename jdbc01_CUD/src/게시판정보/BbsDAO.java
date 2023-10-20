package 게시판정보;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BbsDAO {
	
	Connection conn;
	
	public BbsDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공....!");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			conn =  DriverManager.getConnection(url,user,password);
			System.out.println("2. shop db 연결 성공....!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 파일을 찾을수 없음");
		} catch (SQLException e) {
			System.out.println("mySQL연결 할때 문제 생김");
		}
	}
	
	public void insert(String title,String content,String writer) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		try {

			String sql = "insert into bbs values (null, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, writer);

			System.out.println("3. sql문 생성성공....!");
			
			ps.execute();
			System.out.println("4. sql문 mysql로 전송 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		
	} // insert
	public void delete(int no) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		try {

			String sql = "delete from bbs where no = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, no);

			System.out.println("3. sql문 생성성공....!");
			
			ps.execute();
			System.out.println("4. sql문 mysql로 전송 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		
	}// delete
	
	public void update(String title,String content,int no) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		try {
			
			String sql = "update bbs set title = ?,  content = ? where no = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, no);

			System.out.println("3. sql문 생성성공....!");
			
			ps.execute();
			System.out.println("4. sql문 mysql로 전송 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		
	}// update
}
