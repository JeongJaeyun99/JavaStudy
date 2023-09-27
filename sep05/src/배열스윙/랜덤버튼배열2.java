package 배열스윙;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(1000,600);
		f.setLayout(null);
		Container c = f.getContentPane();
		c.setBackground(Color.green);
		
		JButton buttons[] = new JButton[500];
		Color colors[] = {Color.red,Color.blue,Color.white,Color.gray,Color.green,Color.orange};
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();		
			buttons[i].setText("버튼" + i);
			Random r = new Random();
			int x = r.nextInt(1000);
			int y = r.nextInt(600);
			buttons[i].setBounds(x, y, 100, 25);
			int col = r.nextInt(6);
			buttons[i].setBackground(colors[col]);
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); // 버튼위의 글자를 가져와줌
					JOptionPane.showMessageDialog(f, s + "번을 클릭하셨군요!");
					
				}
			});
			f.add(buttons[i]);
		}
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}	

}
