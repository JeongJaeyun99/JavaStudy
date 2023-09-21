package 연산자test;

import javax.swing.JOptionPane;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pw1 = "p";
		String pw2 = JOptionPane.showInputDialog("암호를 입력해주세요");
		
		if(pw2.equals(pw1)) {
			System.out.println("pass!");
		}else {
			System.out.println("재입력!");
		}
		
		String yesterday = JOptionPane.showInputDialog("어제의 몸무게를 입력해주세요");
		String today = JOptionPane.showInputDialog("오늘의 몸무게를 입력해주세요");
		
		double y = Double.parseDouble(yesterday);
		double t = Double.parseDouble(today);
		
		if(y - t > 2 || t - y > 2) {
			System.out.println("다이어트 성공!");
		}
		if(pw1.equals(pw2) && (y - t > 2 || t - y > 2)) {
			System.out.println("오늘은 성공!");
		}else {
			System.out.println("내일 다시 도전!");
		}
		
	}

}
