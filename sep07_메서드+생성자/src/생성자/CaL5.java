package 생성자;

import java.util.ArrayList;

public class CaL5 {
	public ArrayList<Integer> getEven(int num[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer x : num) {
			if (x % 2 == 0) {
				list.add(x);
			} 
		}
		return list;
	}
}
