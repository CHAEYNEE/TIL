package chaeyeon.java.vo;

public class TvVo {
	// 티비 크기
	private int inch;
	// 티비 전원
	private boolean power;
	// 티비 채널
	private int channel;
	// 티비 볼륨
	private int volume;
	
	// JVM이 만드는 기본 생성자
	// 생성자의 역할 -> TvVO 객체가 만들어졌을 때 정상적으로 동작 할 수 있도록 기본값 세팅
	public TvVo() {
		this.inch = 100;
	}
	public TvVo(int inch) {
		this.inch = inch;
	}
	public TvVo(int inch, boolean power, int channel, int volume) {
		this.inch = inch;
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
	// 볼륨값을 다른 클래스에서 얻고 싶은 경우 호출하는 메소드 -> volume변수의 getter
	// getter 메소드 생성 방법
	// 1. 접근제어지시자는 public
	// 2. 리턴타입은 값을 되돌려 줄 변수의 자료형
	// 3. 메소드 이름 -> get변수명 -> 이 때 카멜표기법 적용
	// 4. 매개변수 -> 없음
	// 5. 코드 -> return 되돌려 줄 변수;
	public int getVolume() {
		return volume;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getInch() {
		return inch;
	}
	
	// power getter
	// getter에서 자료형이 boolean인 경우만 메소드 이름을 is변수명 -> 카멜형
	public boolean isPower() {
		return power;
	}
	
	// setter 메소드 생성방법
	// 1. 접근제어지시자 -> public
	// 2. 리턴 -> void
	// 3. 이름 -> set변수명 -> 카멜표기법
	// 4. 매개변수 -> 1개 -> 값을 변경할 자료형과 동일자료형 1개
	// 5. 코드 -> 전역변수 = 매개변수;
	// 볼륨 변수를 변경하는 setter 생성
	public void setVolume(int volume) {
		// 매개변수와 전역변수가 이름이 같은 경우 -> 그냥 변수명을 쓰면 범위가 좁은 매개변수가 지정됨
		// 이런 경우 전역변수를 지칭하는 기능 this.변수명
		this.volume = volume;
	}
	// 인치
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	// 채널
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	// 파워
	public void setPower(boolean power) {
		this.power = power;
	}
	
}