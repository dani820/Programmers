class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] strArr = my_string.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        
        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                answer += Integer.parseInt(strArr[0]);
                continue;
            }
            
            switch(strArr[i]) {
                case "+" :
                    answer += Integer.parseInt(strArr[i+1]);
                    break;
                case "-" :
                    answer -= Integer.parseInt(strArr[i+1]);
                    break;
            }
        }
        
        return answer;
    }
}