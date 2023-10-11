package 컬렉션;

import java.util.ArrayList;

public class 달리기 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(0,"박소정");
		list.add(1,"김정민");
		list.add(2,"소지현");
		list.add(3,"김개념");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "등 : " + list.get(i));
		}
		System.out.println("----------------------------------");
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "등 : " + list.get(i));			
		}
		System.out.println(list.contains("김정민"));
		System.out.println((list.indexOf("박소정")+1) + "등");	
		list.set(1, "소혜련");
		System.out.println(list);
	}

}
