package 제어문.순차문;

import javax.swing.JOptionPane;

public class test4 {

	public static void main(String[] args) {
		
		String tmp = JOptionPane.showInputDialog("현재 온도?");
		double tmp2 = Double.parseDouble(tmp);
		
		if(tmp2 >= 25) {
			System.out.println("너무 더워요");
		}else {
			System.out.println("아니요 괜찮습니다.");
		}
	}

}
