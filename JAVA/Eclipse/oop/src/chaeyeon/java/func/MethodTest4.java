package chaeyeon.java.func;

import java.util.Scanner;

public class MethodTest4 {

	public void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("입력한 정수 : " + num);
		// 메소드 호출 시 값을 전달하면 변수에 들어있는 값을 복사해서 전달
		// 기본형인 경우 -> 기본형 값을 복사해서 전달(데이터 복사)
		// 참조형인 경우 -> 참조형 주소를 복사해서 전달(주소 복사)
		addNum(num);
		System.out.println("메소드 수행 후 : " + num);
		////////
		int[] arr = {1,2,3,4,5};
		System.out.println("메소드 수행 전 : " + arr[2]); // 3
		addArr(arr);
		System.out.println("메소드 수행 후 : " + arr[2]); // 100   
		
		System.out.println("메소드 수행 전 : " + arr[0]); // 1
		addNum(arr[0]);
		System.out.println("메소드 수행 후 : " + arr[0]); // 1
		}
	
	public void addNum(int num) {
		num += 10;
		System.out.println(num);
	}
	
	public void addArr(int[] arr) {
		arr [2]	 = 100;
		System.out.println(arr[2]);
	}
}
