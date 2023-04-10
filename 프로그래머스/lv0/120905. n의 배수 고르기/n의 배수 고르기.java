class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        int cnt = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                cnt++;
            }
        }
        
        answer = new int[cnt];
        int index = 0;
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) { // numlist 요소가 n 의 배수인 경우
                answer[index] = numlist[i];
                index++;
            }
        }
        
        return answer;
    }
}