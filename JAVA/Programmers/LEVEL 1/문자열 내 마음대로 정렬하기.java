import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<>();
        // 각 문자열 앞에 n번째 문자를 붙여서 새로운 리스트로 추가
        for(int i=0; i<strings.length; i++){
            list.add(""+strings[i].charAt(n)+strings[i]);
        }
        
        // 새로운 리스트를 정렬
        Collections.sort(list);
        
        // 정렬된 리스트에서 앞에 붙였던 n번째 문자를 제거하고 결과 배열로 저장
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).substring(1,list.get(i).length());
        }
        return answer;
    }
}