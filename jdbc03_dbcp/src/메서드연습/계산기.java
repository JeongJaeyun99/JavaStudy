package 메서드연습;

import java.util.ArrayList;

public class 계산기 {
	public void add(int x, int y) {
		int sum  = x + y;
		System.out.println("계산결과는 " + sum + " 이야");
	}
	public int add2(int x, int y) {
		int sum  = x + y;
		return sum;
	}
	public int mul(int x, int y) {
		int sum  = x * y;
		return sum;
	}
	public int[] array() {
		int[] arr = {1,2,3}; 
		return arr; // 참조형변수(주소가 들어있음)
	}
	public double[] arr2() {
		double[] arr2= {11.1,22.2};
		return arr2;
	}
	public int result() {
		int result = 0;
		return result;
	}
	public void get1() {
		회원정보VO bag = new 회원정보VO();
		bag.setId("win");
		bag.setPw("1234");
		bag.setName("win");
		bag.setTel("010");
		System.out.println(bag);
	}
	public 회원정보VO get2(String id,String pw,String name,String tel) {
		회원정보VO bag = new 회원정보VO();
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		return bag;
	}
	public ArrayList get3(String name,int age) {
		ArrayList list = new ArrayList();
		list.add(name);
		list.add(name);
		return list;
	}
	public String get4(String name,int age) {
		String s = "제 이름은 " + name + "이고 나이는 " + age;
		return s;
	}
}
