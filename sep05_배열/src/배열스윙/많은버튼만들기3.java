package 배열스윙;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 많은버튼만들기3 {
	
	static int i = 0;
	static int count = 1;
	static String no = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(1500,1000);
		Container c = f.getContentPane();
		c.setBackground(Color.green);
		f.setTitle("나의 버튼들");
		
		JButton buttons[] = new JButton[200];
		for (i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText(i+ "번");
			JButton b1 = new JButton();
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); // 버튼위의 글자를 가져와줌
					JOptionPane.showMessageDialog(f, s + "을 클릭하셨군요!");
					no = no + s + " ";
					int pay = count * 10000;
					JOptionPane.showMessageDialog(f, s+"번을 클릭하셨군요! 현재 결제 금액은 " + pay + "원 입니다. 좌석번호는 " + no);
					//buttons[i].setBackground(Color.red);
					count++;
					JButton b = (JButton)e.getSource();
					b.setBackground(Color.gray);
					b.setEnabled(false);
				}
			});
			f.add(buttons[i]);
		}
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
