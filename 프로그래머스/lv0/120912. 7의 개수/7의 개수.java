class Solution {
    public int solution(int[] array) {
        int answer = 0;
             
        
        for (int b : array) {
            String num = String.valueOf(b);
            
            for (int i = 0; i < num.length(); i++) {
                if (num.substring(i,i+1).contains("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}