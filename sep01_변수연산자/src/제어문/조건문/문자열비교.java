package 제어문.조건문;

public class 문자열비교 {

	public static void main(String[] args) {

		String pass = "password";
		if(pass.equals("password")) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("비밀번호를 다시 확인해 주세요");
		}
	}

}
