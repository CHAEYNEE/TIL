package chaeyeon.java.func;

public class Variable {

	public void var1() {
		// 변수를 선언하는 방법 -> 자료형 변수이름;
		// 정수형 변수 num을 선언
		int num; // 메모리의 공간은 할당한 상황이지만 아직 데이터를 입력한 적이 없음
		// 데이터가 입력되지 않은 변수는 사용이 불가능
		// System.out.println(num); -> 에러
		// = : 대입연산자 -> = 기준으로 오른쪽의 값을 왼쪽 공간에 대입
		num = 100; // 100이라는 값을 num이라는 공간에 대입
		System.out.println((num)); // 100출력

		// 기본 자료형 변수 선언 및 사용
		// 1. 논리형(boolean) -> 1byte
		boolean bool;
		// 논리형 데이터는 2개 : true, false
		bool = true;
		// 2. 문자형(char) -> 2byte
		// 문자형 데이터는 1글자를 저장 -> 'a'
		char ch;
		ch = 'c';
		// 3. 정수형 변수(byte[1], short[2], int[4], long[8]) -> 기본자료형은 int
		int iNum = 100;
		// 4. 실수형 변수(float[4], double[8]) -> 기본자료형은 double
		double dNum = 3.14;
		System.out.println("bool : " + bool); // true 출력
		System.out.println("ch : " + ch); // c 출력
		System.out.println("iNum : " + iNum); // 100 출력
		System.out.println(("dNum : " + dNum)); // 3.14 출력

		// 문자열 자료형(String)
		String str = "문자열";
		System.out.println("str : " + str); // 문자열 출력
	}

	public void var2() {
		// float 변수 선언
		float fNum = 3.14f;
		// long 변수 선언
		long lNum = 1000000000000l;
		System.out.println("float : " + fNum); // 3.14 출력
		System.out.println("long : " + lNum); // 1000000000000 츨력

		int iNum;
		iNum = 100;
		System.out.println("iNum : " + iNum); // 100 츨력
		iNum = 200;
		System.out.println("iNum : " + iNum); // 200 출력
		// 상수형 변수는 final 키워드를 사용해서 선언
		// 상수형 변수는 한 번 값이 초기화된 후 값을 더이상 변경할 수 없음
		// 표기법은 모든 변수를 대문자로 표현해서 구분
		final double PI = 3.14;
		System.out.println("PI : " + PI); // 3.14 츨력
		// PI = 5.55; -> 오류
		System.out.println("PI : " + PI); // 3.14 츨력
	}

	public void var3() {
		// 그럼 변수를 왜 사용할까?
		String name = "이채연";
		System.out.println("저는 " + name + " 입니다.");
		System.out.println("저는 서울에 살고,");
		System.out.println("이름은 " + name + " 입니다.");
	}

	public void var4() {
		int num = 2147483647;
		System.out.println("num : " + num); // 2147483647 출력
		// int result = num + 1;
		// System.out.println("result : " + result); // 2147483648(예상값) -> 데이터 오버플로우 -> -2147483648 출력
		long result = (long) num + 1;
		System.out.println("result : " + result); // 2147483648 출력
		System.out.println('1' + '1'); // 98 출력(1이 숫자가 아니라 문자열로 인식)
		// 형 변환하는 방법 -> (변경하고 싶은 자료형)data
		int data1 = (int) '1';
		char ch = (char) 49;
		System.out.println("data1 : " + data1); // 49 출력
		System.out.println("ch : " + ch); // 1 출력
	}

	public void var5() {
		// System.out.println(); -> ()안의 데이터를 출력하고 다음 줄로 내림
		System.out.println("안녕하세요");
		System.out.println("저는 이채연 입니다.");
		// System.out.print(); -> ()안의 데이터를 출력, 다음 줄로 내리지 않음
		System.out.print("안녕하세요");
		System.out.print("저는 이채연 입니다."); // 안녕하세요저는 이채연 입니다. 출력
		// println() -> 괄호안에 데이터를 넣지 않아도 상관없음(엔터만 동작)
		System.out.println();
		// print() -> 괄호안에 반드시 데이터를 넣어줘야 함 -> 없으면 에러
		// System.out.print(); -> 에러
		// System.out.printf(); -> 괄호안에 데이터 출력하고 다음 줄로 내리지 않음
		// 변수 3개 선언 -> 이름, 나이, 주소를 저장할 변수 선언 후 값 대입
		String name = "이채연";
		int age = 35;
		String addr = "서울특별시 은평구";

		// 제 이름은 이채연이고 나이는 35살 사는 곳은 서울특별시 은평구 입니다.
		// 1. print
		System.out.print("제 이름은 ");
		System.out.print(name);
		System.out.print("이고 나이는 ");
		System.out.print(age);
		System.out.print("살 사는 곳은 ");
		System.out.print(addr);
		System.out.println(" 입니다.");
		// 2. println
		System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살" + " 사는 곳은 " + addr + " 입니다.");
		// 3. printf
		System.out.printf("제 이름은 %s이고 나이는 %d살 사는 곳은 %s 입니다.\n", name, age, addr);
		
		/* "안녕 
		 * 하\세 요" */		
		System.out.println("\"안녕\n하\\세\t요\"");
	}
	
	public void var6() {
		int iNum = 100;
		long lNum = 99900000000l;
		float fNum = 486.520f;
		double dNum = 5697.890123;
		char ch = 'A';
		String str = "Hello JAVA";
		boolean bool = true;
		
		System.out.println(iNum); // 100 출력
		System.out.println(lNum); // 99900000000 출력
		System.out.println(fNum); // 486.52 출력
		System.out.println(dNum); // 5697.890123 출력
		System.out.println(ch); // A 출력
		System.out.println(str); // Hello JAVA 출력
		System.out.println(bool); // true 출력
		
	}
}
