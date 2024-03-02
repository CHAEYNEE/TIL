package chaeyeon.java.func;

import java.util.Scanner;

public class ArrayTest2 {

	public void test1() {
		// 이차원 배열은 [][] 표시
		int[][] arr = new int[2][3]; // 행2 x 열3인 이차원 배열 생성 후 0으로 초기화
		/*
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		*/
		int k = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		/*
		for(int j = 0 ; j < 3; j++) {
			System.out.print(arr[0][j] + "\t");
		}
		System.out.println();
		
		System.out.print(arr[0][0] + "\t");
		System.out.print(arr[0][1] + "\t");
		System.out.print(arr[0][2] + "\t");
		System.out.println();
		
		for(int j = 0 ; j < 3; j++) {
			System.out.print(arr[1][j] + " ");
		}
		System.out.println();
			
		System.out.print(arr[1][0] + "\t");
		System.out.print(arr[1][1] + "\t");
		System.out.print(arr[1][2] + "\t");
		System.out.println();
		*/
		// 이차원 배열에서 배열이름.length -> 행의 수
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void sample() {
		int[][] arr = new int[5][5];
		int k = 1;
		
		 for(int i = 0; i < 5; i++){
		 	for(int j = 0; j < 5; j++){
		 		arr[i][j] = k++;
		 	}
		 }
		/*
        arr[0][0] = k++;
        arr[0][1] = k++;
        arr[0][2] = k++;
        arr[0][3] = k++;
        arr[0][4] = k++;         
		
		 arr[1][0] = k++;
		 arr[1][1] = k++;
		 arr[1][2] = k++;
		 arr[1][3] = k++;
		 arr[1][4] = k++;
		*/
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void exam1() {
		int[][] arr = new int[5][5];
		int k = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = arr[i].length-1; j >= 0; j--) {
				arr[i][j] = k++;
			}
		}
		/*
		for(int j = 4 ; j >= 0 ; j--) {
			arr[0][j] = k++;
		}
		for(int j = 4 ; j >= 0 ; j--) {
			arr[1][j] = k++;
		}
		for(int j = 4 ; j >= 0 ; j--) {
			arr[2][j] = k++;
		}
		for(int j = 4 ; j >= 0 ; j--) {
			arr[3][j] = k++;
		}
		for(int j = 4 ; j >= 0 ; j--) {
			arr[4][j] = k++;
		}
		*/
		
		/*
		arr[0][4] = k++;
		arr[0][3] = k++;
		arr[0][2] = k++;
		arr[0][1] = k++;
		arr[0][0] = k++;
		*/
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void exam2() {
		int[][] arr = new int[5][5];
		int k = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[j][i] = k;
				k++;
			}
		}
		/*
		arr[0][0] = 1;
		arr[1][0] = 2;
		arr[2][0] = 3;
		arr[3][0] = 4;
		arr[4][0] = 5;
		*/
		/*
		arr[0][1] = 6;
		arr[1][1] = 7;
		arr[2][1] = 8;
		arr[3][1] = 9;
		arr[4][1] = 10;
		
		arr[0][2] = 11;
		arr[1][2] = 12;
		arr[2][2] = 13;
		arr[2][3] = 14;
		arr[2][4] = 15;
		*/
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void exam3() {
		int[][] arr = new int[5][5];
		int k = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = arr[i].length-1; j >= 0; j--) {
				arr[j][i] = k;
				k++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void exam4() {
		int[][] arr = new int[5][5];
		int k = 1;
		/*
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		arr[1][4] = 6;
		arr[1][3] = 7;
		arr[1][2] = 8;
		arr[1][1] = 9;
		arr[1][0] = 10;
		
		arr[2][0] = 11;
		arr[2][1] = 12;
		*/
		for(int i=0; i<arr.length; i++) {
			if(i%2 == 0) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = k;
					k++;
				}
			}else {
				for(int j=arr[i].length-1; j>=0; j--) {
					arr[i][j] = k;
					k++;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void exam5() {
		int[][] arr = new int[5][5];
		int k = 1;
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		
		arr[1][4] = 6;
		arr[2][4] = 7;
		arr[3][4] = 8;
		arr[4][4] = 9;
		
		arr[4][3] = 10;
		arr[4][2] = 11;
		arr[4][1] = 12;
		arr[4][0] = 13;
		
		arr[3][0] = 14;
		arr[2][0] = 15;
		arr[1][0] = 16;
		
		arr[1][1] = 17;
		arr[1][2] = 18;
		arr[1][3] = 19;
		
		arr[2][3] = 20;
		arr[3][3] = 21;
		
		arr[3][2] = 22;
		arr[3][1] = 23;
		
		arr[2][2] = 24;
		arr[3][2] = 25;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//카카오 문제
		public void kakao() {
			Scanner sc = new Scanner(System.in);
			//배열크기를 입력받아서 사이즈를 지정하고 맞춘다.
			System.out.print("배열 크기 입력 : ");
			int arrLength = sc.nextInt();
			boolean[][] arr1 = new boolean[arrLength][arrLength];
			boolean[][] arr2 = new boolean[arrLength][arrLength];
			char [][] result = new char[arrLength][arrLength];
			int range=1;
			for(int i=0; i<arrLength; i++) {
				range *= 2;
			}
			System.out.println("= = = = = 첫번째 배열 = = = = =");
			for(int i=0;i<arrLength;i++) {
				System.out.print((i+1)+"번째 행 숫자 입력 (범위 0~"+(range-1)+"): ");
				int inputNum = sc.nextInt();
				for(int j=0;j<arrLength;j++) {
					if(inputNum%2 == 0) {
						arr1[i][arrLength-j-1] = false;
					}else {
						arr1[i][arrLength-j-1] = true;
					}
					inputNum /= 2;
				}
			}			
			System.out.println("= = = = = 두번째 배열 = = = = =");
			for(int i=0;i<arrLength;i++) {
				System.out.print((i+1)+"번째 행 숫자 입력 (범위 0~"+(range-1)+"): ");
				int inputNum = sc.nextInt();
				for(int j=0;j<arrLength;j++) {
					if(inputNum%2 == 0) {
						arr2[i][arrLength-j-1] = false;
					}else {
						arr2[i][arrLength-j-1] = true;
					}
					inputNum /= 2;
				}
			}
			System.out.println("= = = = = 첫번째 배열 결과 = = = = =");
			for(int i=0;i<arrLength;i++) {
				for(int j=0;j<arrLength;j++) {
					result[i][j]=arr1[i][j]?'#':' ';
					System.out.print(result[i][j]+ " ");
				}
				System.out.println();
			}
			System.out.println("= = = = = 두번째 배열 결과 = = = = =");
			for(int i=0;i<arrLength;i++) {
				for(int j=0;j<arrLength;j++) {
					result[i][j]=arr2[i][j]?'#':' ';
					System.out.print(result[i][j]+ " ");
				}
				System.out.println();
			}
			System.out.println("= = = = = 최종 결과 = = = = =");
			for(int i=0;i<arrLength;i++) {
				for(int j=0;j<arrLength;j++) {
					result[i][j]=arr1[i][j]|arr2[i][j]?'#':' ';
					System.out.print(result[i][j]+ " ");
				}
				System.out.println();
			}
		}
		
		//달팽이배열(시계방향)
		public void snail1() {	
			Scanner sc = new Scanner(System.in);
			System.out.print("2차원 배열 크기 입력(정방형) > ");
			int size = sc.nextInt();
			int[][] arr = new int[size][size];				 //입력받은크기의 정방형 배열 생성
			int k = 1;										 //배열안의 채울 값 변수
			int inc =1;										 //인덱스번호 증감용 변수
			int r=0;										 //2차원배열 행 인덱스번호
			int c=-1;										 //2차원배열 열 인덱스번호
			while(size>0) {
				for(int i=0;i<size;i++) {
					c=c+inc;
					arr[r][c]=k;
					k++;
				}
				size--;
				for(int i=0;i<size;i++) {
					r=r+inc;
					arr[r][c]=k;
					k++;
				}
				inc = -inc;
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
		}
}
