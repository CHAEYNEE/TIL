package chaeyeon.java.func;

import java.util.Scanner;

public class MethodTest3 {
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		// 문자 1개 입력            대->소 / 소->대
		System.out.print("변환할 문자를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		// 입력받은 문자를 전달 -> 문자를 대->소 / 소->대문자로 변환한 결과를 받음
		// -> 메소드
		char changeChar = changeChar(ch);
		System.out.println("결과 : " + changeChar);
	}
	
	public char changeChar(char cha) {
		// cha => 다른 메소드에서 보내 준 문자
		// 받은 문자를 대->소 / 소->대문자로 변환해서 리턴
		if('A'<=cha && cha<='Z') {
			cha = (char)(cha + 32);
		}else if('a'<=cha && cha<='z') {
			cha = (char)(cha -32);
		}
		return cha;
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		// 입력받은 두 수의 합을 구하는 코드
		// num1 + num2             -> 10000줄 짜리 코드라 가정
		int result1 = sum(num1, num2);
		System.out.println("결과는 : " + result1);
		System.out.print("정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int num4 = sc.nextInt();
		int result2 = sum(num3, num4);
		System.out.println("결과 : " + result2);
	}
	
	public int sum(int su1, int su2) {
		int result = su1 + su2;
		return result;
	}
}
