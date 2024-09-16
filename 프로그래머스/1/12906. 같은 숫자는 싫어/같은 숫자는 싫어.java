import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> Q = new LinkedList<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) Q.offer(arr[i]);

        List<Integer> arrList = new ArrayList<>();
        int prev = -1;
        int curr = 0;
        while (!Q.isEmpty()) {
            curr = Q.poll();
            if (prev != curr) {
                arrList.add(curr);
            }
            
            prev = curr;
        }
        
        len = arrList.size();
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = arrList.get(i).intValue();
        }
            
        return answer;
    }
}