package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열 만들때 기준 - 값을 모르고 있는 경우
		int s[] = new int[5];
		// 2. 배열 만들때 기준 - 값을 이미 알고 있는 경우
		int s2[] = {1,2,3,4,5};
		
		System.out.println(s.length + " " + s2.length);
		System.out.println(s[0]);
		System.out.println(s[2]);
		System.out.println(s[s.length-1]);
		s[0] = 100;
		System.out.println(s[0]);
		s[2] = 200;
		System.out.println(s[2]);		
		s[s.length-1] = 300;
		System.out.println(s[s.length-1]);
		
		int sum = s[0] + s[2];
		System.out.println(sum);
		System.out.println(s[0] == s[2]);
		
	}

}
