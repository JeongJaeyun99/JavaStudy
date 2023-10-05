package 메서드기본;

public class 내카페 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add();
		int num = cal.add2();
		num-= 1000;
		System.out.println(num);
		int num2 = cal.add3(3500,5);
		System.out.println(num2 - 1000);
		
		int num3 = cal.add4(10000);
		System.out.println(num3 - 1000);
	}

}
