package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 화면만들기 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame(); 
		f.setSize(500, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b = new JButton();
		b.setText("나는 랄로!");
		
		f.add(b);
		
		
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.setVisible(true);
	}

}
