package 배열고급;

import java.util.Arrays;
import java.util.List;


public class 배열을컬렉션으로 {

	public static void main(String[] args) {
		String s1[] = {"a", "b", "c"};
		String s2[] = {"com", "b", "d","p","c"};
		Solution10 s = new Solution10();
		int answer = s.solution(s1,s2);
		System.out.println(answer);
	}

}
class Solution10 {
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		List <String> list2 = Arrays.asList(s1); // 읽기전용 list로 만든다(add불가)
		List <String> list3 = Arrays.asList(s2); // 읽기전용 list로 만든다(add불가)
		if(list2.size() >= list3.size()) {
			for (String s : list3) {
				if(list2.contains(s)) {
					answer++;
				}
			}
		}else {
			for (String s : list2) {
				if(list3.contains(s)) {
					answer++;
				}
			}
		}
		return answer;
	}
}
