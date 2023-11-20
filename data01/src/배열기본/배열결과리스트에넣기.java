package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열결과리스트에넣기 {

	public static void main(String[] args) {
		int []n = {100,200,300,400,500};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
		Print.arr(n);
//		System.out.println(Arrays.toString(n));
		for (int i = 0; i < n.length; i++) {
			if(n[i] >= 300) {
				cnt++;
				list.add(i);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			n[list.get(i)] -= 100;
		}
		System.out.println("배열의 갯수 : " + cnt + "개");
//		System.out.println(Arrays.toString(n));
		Print.arr(n);
	}

}
