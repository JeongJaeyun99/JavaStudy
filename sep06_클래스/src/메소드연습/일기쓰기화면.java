package 메소드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 일기쓰기화면 {
	public void open() {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setTitle("일기장 쓰기 화면");
		f.setSize(550,700);
		
		f.getContentPane().setBackground(Color.white);;
		Font font = new Font("맑은 고딕",1,35);
		Font font2 = new Font("맑은 고딕",1,50);
		
		JLabel l1 = new JLabel();
		l1.setText("오늘의 날짜 : ");
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.pink);
		
		JLabel l2 = new JLabel();
		l2.setText("오늘의 제목 : ");
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.pink);
		
		JLabel l3 = new JLabel();
		l3.setText("오늘의 내용 : ");
		TextArea t3 = new TextArea(5,50);
		t3.setBackground(Color.pink);
		
		JButton save = new JButton();
		save.setText("파일에 일기 저장");
		save.setBackground(Color.white);
		save.setForeground(Color.blue);
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String day = t1.getText();
					String title = t2.getText();
					String content = t3.getText();
					FileWriter file = new FileWriter(day + ".txt");
					file.write(day + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close();
					JOptionPane.showMessageDialog(f, "일기 저장 완료!");
					t1.setText("");
					t2.setText("");
					t3.setText("");
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					System.out.println("에러 발생함!");
					e2.printStackTrace(); // 자세한 에러정보 보기
				}
			}
		});
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		save.setFont(font2);		
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(save);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		}
}	
