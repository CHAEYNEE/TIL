package chaeyeon.java.func;

import java.util.Scanner;

public class SwitchTest {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.println("1입력!");
			break;
		case 2 :
			System.out.println("2입력@");
			break;
		case 3 :
			System.out.println("3입력#");
			break;
		default :
			System.out.println("?????");
		}
		/*
		if( num == 1 ) {
			System.out.println("1입력!");
		}else if( num == 2 ) {
			System.out.println("2입력@");
		}else if( num == 3 ) {
			System.out.println("3입력#");
		}else {
			System.out.println("?????");s
		}
		*/
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고싶은 월을 입력하세요 : ");
		int month = sc.nextInt(); // 1->31 2->28 등등
		switch(month) {
		case 2 :
			System.out.println("28일");
			break;
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("31일");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("30일");
			break;
		default :
			System.out.println("1~12월까지 입력하세요");
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		// switch로 문자열을 처리하는 기능은 자바 1.7에서 추가된 기능
		switch(str) {
		case "a" :
			System.out.println("aaa");
			break;
		case "b" :
			System.out.println("bbb");
			break;
		}
		/*
		if(str.equals("a")) {
			System.out.println("aaa");
		}else if(str.equals("b")) {
			System.out.println("bbb");
		}
		*/
 	}
}
