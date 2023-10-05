package 메서드기본;

public class 계산기 {
	public void add() {
		System.out.println("더하기 기능 처리됨.");
	}
	public int add2() {
		int price = 5000;
		int count = 3;
		int sum = price * count;
		return sum;
	}
	public int add3(int price , int count) {
		int sum = price * count;
		return sum;
	}
	public int add4(int num) {
		num += 2000;
		return num;
	}
}
