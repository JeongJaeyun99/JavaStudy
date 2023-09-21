package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("당신의 이름은? : ");
		JOptionPane.showMessageDialog(null, "이름: "+  name );
		// showMessageDialog의 null은 
		System.out.println(name);
		
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		JOptionPane.showMessageDialog(null, name + "님의 취미는 " + hobby + "입니다.");
		
		String time = JOptionPane.showInputDialog("당신은 몇시에 일어나나요?");
	
		int time2 = Integer.parseInt(time);
		JOptionPane.showMessageDialog(null, hobby + "는 " + time + "시에 시작할 수 있군요!");
		
	}

}
