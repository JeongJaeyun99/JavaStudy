package 회원정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 회원정보_UI extends JFrame{
	
	FlowLayout flow;
	Font font;
	JLabel j1,j2,j3,j4,j5;
	JTextField t2,t3,t4,t5;
	JButton yes,no;
	public 회원정보_UI() {
		setSize(300,600);
		flow = new FlowLayout();
		setLayout(flow);
		setTitle("나의 회원정보 UI");
		getContentPane().setBackground(Color.green);		
		
		font = new Font("맑은 고딕",Font.BOLD,30);
		j1 = new JLabel("이미지 들어갈곳");
		j2 = new JLabel("아이디 ");
		t2 = new JTextField(10);
		j3 = new JLabel("패스워드 ");
		t3 = new JTextField(10);
		j4 = new JLabel("이름 ");
		t4 = new JTextField(10);
		j5 = new JLabel("전화번호 ");
		t5 = new JTextField(10);
		
		yes = new JButton("회원가입 요청");
		no = new JButton("회원탈퇴 요청");
		
		j1.setFont(font);
		j2.setFont(font);
		t2.setFont(font);
		j3.setFont(font);
		t3.setFont(font);
		j4.setFont(font);
		t4.setFont(font);
		j5.setFont(font);
		t5.setFont(font);
		yes.setFont(font);
		no.setFont(font);
		
		t2.setBackground(Color.pink);
		t2.setForeground(Color.red);
		t3.setBackground(Color.pink);
		t3.setForeground(Color.red);
		t4.setBackground(Color.pink);
		t4.setForeground(Color.red);
		t5.setBackground(Color.pink);
		t5.setForeground(Color.red);
		yes.setForeground(Color.blue);
		no.setForeground(Color.blue);
		
		add(j1); // 이미지
		add(j2); // 아이디
		add(t2);  
		add(j3); // 비밀번호
		add(t3);
		add(j4); // 이름
		add(t4);
		add(j5); // 전화번호
		add(t5);
		add(yes); // 가입 요청
		add(no); // 탈퇴 요청
		
		try {
			// 커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("커넥터 연결 성공.....!");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		회원정보_UI ui = new 회원정보_UI();
	}

}
