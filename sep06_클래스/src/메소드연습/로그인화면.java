package 메소드연습;

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

public class 로그인화면 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("로그인화면");
		f.setSize(550,700);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("맑은 고딕",1,35);
		
		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");
		
		JLabel top = new JLabel();
//		top.setText("<<<이미지가 들어갈곳>>>");
		top.setFont(font);
		top.setIcon(icon1);
		
		JLabel j1 = new JLabel();
		j1.setText("아이디 : ");
		j1.setFont(font);
		JTextField t1 = new JTextField(10);
		t1.setFont(font);
		
		JLabel j2 = new JLabel();
		j2.setText("비밀번호 : ");
		j2.setFont(font);
		JTextField t2 = new JTextField(10);
		t2.setFont(font);
		
		JButton login = new JButton();
//		login.setIcon(icon2);
		login.setBackground(Color.white);
		login.setForeground(Color.blue);
		login.setText("로그인");
		login.setFont(font);
		
		JButton reset = new JButton();
//		reset.setIcon(icon3);
		reset.setBackground(Color.white);
		reset.setForeground(Color.red);
		reset.setText("리셋");
		reset.setFont(font);
		
		f.add(top);
		f.add(j1);
		f.add(t1);
		f.add(j2);
		f.add(t2);
		f.add(login);
		f.add(reset);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// login 버튼을 눌렀을때 실행할 내용을 넣어주세요
				System.out.println("로그인 버튼 클릭함");
				String id = t1.getText();
				String pw = t2.getText();
				if(id.equals("root") && pw.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인에 성공하였습니다!");
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				}else {
					JOptionPane.showMessageDialog(f, "아이디 또는 비밀번호를 확인해주세요");
				}
				// t1값이 root, t2값이 1234인지 확인
			}
		}); // login

		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// reset 버튼을 눌렀을때 실행할 내용을 넣어주세요
				System.out.println("리셋 버튼 클릭함");
				t1.setText("");
				t2.setText("");
			}
		}); // reset
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
