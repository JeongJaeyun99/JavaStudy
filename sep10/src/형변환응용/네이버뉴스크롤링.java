package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버뉴스크롤링 {

	public static void main(String[] args) {
		Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930"); // 해당 주소로 네트워크로 연결
		System.out.println(conn);
		try {
			Document doc = conn.get(); // 연결한 사이트에서 코드를 다 가져온다.
//			System.out.println(doc);
			Elements list = doc.select("span.code"); // ArrayList --상속--> Elements
			// Elements : 조건에 맞는 태그들의 리스트를 객체화
			String code = list.get(0).text();
			System.out.println("code>> " + code);
			System.out.println("---------------");
			Elements list2 = doc.select("td.first span.blind");
			
			System.out.println("전일>> " + list2.get(0).text());
			System.out.println("시가>> " + list2.get(1).text());
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
