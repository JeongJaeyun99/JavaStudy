package 상속응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class 글자수카운트 extends JFrame{
	
	JLabel c1,c2,w1,w2;
	JTextArea t;
	FlowLayout f;
	JButton b1,b2,b3;
	Color color1[] = {Color.red,Color.blue,Color.yellow,Color.pink};
	Color color2[] = {Color.white,Color.CYAN,Color.GRAY,Color.GREEN};
	Random r;
	public 글자수카운트() {
		setSize(500,500);
		f = new FlowLayout();
		setLayout(f);
		
		getContentPane().setBackground(Color.white);
		c1 = new JLabel("Characters : ");
		c2 = new JLabel();
		w1 = new JLabel("Words : ");
		w2 = new JLabel();
		
		t = new JTextArea(10,10);
		
		b1 = new JButton("글자수 카운트");
		b2 = new JButton("배경색 변경");
		b3 = new JButton("글자색변경");		
		
		Font font = new Font("맑은 고딕",Font.BOLD,20);
		
		c1.setFont(font);
		c2.setFont(font);
		w1.setFont(font);
		w2.setFont(font);
		t.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		c1.setForeground(Color.blue);
		w1.setForeground(Color.blue);
		t.setBackground(Color.gray);
		b1.setBackground(Color.red);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
		
		add(c1);
		add(c2);
		add(w1);
		add(w2);
		add(t);
		add(b1);
		add(b2);
		add(b3);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// 수도코드
				// 입력한 문자열을 가지고 와서 저장
				// 글자수를 카운트
				// 문자수를 계산
				// 각각의 라벨에 넣어주어라
				String s = t.getText();
				int cnt1 = s.length();
				String sArr[] = s.split(" ");
				c2.setText(cnt1 + "");
				w2.setText(sArr.length + "");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				r = new Random();
				int num = r.nextInt(4);
				t.setBackground(color1[num]);
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				r = new Random();
				int num = r.nextInt(4);
				t.setForeground(color2[num]);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		글자수카운트 s = new 글자수카운트();

	}

}
