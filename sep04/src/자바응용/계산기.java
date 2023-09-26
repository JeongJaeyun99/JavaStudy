package 자바응용;

import java.awt.Color;
import java.awt.Container;
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

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품을 ram에 다 가져다 놓아야 한다.
		JFrame f = new JFrame(); // 100
		f.setSize(500, 750);
		// f.setBackground(Color.green);
//		Container pane = f.getContentPane();
//		pane.setBackground(Color.green);
		f.getContentPane().setBackground(Color.green);

		// 물흐르듯 순서대로 붙여줍니다.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton plus = new JButton(); // 200
		plus.setText("더하기");
		
		JButton minus = new JButton(); // 200
		minus.setText("빼 기");
		plus.setBackground(Color.yellow); // 배경색
		plus.setForeground(Color.blue); // 글자색
		minus.setBackground(Color.yellow); // 배경색
		minus.setForeground(Color.blue); // 글자색

		JLabel l1 = new JLabel();
		l1.setText("숫자1");
		l1.setForeground(Color.blue); // 글자색

		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.red); // 배경색
		t1.setForeground(Color.white); // 글자색

		JLabel l2 = new JLabel();
		l2.setText("숫자2");
		l2.setForeground(Color.blue); // 글자색

		// html에서 Input역할!
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.red); // 배경색
		t2.setForeground(Color.white); // 글자색

		// 글자넣는 부품 JLabel
		JLabel top = new JLabel();
		//이미지 부품, Image파일은 프로젝트 바로 아래에 있어야함.
		ImageIcon icon = new ImageIcon("calculator2.png");
		top.setIcon(icon);
		
		JLabel under = new JLabel();
		under.setText("결과 들어가는곳");
		
		f.add(top);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(under);

		// Font - 글자스타일 담당(글자체, 진하게여부, 글자크기)
		Font font = new Font("궁서", 1, 50);
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		t1.setFont(font);
		l2.setFont(font);
		t2.setFont(font);
		under.setFont(font);
		
		// 1. plus 버튼 클릭했을때 action 처리 하겠다고 설정
		// 2. 어떤 부품이 할지를 램에다가 만들어서 넣어주어야함
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에다가 버튼을 클릭헸을때, 처리내용을 써주면 된다.
				System.out.println("Plus 버튼을 누르셨네요.");
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				if(s1.equals("") || s2.equals("")){
					JOptionPane.showMessageDialog(f, "숫자를 입력하세요!");
				}else {
					int n1 = Integer.parseInt(s1);
					int n2 = Integer.parseInt(s2);
					
					int sum = n1+n2;
					
					// JOptionPane.showMessageDialog(top, "Plus 연산의 값 : " + sum);
					under.setText("더한값은 : " + sum);
					
					// t1,t2값 지우자
					t1.setText("");
					t2.setText("");					
				}// else : 제대로 입력하였을시
			}
		});
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에다가 버튼을 클릭헸을때, 처리내용을 써주면 된다.
				System.out.println("Minus 버튼을 누르셨네요.");
				
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				int cha = n1-n2;
				
				// JOptionPane.showMessageDialog(top, "Minus 연산의 값 : " + cha);
				under.setText("뺀값은 : " + cha);
				
				// t1,t2값 지우자
				t1.setText("");
				t2.setText("");
			}
		});
		
		// 위에서 다 설정한 거 보여줘.! 맨 끝줄에 넣어주세요.!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
