package chaeyeon.java.func;

import java.util.Scanner;

public class Operator {
	
	public void oper1() {
		// 대입연산자
		// 연산자(=) 기준으로 오른쪽의 값을 왼쪽 공간에 대입
		int num = 100;
		System.out.println("num : " + num); // 100 출력
		// 이미 값이 들어있는 변수에 대입연산자를 다시 사용하면 이전 있던 값을 새로 대입하는 값으로 대체
		num = 200;
		int num1 = num;
		System.out.println("num : " + num); // 200 출력
		System.out.println("num1 : " + num1); // 200 출력
		num1 = 300;
		System.out.println("num : " + num); // 200 출력
		System.out.println("num1 : " + num1); // 300 출력
		
		// 복합대입연산자 : 대입연산자 왼쪽에 산술연산자가 붙어있는 모양(+=, -=, /=, %=)
		int num2 = 100;
		System.out.println("num2 : " + num2); // 100 출력
		num2 += 200;
		// num2 = num2 + 200;
		System.out.println("num2 : " + num2); // 300 출력
		num2 -= 100;
		System.out.println("num2 : " + num2); // 200 출력
	}
	
	public void oper2() {
		int num1 = 10;
		int num2 = 10;
		// ++, -- : 현재 변수에 있는 값을 1증가 또는 감소
		System.out.println("num1 : " + num1); // 10 출력
		// 현재 자기 자신 값을 +1
		num1++;
		System.out.println("num1 : " + num1); // 11 출력
		// 현재 자기 자신 값을 -1
		num1--;
		System.out.println("num1 : " + num1); // 10 출력
		
		System.out.println("------------------------");
		
		System.out.println("num2 : " + num2); // 10 출력
		// 현재 자기자신 값을 +1
		++num2;
		System.out.println("num2 : " + num2); // 11 출력
		// 현재 자기자신 값을 -1
		--num2;
		System.out.println("num2 : " + num2); // 10출력
		
		System.out.println("------------------------");
		
		System.out.println("num1 : " + num1); // 10 출력
		System.out.println(num1++); // 후위 연산을 하게 되면 인접 연산을 먼저 수행하고 증감을 진행 -> 10 출력
		System.out.println("num1 : " + num1); // 11 출력
		
		System.out.println("------------------------");
		
		System.out.println("num2 : " + num2); // 10 출력
		System.out.println(++num2); // 11 출력
		System.out.println("num2 : " + num2); // 11 출력
		
		System.out.println("------------------------");
		
		int a = 10;
		int b = (a--) + 2;
		System.out.println(a); // 9 출력
		System.out.println(b); // 12 출력
		
		System.out.println("------------------------");
		
		int x = 10;
		int y = 10;
		int z = (x++) + (++y) + x;
		System.out.println(x); // 11 출력
		System.out.println(y); // 11 출력
		System.out.println(z); // 10+11+11 -> 32 출력
	}
	
	public void oper3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		int result = (num1 < num2)? num1 : num2; // num1 < num2가 참이면 num1 출력 거짓이면 num2 출력
		System.out.println("결과 : " + result);
		String result2 = (num1 < num2)? "num1이 더 작습니다." : "num2가 더 작습니다.";
		System.out.println(result2);
		/*
		 * int result = (num1<num2)? num1 : num2 ;
		 * System.out.println("결과 : " + result);
		 */
	}
	
	public void oper4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("========== 결과 ==========");
		System.out.println("두 수를 더한 수 : " + (num1 + num2));
		System.out.println("두 수를 뺀 수 : " + (num1 - num2));
		System.out.println("두 수를 곱한 수 : " + (num1 * num2));
		double num3 = (double)num1 / num2;
		System.out.printf("두 수를 나눈 수 : %.2f ", num3);
		
	}
	
	public void oper5() {
		int a = 40, b = 20;
		a += b;
		System.out.printf("a의 값 : %d, b의 값 : %d \n", a, b); // 60, 20 출력
		a -=  b;
		System.out.printf("a의 값 : %d, b의 값 : %d \n", a, b); // 40, 20 출력
		b *= a;
		System.out.printf("a의 값 : %d, b의 값 : %d \n", a, b); // 40, 800 출력
		b /= a;
		System.out.printf("a의 값 : %d, b의 값 : %d \n", a, b); // 40, 20 출력
	}
	
	public void oper6() {
		
		int a = 10, b = 20, c = 30, d = 50;
		boolean result1, result2;
		result1 = ((a < 20 && b > 10) && (c == 20 || d == 40)); 
		result2 = ((a == 10 && b != 2 * 10) || (c == 30 && d != 40));
		System.out.printf("첫번째 결과값 : %b \n", result1); // false
		System.out.printf("두번째 결과값 : %b \n", result2); // true
	}
	
	public void oper7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result = (19 < age) ? "성인입니다. 어서오세요" : "미성년자는 입장불가입니다";
		System.out.println(result);
	}
	
	

}
