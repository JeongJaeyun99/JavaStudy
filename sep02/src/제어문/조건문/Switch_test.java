package 제어문.조건문;

public class Switch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "자바";
		
		switch (title) {
		case "자바":
			System.out.println("1101호로 고!!");
			break;
		case "파이썬":
			System.out.println("1102호로 고!!");
			break;
		case "리눅스":
			System.out.println("1103호로 고!!");
			break;
		default:
			System.out.println("카운터로 고!!");
			break;
		}
	}

}
