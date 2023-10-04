package 메소드연습;

import java.io.File;
import java.util.Arrays;

public class 파일테스트 {

	public static void main(String[] args) {
		File file = new File("text.txt");
		boolean result = file.exists();
		System.out.println(result);
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		File folder = new File(".");
		System.out.println(folder.isDirectory());
		String list[] = folder.list();
		System.out.println(Arrays.toString(list));
	}

}
