package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String garo1 = JOptionPane.showInputDialog("가로는?");
		String sero1 = JOptionPane.showInputDialog("가로는?");
		int garo2 = Integer.parseInt(garo1);
		int sero2 = Integer.parseInt(sero1);
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 " + (garo2*sero2));
	}	

}
