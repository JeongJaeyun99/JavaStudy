package 변수;

public class 기본형심화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수(byte, short, int long)
		// 실수(float, double)
		byte age = 127; // +-127(-128~127), 1byte
		short wallet = 25000; // +-30000, 2byte
		int money = 2000000000; // +-2100000000, 4byte
		long space = 20000000000000000L; // 21억이상, 8byte
		
		// 모두 int로 했을때와 메모리 크기 비교!
		
		// 각각 다르게 했을떼 --> 32byte
		// 다 int로 했을때 --> 60byte
		
		float weight = 88.8f;
		double height = 185.5;
		
	}

}
