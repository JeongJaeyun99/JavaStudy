package bean;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
				vo.setId(table.getString("id"));
				vo.setPw(table.getString("pw"));
				vo.setName(table.getString("name"));
				vo.setTel(table.getString("tel"));
				// 인덱스로 가져와도 되는데, db와 관련된 인덱스는 1부터 시작한다.
			}else {
				System.out.println("검색결과가 없음.");
			}
			dbcp.freeConnection(conn,ps,table);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		return vo;
	}// select(one)
	public ArrayList<MemberVO> list() { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		try {			
			String sql = "select * from member";
			PreparedStatement ps = conn.prepareStatement(sql);
			System.out.println("3. sql문 생성성공....!");
			
			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. sql문 mysql로 전송 성공!");
			while(table.next()) {
				MemberVO bag = new MemberVO(); 
				bag.setId(table.getString("id"));
				bag.setPw(table.getString("pw"));
				bag.setName(table.getString("name"));
				bag.setTel(table.getString("tel"));
				// 인덱스로 가져와도 되는데, db와 관련된 인덱스는 1부터 시작한다.
				list.add(bag);
			}
			dbcp.freeConnection(conn,ps,table);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		return list;
	}// select(all)
}// class
