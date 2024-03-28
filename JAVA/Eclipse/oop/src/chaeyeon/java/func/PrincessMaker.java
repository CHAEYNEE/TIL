package chaeyeon.java.func;

import java.util.Random;
import java.util.Scanner;

public class PrincessMaker {
	
	
	String name = ""; // 이름
	int intellect; // 지력
	int stress; // 피로
	int attractiveness; // 매력
	int	character; // 성품
	int money = 500; // 돈
	int study; // 학문
	int parttime; // 아르바이트
	int month;
	
	public void study() {
		Random r = new Random();
		int intellect1 = r.nextInt(25)+5;
		int stress1 = r.nextInt(15)+1;
		int character1 = r.nextInt(25)+5;
		intellect += intellect1;
		stress += stress1;
		character += character1; 
		money -= 100;
		if(money > 0) {
		System.out.println("-100G, 현재 소지금 : " + money + "G");
		System.out.println(name + "의 지력 : +" + intellect1 + " 성품 : +" + character + " 피로 : +" + stress1);
		}else {
			System.out.println("소지금이 없습니다.");
		}
	}
	
	public void parttime() {
		Random r = new Random();
		int attractiveness1 = r.nextInt(25)+5;
		int stress1 = r.nextInt(15)+1;
		attractiveness += attractiveness1;
		stress += stress1;
		money += 500;
		System.out.println("+500G, 현재 소지금 : " + money + "G");
		System.out.println(name + "의 매력 : +" + attractiveness1 + " 피로 : +" + stress1);
	}
	
	public void princess() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("· ˚ * 。ॱ ˚ ♡ ˚ ॱ。* ˚ · 공주 키우기 · ˚ * 。ॱ ˚ ♡ ˚ ॱ。* ˚ ·");
			System.out.println();
			System.out.println("1. 이름 정하기");
			System.out.println("2. 공주 키우기");
			System.out.println("3. 스탯 확인");
			System.out.println("4. 엔딩");
			System.out.println("5. 게임 종료");
			System.out.print("▶ ");
			int select = sc.nextInt();
			if(2 <= select && select <= 4) {
				if(name == "") { 
					System.out.println("이름을 먼저 설정하세요.");
					continue; 	
				}
			}
					
			
			switch(select) {
			case 1:
				while(true) {
					System.out.print("이름을 정해주세요 ▶ ");
					name = sc.next();
					System.out.print("이름이 " + name + " 이(가) 맞습니까?(y/n) " );
					char ch = sc.next().charAt(0);
					if(ch == 'n') {
						
					}else if(ch == 'y'){
						break;
					}else {
						System.out.println("y/n 중 하나를 입력해주세요"); 
					}
				}
				break;
			case 2:
				while(true) {
					if(month < 12) {
						System.out.println("1. 교육");
						System.out.println("2. 아르바이트");
						System.out.println("3. 상점");
						System.out.println("4. 나가기");
						System.out.print("▶ ");
						int select2 = sc.nextInt();
						switch(select2) {
						case 1: 
							study();
							month++;
							break;
						case 2:
							parttime();
							month++;
							break;
						case 3:
							while(true) {
								System.out.println("1. 편안한 드레스(700G)");
								System.out.println("2. 매력적인 드레스(1000G)");
								System.out.println("3. 겁나 예쁜 드레스(1500G)");
								System.out.println("4. 나가기");
								System.out.print("▶ ");
								int select3 = sc.nextInt();
								switch(select3) {
								case 1:
									if(money >= 700) {
										attractiveness += 500;
										money -= 700;
										System.out.println("-700G");
										System.out.println("편안한 드레스를 착용했습니다. 매력이 500 증가합니다. 현재 소지금 : " + money + "G");
									}else {
										System.out.println("골드가 부족합니다.");
										continue;
									}
					
								case 2:
									if(money >= 1000) {
										attractiveness += 1000;
										money -= 1000;
										System.out.println("-1000G");
										System.out.println("매력적인 드레스를 착용했습니다. 매력이 1000 증가합니다. 현재 소지금 : " + money + "G");
									}else{
										System.out.println("골드가 부족합니다.");
										continue;
									}
								case 3:
									if(money >= 1500) {
										attractiveness += 2000;
										money -= 1500;
										System.out.println("-2000G");
										System.out.println("겁나 예쁜 드레스를 착용했습니다. 매력이 2000 증가합니다. 현재 소지금 : " + money + "G");
									}else{
										System.out.println("골드가 부족합니다.");
										continue;
									}
								case 4:
									break;
								}
						
							}
						}
						break;
					}else {
							System.out.println("12달이 끝났습니다.");
							break;	
						}
					}
					
				
					

			case 3:
				System.out.println("지력 : " + intellect);
				System.out.println("매력 : " + attractiveness);
				System.out.println("성품 : " + character);
				System.out.println("피로 : " + stress);
				System.out.println("소지금 : " + money + "G");
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				
			}
		}
	}
}
