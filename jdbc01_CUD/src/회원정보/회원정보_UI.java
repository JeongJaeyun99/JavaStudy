package 회원정보;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import db연결.MemberDAO;

public class 회원정보_UI extends JFrame{
	
	FlowLayout flow;
	Font font;
	JLabel j1,j2,j3,j4,j5;
	JTextField t2,t3,t4,t5;
	JButton yes,no,upd;
	ImageIcon icon;
	public 회원정보_UI() {
		setSize(500,900);
		flow = new FlowLayout();
		setLayout(flow);
		setTitle("나의 회원정보 UI");
		getContentPane().setBackground(Color.green);		
		
		
		font = new Font("맑은 고딕",Font.BOLD,30);
		j1 = new JLabel();
		j2 = new JLabel("아이디 ");
		t2 = new JTextField(10);
		j3 = new JLabel("패스워드 ");
		t3 = new JTextField(10);
		j4 = new JLabel("이름 ");
		t4 = new JTextField(10);
		j5 = new JLabel("전화번호 ");
		t5 = new JTextField(10);
		
		icon = new ImageIcon("naver.png");
		j1.setIcon(icon);
		
		yes = new JButton("회원가입 요청");
		no = new JButton("회원탈퇴 요청");
		upd = new JButton("회원정보 수정");
		
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
		upd.setFont(font);
		
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
		upd.setForeground(Color.blue);
		
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
		add(upd); // 수정 요청
		
		yes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t2.getText();
				String pw = t3.getText();
				String name = t4.getText();
				String tel = t5.getText();
				
				MemberDAO dao = new MemberDAO();
				
				dao.insert(id,pw,name,tel);
				
				JOptionPane.showMessageDialog(null, "회원가입이 완료 되었습니다!");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			}
		});
		
		no.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("탈퇴할 id를 입력해주세요");
				MemberDAO dao = new MemberDAO();
				
				dao.delete(id);
				
				JOptionPane.showMessageDialog(null, "회원탈퇴가 완료 되었습니다!");
			}
		});
		
		upd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tel = JOptionPane.showInputDialog("수정할 tel를 입력해주세요");
				String id = JOptionPane.showInputDialog("수정할 id를 입력해주세요");
				MemberDAO dao = new MemberDAO();
				
				dao.update(tel,id);
				
				JOptionPane.showMessageDialog(null, "회원정보 수정이 완료 되었습니다!");
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		회원정보_UI ui = new 회원정보_UI();
	}

}
