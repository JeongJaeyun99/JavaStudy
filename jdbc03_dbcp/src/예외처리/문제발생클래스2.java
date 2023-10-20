package 예외처리;

public class 문제발생클래스2 {

	public static void main(String[] args) {
		System.out.println("1. 나는 실행됨. ");
		
		try {
//			System.out.println("2. 0으로 나누기 " + 10/0);
			int[] arr = {1,2,3};
			System.out.println(arr[3]);
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
			System.out.println("수학 연산 에러 발생함.");
		} catch (IndexOutOfBoundsException e2) {
			e2.printStackTrace();
			System.out.println("배열 index 에러 발생함.");
		} catch (Exception e) {
			System.out.println("기타 에러 발생함.");
		} 
			
		System.out.println("3. 여기는 프린트 될까여?");
	}
		
}	
