package 배열문제;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		System.out.println(arr.length);
		arr[0] = 100;
		System.out.println(arr[0]);
		arr[arr.length-1] = 500;
		System.out.println(arr[arr.length-1]);
		arr[2] = 200;
		System.out.println(arr[2]);
		for(int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println("");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 데이터 : " + arr[i]);
		}
	}

}
