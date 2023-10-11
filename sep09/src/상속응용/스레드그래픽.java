package 상속응용;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame{
//	public void set() {
//	}
	JLabel count,image,day;
	ImageIcon icon;
	Font font;
	//생성자 메소드이용
	public 스레드그래픽() {
		setSize(500,500);
		count = new JLabel("카운터 들어가는 자리");
		image = new JLabel();
		day = new JLabel("시각 들어가는 자리");		
		
		font = new Font("맑은 고딕",Font.BOLD,30);
		count.setFont(font);  
		day.setFont(font);  
		
		카운터스레드 c = new 카운터스레드();
		시각스레드 t = new 시각스레드();
		배열스레드 a = new 배열스레드();
		c.start();
		t.start();
		a.start();
		
		add(count,BorderLayout.WEST);
		add(image,BorderLayout.EAST);
		add(day,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		스레드그래픽 g = new 스레드그래픽();
		
	}
	public class 카운터스레드 extends Thread { // inner class
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				System.out.println("카운터>> " + i);
				count.setText(i + "");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) { // 중단
					e.printStackTrace(); // 어떤 에러인지 프린트
				}
				if (i == 5) {
					JOptionPane.showMessageDialog(null, "종료 5초 전입니다.");
				}
				if(i == 0) {
					System.exit(0);
				}
			}
		}
	}
	public class 시각스레드 extends Thread{// inner class
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date d = new Date();
				System.out.println("현재 : " + d);
				day.setText(d + "");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) { // 중단
					e.printStackTrace(); // 어떤 에러인지 프린트
				}
			}
		}
	}
	public class 배열스레드 extends Thread {// inner class
		@Override
		public void run() {
			String img[] = {"30days.png","boston.png","creater.png","girl.png","spider.png"};
			for (int i = 0; i < img.length; i++) {
				System.out.println("이미지>> " + img[i]);
				icon = new ImageIcon(img[i]);
				image.setIcon(icon);
				
				try {
					Thread.sleep(2000); // ms
				} catch (InterruptedException e) { // 중단
					e.printStackTrace(); // 어떤 에러인지 프린트
				}
				if (i == 4) {
					i = 0;
				}
			}
		}
	}
}
