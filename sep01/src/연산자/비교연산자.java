package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 1111;
		int pw = 2222;
		
		int id2 = 1111;
		int pw2 = 3333;
		
		if(id == id2 && pw == pw2) {
			System.out.println("로그인 ok!");
		}else {
			System.out.println("로그인 fail!");
		}
		
	}

}
