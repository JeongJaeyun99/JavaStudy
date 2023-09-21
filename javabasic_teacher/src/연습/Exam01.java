package 연습;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		String w1 = JOptionPane.showInputDialog("가로");
		String h1 = JOptionPane.showInputDialog("세로");
		
		int w2 = Integer.parseInt(w1);
		int h2 = Integer.parseInt(h1);
		
		System.out.println(w2 * h2);

	}

}
