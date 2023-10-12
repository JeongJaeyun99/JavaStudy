package 형변환응용;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권크롤링예시 extends JFrame{
	
	public static void main(String[] args) {
		String company = JOptionPane.showInputDialog("코드를 입력하세요 : ");
		Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + company); // 해당 주소로 네트워크로 연결
		// 005930 086520 022100
		try {
			Document doc = conn.get(); // 연결한 사이트에서 코드를 다 가져온다.
			Elements list = doc.select("a"); // ArrayList --상속--> Elements
			System.out.println(list.get(16).text());
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
