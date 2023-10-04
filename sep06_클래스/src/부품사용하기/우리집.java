package 부품사용하기;

import 부품만들기.TV;
import 부품만들기.전화기;

public class 우리집 {

	public static void main(String[] args) {
		
		TV myTV = new TV();
		myTV.ch = 7;
		myTV.vol = 9;
		myTV.onOff = false;
		
		TV yourTV = new TV();
		yourTV.ch = 9;
		yourTV.vol = 12;
		yourTV.onOff = true;
		
		// new는 객체생성
		// ram에 주소 + 멤버변수를 힙영역에 만들어 준다.
		System.out.println(myTV.ch);
		System.out.println(myTV.vol);
		System.out.println(myTV.onOff);
		
		전화기 p1 = new 전화기();
		전화기 p2 = new 전화기();
		p1.size = 11;
		p1.speaker = "바나나사";
		p2.size = 9;
		p2.speaker = "메론사";
		
		System.out.println("p1>> " + p1);
		System.out.println("사이즈는 " + p1.size + " 회사는 " + p1.speaker);
		
		System.out.println("p2>> " + p2);
		System.out.println("사이즈는 " + p2.size + " 회사는 " + p2.speaker);
		p2.인터넷하다();
		System.out.println(p2.toString());
	}

}
