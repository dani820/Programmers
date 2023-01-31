class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        if (!B.equals(A)) {
            for (int i = 0; i < A.length(); i++) {
                String lastChar = A.substring(A.length() - 1);
                
                A = A.substring(0, A.length() - 1);
                A = lastChar + A;
                answer++;

                if (B.equals(A)) {
                    return answer;
                }
            }
            answer = -1;    
        }
        
        return answer;
    }
}
