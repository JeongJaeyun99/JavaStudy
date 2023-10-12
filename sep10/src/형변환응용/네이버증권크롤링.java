package 형변환응용;

import java.awt.Color;
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

public class 네이버증권크롤링 extends JFrame{
	
	JLabel cm,c,y,t,y2,t2;
	FlowLayout flow;
	JTextField c2;
	JButton b;
	Font font;
	public 네이버증권크롤링() {
		setSize(500,500);
		flow = new FlowLayout();
		setLayout(flow);
		
		font = new Font("맑은 고딕",Font.BOLD,30);
		
		c = new JLabel("코드를 입력해주세요 : ");
		c2 = new JTextField(10);
		// 005930 086520 022100
		cm = new JLabel();
		y = new JLabel("전일가 들어갈곳 :   ");
		y2 = new JLabel();
		t = new JLabel("시가 들어갈곳 :   ");
		t2 = new JLabel();
		b = new JButton();
		
		c.setFont(font);
		c2.setFont(font);
		cm.setFont(font);
		y.setFont(font);
		y2.setFont(font);
		t.setFont(font);
		t2.setFont(font);
		b.setFont(font);
		
		cm.setForeground(Color.blue);
		t2.setForeground(Color.red);
		
		b.setText("증권 정보 보기");
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String company = c2.getText();
				Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + company);
				try {
					Document doc = conn.get();
					Elements list = doc.select("td.first span.blind");
					Elements list2 = doc.select("a");					
					y2.setText(list.get(0).text());
					t2.setText(list.get(1).text());
					cm.setText(list2.get(16).text());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}	
		});
		
		add(c);
		add(c2);
		add(cm);		
		add(y);
		add(y2);		
		add(t);
		add(t2);
		add(b);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		네이버증권크롤링 par = new 네이버증권크롤링();

}

//		String company = JOptionPane.showInputDialog("코드를 입력하세요 : ");
//		Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + company); // 해당 주소로 네트워크로 연결
//		System.out.println(conn);
//		// 005930 086520 022100
//		try {
//			Document doc = conn.get(); // 연결한 사이트에서 코드를 다 가져온다.
////			System.out.println(doc);
//			Elements list = doc.select("span.code"); // ArrayList --상속--> Elements
//			// Elements : 조건에 맞는 태그들의 리스트를 객체화
//			String code = list.get(0).text();
//			System.out.println("code>> " + code);
//			System.out.println("---------------");
//			Elements list2 = doc.select("td.first span.blind");
//			
//			System.out.println("전일>> "  + list2.get(0).text());
//			System.out.println("시가>> " + list2.get(1).text());
//			
//			Elements list3 = doc.select("td.fitst td");
//			for (int i = 0; i < list3.size(); i++) {
//				System.out.println(list3.get(i));
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} 
}