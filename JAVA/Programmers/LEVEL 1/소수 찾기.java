import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n+1];
        // 소수는 true, 배열 초기화
        Arrays.fill(isPrime,true);
        
        // 0, 1은 소수 아니므로 false
        isPrime[0] = false;
        isPrime[1] = false;
        
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // i의 배수들도 소수가 아님 -> false
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // 소수 갯수 세기
        for(int i=2; i<=n; i++){
            if(isPrime[i] == true){
                answer++;
            }
        }
        return answer;
    }
}