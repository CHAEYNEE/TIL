public class 문자제거 {
    public static void main(String[] args){
        String str = "123안녕45하678세9*@";
        String answer = str.replaceAll("[^0-9]", "");
        System.out.println(answer);
    }
    
}
