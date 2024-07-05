public class 짝수의곱 {
    public static void main(String[] args) {
        long mul = 1;
        for(int i=1; i<=50; i++){
            if(i%2 == 0){
                mul *= i;
            }
    
        }
        System.out.println("짝수들의 곱 : " + mul);
        }
    
}
