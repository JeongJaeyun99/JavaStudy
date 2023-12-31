package 게시판정보;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	
	public int insert(BbsVO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		int result = 0;
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
			
			String sql = "insert into bbs values (null, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setString(3, vo.getWriter());

			System.out.println("3. sql문 생성성공....!");
			
			result = ps.executeUpdate();
			System.out.println("4. sql문 mysql로 전송 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		}
		return result;
		
	} // class
	public void delete(BbsVO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
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
			
			String sql = "delete from bbs where no = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, vo.getNo());
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
	
	public void update(BbsVO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
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
			
			String sql = "update bbs set title = ?,  content = ? where no = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setString(2, vo.getContent());
			ps.setInt(3, vo.getNo());
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

	public BbsVO one(int no) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		BbsVO vo = new BbsVO();
		try {
			// 1. 연결할 부품(커넥터,driver)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공....!");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection conn =  DriverManager.getConnection(url,user,password);
			System.out.println("2. shop db 연결 성공....!");
			
			String sql = "select * from bbs where no = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("3. sql문 생성성공....!");
			
			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. sql문 mysql로 전송 성공!");
//			System.out.println(table.next()); // table안에 데이터가 있으면 true,없으면 false
			if(table.next()) {
				int no2 = table.getInt("no");
				String title = table.getString("title");
				String content = table.getString("content");
				String writer = table.getString("writer");
				System.out.println(no2);
				System.out.println(title);
				System.out.println(content);
				System.out.println(writer);
				vo.setNo(no2);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setWriter(writer);
			}else {
				System.out.println("검색결과가 없음.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		return vo;
	}// select
}
