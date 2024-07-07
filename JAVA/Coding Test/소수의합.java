import java.util.Arrays;

public class 소수의합{
    public static void main(String[] args) {
        int answer = 0;
        boolean[] isPrime = new boolean[100+1];
        // 소수는 true, 배열 모두 true로 초기화
        Arrays.fill(isPrime,true);

        // 0, 1은 소수 아니므로 false
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= 100; i++) {
            if (isPrime[i]) {
                // i의 배수들도 소수가 아님 -> false
                for (int j = i * i; j <= 100; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수 합 구하기
        for(int i=2; i<=100; i++){
            if(isPrime[i] == true){
                answer += i;
            }
        }

        System.out.println("소수의 합 : " + answer);
    }
}