package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 로또문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet lotto = new HashSet();
		
		Random r = new Random();
		while (true) {
			lotto.add(r.nextInt(40)+ 1);
			if (lotto.size() == 6) {
				break;
			} // 중복되면 안 넣는데, size가 6이 될때까지 넣는다.
		}
			
		System.out.println(lotto);
	}

}
