package 제어문.반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int target = r.nextInt(99) + 1;
		int total = 0;
		while (true) {
			String data = JOptionPane.showInputDialog("숫자를 입력하세여");
			
			int data2 = Integer.parseInt(data);
			
			if(target == data2) {
				System.out.println("정답입니다");
				System.out.println(total + "번 만에 맞추셨습니다!");
				break;
			}else {
				System.out.println("오답입니다");
				if (target < data2) {
					System.out.println("정답보다 큽니다.");
					total++;
				}else {
					System.out.println("정답보다 작습니다.");
					total++;
				}
			}
			
		}
	}

}
