package 부품사용하기;

import 부품만들기.TV;
import 부품만들기.전화기;

public class 내방만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		전화기 phone = new 전화기();
		phone.카톡하다();
		phone.인터넷하다();
		TV tv = new TV();
		tv.TV_turnOn();
		tv.TV_turnOff();
		
	}

}
