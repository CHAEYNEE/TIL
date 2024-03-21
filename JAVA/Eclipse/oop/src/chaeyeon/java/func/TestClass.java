package chaeyeon.java.func;

public class TestClass {
	
	// 시간 차 구현 
	public void test() {
		System.out.println("첫번째 줄");
		time(1000);
		System.out.println("두번째 줄");
		time(1000);
		System.out.println("세번째 줄");
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			time(500);
		}
		System.out.println("끝");
	}
	
	public void time(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
