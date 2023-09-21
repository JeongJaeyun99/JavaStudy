package 연산자;

import javax.swing.JOptionPane;

public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "root";
		String pw = "pass";
		
		String idI = JOptionPane.showInputDialog("아이디 입력: ");
		String pwI = JOptionPane.showInputDialog("비밀번호 입력: ");
		
		if(idI.equals(id) && pwI.equals(pw)) {
			System.out.println("로그은 ok!");
		}else {
			System.out.println("로그은 fail!");			
		}
	}

}
