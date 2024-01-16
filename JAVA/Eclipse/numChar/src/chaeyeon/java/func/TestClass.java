package chaeyeon.java.func;

public class TestClass {
	
	public void test1() {
		System.out.println(1); //정수 1을 출력
		System.out.println(1.1); //실수 1.1을 출력
		System.out.println('1'); //문자 1을 출력
		System.out.println("1"); //문자열 1을 출력
	}
	
	public void test2() {
		//자바에서 문자, 문자열을 표현하기 위해서 유니코드를 사용
		//49 문자타입으로 인식하면 '1'
		System.out.println(1+1); //정수 2를 출력
		System.out.println(1.1 + 2.1); //실수 3.2 출력
		//'1' + '1' => 49 + 49 => 98
		System.out.println('1' + '1'); //98
		//문자열 더하기는 옆으로 붙여서 나열
		//문자열 더하기는 숫자 연산이 아니므로 + 이외의 연산은 불가능
		System.out.println("1" + "1"); //"11" 출력
	}
	
	public void test3() {
		// 1 + 1.1 = 2.1
		// 자바는 서로 다른 데이터타입 간 연산이 불가능
		// 서로 다른 데이터타입 간 연산이 이뤄지는 경우
		// 둘 중에 범위가 좁은 자료형을 큰 자료형으로 변환해서 연산
		// 정수 + 실수 => 정수 + 정수, 실수 + 실수 => 1 + 1.1 => 1.0 + 1.1 => 2.1
		System.out.println(1 + 1.1);
		// 정수 + 문자 => 정수 + 정수, 문자 + 문자 => 1+ '1' => 1 + 49 => 50
		System.out.println(1.0 + '1');
		// 1.0 + '1' => 1.0 + 49.0 => 50.0
	}
	
	public void test4() {
		// 문자열은 다른 자료형과 더하기 연산하는 경우
		// 다른 자료형이 문자열로 변환하여 더하기 연산 수행"
		// 1 + "1" => 정수 + 문자열 => 정수 + 정수, 문자열 + 문자열 =? "1" + "1" => "11
		System.out.println(1 + "1"); // "1" + "1" => "11"
		System.out.println(1.0 + "1"); // "1.0" + "1" => "1.01"
		System.out.println('1' + "1"); //"1" + "1" => "11"
	}
	
	public void test5() {
		System.out.println("Hello" + 10); // "Hello" + "10"  => "Hello10"
		System.out.println(10 + "Hello"); // "10" + "Hello" => "10Hello"
		System.out.println(10 + 20 + "Hello"); // (10+20)+ "Hello" => 30 + "Hello" => "30" + "Hello" => "30Hello"
		System.out.println(10+(20+"Hello")); // 10 + ("20" + "Hello") => 10 + "20Hello" => "10" + "20Hello" => "1020Hello"
	} 

}
