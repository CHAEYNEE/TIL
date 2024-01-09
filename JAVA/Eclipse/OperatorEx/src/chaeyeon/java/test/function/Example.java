package chaeyeon.java.test.function;

import java.util.Scanner;

public class Example {

	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		System.out.println("합계 : " + (kor + eng + math));
		double avg = (double)(kor + eng + math) / 3;
		System.out.printf("평균 : %.2f \n", avg);
		
		// 국어 40점 이상, 영어 40점 이상, 수학 40점 이상, 평균 60점이상이면 합격 아니면 불합격
		String result = ((kor >= 40 && eng >= 40 && math >= 40) && (avg >= 60))? "합격" : "불합격";
		System.out.println(result);
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 나머지가 0이면 짝수 아니면 홀수
		String result = (num % 2 == 0)? "짝수!" : "홀수!";
		System.out.println(result);
	}
}
