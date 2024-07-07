public class 대문자골라내기 {
    public static void main(String[] args){
        String str = "안녕45AaBbCCCCccD하EeeF";
        String answer = str.replaceAll("[^A-Z]", "");
        System.out.println(answer);
    }
}
