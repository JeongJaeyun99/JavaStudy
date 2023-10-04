package 변수;

public class 기본형심화_타입변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age = 127;
		int age2 = age;
		int age3 = 127;
//		byte age4 = age3; 에러 발생 --> 큰방에 저장하던걸 작은 방에 저장해서 오류남
		byte age4 = (byte)age3;
	}

}
