package 컬렉션;

import java.util.HashMap;

public class 맵연습 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("apple", "사과");
		map.put("melon", "멜론");
		map.put("ice", "아이스크림");
		map.put("snack", "과자");
		System.out.println(map);
		System.out.println(map.get("apple"));
		map.put("apple", "파란사과");
		// 덮어씀
		map.remove("apple");
		System.out.println(map);
	}

}
