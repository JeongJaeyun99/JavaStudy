package 생성자;

public class TV2 {
	public TV2(int ch, int vol, boolean onOff) {
		this.ch = ch; // 현재 클래스 밑에 있는 ch 변수라는뜻
		this.vol = vol; // this란 현재 클래스로 지정하는것
		this.onOff = onOff;
	}
	public TV2(int ch, int vol) {
		this.ch = ch;
		this.vol = vol;
	}

	public int ch;
	public int vol;
	public boolean onOff;
	
	public void change() {
		System.out.println("채널을 바꾸다");
	}
//	public TV2(int c,boolean o ,int v) { // 생성자 메서드
//		ch = c;
//		vol = v;
//		onOff = o;
//	}
//	public TV2(int c,boolean o) { // 생성자 메서드
//		ch = c;
//		onOff = o;
//	} // 생성자 메소드 오버로딩이 가능하다!
	@Override
	public String toString() {
		return "TV2 [채널=" + ch + ", 볼륨=" + vol + ", 전원여부=" + onOff + "]";
	}
	
}
