package level2;

import java.util.Stack;

public class 영어끝말잇기 {
	public static void main(String[] args) {
		String words[] = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		Stack<String> stack = new Stack<>();
        stack.push(words[0]);
        for(int i = 1;i < words.length;i++){
            if(stack.contains(words[i])) {
            	break;
            }
        }
	}
}
