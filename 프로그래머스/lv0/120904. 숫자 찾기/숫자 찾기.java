import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numStr = Integer.toString(num);
        
        for (int i = numStr.length(); i >= 1 ; i--) {
            if ((num % 10) == k) {
                answer = i;
            }
        
            num = num / 10;
        }
        
        if (answer == 0) {
            answer = -1; // k 와 일치하는 수 없는 경우 -1 을 담아준다.
        }
        
        return answer;
    }
}