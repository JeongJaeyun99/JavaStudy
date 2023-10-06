package 스태틱;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

	static int cnt;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("맑은 고딕",1,100);
		
		JButton plus1 = new JButton();
		plus1.setText("1더하기");
		
		JButton zero = new JButton();
		zero.setText("0으로 초기화");
		
		JButton minus1 = new JButton();
		minus1.setText("1빼기");
		
		JLabel num = new JLabel();
		num.setText("  " + cnt);
		num.setFont(font);
		
		f.add(plus1);
		f.add(zero);
		f.add(minus1);
		f.add(num);
		
		plus1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cnt++;
				num.setText("  " + cnt);
			}
		});
		zero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cnt = 0;
				num.setText("  " + cnt);
			}
		});
		minus1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cnt--;
				num.setText("  " + cnt);
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
