package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		
		String in1 = JOptionPane.showInputDialog("통신사 입력");
		String in2 = JOptionPane.showInputDialog("전화번호 입력");
		String in3 = JOptionPane.showInputDialog("가입자 이름 입력");
		//한줄 복사 - 컨트롤 + 알트 + 화살표아래  
	
		String result = in3 + "님은 " + in1 + "에 " + in2;
		
		JOptionPane.showMessageDialog(null, result);
	}

}
