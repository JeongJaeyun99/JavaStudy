package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동",25,"여");
		System.out.println(work1);
		System.out.println("현재 직원의 수는 " + 직원.people + "명 입니다.");
		직원 work2 = new 직원("김길동",24,"남");
		System.out.println(work2);
		System.out.println("현재 직원의 수는 " + 직원.people + "명 입니다.");
		직원 work3 = new 직원("송길동",26,"여");
		System.out.println(work3);
		System.out.println("현재 직원의 수는 " + 직원.people + "명 입니다.");
		
		System.out.println("평균나이는 " + 직원.ageSum / 직원.people  + "이다.");
	}

}
