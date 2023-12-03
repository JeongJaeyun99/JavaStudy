package 우선순위큐;

public class Exam_01 {

	public static void main(String[] args) {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String a = "ZABCDEFGHIJKLMNOPQRSTUVWXY";
		int n = 25;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int temp = s.charAt(i);
			if(temp == 65 || temp == 97) {
				sb.append((char)(temp + n));
			}else if(temp > 65 || temp > 97) {
				sb.append((char)(temp + n - 26));
			}else {
				sb.append((char)temp);
			}
		}
		String answer = "";
		answer = sb.toString();
		System.out.println(answer.equals(a));
	}

}
