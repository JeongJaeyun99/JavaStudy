package 형변환개념;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte x = 127;
		int y = x;
		System.out.println(y);
//		byte z = y; // 작 <------ 큰 의 타입변환은 안된다!!
		byte z = (byte)y; // 강제 형 변환
		System.out.println(z);
		int a = 1000;
		byte b = (byte)a;
		System.out.println(b); // byte의 저장공간을 넘어섰기 때문에 이상한값이 나옴 >> byte에 들어갈수 있는 범위의 숫자를 넣어야함
	}

}
