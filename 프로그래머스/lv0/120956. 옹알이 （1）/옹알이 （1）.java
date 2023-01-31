class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] samples = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            String data = babbling[i];
            String containedValue = ""; // 포함된 글자 체크
            
            if (data.length() > 1) { // 비교할 대상은 최소 두 글자 이상이어야 함
                for (int j = 0; j < samples.length; j++) {
                    String sample = samples[j];

                    if (data.indexOf(sample) > -1) {
                        containedValue += sample;
                    }
                }
                
                if (containedValue.length() == data.length()) {
                    answer++;    
                }
            }
            containedValue = "";
        }
        return answer;
    }
}