package 연산자test;

import javax.swing.JOptionPane;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String play = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		String result = "오늘 " + day + "에 수업후 나는 " + play + "할 예정";
		
		System.out.println("결과는 : " + result);
	}

}
