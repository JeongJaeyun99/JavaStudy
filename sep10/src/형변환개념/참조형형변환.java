package 형변환개념;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 참조형 형변환 >> 상속관계에서만 가능하다.
		ArrayList list = new ArrayList();
		list.add("나는 스트링"); // 괄호에 들어갈수 있는 것이 오브젝트라서 아무거나 다 들어갈수 있다. 
		list.add(100); 
		list.add(new JButton("나는 버튼"));
	}

}
