package chaeyeon.java.func;

import java.util.Scanner;

public class LoopTest {

	public void loopTest1() {
		Scanner sc = new Scanner(System.in);
		// for문의 무한반복문 : for(;;){실행코드;} : 초기, 조건, 증감을 모두 비우면 무한반복
		/*
		 * for(;;) { System.out.println("hello"); }
		 */
		// while문의 무한반복문 : while(조건식) {실행코드;} : 조건식을 항상 true가 나올 수 있게
		boolean bool = true;
		while (bool) {
			System.out.print("숫자를 입력하세요[0을 입력하면 반복문이 종료됩니다] : ");
			int num = sc.nextInt();
			if (num == 0) {
				bool = false;
			}
		}
	}
	
	public void loopTest2() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("i : " + i);
			System.out.print("1을 입력하면 break / 2를 입력하면 continue / 나머지는 일반반복 : ");
			int num = sc.nextInt();
			if(num == 1) {
				break; // 밑 코드 실행하지 않고 for문 바로 빠져나감
			}else if(num == 2) {
				continue; // 밑 코드 실행하지 않고 다시 증감문으로
			}
			System.out.println("반복문 마지막 줄에서 출력되는 구문");
		}
		System.out.println("반복문이 끝나면 출력되는 구문");
	}
	
	public void loopTest3() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i<5) {
			System.out.println("i : " + i);
			System.out.print("1을 입력하면 break / 2를 입력하면 continue / 나머지는 일반반복 : ");
			int num = sc.nextInt();
			if(num == 1) {
				break;
			}else if(num == 2) {
				continue;
			}
			i++;
			System.out.println("반복문 마지막 줄!");
		}
		System.out.println("반복문 끝!!!");
	}
	
	public void loopTest4() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println("i : " + i + " / j : " + j);
				System.out.print("1은 break / 2는 continue : ");
				int num = sc.nextInt();
				if(num == 1) {
					break;
				}else if(num == 2) {
					continue;
				}
				System.out.println("내부 for문(j-for) 마지막 줄");
			}
			System.out.println("외부 for문(i-for) 마지막 줄");
		}
		System.out.println("전체 for문 끝난 뒤!");
	}
	
	public void test1() {
		int num;
		int num2 = 10;
		if(num2 == 10) {
			num = 100;
		}else {
			num = 200;
		}
		System.out.println("num : " + num);
	}
	
	public void test2() {
		int num1 = 100;
		int num2 = 200;
		for(;;) {
			if(num1 == 100) {
				System.out.println("if 내부코드 실행");
				if(num2 == 200) {
					break; // for문을 나가는거지 if문을 나가는 것이 아님
				}
				System.out.println("if문 끝!");
			}
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		while(bool) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : 
				bool = false;
				break;
				// braek; 위에서 바로 나가버렸기 때문에 도달 x
			case 2 :
				System.out.println("!!!");
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
		System.out.println("반복문 끝!"); // 내부에 무한반복문 끝나는 코드가 있어야 활성화 가능
	}
}
