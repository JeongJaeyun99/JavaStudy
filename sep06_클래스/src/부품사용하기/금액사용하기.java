package 부품사용하기;

import 부품만들기.계좌;

public class 금액사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		계좌 m1 = new 계좌();
		계좌 m2 = new 계좌();
		계좌 m3 = new 계좌();
		
		m1.이름 = "홍길동";
		m1.계좌이름 = "튼튼적금";
		m1.금액 = 1000;
		
		m2.이름 = "박길동";
		m2.계좌이름 = "튼튼예금";
		m2.금액 = 2000;
		
		m3.이름 = "홍기사";
		m3.계좌이름 = "다음적금";
		m3.금액 = 3000;
		
		// 참조형 변수를 프린트 할때 자동으로 호출된다!!
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}

}
