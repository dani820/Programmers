import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            int cnt = s.length() - s.replace("" + s.charAt(i), "").length();            
            
            if (cnt == 1) {
                answer += s.charAt(i);
            }
        }
        char[] charArr = answer.toCharArray();
        Arrays.sort(charArr);
        
        return new String(charArr);
    }
}