import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) { set.add(num); }
        
        answer = set.size() > max ? max : set.size();
        return answer;
    }
}