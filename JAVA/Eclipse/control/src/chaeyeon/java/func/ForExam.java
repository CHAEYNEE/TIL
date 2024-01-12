package chaeyeon.java.func;

public class ForExam {
	
	// 중첩 for문
	public void test() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println("i = " + i + "/ j = " + j);
			}
		}
	}
	
	// 중첩 for문을 사용한 구구단 출력
	public void exam1() {
		/*
		int dan = 2;
		for(int j = 1; j <= 9; j++) {
			System.out.print(dan+"*"+j+"=" + (dan*j)+"\t");
			
		}
		System.out.println();
		
		int dan1 = 3;
		for(int j = 1; j <= 9; j++) {
			System.out.print(dan1+"*"+j+"=" + (dan1*j)+"\t");
		
		} */
		for(int i=2; i<=9; i++) {
			int dan = i;
			for(int j=1; j<=9; j++) {
				System.out.print(dan + " * " + j + " = " + (dan*j) + "\t");
				System.out.println();
			}
		}
	}
	
	public void exam2() {
		for(int i=1; i<=9; i++) {
			int num = i;
			for(int j=2; j<=9; j++) {
				System.out.printf("%d * %d = %d\t", j, num, j*num);
				System.out.println();
			}
		}
	}

}
