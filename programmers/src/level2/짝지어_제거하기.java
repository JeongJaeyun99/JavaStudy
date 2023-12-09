package level2;

import java.util.Stack;

public class 짝지어_제거하기 {

	public static void main(String[] args) {
		String s = "cdcd";
		int answer = 0;
        Stack<String> st = new Stack<String>();
        String arr[] = s.split("");
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
			try {
				if (st.peek().equals(arr[i])) {
					st.pop();
				} else {
					st.push(arr[i]);
				} 
			} catch (Exception e) {
				st.push(arr[i]);
			}
		} 
		if(st.empty()){
			answer = 1;
        }
        System.out.println(answer);
	}

}
