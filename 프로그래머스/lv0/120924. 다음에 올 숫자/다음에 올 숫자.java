class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int[] differenceList = new int[common.length];
        for (int i = 0; i < common.length; i++) {
            if (i == common.length-1) {
                continue;
            } else {
                differenceList[i] = (common[i+1] - common[i]);    
            }
        }

        if (differenceList[0] == differenceList[1]) { // 등차수열
            answer = common[common.length - 1] + differenceList[0];
        } else { // 등비수열
            answer = common[common.length - 1] * (differenceList[1] / differenceList[0]);
            
        }
        
        return answer;
    }
}