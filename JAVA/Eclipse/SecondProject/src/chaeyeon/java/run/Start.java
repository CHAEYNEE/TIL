package chaeyeon.java.run;
// 1. Func1클래스의 위치를 알려줌(기능제공 클래스 위치 패키지부터)
import chaeyeon.java.func.Func1;
import chaeyeon.java.func1.TestClass;

public class Start {

	public static void main(String[] args) {
		// 실제로 실행하고 싶은 코드는 Func1클래스의 test1() 메소드
		// 다른 클래스에 있는 메소드를 실행하는 방법
		// 1. 해당 클래스의 위치를 알려줘야함(import)
		// 2. 해당 클래스를 약어로 설정
		// 사용하고싶은클래스이름 약어 = new 사용하고싶은클래스이름()
		TestClass tc = new TestClass();
		// 3. 사용하고싶은 메소드 실행 : 2번에서 선언한 약어.메소드이름
		tc.function();
	}

}
