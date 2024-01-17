package chaeyeon.java.func;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public void test1() {
		// 무작위 수를 생성하는 객체 : Random
		// 1. import, 2. 약어 설정, -> 3. 메소드 사용
		Random r = new Random();
		int num1 = r.nextInt(); // int 범위 중 무작위 수 1개를 되돌려 줌
		System.out.println("num1 : " + num1);
		// 나오는 랜덤수의 범위값을 조정할 수 있음
		int num2 = r.nextInt(10); // 0~9 사이의 숫자 중 랜덤 숫자 1개
		// r.nextInt(range) : range는 0부터 랜덤 수 갯수
		System.out.println("num2 : " + num2);
		// 0~5 사이의 숫자 중에 랜덤 수 1개 생성
		int num3 = r.nextInt(6);
		System.out.println("num3 : " + num3);
		// 1~10 사이의 숫자 중에 랜덤 수 1개 생성
		int num4 = r.nextInt(10) + 1; // r.nextInt(랜덤 수 갯수) + 시작 숫자
		System.out.println("num4 : " + num4);
		// 20~35 사이의 숫자 중 랜덤 수 1개 생성
		int num5 = r.nextInt(16) + 20;
		System.out.println("num5 : " + num5);
	}
	
	public void coin() {
		// 컴퓨터랑 동전 앞/뒤 맞추기
		// 컴퓨터가 앞/뒤 중 한 개의 값을 갖고 있는 상태를 만듦
		// random을 이용해서 1이면 앞/2면 뒤
		
		// 사용자가 앞/뒤를 입려하면 결과를 처리
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		// 연속 정답 횟수 출력용 변수
		int count = 0; // while문 안에 넣으면 안됨. 안에 있을 경우는 while문이 끝나면 변수까지 사라지기 때문 -> 계속 1회로 출력
		// 이 게임 정답을 맞추면 계속 다시 진행하고 틀리면 게임 종료되게!!
		while(true) {
			System.out.println("===== 동전 앞/뒤 맞추기 =====");
			// 1~2 사이의 랜덤수를 추출(앞/뒤를 생성)
			int coin = r.nextInt(2) + 1;
			// 사용자에게 앞/뒤 선택받기
			System.out.print("앞 / 뒤를 선택하세요(1.앞 / 2.뒤) : ");
			int userSelect = sc.nextInt();
			// 맞춘 경우 : 사용자가 1 입력 시 코인은 1 / 사용자가 2 입력 시 코인은 2
			// 틀린 경우 : 사용자가 1 입력 시 코인은 2 / 사용자가 2 입력 시 코인은 1
			if(userSelect == coin) {
				count++;
				System.out.println(count + "회 연속 정답!!");
			}else {
				System.out.println("땡!");
				break;
			}
		}
	}
	
	public void rsp() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int win = 0; // 승리 카운트
		int lose = 0; // 패배 카운트
		int draw = 0; // 무승부 카운트
		boolean bool = true;
		while(bool) {
			System.out.println("===== 가위 바위 보 게임 =====");
			System.out.println("1. 게임진행");
			System.out.println("2. 게임스코어");
			System.out.println("3. 게임종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				int com = r.nextInt(3) + 1;
				System.out.print("숫자를 선택하세요.(1.가위 / 2.바위 / 3.보) : ");
				int userSelect = sc.nextInt();
				System.out.println("===== 결과 =====");
				if(userSelect == 1) {
					System.out.println("당신은 가위를 냈습니다.");
				}else if(userSelect == 2) {
					System.out.println("당신은 바위를 냈습니다.");
				}else if(userSelect == 3) {
					System.out.println("당신은 보를 냈습니다.");
				}
				String comStr = "";
				if(com == 1) {
					comStr = "가위";
				}else if(com == 2) {
					comStr = "바위";
				}else if(com == 3) {
					comStr = "보";
				}
				System.out.println("컴퓨터는 " + comStr + "를 냈습니다.");
				System.out.println("====================");
				if(userSelect == com) {
					draw++;
					System.out.println("비겼습니다.");
				}else if((userSelect == 1 && com == 3) || (userSelect == 2 && com == 1) || (userSelect == 3 && com == 2)) {
					win++;
					System.out.println("당신이 이겼습니다.ㅠ.ㅠ");
				}else {
					lose++;
					System.out.println("당신이 졌습니다.히히");
				}
				break;
			case 2 :
				System.out.println("승리 : " + win);
				System.out.println("무승부 : " + draw);
				System.out.println("패배 : " + lose);
				break;
			case 3 :
				bool = false;
				System.out.println("잘가세요~");
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	
	public void ud() {
		// 랜덤 숫자 맞추는 게임 : 랜덤 숫자보다 큰 수 입력 시 Down 작은 수 입력 시 Up 출력 랜덤 숫자 맞추면 정답 출력
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		boolean bool = true;
		int rank = 0;
		while(bool) {
			System.out.println("===== Up & Down Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				System.out.println("<< Game Start >>");
				int ran = r.nextInt(99) + 1;
				int total = 1;
				while(true) {
					System.out.print(total + "회차 번호 입력 : ");
					int selectNum = sc.nextInt();
					if(selectNum == ran) {
						// rank == 0 경우 : 첫번째 게임인 경우
						// rank > total : 이전 기록보다 적은 횟수로 정답을 맞춘 경우
						if(rank == 0 || rank > total) {
							rank = total;
						}
						System.out.println("<< 정답 >>");
						break;
					}else if(selectNum > ran) {
						System.out.println("<< Down >>");
					}else if(selectNum < ran) {
						System.out.println("<< Up >>");
					}
					total++;
					
					// 입력 받고 결과를 출력하는 코드 반복용 while
				}
				break;
			case 2 :
				if(rank == 0) { 
					System.out.println("아직 기록이 없습니다.");
				}else {
					System.out.println("현재 최고 기록은 " + rank + "회 입니다.");
				}
				break;
			case 3 :
				bool = false;
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	
	public void br() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		// 전체 메뉴 반복을 위한 변수
		boolean bool = true;
		// 승리 카운트용 변수
		int win = 0;
		// 패배 카운트용 변수
		int lose = 0;
		
		while(bool) {
			System.out.println("===== Baskin Robbins31 Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End game");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1 : 
				while(true) {
					System.out.println("<< Game Start >>");
					int count = 0; // 화면에 숫자를 출력하기 위해 사용한 변수
					int mNum = 0;
					while(true) {
						System.out.println("<< Your Turn >>");
						System.out.print("Input Number(1~3) : ");
						mNum = sc.nextInt(); // 사용자 번호 출력 반복 수
						if(0 < mNum && mNum< 4) {
							break;
						}else {
							System.out.println("1~3 사이값을 입력해주세요");
						}
					}
			
					for(int i = 0; i < mNum; i++) {
						count++;
						System.out.println((count) + "!");
						if(count == 31) {
							lose++;
							System.out.println("나의 패배");
							break; // 출력하는 for문을 중단하는 코드
						}
						
					
					
					}
					if(count == 31) {
						break; // 전체 게임을 종료하는 코드(while문 종료)
					}
					
					System.out.println("<< Computer Turn >>");
					int cNum = r.nextInt(3)+1; // 컴퓨터 번호 출력 반복 
					for(int i = 0; i < cNum; i++) {
						count++;
						System.out.println((count) + "!");
						if(count == 31) {
							win++;
							System.out.println("나의 승리!!!");
							break;
						}
						
					}
					if(count == 31) {
						break;
					}
				}
				break;
			case 2 :
				System.out.println("<< 당신의 전적 >>");
				System.out.println(" WIN : " + win);
				System.out.println(" LOSE : " + lose);
				break;
			case 3 :
				bool = false;
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	
	public void dice() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int win = 0;
		int lose = 0;
		int draw = 0;
		int tMoney = 10000;
		boolean bool = true;
		while(bool) {
			System.out.println("===== Dice Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End game");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1 : 
				while(true) {
					while(true) {
						System.out.println("<< Game Start >>");
						int num1 = r.nextInt(6)+1;
						System.out.println("1번째 주사위 값 : " + num1);
						int num2 = r.nextInt(6)+1;
						System.out.println("2번째 주사위 값 : " + num2);
						int num3 = r.nextInt(6)+1;
						System.out.println("3번째 주사위 값 : " + num3);
						int sum = num1 + num2 + num3;
						System.out.println("내 주사위 총 합 : " + sum);
						System.out.print("배팅 하시겠습니까[y/n] : ");
						int money = 10000;
						int bMoney = 0;
						char ch = sc.next().charAt(0);
						if(ch == 'y') {
							System.out.print("얼마를 배팅하시겠습니까(현재 내 소지금 " + tMoney + "원) : ");
							bMoney = sc.nextInt();
						}else {
							System.out.println("메뉴로 돌아갑니다.");
							break;
			
						}
						int com1 = r.nextInt(6)+1;
						System.out.println("컴퓨터 1번째 주사위 값 : " + com1);
						int com2 = r.nextInt(6)+1;
						System.out.println("컴퓨터 2번째 주사위 값 : " + com2);
						int com3 = r.nextInt(6)+1;
						System.out.println("컴퓨터 3번째 주사위 값 : " + com3);
						int csum = com1 + com2 + com3;
						System.out.println("컴퓨터 주사위 총 합 : " + csum);
			
						System.out.println("<< 결과 >>");
						if(csum < sum) {
							System.out.println("승리!!!!!");
							System.out.println("+" + bMoney + "원!!");
							tMoney += bMoney;
							win++;
						}else if(csum > sum) {
							System.out.println("패배");
							System.out.println("-" + bMoney + "원!!");
							tMoney -= bMoney;
							lose++;
							if(tMoney == 0) {
								System.out.println("거지 Bye~");
								break;
							}
							
						
						}else if(csum == sum) {
							System.out.println("비겼습니다......");
							draw++;
						}
						System.out.print("한 번 더 하시겠습니까[y/n] : ");
						char ch2 = sc.next().charAt(0);
						if(ch2 == 'y') {
					
						}else if(ch2 == 'n') {
							break;
						}else {
							System.out.println("메뉴로 돌아갑니다.");
							break;
						}
					}
					break;
				}
				break;
			case 2 :
				System.out.println("<< 당신의 전적 >>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				System.out.println("DRAW : " + draw);
				System.out.println("내 소지금 : " + tMoney + "원");
				break;
			case 3 :
				bool = false;
				break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
