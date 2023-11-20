package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 입력해서배열에넣기3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[5];
		//numbers --> {0,0,0} + length
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
		}
		sc.close();//통로를 닫아주세요.!!
		System.out.println(Arrays.toString(numbers));
		
		int count = 0;
		String location = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println("22.2의 위치는 " + i);
			}else if(numbers[i] == 33.3) {
				System.out.println("33.3의 위치는 " + i);
				count++;
				location = location + i + " ";
				list.add(i);
			}
		}
		
		System.out.println(count);
		System.out.println("33.3위치는 " + location);
		System.out.println(list);
		
		//list안에 있는 인덱스에 333.3을 넣어보세요.!
		for (int i = 0; i < list.size(); i++) {
			//2, 3
			int index = list.get(i); //2, 3
			numbers[index] = 333.3;
		}
		System.out.println(Arrays.toString(numbers));
			//List<double[]> list = Arrays.asList(numbers);
	}

}
