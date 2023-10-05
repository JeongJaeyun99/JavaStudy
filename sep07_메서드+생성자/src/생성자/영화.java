package 생성자;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 영화 {
	
	static int start = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title[] = {"30일","화사한그녀","1947 보스톤","크리에이터","거미집"};
		String image[] = {"30days.png","girl.png","boston.png","creater.png","spider.png"};
		double jumsu[] = {7.7,9.6,7.6,6.9,6.5};
		String direction[] = {"left.png","right.png"};
		
		JFrame f = new JFrame();
		f.setSize(480,600);
		f.getContentPane().setBackground(Color.green);
		
		Font font = new Font("맑은 고딕",Font.BOLD,50);
		
		JLabel top = new JLabel();
		top.setText(title[start]);
		top.setFont(font);
		top.setForeground(Color.RED);
		
		JLabel middle = new JLabel();
		ImageIcon icon = new ImageIcon(image[start]);
		middle.setIcon(icon);
		middle.setFont(font);
		
		JLabel bottom = new JLabel();
		bottom.setText("" + jumsu[start]);
		bottom.setFont(font);
		bottom.setForeground(Color.RED);
		
		JButton left = new JButton();
		ImageIcon leftD = new ImageIcon(direction[0]);
		left.setIcon(leftD);
		left.setFont(font);
		left.setBackground(Color.white);
		left.setOpaque(true);
		
		JButton right = new JButton();
		ImageIcon rightD = new ImageIcon(direction[1]);
		right.setIcon(rightD);
		right.setFont(font);
		right.setBackground(Color.white);
		right.setOpaque(true);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(start==0) {
					JOptionPane.showMessageDialog(f, "첫번째 페이지 입니다.");
				}else {
					start-=1;
					top.setText(title[start]);
					ImageIcon icon = new ImageIcon(image[start]);
					middle.setIcon(icon);
					bottom.setText("" + jumsu[start]);					
				}
			}
		});
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(start==title.length-1) {
					JOptionPane.showMessageDialog(f, "마지막 페이지 입니다.");
				}else {
					start+=1;
					top.setText(title[start]);
					ImageIcon icon = new ImageIcon(image[start]);
					middle.setIcon(icon);
					bottom.setText("" + jumsu[start]);					
				}
			}
		});
		
		f.add(top, BorderLayout.NORTH);
		f.add(left, BorderLayout.WEST);
		f.add(middle, BorderLayout.CENTER);
		f.add(right, BorderLayout.EAST);
		f.add(bottom, BorderLayout.SOUTH);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	

}
