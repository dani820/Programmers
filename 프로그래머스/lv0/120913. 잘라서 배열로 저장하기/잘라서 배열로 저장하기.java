class Solution {
    public String[] solution(String my_str, int n) {
        // 배열 크기 지정
        // 나머지가 존재하지 않는 경우 몫만큼의 배열 크기가,
        // 나머지가 존재하는 경우는 + 1 만큼의 배열 크기가 필요하다.
        int size = my_str.length() / n;
        if (my_str.length() % n > 0) {
            size += 1;    
        }
        String[] answer = new String[size];   
        String subStr = "";
        
        for (int i = 0; i < answer.length; i++) {
            if (my_str.length() >= n) { // 대상 문자열의 길이가 잘라야 하는 개수보다 길 때 길이에 맞게 자르기
                subStr = my_str.substring(0, n);
                my_str = my_str.substring(n);
            } else { // 대상 문자열의 길이가 잘라야 하는 개수보다 짧을 때 대상 문자열을 그대로 넣음
                subStr = my_str;
            }
            answer[i] = (subStr);        
        }
        
        return answer;
    }
}