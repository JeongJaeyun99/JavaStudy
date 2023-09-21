package 연습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// 적정몸무게 계산
		
		//입력받는 데이터의 타입은 무조건 String(문자열)
		//입력받기 위한 부품이 필요???
		//망치?? 벽돌???
		//망치 - 망치.두들기다(), 망치.날카롭게자르다()
		//      부품이름.함수이름() == 부품이름.기능이름() 선택
		String h = JOptionPane.showInputDialog("키를 입력하세요.");
		
		//기본형 데이터 4개 - 정수, 실수, 	   문자1, 논리
		//                int  double  char  boolean
		
		double h2 = Double.parseDouble(h);
		
		double result = (h2 - 100) * 0.9;
		
		System.out.println("당신의 적정몸무게는 " + result);
		System.out.printf("당신의 적정몸무게는 %.2f", result);
		System.out.println();
		String result2 = String.format("당신의 적정몸무게는 %.2f", result);
		System.out.println(result2);
	}

}
