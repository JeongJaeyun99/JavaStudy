package dbcp;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	
	Connection conn;
	DBConnectionMgr dbcp;
	
	public MemberDAO() {
		try {
			dbcp = DBConnectionMgr.getInstance();
			conn = dbcp.getConnection();
		} catch (Exception e) {
			System.out.println("에러발생");
		} 
	}
	
	public int insert(MemberVO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		int result = 0;
		try {
			
			String sql = "insert into member values (?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPw());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getTel());

			System.out.println("3. sql문 생성성공....!");
			
			result = ps.executeUpdate();
			System.out.println("4. sql문 mysql로 전송 성공!");
			dbcp.freeConnection(conn,ps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		return result;
	}// insert
	public int delete(String id) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		int result = 0;
		try {
			
			String sql = "delete from member where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println("3. sql문 생성성공....!");
			
			result = ps.executeUpdate();
			System.out.println("4. sql문 mysql로 전송 성공!");
			dbcp.freeConnection(conn,ps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		return result;
	}// delete
	
	public int update(String tel,String id) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		int result = 0;
		try {
			
			String sql = "update member set tel = ? where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);

			System.out.println("3. sql문 생성성공....!");
			
			result = ps.executeUpdate();
			System.out.println("4. sql문 mysql로 전송 성공!");
			dbcp.freeConnection(conn,ps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		return result;
	}// update
	
	public MemberVO one(String id) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		MemberVO vo = new MemberVO();
		try {
			
			String sql = "select * from member where id = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, id);
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
				dbcp.freeConnection(conn,ps,table);
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
