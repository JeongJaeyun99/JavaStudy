package 연산자;

public class 연산시주의점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 5;
		int n2 = 4;
		
		int sum = n1+n2;
		int avg = sum / 2;
		
		System.out.println(avg);
		System.out.println("----------");
//		double avg2 = sum / 2.0; //둘 중 하나라도 실수이면 답도 실수
		double avg2 = (double)sum / 2; //둘 중 하나라도 실수이면 답도 실수
		System.out.println(avg2);
	}

}
