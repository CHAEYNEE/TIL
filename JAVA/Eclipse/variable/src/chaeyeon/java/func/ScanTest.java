package chaeyeon.java.func;
// 1. Scanner 사용 시 첫번째로 할 일(import)
import java.util.Scanner;

public class ScanTest {
	public void scan1() {
		// 스캐너 별칭 설정
		Scanner sc = new Scanner(System.in);
		
		// 1. 입력을 위한 메세지 출력
		// System.out.println("키보드를 입력해주세요 : ");
		// sc.next();
		System.out.print("문자열 입력 : ");
		String str0 = sc.nextLine();
		System.out.print("정수를 입력하세요 : ");
		// 2. 입력형식에 맞는 스캐너 메소드 사용
		// 3. 결과를 변수에 저장
		int num = sc.nextInt();
		System.out.println("입력한 수는 : " + num);
		
		// 실수 입력 받기
		System.out.print("실수를 입력하세요 : ");
		double num2 = sc.nextDouble();
		System.out.println("입력한 실수는 : " + num2);
		
		// 문자열 입력받기 1. -> 입력받을 문자열에 띄어쓰기가 없는 경우
		System.out.print("띄어쓰기가 없는 문자열을 입력하세요 : ");
		String str1 = sc.next();
		System.out.println("str1 : " +  str1);
		// 1. sc.nextLine()은 사용조건
		// nextLine() 사용 전에 다른 next(), nextInt(), nextDouble() 사용한 적이 있는지
		// -> 사용한 적이 있으면 엔터를 정리하는 작업(버퍼 정리 작업)을 수행 후 사용
		System.out.print("띄어쓰기가 있는 문자열을 입력하세요 : ");
		sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("str2 : " + str2);
		
		// 문자 입력 받기
		System.out.print("문자 입력 : ");
		// String str3 = sc.next();
		// char ch = str3.charAt(0);
		char ch = sc.next().charAt(0);
		System.out.println("ch : " + ch );
	}
	
	
	public void exam1() {
		/* 자신의 이름(String), 나이(int), 주소(String), 키(double), 몸무게(double), 성별(char)을 입력 받고
		 * 출력하는 프로그램을 작성 하시오.
		 * 키는 정수로 변환하여 출력, 몸무게는 첫째 자리까지 출력 */
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게 입력 : ");
		double weight = sc.nextDouble();
		
		System.out.print("성별 입력[남/여] : ");
		char gender = sc.next().charAt(0);
		
		
		System.out.println("----- 개인정보 -----");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
		int intHeight = (int)height;
		System.out.println("키 : " + intHeight);
		System.out.printf("몸무게 : %.1f\n", weight);
		System.out.println("성별 : " + gender);
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		// 총합 -> 입력 받은 국어, 수학, 영어 점수를 모두 더하면
		int sum = kor + math + eng;
		// 평균 -> 총합 / 3
		double avg = (double)sum/3;
		System.out.printf("당신 성적의 총 합은 %d점이고, 평균은 %.2f 입니다!", sum, avg);
		
	}
}
