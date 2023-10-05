package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		컴퓨터 c1 = new 컴퓨터(10000,"삼성",100);
		컴퓨터 c2 = new 컴퓨터(20000,"LG",150);
		System.out.println(c1);
		System.out.println(c2);
	}

}
