package 생성자;

import javax.swing.JFrame;

import 부품만들기.TV;

public class 생성자예제 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("나도 제목이야");
		JFrame f2 = new JFrame("나는 제목이야!"); // new JFrame()가 생성자이다
		
		TV tv = new TV();
	}

}
