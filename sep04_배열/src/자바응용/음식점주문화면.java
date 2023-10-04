package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 음식점주문화면{
	static int total = 0; //클래스 전체에서 접근이 가능 
	//main안에서 사용하기 위해서는 main이 static이 붙어있음.
	//main밖에 있는 변수도 static이 붙어있어야함.
	static JLabel l1, l2, l3;
	static int money = 0;
	static ImageIcon icon;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 1000);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton();
		b1.setText("짬뽕");
		JButton b2 = new JButton();
		b2.setText("우동");
		JButton b3 = new JButton();
		b3.setText("짜장");
		JButton b4 = new JButton();
		b4.setText("결제하기");
		
		l1 =  new JLabel();
		l1.setText("개수 : 0개");
		
		l2 =  new JLabel();
		//l2.setText("이미지 들어가는 곳----------");
		
		icon = new ImageIcon("first.jpg");
		l2.setIcon(icon);
		
		l3 =  new JLabel();
		l3.setText("결제금액");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(b4);
		
		Font font = new Font("맑은 굴림", 1, 50);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		b1.setBackground(Color.yellow); //배경색
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.yellow);
		l1.setForeground(Color.blue); //글자색 
		l2.setForeground(Color.blue);
		l3.setForeground(Color.blue);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리하고 싶은 내용을 쭉 써주면 된다.
				icon = new ImageIcon("main.png");
				l2.setIcon(icon);
				System.out.println("짬뽕선택함.");
				show1();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리하고 싶은 내용을 쭉 써주면 된다.
				icon = new ImageIcon("udong.jpg");
				l2.setIcon(icon);
				System.out.println("우동선택함.");
				show2();
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리하고 싶은 내용을 쭉 써주면 된다.
				icon = new ImageIcon("zzajang.jpg");
				l2.setIcon(icon);
				System.out.println("짜장선택함.");
				show3();
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icon = new ImageIcon("first.jpg");
				l2.setIcon(icon);
				JOptionPane.showMessageDialog(f, "결제가 완료되었습니다! (결제금액 : " + money + ")");
				total = 0;
				money = 0;
				l1.setText("개수 : 0개");
				l3.setText("결제금액");
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 맨 끝으로 보내라.!
		f.setVisible(true);
		
	}//main
	
	public static void show1() {
		total++;
		l1.setText("개수 : " + total + "개");
		money += 5000;
		l3.setText("결제금액 : " + money + "원" );
	}
	public static void show2() {
		total++;
		l1.setText("개수 : " + total + "개");
		money += 4000;
		l3.setText("결제금액 : " + money + "원" );
	}
	public static void show3() {
		total++;
		l1.setText("개수 : " + total + "개");
		money += 8000;
		l3.setText("결제금액 : " + money + "원" );
	}
}
