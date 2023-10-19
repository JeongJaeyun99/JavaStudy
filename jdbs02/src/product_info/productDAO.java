package product_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class productDAO {
	public void insert(productVO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공....!");
			
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection conn =  DriverManager.getConnection(url,user,password);
			System.out.println("2. shop db 연결 성공....!");
			
			String sql = "insert into product values (?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getContent());
			ps.setInt(4, vo.getPrice());
			ps.setString(5, vo.getCompany());
			ps.setString(6, vo.getImg());
			
			System.out.println("3. sql문 생성성공....!");
			
			int rowCount = ps.executeUpdate();
			if(rowCount == 1) {
				System.out.println("상품 추가 성공!");
			}
			System.out.println("4. sql문 mysql로 전송 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		
	} // class
	public void delete(productVO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공....!");
			
			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection conn =  DriverManager.getConnection(url,user,password);
			System.out.println("2. shop db 연결 성공....!");
			
			String sql = "delete from product where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			System.out.println("3. sql문 생성성공....!");
			
			ps.execute();
			System.out.println("4. sql문 mysql로 전송 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		
	}// delete
	
	public void update(productVO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공....!");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection conn =  DriverManager.getConnection(url,user,password);
			System.out.println("2. shop db 연결 성공....!");
			
			String sql = "update product set img = ? where id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getImg());
			ps.setString(2, vo.getId());
			System.out.println("3. sql문 생성성공....!");
			
			ps.execute();
			System.out.println("4. sql문 mysql로 전송 성공!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		
	}// update
	
	public void one(productVO vo) { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 설정 성공....!");

			String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&serverTimezone=Asia/Seoul";
			String user = "root";
			String password = "1234";
			Connection conn =  DriverManager.getConnection(url,user,password);
			System.out.println("2. shop db 연결 성공....!");
			
			String sql = "select * from product where id = ? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			System.out.println("3. sql문 생성성공....!");
			
			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. sql문 mysql로 전송 성공!");
//			System.out.println(table.next()); // table안에 데이터가 있으면 true,없으면 false
			if(table.next()) {
				String id2 = table.getString("id");
				String name = table.getString("name");
				String content = table.getString("content");
				String price = table.getString("price");
				String company = table.getString("company");
				String img = table.getString("img");
				System.out.println(id2);
				System.out.println(name);
				System.out.println(content);
				System.out.println(price);
				System.out.println(company);
				System.out.println(img);
			}else {
				System.out.println("검색결과가 없음.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		
	}// select
}
