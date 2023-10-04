package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		FlowLayout flow = new FlowLayout();
		jf.setSize(600,700);
		jf.getContentPane().setBackground(Color.green); // 판때기에다가 색깔을 입혀야함
		jf.setLayout(flow);
		
		JLabel top = new JLabel();
		ImageIcon ic = new ImageIcon("calculator2.png");
		top.setIcon(ic);
		
		JLabel l1 = new JLabel();
		l1.setText("숫자1");
		l1.setForeground(Color.white);
		JLabel l2 = new JLabel();
		l2.setText("숫자2");
		l2.setForeground(Color.white);
		
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.black);
		t1.setForeground(Color.white);
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.black);
		t2.setForeground(Color.white);
		
		JButton plus = new JButton();
		plus.setText("더하기");
		plus.setBackground(Color.blue);
		plus.setForeground(Color.white);
		
		JButton minus = new JButton();
		minus.setText("빼기");
		minus.setBackground(Color.blue);
		minus.setForeground(Color.white);		
		
		Font font = new Font("궁서",1,50);
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		t1.setFont(font);
		l2.setFont(font);
		t2.setFont(font);
		
		jf.add(top);
		jf.add(l1);
		jf.add(t1);
		jf.add(l2);
		jf.add(t2);
		jf.add(plus);
		jf.add(minus);
		
		
		
		
		
		jf.setVisible(true);
	}

}
