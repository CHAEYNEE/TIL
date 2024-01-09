package chaeyeon.java.func;

import java.util.Scanner;

public class Example {

	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번 째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번 째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int min = num1 - num2;
		int mul = num1 * num2;
		int por = num1 / num2;
		int rest = num1 % num2;
		
		System.out.println("========== 결과 ==========");
		
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + min);
		System.out.println("곱하기 결과 : " + mul);
		System.out.println("나누기 몫 : " + por);
		System.out.println("나누기 나머지 : " + rest);
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이 입력 : ");
		double wid = sc.nextDouble();
		
		System.out.print("세로 길이 입력 : ");
		double height = sc.nextDouble();
		
		double exe = wid * height;
		double around = 2 * (wid + height);
		
		System.out.println("========== 결과 ==========");
		
		System.out.println("면적 : " + exe);
		System.out.println("둘레 : " + around);
	}
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어 단어 입력 : ");
	    String word = sc.next();
	    char ch1 = word.charAt(0);
	    char ch2 = word.charAt(1);
	    char ch3 = word.charAt(2);
		
		System.out.println("첫번째 문자 : " + ch1);
		System.out.println("두번째 문자 : " + ch2);
		System.out.println("세번째 문자 : " + ch3);
	}
}
