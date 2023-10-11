package 컬렉션;

import java.util.ArrayList;
import java.util.Random;

public class 로또문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lotto = new ArrayList();
		
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			lotto.add(r.nextInt(40)+ 1);
		}
		System.out.println(lotto);
	}

}
