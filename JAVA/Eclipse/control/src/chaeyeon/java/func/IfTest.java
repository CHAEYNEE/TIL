package chaeyeon.java.func;

import java.util.Scanner;

public class IfTest {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 10을 입력해보세요 : ");
		int num = sc.nextInt();
		if(num == 10) {
			System.out.println("입력한 숫자 : " + num);
			System.out.println("시키는대로 잘 했어요");
		}
		System.out.println("끝!");
	}
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 숫자 구별 프로그램 =========");
		System.out.print("임의의 정수를 입력 하세요 : ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 양수입니다.", num);
		}
		if(num == 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 0입니다.", num);
		}
		if(num < 0) {
			System.out.printf("당신이 입력한 수 %d은(는) 음수입니다.", num);
		}
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 두 수 비교 프로그램 =========");
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		if(num1 < num2) {
			System.out.printf("%d < %d \n", num1, num2);
			System.out.println("두번째 수가 더 큽니다.");
		}
		if(num1 == num2) {
			System.out.printf("%d = %d \n", num1, num2);
			System.out.println("두 수가 같습니다.");
		}
		if(num1 > num2) {
			System.out.printf("%d > %d \n", num1, num2);
			System.out.println("첫번째 수가 더 큽니다.");
		}
	}
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("========= 계산기 프로그램 =========");
		System.out.print("연산자를 입력하세요(+, -, *, /) : ");
		char ch = sc.next().charAt(0); // 문자열로 받을 때 String ch = sc.next();
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		if (ch == '+') {
			System.out.printf("%d %c %d = %d", num1, ch, num2,(num1 + num2) );
		} // 문자열로 받을 때 if (ch.equals("+")) {}
		if (ch == '-') {
			System.out.printf("%d %c %d = %d", num1, ch, num2,(num1 - num2) );
		}
		if (ch == '*') {
			System.out.printf("%d %c %d = %d", num1, ch, num2,(num1 * num2) );
		}
		if (ch == '/') {
			System.out.printf("%d %c %d = %.6f", num1, ch, num2, ((double)num1 / num2));
		}
		
		// 문자열은 참조형 데이터로 == 비교연산자로 비교하는 경우 주소값끼리 비교 -> 항상 false
		// 문자열이 같은지 비교하는 방법 문자열1.equals(문자열2);
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("짝수!");
		}else {
			System.out.println("홀수!");
		}
	}
	
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========= 놀이공원 프로그램 =========");
		
		int adultPrice = 15000;
		int kidPrice = 5000;
		System.out.print("입장하실 총 인원은 몇 명입니까? : ");
		int total = sc.nextInt();
		System.out.print("어른은 몇 명입니까?(1인당 "+adultPrice+"원) : ");
		int adult = sc.nextInt();
		System.out.print("아이는 몇 명입니까?(1인당 "+kidPrice+"원) : ");
		int kid = sc.nextInt();
		if(total == adult + kid) {
			System.out.printf("지불하실 총 금액은 %d원 입니다.", (adultPrice*adult+kidPrice*kid));
		}else {
			System.out.println("인원수가 맞지 않습니다.");
		}
	}
	
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========= 퀴즈 프로그램 =========");
		// 정답 갯수를 저장할 변수를 선언
		// 최초에 저답을 맞춘적이 없으니까 처음에는 0으로 초기화
		int count = 0;
		System.out.println("첫번째 퀴즈");
		System.out.print("사과는 영어로 무엇일까요(1.apple, 2.스티브 잡스)? : ");
		int ans1 = sc.nextInt();
		if(ans1 == 1) {
			count++;
			System.out.println("정답!!!");
		}else {
			System.out.println("땡!!");
		}
		System.out.println("두번째 퀴즈");
		System.out.print("바나나는 길어 길으면 기차 기차는 (1.비싸, 2.빨라)? : ");
		int ans2 = sc.nextInt();
		
		if(ans2 == 2) {
			count++;
			System.out.println("정답!!!");
		}else {
			System.out.println("땡!!");
		}
		System.out.println("총 "+count+"문제 맞췄습니다.");
		/*
		if(ans1 == 1 && ans2 == 2) {
			System.out.println("총 2문제를 맞췄습니다.");
		}
		if((ans1 == 1 && ans2 == 1) || (ans1 == 2 && ans2 == 2)) {
			System.out.println("총 1문제를 맞췄습니다.");
		}
		if(ans1 == 2 && ans2 ==1) {
			System.out.println("총 0문제를 맞췄습니다.");
		}*/
	}
	
	public void exam6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========== 심리테스트 =========");
		
		System.out.print("당신은 술을 좋아하십니까(1.yes, 2.no)? : ");
		int ans1 = sc.nextInt();
		if(ans1 == 1) {
			System.out.print("당신은 담배를 피웁니까(1.yes, 2.no)? : ");
			int ans2 = sc.nextInt();
			if(ans2 == 1) {
				System.out.println("담배는 건강에 좋지 않습니다.");
			}else {
				System.out.println("술은 간에 좋지 않습니다.");
			}
		}else {
			System.out.print("당신은 이성친구가 있습니까(1.yes, 2.no)? : ");
			int ans3 = sc.nextInt();
			if(ans3 == 1) {
				System.out.println("올..ㅋ");
			}else {
				System.out.println("힘내요 ㅠㅠ");
			}
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num > 1000) {
			System.out.println("1000보다 큰 수 입니다.");
		}else if(num > 100) {
			System.out.println("100보다 큰 수 입니다.");
		}else if(num > 10) {
			System.out.println("10보다 큰 수 입니다.");
		}else {
			System.out.println("10 이하의 수 입니다.");
		}
    }
	
	public void exam7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========= 대/소문자 변환 프로그램=========");
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println("==== 결과 ====");
		// 65~90 사이면 대문자 65 <= ch && ch <= 90
		// 97~122 사이면 소문자
		if(ch >= 65 && ch <= 90) {
			System.out.println("대문자를 입력하였습니다.");
			System.out.println((char)(ch+32));// if('A' <= ch && ch <= 'Z')
			// 복합대입연산자를 써도 된다. ch += 32
		}else if (ch >= 97 && ch <= 122){
			System.out.println("소문자를 입력하였습니다.");
			System.out.println((char)(ch-32));
		}else {
			System.out.println("잘못 입력하셨습니다.영문자를 입력해주세요.");
		}
	}
	
	public void exam8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("===== 결과 =====");
		if(num == 0) {
			System.out.println("[0]은(는) 3의 배수도 4의 배수도 아닙니다.");
		}else if((num % 3 == 0) && (num % 4 == 0)) {
			System.out.printf("[%d]은(는) 3의 배수면서 4의 배수입니다.", num);
		}else if(num % 3 == 0) {
			System.out.printf("[%d]은(는) 3의 배수입니다.", num);
		}else if(num % 4 == 0) {
			System.out.printf("[%d]은(는) 4의 배수입니다.", num);
		}else {
			System.out.printf("[%d]은(는) 3의 배수도 4의 배수도 아닙니다.", num);
		}
	}
}
