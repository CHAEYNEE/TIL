package chaeyeon.java.func;

import java.util.Scanner;

public class TV {
	/*
	 속성 : 클래스 단위에 변수를 선언	
	 크기 	자료형 int		변수명 inch
	 전원		자료형 boolean	변수명 power
	 채널		자료형 int		변수명 channel
	 볼륨		자료형 int		변수명 volume
	*/
	
	// 전역 변수는 선언만 하더라도 기본값으로 세팅이 되어있음
	private int inch;			// 0
	private boolean power;		// false
	private int channel;		// 0
	private int volume;			// 0
	
	// 전원을 켜고/끄는 메소드
	public void power() {
		// power값이 true -> false, false -> true
		if(power == true) {
			power = false;
			System.out.println("전원이 꺼졌습니다.");
		}else {
			power = true;
			System.out.println("전원이 켜졌습니다.");
		}
	}
	
	// 채널을 현재 채널에서 1 올리는 기능
	public void channelUp() {
		if(channel == 999) {
			channel = 0;
		}else {
			channel++;
		}
		System.out.println("현재 채널 : " + channel);
	}
	
	// 채널을 현재 채널에서 1 내리는 기능
	public void channelDown() {
		if(channel == 0) {
			channel = 999;
		}else {
			channel--;
		}
		System.out.println("현재 채널 : " + channel);
	}
	
	// 볼륨을 현재 볼륨에서 1 올리는 기능
	public void volumeUp() {
		if(volume<100) {
			volume++;
		}
		System.out.println("현재 볼륨 : " + volume);
	}
	
	// 볼륨을 현재 볼륨에서 1 내리는 기능
	public void volumeDown() {
		if(volume != 0) {
			volume--;
		}
		System.out.println("현재 볼륨 : " + volume);
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("======= TV 리모콘 =======");
			System.out.println("1. 전원버튼");
			System.out.println("2. 채널 올리기");
			System.out.println("3. 채널 내리기");
			System.out.println("4. 채널 변경");
			System.out.println("5. 볼륨 올리기");
			System.out.println("6. 볼륨 내리기");
			System.out.println("0. 시스템 종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			if(2<=select && select<=6) { // 채널 변경 or 볼륨 조절 기능 선택시
				if(power == false) { // 전원이 꺼져있는지 확인하는 if
					System.out.println("전원을 켠 후 사용해주세요!");
					continue; // 전원이 꺼져있으면 반복문 조건문으로 이동
				}
			}
			switch(select) {
			case 1 :
				power();
				break;
			case 2 :
				channelUp();
				break;
			case 3 :
				channelDown();
			case 4 : 
				System.out.print("채널 번호 입력 : ");
				int changeChannel = sc.nextInt();
				if(0<=changeChannel && changeChannel<=999) {
					channel = changeChannel;
				}else {
					System.out.println("존재하지 않는 채널입니다.");
				}
				System.out.println("현재 채널 : " + changeChannel);
				break;
			case 5 :
				volumeUp();
				break;
			case 6:
				volumeDown();
				break;
			case 0:
				System.out.println("시스템을 종료합니다.");
				return; // 리턴 타입이 void인 메소드를 현재 시점에서 강제로 종료하는 코드
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}		
	}
}
