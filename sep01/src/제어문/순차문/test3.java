package 제어문.순차문;

import javax.swing.JOptionPane;

public class test3 {

	public static void main(String[] args) {
		
		String n1 = JOptionPane.showInputDialog("n1 : ");
		String n2 = JOptionPane.showInputDialog("n2 : ");
		
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		int plus = n11 + n22;
		int minus = Math.abs(n11 - n22);
		int product = n11 * n22;
		double divide = n11 / n22;
		
		System.out.println("합 : " + plus + " 차 : " + minus + " 곱 : " + product + " 나눗셈 : " + divide);
	}

}
