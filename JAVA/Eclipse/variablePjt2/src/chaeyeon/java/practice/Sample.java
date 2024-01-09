package chaeyeon.java.practice;

import java.util.Scanner;

public class Sample {

	public void sample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		int uni = (int)ch;
		
		System.out.println(ch + "의 유니코드 값 : " + uni); 
	}
	
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		double kor = sc.nextDouble();
		
		System.out.print("수학 점수 입력 : ");
		double math = sc.nextDouble();
		
		System.out.print("영어 점수 입력 : ");
		double eng = sc.nextDouble();
		
		// double sum = kor + math + eng;
		// double avg = sum / 3;
		
		// int intsum = (int)sum;
		// int intavg = (int)avg;
		
		int sum = (int)(kor + math + eng);
		int avg = sum / 3;
		
		System.out.println("========== 결과 ==========");
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
