package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class 콜랙션획인문제 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		Scanner sc = new Scanner(System.in);
		while (true) {
			String place = sc.next();
			set.add(place);
			if (set.size() == 6) {
				break;
			}
		}
		
		System.out.println(set);
		HashMap map = new HashMap();
		map.put("안방", "TV");
		map.put("거실", "쇼파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
		System.out.println(map);
		System.out.println(map.get("현관"));
		map.put("거실", "책상");
		System.out.println(map);
		
		ArrayList list = new ArrayList();
		list.add("게임");
		list.add("공부");
		list.add("잠");
		list.add("운동");
		list.add("만화보기");
		System.out.println(list);
		list.set(1, "청소");
		System.out.println(list);
	}

}
