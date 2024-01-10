package chaeyeon.java.func;

import java.util.Scanner;

public class ForTest {

	public void test1() {
		// for(초기;조건;증감)
		// 초기 : 반복 횟수를 위한 변수 선언 및 초기화
		// 조건 : 반복 횟수 조절
		// 증감 : 초기에서 선언해둔 변수를 증가/감소
		// 안녕하세요 5번 출력 ->
		for(int i=0; i<5; i++) {
			System.out.println((i) + "_안녕하세요");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반복하고 싶은 횟수를 입력하세요 : ");
		int count = sc.nextInt();
		for(int i=0; i<count; i++) {
			System.out.println((i) + "_안녕하세요");
		}
	}
	
	public void exam1() {
		int dan = 5;
		System.out.println(dan + "단 입니다.");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력하시겠습니까? : ");
		int dan = sc.nextInt();
		System.out.println(dan + "단 입니다.");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<5; i++) {
			System.out.print("정수 값을 입력하시오 : ");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("입력한 5개의 정수의 합 : " + sum);
	}
	
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		
		System.out.printf("%d ~ %d의 정수의 합 : %d", num1, num2, sum);
	}
	
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("짝수들의 합은 : " + sum);
	}
}
