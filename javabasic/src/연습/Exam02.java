package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String height1 = JOptionPane.showInputDialog("당신의 키는?");
		double height2 = Double.parseDouble(height1);
		
		JOptionPane.showMessageDialog(null, "적정 몸무게는: "+ ((height2-100) * 0.9));
	}

}
