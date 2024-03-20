package chaeyeon.java.func;

import java.util.Scanner;

public class MethodTest1 {
	// 메소드 선언 방법
	// 접근제어지시자 리턴타입 메소드이름(매개변수){실행코드;}
	public void test1() {
		System.out.println("test1 메소드!");
		test2();
	}
	
	// protected의 범위는 일단 같은 패키지까지라고 생각하면 됨
	protected void test2() {
		System.out.println("test2 메소드!");
	}
	
	// 메소드에 리턴타입이 void가 아니면 어떠한 경우에도 리턴이 될 수 있는 코드를 작성해야 함
	// return data; -> data를 되돌려주면서 메소드를 종료
	public int test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		if(num1 == 100) {
			return 100; // 여기서 100이라는 값 리턴하면서 메소드 종료
		}
		return 0;
		/* System.out.println(1);  
		   return보다 아래에는 코드 올 수 없어
		 */
	}
	
	public void test5() {
		System.out.println("test4 메소드의 수행 결과를 알아봅시다.");
		int num = test4(); // test4가 return되는 타입이 int니까 정수에 넣어줄 수 있음
		System.out.println("num : " + num);
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		int sum = add(num1, num2);
		System.out.println("두 수의 합 : " + sum);
	}
	// add라는 메소드는 전달 받은 두 정수를 더해서 더한 결과를 되돌려주는 메소드
		// 매개변수는 해당 메소드에서 사용 할 변수를 선언하는 개념
		// -> 새로 만들어진 변수이므로 변수 이름은 아무런 영향을 주지 않음
		// -> 자료형과 순서가 중요
		public int add(int num1, int num2) { // 보통 변수 이름은 맞춰서 쓰지만 전달 받은 클래스 변수 이름과 다를 수도 있음
			/*
			 int num1 = test6()에서 준 num1;
			 int num2 = test6()에서 준 num2;
			 */
			int result = num1 + num2;
			return result;
		}
}
