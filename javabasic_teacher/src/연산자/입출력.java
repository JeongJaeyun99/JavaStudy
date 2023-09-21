package 연산자;

import javax.swing.JOptionPane;

public class 입출력 {

	public static void main(String[] args) {
		//망치.망치질하다();
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		JOptionPane.showMessageDialog(null, "당신의 이름은 " + name + "이군요.");
		System.out.println("당신의 이름은 " + name + "이군요.");
		
		//당신의 취미는 무엇인가요?
		String hobby = JOptionPane.showInputDialog("당신의 취미는 무엇인가요?");
		//홍길동님의 취미는 테니스입니다.
		JOptionPane.showMessageDialog(null, name + "님의 취미는 " + hobby + "입니다.");
		
		//당신은 몇시에 일어나나요? 9시
		String time = JOptionPane.showInputDialog("당신은 몇시에 일어나나요?");
		//테니스는 9시에 시작할 수 있군요!
		JOptionPane.showMessageDialog(null, hobby + "는 " + time + "시에 시작할 수 있군요!.");
		
		//문자열을 숫자로 변경해주는 작업은 굉장히 자주 사용.
		//정수.분석해서정수로바꿔줘(스트링);
		int time2 = Integer.parseInt(time);
		
		int result = time2 + 1; //"9" + 1 ==> "91", 10
		System.out.println(hobby + "는  " + result + "시에 시작하자." );
	}

}
