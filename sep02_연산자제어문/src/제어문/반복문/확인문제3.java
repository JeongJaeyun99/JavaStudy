package 제어문.반복문;

public class 확인문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int sum = 0;
		while(x <= 1000) {
			if(x % 5 != 0) {
				sum += x;				
			}
			if(sum > 100) {
				break;
			}
			x += 3;
		}
		System.out.println(sum);
	}

}
