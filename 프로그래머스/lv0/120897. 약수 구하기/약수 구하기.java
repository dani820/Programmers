class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int cnt = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) ++cnt;
        }
        
        answer = new int[cnt];
        cnt = 0;
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                answer[cnt] = j;
                cnt++;
            }
        }
        
        return answer;
    }
}