package 연습;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String hobby = JOptionPane.showInputDialog("당신은 취미는 무엇인가요?");
		JOptionPane.showMessageDialog(null, "나의 취미는" + hobby);

		String time = JOptionPane.showInputDialog("당신은 몇시에 일어나나요? ");
		JOptionPane.showMessageDialog(null, "당신은" + time + "부터" + hobby + "를 할수있음");

		int time2 = Integer.parseInt(time);
		int result = time2 + 1;
		System.out.println(hobby + "는" + result + "시에 시작하자");
	}

}
