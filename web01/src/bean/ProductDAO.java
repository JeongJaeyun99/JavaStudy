package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	Connection con = null; // 클래스 바로 아래에 만들어주면 클래스 전체영역에서 사용 가능
	DBConnectionMgr dbcp; // null

	public ProductDAO() {
		try {
			dbcp = DBConnectionMgr.getInstance();
			con = dbcp.getConnection();// 임대
		} catch (Exception e) {
			System.out.println("에러발생!!");
		}
	}
	
	public void insert(ProductVO bag) {
		try {
			
			// 3. 2번에서 연결된 것을 가지고 sql문 생성
			String sql = "insert into product values (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, bag.getId()); // 물음표 번호 1번에 title에 저장한 변수값을 넣어줘!
			ps.setString(2, bag.getName());
			ps.setString(3, bag.getContent());
			ps.setInt(4, bag.getPrice());
			ps.setString(5, bag.getCompany());
			ps.setString(6, bag.getImg());
			
			System.out.println("3. sql문 생성 성공!!");

			// URL site = new URL(site);

			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			int rowCount = ps.executeUpdate(); //insert문 실행한 row수,int 
			if(rowCount == 1) {
				System.out.println("상품 추가 성공!");
			}
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
	}
	public int delete(String id) {
		int result = 0;
		try {
			String sql = "delete from product where id = ";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, id); // 물음표 번호 1번에 title에 저장한 변수값을 넣어줘!
			
			System.out.println("3. sql문 생성 성공!!");
	
			// URL site = new URL(site);
	
			// 4. 3번에서 생성된 sql문을 Mysql로 전송
			result = ps.executeUpdate(); //insert문 실행한 row수,int 
			System.out.println("4. SQL문 mySQL로 전송 성공!!");
			dbcp.freeConnection(con,ps);
		} catch (Exception e) { // Exception == Error
			e.printStackTrace();// 에러정보를 추적해서 프린트해줘.!
			System.out.println("에러발생함.!!!!");
		}
		return result;
	}
	public int update(String content, String id) {
		int result = 0;
		try {
			
			String sql = "update product set content = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, content);
			ps.setString(2, id);

			System.out.println("3. sql문 생성성공....!");
			
			result = ps.executeUpdate();
			System.out.println("4. sql문 mysql로 전송 성공!");
			dbcp.freeConnection(con,ps);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		return result;
	}
	public ProductVO one(String id) {
		ProductVO vo = new ProductVO();
		try {	
				String sql = "select * from product where id = ? ";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, id);
				System.out.println("3. sql문 생성성공....!");
				
				ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
				System.out.println("4. sql문 mysql로 전송 성공!");
	//			System.out.println(table.next()); // table안에 데이터가 있으면 true,없으면 false
				if(table.next()) {
					vo.setId(table.getString("id"));
					vo.setName(table.getString("name"));
					vo.setContent(table.getString("content"));
					vo.setPrice(table.getInt("price"));
					vo.setCompany(table.getString("company"));
					vo.setImg(table.getString("img"));
					// 인덱스로 가져와도 되는데, db와 관련된 인덱스는 1부터 시작한다.
				}else {
				System.out.println("검색결과가 없음.");
				}
			dbcp.freeConnection(con,ps,table);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		return vo;
	}
	public ArrayList<ProductVO> list() { // member 테이블에 crud를 하고싶으면 MemberDAO를 사용하면됨
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		try {			
			String sql = "select * from product";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성성공....!");
			
			ResultSet table = ps.executeQuery(); // 테이블로 mysql로 받아온다.
			System.out.println("4. sql문 mysql로 전송 성공!");
			while(table.next()) {
				ProductVO bag = new ProductVO(); 
				bag.setId(table.getString("id"));
				bag.setName(table.getString("name"));
				bag.setContent(table.getString("content"));
				bag.setPrice(table.getInt("price"));
				bag.setCompany(table.getString("company"));
				bag.setImg(table.getString("img"));
				list.add(bag);
			}
			dbcp.freeConnection(con,ps,table);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류 발생!!!!");
		} 
		return list;
	}
}

