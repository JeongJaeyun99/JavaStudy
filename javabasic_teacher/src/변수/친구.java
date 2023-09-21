package 변수;

public class 친구 {

	public static void main(String[] args) {
		// 기본형 4가지, 문자열 기본형처럼 사용 가능
		// 기본형 4가지 변수(저장소)에 값이 1개만 저장됨.

		String name = "홍길동"; // 문자열 char('홍') + char('길') + char('동')
		// 실
		int age = 200;
		String location = "홍천";
		double weight = 88.8;
		char color = 'y';
		boolean programmer = true; // false
		// 대충치다가 저장하고 컨트롤 + 쉬프트 + f
		// ==> 코드정리
		// 문법 오류가 있으면 코드 정리 안됨.
		//다음과 같이 출력해보세요.
//		친구의 이름은 홍길동이고 나이는 200세이다.
//		홍천에 살고 있고 몸무게는 88.8킬로이다.
//		좋아하는 색은 y가 들어가는 색이고, 프로그래머 여부는 true이다.
		System.out.println("친구의 이름은 " + name + "이고 나이는 " + age + "세이다");
		System.out.println(location + " 살고 있고 몸무게는 " + weight  + "킬로이다.");
		System.out.println("좋아하는 색은 " + color + "가 들어가는 색이고, 프로그래머 여부는 " + programmer + "이다.");
	}

}
