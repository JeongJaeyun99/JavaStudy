package 제어문.순차문;

import javax.swing.JOptionPane;

public class test1 {

	public static void main(String[] args) {
		
		String weight = JOptionPane.showInputDialog("몸무게를 입력하세요");
		String height = JOptionPane.showInputDialog("키를 입력하세요");
		
		
		int weight2 = Integer.parseInt(weight);
		double height2 = Double.parseDouble(height);
		
		double bmi = (weight2 / (height2 * height2));
		
		System.out.println(bmi);
	}

}
