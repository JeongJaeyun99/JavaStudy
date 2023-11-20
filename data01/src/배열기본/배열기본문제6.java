package 배열기본;


public class 배열기본문제6 {
	public static void main(String[] args) {
		String s4 = "[  10, 20, 30, 40, 50]";
		s4.replace("[", "");
		s4.replace("]", "");
		s4 = s4.trim();
		String arr[] = s4.split(", ");
		int sum = 0;
		for (String i : arr) {
			int x = Integer.parseInt(i);
			sum += x;
		}
		System.out.println(sum);
		int arr2[] = new int[arr.length];
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
			sum2 += arr2[i];
		}
		System.out.println(sum2);
	}
}
