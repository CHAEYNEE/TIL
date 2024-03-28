package chaeyeon.java.control;

import java.util.Scanner;

import chaeyeon.java.vo.TvVo;

public class TvMgr {
	// 관리할 데이터 객체
	private TvVo tv;
	// 키보드를 입력받기 위한 객체
	private Scanner sc;
	// 전역변수를 세팅할 기본 생성자
	public TvMgr() {
		// 전역변수로 있는 tv, sc의 사용준비
		tv = new TvVo();
		sc = new Scanner(System.in);
	}
	
	public void main() {
		while(true) {
			System.out.println("----- TV 리모콘 -----");
			System.out.println("1. 전원 on / off");
			System.out.println("2. 채널 증가");
			System.out.println("3. 채널 감소");
			System.out.println("4. 채널 변경");
			System.out.println("5. 볼륨 증가");
			System.out.println("6. 볼륨 감소");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				power();
				break;
			case 2:
				chUp();
				break;
			case 3:
				chDown();
				break;
			case 4:
				changeChannel();
				break;
			case 5:
				volUp();
				break;
			case 6:
				volDown();
				break;
			case 0:
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			} // switch문 종료
		} // while문 종료
	} // main() 메소드 종료
	
	// TV 전원을 켜고 / 끄는 기능 -> tv객체의 power변수의 값을 true -> false / false -> true 변경하는 기능
	public void power() {
		// tv객체의 power변수에 현재 값을 getter 통해서 가져옴
		boolean power = tv.isPower();
		if(power == true) {
			// 현재 전원이 켜져있는 경우 -> 전원을 꺼야함 -> tv객체의 power변수값을 false로
			// setter를 통해서 power변수값을 false로 변경
			tv.setPower(false);
			System.out.println("전원이 꺼집니다.");
		}else {
			// 현재 전원이 꺼져있는 경우 -> 전원을 켜야함 -> tv객체의 power변수값을 true로
			tv.setPower(true);
			System.out.println("전원이 켜집니다.");
		}
	} // power() 메소드 종료
	
	// 현재 설정되어 있는 채널을 1 증가시키는 기능
	// 단, 현재 채널이 999면 0번으로 이동
	public void chUp() {
		// 현재 채널 정보를 가져옴
		// tv객체의 channel 변수의 값을 읽어옴 -> getter
		int currentChannel = tv.getChannel();
		if(currentChannel == 999) {
			// 제일 높은 수 이므로 0으로 세팅 -> setter
			tv.setChannel(0);
			System.out.println("현재 채널 : 0");
		}else {
			// 현재 채널에서 +1해서 세팅 -> setter
			int changeChannel = currentChannel + 1;
			tv.setChannel(changeChannel);
			System.out.println("현재 채널 : " + changeChannel);
		}
	} // chUp() 메소드 종료
	
	// 현재 채널을 1 감소시키는 기능
	// 단, 현재 채널이 0인 경우 999로 세팅
	public void chDown() {
		// 현재 채널 값을 읽어옴 -> tv 객체의 channel 변수의 값을 가져옴 -> getter
		int currentChannel = tv.getChannel();
		int changeChannel = 0;
		if(currentChannel == 0) {
			changeChannel = 999;
		}else {
			changeChannel = currentChannel - 1;
		}
		tv.setChannel(changeChannel);
		System.out.println("현재 채널 : " + tv.getChannel());
	} // chDown() 메소드 종료
	
	// 변경할 채널을 입력 받아서 해당 채널로 변경해주는 메소드
	// 단, 입력 받은 채널이 0 ~ 999 사이 인 경우 변경, 아닌 경우 현재 채널을 유지
	public void changeChannel() {
		System.out.print("변경할 채널을 입력하세요 : ");
		int inputChannel = sc.nextInt();
		if(0<=inputChannel && inputChannel<=999) {
			tv.setChannel(inputChannel);
		}else {
			System.out.println("없는 채널입니다.");
		}
		System.out.println("현재 채널 : " + tv.getChannel());
	} // changeChannel() 메소드 종료
	
	// 현재 볼륨을 1 증가시키는 메소드
	// 단, 현재 볼륨이 100인 경우 100으로 유지
	public void volUp() {
		int currentVolume = tv.getVolume();
		int changeVolume = 0;
		if(currentVolume != 100) {
			changeVolume = currentVolume + 1;
			tv.setVolume(changeVolume);
		}
		System.out.println("현재 볼륨 : " + tv.getVolume());
	} // volUp() 메소드 종료
	
	// 현재 볼륨을 1 감소시키는 메소드
	// 단, 현재 볼륨이 0인 경우 0으로 유지
	public void volDown() {
		int currentVolume = tv.getVolume();
		int changeVolume = 0;
		if(currentVolume != 0) {  // if(tv.getVolume() != 0) { tv.setVolume(tv.getVolume() + 1);
			changeVolume = currentVolume - 1;
			tv.setVolume(changeVolume);
		}
		System.out.println("현재 볼륨 : " + tv.getVolume());
	} // volDown() 메소드 종료
}
