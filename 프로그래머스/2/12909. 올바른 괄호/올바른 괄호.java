import java.util.List;
import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // 괄호를 담을 객체 생성
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            char parentheses = s.charAt(i);
            
            // ')' 로 시작하는 경우 false 리턴
            if (i == 0 && parentheses == ')') return false;
        
            // 리스트에 '('부터 차례대로 저장하고 ')' 순서가 돌아왔을 때
            // 리스트에서 가장 마지막 '(' 부터 꺼내 하나씩 삭제한다.
            if (parentheses == ')' && list.size() > 0) {
                list.remove(list.size()-1);
            } else {
                list.add(parentheses - '0');    
            }
        }

        // 괄호가 삭제되지 않고 남아있는 경우 올바르지 않은 경우이므로 false 리턴
        if (list.size() > 0) answer = false;

        return answer;
    }
}