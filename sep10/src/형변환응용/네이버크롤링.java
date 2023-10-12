package 형변환응용;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버크롤링 {

	public static void main(String[] args) {
		Connection conn = Jsoup.connect("https://www.naver.com"); // 해당 주소로 네트워크로 연결
		System.out.println(conn);
		try {
			Document doc = conn.get(); // 연결한 사이트에서 코드를 다 가져온다.
//			System.out.println(doc);
			Elements list = doc.select("span"); // ArrayList --상속--> Elements
			// Elements : 조건에 맞는 태그들의 리스트를 객체화
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).text()); // span태그의 코드를 한개씩 갖고오는데 그 코드중에서도 글자만 갖고온다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
