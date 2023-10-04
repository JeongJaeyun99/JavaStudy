package 자바응용;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 중국집주문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setSize(700,500);
		Container pane = f.getContentPane();
		pane.setBackground(Color.green);
		f.getContentPane().setBackground(Color.green);
		f.setLayout(flow);
		
		Font font = new Font("맑은 고딕",3,50);
		
		JButton b1 = new JButton();
		b1.setText("짬뽕");
		b1.setFont(font);
		b1.setBackground(Color.pink);
		
		JButton b2 = new JButton();
		b2.setText("우동");
		b2.setFont(font);
		b2.setBackground(Color.yellow);
		
		JButton b3 = new JButton();
		b3.setText("짜장");
		b3.setFont(font);
		b3.setBackground(Color.cyan);
		
		JLabel l1 = new JLabel();
		l1.setText("개수  : " + " 0 개");
		l1.setFont(font);
		l1.setForeground(Color.blue);
		
//		JLabel img = new JLabel();
//		ImageIcon ic = new ImageIcon("champon.jpg");
//		img.setIcon(ic);
		
		JLabel l2 = new JLabel();
		l2.setText("결제금액 : ");
		l2.setFont(font);
		l2.setForeground(Color.red);
		
//		f.add(img);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x를 눌렀을때 자동종료
		
		f.setVisible(true);
	}

}
