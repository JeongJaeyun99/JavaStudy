package 제어문.반복문;

public class 확인문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1 = 0;
		for (int i = 33; i < 223; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		int sum2 = 0;
		int x = 55;
		while(x <= 4500) {
			sum2 += x;
			x += 2;
		}
		System.out.println(sum2);
		int sum3 = 0;
		int y = 0;
		while(y <= 6000) {
			sum3 += y;
			y += 5;
		}
		System.out.println(sum3);
	}
	

}
