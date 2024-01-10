package chaeyeon.java.func;

import java.util.Scanner;

public class WhileTest {

	public void test1() {
		// while문을 통해서 안녕하세요 5번 출력
				/*
				  for(int i = 1, i <= 5, i++) {
					  System.out.println("안녕하세요");
				  }(*/
				
				
				
				// while(조건문) { 실행코드; } => for문과 비교했을 때 초기값 설정, 증감문이 존재하지 않음 => 직접 초기값과 증감문을 만들어야함
				
				int i = 1;
				while(i <= 5) {
					System.out.println("안녕하세요");
					i++;
				}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반복 횟수를 입력하세요 : ");
		int count = sc.nextInt();
		int i = 1;
		while(i <= count) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	
	public void exam1() {
		System.out.println("2단 입니다.");
		int i = 1;
		while(i <= 9) {
			System.out.println("2 * " + i + " = " + (2*i));
			i++;
		}
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력하시겠습니까? : ");
		int dan = sc.nextInt();
		System.out.println(dan + "단 입니다.");
		int i = 1;
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
			i++;
		}
	}
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		while(i <= 5) {
			System.out.print("정수 값을 입력하시오 : ");
			int num = sc.nextInt();
			sum += num;
			i++;
		}
		System.out.println("입력한 5개의 정수의 합 : " + sum);
	}
	
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		int i = num1;
		int sum = 0;
		while(i <= num2) {
			sum += i;
			i++;
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d", num1, num2, sum);
	}
	
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= num) {
			if(i%2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("짝수들의 합은 : " + sum );
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		do {
			System.out.println("num : " + num);
			num--;
		}while(num > 0);
		// do while은 일단 실행 후 조건 검사
		
				/*
				while(num > 0) {
					System.out.println("num : " + num);
					num--;
				}
				*/
	}
}
