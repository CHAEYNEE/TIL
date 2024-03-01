package chaeyeon.java.func;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest {

	public void test1() {
		// 정수형 변수 5개를 선언해서 1,2,3,4,5라는 값을 대입 / 출력
		int num0 = 1;
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		int num4 = 5;
		System.out.println("-----------변수로 출력");
		System.out.println(num0);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		/*
		 변수는 반복문으로 사용 불가능 -> i값이 숫자로 인식될 수 없음
		for(int i = 0; i < 5; i++) {
			System.out.println(numi);
		}
		*/
		
		// 길이가 5인 정수형 배열을 선언해서 순서대로 1,2,3,4,5라는 값을 대입 / 출력
		// 길이가 5인 정수형 배열 선언
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("-----------배열로 출력");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("-----------배열 반복문으로 출력");
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void test2() {
		// 길이가 3인 배열을 선언해서 순서대로 1,2,3,이라는 데이터를 대입 -> 출력
		// 총 3가지 방법
		// 방법 1. 길이가 3인 배열을 생성 후 각 index에 값 직접 대입
		int[] arr1 = new int[3]; // 길이 3인 정수형 배열 생성 후 0 0 0으로 초기화 완료
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		System.out.println("----------arr1 출력");
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]);
		}
		
		// 방법 2. 길이가 3인 배열을 생성 후 for문을 통해서 데이터 대입 -> 출력
		int[] arr2 = new int[3];
		for(int i=0; i<3; i++) {
			arr2[i] = (i+1);
		}
		System.out.println("----------arr2 출력");
		for(int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		
		// 방법 3. 중괄호를 이용하는 방법
		int[] arr3 = {1, 2, 3};
		System.out.println("----------arr3 출력");
		for(int i=0; i<3; i++) {
			System.out.println(arr3[i]);
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		/*
		// 숫자 다섯개를 반복문을 통해서 입력 받아 숫자의 총 합을 출력
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("입력받은 5개 숫자의 총 합은 : " + sum);
		 */
		
		// 숫자 다섯개를 입력받아서 입력받은 숫자를 출력
		int[] num = new int[5];
		for(int i=0; i<5; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			num[i] = sc.nextInt();
		}
		for(int i=0; i<5; i++) {
			System.out.println(num[i]);
		}
	}
	
	public void exam1() {
		String[] fruit = new String[5];
		fruit[0] = "딸기";
		fruit[1] = "복숭아";
		fruit[2] = "키위";
		fruit[3] = "사과";
		fruit[4] = "바나나";
		// 다른 방법
		String[] fruit2 = {"딸기", "복숭아", "키위", "사과", "바나나"};
		
		// 1-1 : 배열 인덱스를 이용해서 바나나
		System.out.println("1-1. 배열 인덱스를 이용해서 바나나 출력");
		System.out.println(fruit[4]);
		
		// 1-2 : for문 사용하지 않고 전체 출력 
		System.out.println("1-2. for문을 쓰지 않고 전체 출력");
		System.out.println(fruit[0]);
		System.out.println(fruit[1]);
		System.out.println(fruit[2]);
		System.out.println(fruit[3]);
		System.out.println(fruit[4]);
		
		// 1-3 : for문을 이용하여 전체 출력
		// 배열 이름.length => 해당 배열의 길이
		System.out.println("1-3. for문을 이용하여 전체 출력");
		for(int i=0; i<5; i++) {
			System.out.println(fruit[i]);
		}
		//for(int i=0; i<fruit.length; i++)
	}
	
	public void exam2() {
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1) ;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		/* 내가 짠 코드
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		System.out.println("합계 : " + sum);
		
		int[] num = {kor, math, eng, sum};	
		for(int i = 0; i < 4; i++) {
			System.out.println(num[i]);
		}
		System.out.printf("%.2f", avg);
		*/
		
		int[] score = new int[4];
		String[] subject = new String[3];
		subject[0] = "국어";
		subject[1] = "영어";
		subject[2] = "수학";

		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " 점수 입력 : ");
			score[i] = sc.nextInt();
			score[3] += score[i];
		}
		
		for(int i = 0; i < subject.length; i++) {
			System.out.printf("%s 점수 : %d\n", subject[i], score[i]);
		}
		System.out.println("합계 : " + score[3]);
		double avg = (double)score[3]/3;
		System.out.printf("평균 : %.2f", avg);
	}
	
	public void motel() {
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		int[] room = new int[10]; // boolean형 배열로도 해봐
		while(bool) {
			System.out.println("----- 모텔 관리 프로그램 -----");
			System.out.println("1. 입실");
			System.out.println("2. 퇴실");
			System.out.println("3. 방보기");
			System.out.println("4. 종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			switch(select) {
			case 1 : 
				System.out.print("몇 번 방으로 입실하시겠습니까? ");
				int rNum = sc.nextInt();
				if(room[rNum-1] == 1) {
					System.out.println(rNum + "번 방에는 현재 손님이 있습니다.");
				}else {
					room[rNum-1] = 1;
				}
				break;
				
			case 2 :
				System.out.println("몇 번 방에서 퇴실하시겠습니까? ");
				int oNum = sc.nextInt();
				if(room[oNum-1] == 0) {
					System.out.println(oNum + "번 방은 비어있습니다.");
				}else {
					room[oNum-1] = 0;
				}
				break;
				
			case 3 :
				for(int i=0; i<room.length; i++) {
					if(room[i] == 0) {
						System.out.println((i+1) + "번 방은 비어있습니다.");
					}else if(room[i] == 1) {
						System.out.println((i+1) + "번 방에는 손님이 있습니다.");
					}
				}
				break;
				
			case 4 :
				bool = false;
				System.out.println("BYE~!!");
				break;
			}
		}
	}
	
	public void bubble() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		// 버블 정렬 로직 구현
		/*
		// 배열의 0번째와 1번째를 비교해서 0번째가 더 크면 자리를 바꾸는 코드
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		for(int i = 0; i<arr.length-2; i++) {
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		for(int i = 0; i<arr.length-3; i++) {
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		for(int i = 0; i<arr.length-4; i++) {
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
		
		/*
		if(arr[0] > arr[1]) {
			int tmp = arr[0];
			arr[0] = arr[1];
			arr[1] = tmp;
		}
		// 배열 1번째와 2번째를 비교해서 1번째가 더 크면 자리를 바꾸는 코드
		if(arr[1] > arr[2]) {
			int tmp = arr[1];
			arr[1] = arr[2];
			arr[2] = tmp;
		}
		
		if(arr[2] > arr[3]) {
			int tmp = arr[2];
			arr[2] = arr[3];
			arr[3] = tmp;
		}
		if(arr[3] > arr[4]) {
			int tmp = arr[3];
			arr[3] = arr[4];
			arr[4] = tmp;
		}
		*/
		// 오름차순으로 정렬
		for(int i=0; i<arr.length-1; i++) { // for(int i = arr.length-1; i > 0; i--) 이면
			for(int j=0; j<arr.length-1-i; j++) { //for(int j = 0; j < i; j++) 이다.
				if(arr[j] > arr[j+1]) { // 부등호만 바꾸면 내림차순으로 바뀜
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	public void lotto() {
		// 1. 내 번호 저장 할 배열 선언(길이가 6)
		// 2. 반복문을 통해서 숫자를 입력 받음(6개) -> 2-1. 입력받는 숫자는 1~45의 정수 2-2. 이미 입력된 정수는 입력 x (중복 불가)
		// 3. 컴퓨터 번호(당첨 번호) 배열 선언(길이가 6)
		// 4. 반복문 통해서 랜덤으로 숫자 6개 저장 -> 4-1. 랜덤 수 범위는 1~45 4-2. 이미 입력된 정수는 저장 x
		// 2-1, 2-2, 4-1, 4-2 사항에 걸려서 데이터가 저장되지 않으면 다시 저장
		// 최종 출력 시 -> 내 번호, 당첨 번호 오름차순 정렬해서 출력, 등수 체크, 내 번호와 당첨 번호 일치하는 갯수 확인
		// 6개 일치 1등 5개 일치 2등 4개 일치 3등 나머지 다 꽝
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int[] myNum = new int[6]; // 길이가 6인 배열 선언(내부 데이터는 모두 0으로 초기화 된 상태)
		System.out.println("========== 로또 프로그램 ==========");
		for(int i=0; i<myNum.length; i++) {
			System.out.print((i+1) + "번째 번호 입력(1~45) : ");
			int num = sc.nextInt();
			// 입력 받은 수의 범위 0<num && num<46
			if(0<num && num<46) {
				// 입력 범위가 정상이면 데이터 중복 검사
				boolean bool = true;
				for(int j=0; j<i; j++) { // 중복 체크는 이미 데이터가 들어있는 부분까지만 수행
					if(num == myNum[j]) { // 입력한 숫자와 중복된 숫자가 있는 경우
						bool = false;
						System.out.println("중복 번호입니다. 다시 입력해주세요.");
						i--;
						break; // 중복된 데이터가 있으면 이 후 중복 체크는 무의미하므로 중복 체크 for문 종료
					}
				}
				// 중복이 일어나지 않았으면 데이터 배열 저장
				if(bool) {
					myNum[i] = num;
				}
			}else {
				System.out.println("잘못 입력하셨습니다. 1~45 중 한 개를 입력해주세요.");
				i--; // 해당 회차를 다시 입력 받기 위해 추후에 i++ 동작 할 예정이므로 미리 1을 빼둠
			}
		} // 사용자 번호를 입력받는 for문 종료
		
		// 컴퓨터 번호를 저장 할 배열
		int[] comNum = new int[6];
		for(int i=0; i<comNum.length; i++) {
			int num = r.nextInt(45)+1; // 1~45
			boolean bool = true;
			for(int j=0; j<i; j++) { // 중복 체크는 이미 데이터가 들어있는 부분까지만 수행
				if(num == comNum[j]) {
				// 입력한 숫자와 중복된 숫자가 있는 경우
					bool = false;
					i--;
					break; // 중복된 데이터가 있으면 이후 중복 체크는 무의미하므로 중복 체크 for문 종료
				}
			}
			if(bool) {
				comNum[i] = num;
			}
		} // 로또 당첨 번호를 중복없이 랜덤으로 6개 배열에 대입하는 for문 종료
		// 정렬
		// 사용자 번호 오름차순 정렬
		for(int i=0; i<myNum.length-1; i++) {
			// 0~1/1~2/2~3/3~4/4~5
			for(int j=0; j<myNum.length-1-i; j++) {
				if(myNum[j] > myNum[j+1]) {
					int temp = myNum[j];
					myNum[j] = myNum[j+1];
					myNum[j+1] = temp;
				}
			}
		}
		// 컴퓨터 번호 오름차순 정렬
		for(int i=0; i<comNum.length; i++) {
			// 0~1/1~2/2~3/3~4/4~5
			for(int j=0; j<comNum.length-1-i; j++) {
				if(comNum[j] > comNum[j+1]) {
					int temp = comNum[j];
					comNum[j] = comNum[j+1];
					comNum[j+1] = temp;
				}
			}
		}
		//맞은 갯수 카운팅
		int count = 0; // 맞은 갯수를 세 줄 변수(최초 0, 맞는 번호 찾는 경우 1씩 증가)
		for(int i=0; i<myNum.length; i++) {
			for(int j=0; j<comNum.length; j++) {
				if(myNum[i] == comNum[i]) {
					count++;
					break;
				}
			}
		}
		// 결과 출력
		System.out.println("========== 결과 ----------");
		System.out.println("사용자 번호");
		for(int i = 0; i < myNum.length ; i++) {
			System.out.print(myNum[i]+ "\t");
		}
		System.out.println();
		System.out.println("당첨 번호");
		for(int i = 0; i < comNum.length ; i++) {
			System.out.print(comNum[i]+ "\t");
		}
		System.out.println();
		System.out.println("맞춘 갯수 : " + count);
		switch(count){
		case 6 :
			System.out.println("1등!!!!");
			break;
				
		case 5 :
			System.out.println("2등!!!");
			break;
				
		case 4 :
			System.out.println("3등!!");
			break;
				
		default : 
			System.out.println("꽝");
		}
	}
	
	public void arrayCopy() {
		// 기본형 변수의 경우
		int num1 = 100;
		int num2 = num1; // num1에 들어있는 값을 복사해서 num2에 대입
		System.out.println("num1 : " + num1); // 100
		System.out.println("num2 : " + num2); // 100
		
		num2 = 1000;
		System.out.println("num1 : " + num1); // 100
		System.out.println("num2 : " + num2); // 1000
		
		// 배열의 경우
		int[] arr1 = {1,2,3,4};
		int[] arr2 = arr1;
		System.out.println("arr1 출력");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t"); // {1,2,3,4}
		}
		System.out.println();
		System.out.println("arr2 출력");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t"); // {1,2,3,4}
		}
		System.out.println();
		arr2[2] = 100; 
		System.out.println("arr2 출력");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t"); // {1,2,100,4}
		}
		System.out.println();
		System.out.println("arr1 출력");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t"); // {1,2,100,4}
		}
		System.out.println();
	}
	
	public void arrayCopy2() {
		// 배열 깊은 복사 : 새로운 배열을 만들어서 내부의 데이터만 복사하는 것
		int[] arr1 = {1,2,3,4};
		// 깊은 복사 방법 1. 길이가 같은 배열을 새로 만들어서 for문으로 값을 복사
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			
		}
		System.out.println("arr1 출력");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t"); // {1,2,3,4}
		}
		System.out.println();
		System.out.println("arr2 출력");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t"); // {1,2,3,4}
		}
		System.out.println();
		arr2[2] = 100;
		arr1[1] = 1000;
		System.out.println("arr1 출력");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t"); // {1,1000,3,4}
		}
		System.out.println();
		System.out.println("arr2 출력");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t"); // {1,2,100,4}
		}
		System.out.println();
	}
	
	public void arrayCopy3() {
		int[] arr1 = {1,2,3,4};
		// 깊은 복사 방법 2.
		int[] arr2 = new int[10];
		// 1. 원본 데이터가 저장된 배열
		// 2. 원본 배열 중 복사하고싶은 데이터의 인덱스 번호(시작)
		// 3. 새 배열(복사한 데이터가 들어갈 배열)
		// 4. 새 배열 중 데이터가 들어갈 시작 인덱스 번호
		// 5. 원본 배열에서 데이터를 복사할 길이
		System.arraycopy(arr1, 1, arr2, 5, 2);
		System.out.println("arr1 출력");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+ " "); // 1 2 3 4
		}
		System.out.println();
		System.out.println("arr2 출력");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+ " "); // 0 0 0 0 0 2 3 0 0 0 
		}
		System.out.println();
		// 깊은 복사 방법 3. 완전히 배열을 깊은 복사 할 때
		int[] arr3 = arr1.clone();
		System.out.println("arr3 출력");
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " "); // 1 2 3 4
		}
		System.out.println();
	}
}
