package 생성자;

import java.util.ArrayList;
import java.util.HashSet;

public class CaL5 {
	public HashSet getUnique(int[] num) {
		HashSet list = new HashSet();
		//중복된 것은 아예 넣지 않음. 
		for (int x : num) {
			list.add(x);
		}
		return list;
	} // getUnique()
	
	public ArrayList getEven(int[] num) {
		// 그중 선택하라고 하는데, 여러개를 모아야 함.
		// 고정된 크기(5개) --> 배열 사용
		// 가변적 크기 --> 배열X ==> 컬렉션을 사용!!!
		ArrayList list = new ArrayList();
		for (int x : num) {
			if (x % 2 == 0) {
				list.add(x); // {2, 4, 6, 8, 10}
			}
		}
		return list;
	} // getEven()

	public ArrayList getOdd(int[] num) {
		ArrayList list = new ArrayList();
		for (int x : num) {
			if (x % 2 != 0) {
				list.add(x); // {1,3,5,7}
			}
		}
		return list;
	} // getOdd()
}
