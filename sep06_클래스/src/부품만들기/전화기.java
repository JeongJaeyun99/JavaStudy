package 부품만들기;

public class 전화기 {
	public int size; // 기본형 변수, 전역 변수 >> 자동 초기화 0
	public String speaker;
	public void 인터넷하다() {
		System.out.println("크롬으로 실행");
	}
	@Override
	public String toString() {
		return "전화기 [size=" + size + ", speaker=" + speaker + "]";
	}
}
