package 예외처리;

public class 문제발생클래스 {

	public static void main(String[] args) {
		System.out.println("1. 나는 실행됨. ");
		try {
			System.out.println("2. 0으로 나누기 " + 10/0);
			int[] arr = {1,2,3};
			System.out.println(arr[3]);
		} catch (Exception e) {
			System.out.println("0으로 나누는건 실패!");
//			e.printStackTrace(); // 에러를 프린트함.
		}
		System.out.println("3. 여기는 프린트 될까여?");
	}
		
}	
