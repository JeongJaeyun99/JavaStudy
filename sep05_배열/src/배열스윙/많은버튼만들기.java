package 배열스윙;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은버튼만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		//FlowLayout flow = new FlowLayout();
		f.setLayout(null);
		f.setSize(1500,1000);
		f.setTitle("나의 버튼들");
		
		JButton buttons[] = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼"+ i+ "번");
			// JButton b1 = new JButton();
			Random r = new Random();
			int x = r.nextInt(1500);
			int y = r.nextInt(1000);
			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBackground(Color.blue);
			buttons[i].setForeground(Color.red);
			f.add(buttons[i]);
		}
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
