package 정리문제;

public class ErrorMain2 {

	public static void main(String[] args) {
		Error2 e = new Error2();
		try {
			e.arr();
		} catch (Exception e1) {
			System.out.println("배열 인덱스 에러가 발생함.");
		}
		
		System.out.println("여기는 실행되어야만 해");
	}

}
